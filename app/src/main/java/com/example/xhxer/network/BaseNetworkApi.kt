package com.example.xhxer.base.network


/**
 * 作者  : xiuer
 * 时间  : 2022/11/29
 * 描述  :
 */
 object BaseNetworkApi {

    private const val BASE_URL = "http://10.0.2.2/"
/*

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
*/

    //fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    //reified关键字来修饰泛型,inline关键字来修饰方法,是泛型实化的两大前提条件
    //inline fun <reified T> create(): T = create(T::class.java)


}