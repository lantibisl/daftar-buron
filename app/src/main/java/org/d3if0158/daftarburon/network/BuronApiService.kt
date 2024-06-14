package org.d3if0158.daftarburon.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.d3if0158.daftarburon.model.OpStatus
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

private const val BASE_URL = "https://unspoken.my.id/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface BuronApiService {
    @Multipart
    @POST("api_lantib.php")
    suspend fun postBuron(
        @Header("Authorization") userId: String,
        @Part("nama_buronan") nama: RequestBody,
        @Part image: MultipartBody.Part
    ): OpStatus
}

object BuronApi {
    val service: BuronApiService by lazy {
        retrofit.create(BuronApiService::class.java)
    }
}

enum class ApiStatus { LOADING, SUCCESS, FAILED }