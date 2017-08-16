package com.lgy.kotlinproject

/**
 * Created by LGY on 2017/7/28.
 */

class Person constructor(name: String, sex: String) {
    var name: String? = name
    var address: String? = null
    val age: Int = 0 //val只读类型


    var sex: String? = sex

    fun sum(a: Int, b: Int) = a + b


    companion object {
        @JvmStatic fun main(args: Array<String>) {
            var person = Person("lgy","sex")
//            person.age = 10
        }
    }
}
