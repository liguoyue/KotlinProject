package com.lgy.kotlinproject

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by LGY on 2017/7/31.
 */

class MyAdapter constructor(context: Context,mutableList: MutableList<String>): BaseAdapter(), View.OnClickListener {
    override fun onClick(p0: View?) {
    }

    var context = context
    var mutableList = mutableList

    override fun getCount(): Int {
        return 0
    }

    override fun getItem(i: Int): Any? {
        return null
    }

    override fun getItemId(i: Int): Long {
        return 0
    }

    override fun getView(i: Int, view: View, viewGroup: ViewGroup): View? {
        return null
    }

}
