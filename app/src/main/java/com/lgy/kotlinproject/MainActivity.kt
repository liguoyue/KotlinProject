package com.lgy.kotlinproject

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.lgy.kotlinproject.activity.SecondActivity
import com.lgy.kotlinproject.adapter.TestAdapter
import com.lgy.kotlinutil.FileUtil
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {
    var adapter: MyAdapter? = null
    var student: Student? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "Kotlin"
        tv.textSize = 20.0F
        tv.setTextColor(Color.GREEN)
        tv.setOnClickListener { Toast.makeText(this, "点击了TV", Toast.LENGTH_SHORT).show() }
        tv.setOnClickListener(View.OnClickListener {
            view ->
            when (view.id) {
                R.id.tv -> {
                    var intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
            }
        })

        val abc = 100_000_000

        for (i in 1..10) {

        }

        for (i in 1..4 step 2) print(i) // 输出“13”

        for (i in 4 downTo 1 step 2) print(i) // 输出“42”

        //集合的使用
        var list = listOf<Person>(Person("zs", "boy"),
                Person("ls", "boy"))//list集合为只读集合，不能进行修改：增删
        val size = list.size
        val iterator = list.iterator()
        iterator.forEach { println("==========name========" + it.name) }
        while (iterator.hasNext()) {
            println("=====hasNext====")
        }
        list.forEach { println("=========sex=========${it.sex}") }

        val mutableList = mutableListOf<String>("one", "two", "three", "four", "five")
        mutableList.add("six")
        val size1 = mutableList.size
        println("============$size1")

        val map = mutableMapOf<String, String>()
        map.put("name", "liguoyue")
        map.put("age", "24")
        map.put("sex", "boy")


        var c = sum(6, 9)
        println("======sum====" + c)

        var a = 1
        var s1 = "a is $a"
        var s2 = "${s1.replace("is", "was")},but now is 2"
        println("=======拼接=====" + s2)

        //null检查机制
        var string: String? = "123"
        val toInt = string?.toInt() ?: -1
        if (toInt == -1) {
            println("=========-1========")
        } else {
            println("===========not-1========")
        }

        if (this is AppCompatActivity) {//类型的检测与自动转换

        }

        var file = File("")
        val adapter = TestAdapter(this, mutableListOf())

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun sum(a: Int, b: Int) = a + b

    fun showResult(a: Int): Int {
        return a * 10
    }
}
