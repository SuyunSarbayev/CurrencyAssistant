package android.test.currencyassistant.data.utils

import android.test.currencyassistant.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.*


// UNSAFE, IT IS BETTER TO CONNECT ONlY TO TRUSTED CERTIFICATES, APPLICATION IS COMPLETELY IGNORES SSL CERTIFICATES!!!
object UnsafeOkHttpClient {
    val unsafeOkHttpClient:
            OkHttpClient
        get() = try { 
            val trustAllCerts: Array<TrustManager> = arrayOf<TrustManager>(
                object : X509TrustManager {
                    @Throws(CertificateException::class)
                    override fun checkClientTrusted(
                        chain: Array<X509Certificate?>?,
                        authType: String?
                    ) {
                    }

                    @Throws(CertificateException::class)
                    override fun checkServerTrusted(
                        chain: Array<X509Certificate?>?,
                        authType: String?
                    ) {
                    }

                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }
                }
            )
            // Install the all-trusting trust manager
            val sslContext: SSLContext = SSLContext.getInstance("SSL")
            sslContext.init(null, trustAllCerts, SecureRandom())
            // Create an ssl socket factory with our all-trusting manager
            val sslSocketFactory: SSLSocketFactory = sslContext.getSocketFactory()
            val builder = OkHttpClient.Builder()
            builder.connectTimeout(30000, TimeUnit.MICROSECONDS)
            builder.readTimeout(30000, TimeUnit.MILLISECONDS)
            builder.writeTimeout(30000, TimeUnit.MILLISECONDS)
            builder.addInterceptor(if(BuildConfig.DEBUG)
                    HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
                else
                    HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE))
            builder.sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
            builder.hostnameVerifier(object : HostnameVerifier {
                override fun verify(hostname: String?, session: SSLSession?): Boolean {
                    return true
                }
            })
            builder.build()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
}