package com.nick.lib.network.interfaces

import io.reactivex.Observable
import okhttp3.RequestBody
import retrofit2.adapter.rxjava2.Result
import retrofit2.http.*
import java.util.*

interface HttpProcessorService {

	@GET("{path}")
	fun get(@Path("path") path: String, @HeaderMap headerMap: HashMap<String, String>, @QueryMap queryMap: HashMap<String, String>): Observable<Result<String>>

	@POST("{path}")
	fun post(@Path("path") path: String, @HeaderMap headerMap: HashMap<String, String>, @QueryMap queryMap: HashMap<String, String>, @Body requestBody: RequestBody): Observable<Result<String>>

	@GET("{path}")
	fun getForm(@Path("path") path: String, @HeaderMap headerMap: HashMap<String, String>, @QueryMap queryMap: HashMap<String, String>, @FieldMap fieldMap: HashMap<String, String>): Observable<Result<String>>

	@POST("{path}")
	@FormUrlEncoded
	fun postForm(@Path("path") path: String, @HeaderMap headerMap: HashMap<String, String>, @QueryMap queryMap: HashMap<String, String>, @FieldMap(encoded = true) fieldMap: HashMap<String, String>): Observable<Result<String>>

	@PUT("{path}")
	fun put(@Path("path") path: String, @HeaderMap headerMap: HashMap<String, String>, @QueryMap queryMap: HashMap<String, String>): Observable<Result<String>>
}