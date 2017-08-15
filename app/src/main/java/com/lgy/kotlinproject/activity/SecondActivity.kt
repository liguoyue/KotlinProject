package com.lgy.kotlinproject.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lgy.kotlinproject.R
import com.lgy.kotlinproject.adapter.TestAdapter
import com.lgy.kotlinproject.adapter.TestAdapter2
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    var adapter: TestAdapter? = null
    var list:MutableList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        initData()
    }

    private fun initData() {
        list = mutableListOf()
        list!!.add("1")
        list!!.add("2")
        list!!.add("3")
        list!!.add("4")

        adapter = TestAdapter(this, list!!)
        lv.adapter = adapter
    }
}
