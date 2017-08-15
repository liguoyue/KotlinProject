package com.lgy.kotlinproject

/**
 * Created by LGY on 2017/7/28.
 */

class Person constructor(name: String, sex: String) {
    var name: String? = name
    var address: String? = null
    var age: Int = 0
    var sex: String? = sex

    fun sum(a: Int, b: Int) = a + b

}
