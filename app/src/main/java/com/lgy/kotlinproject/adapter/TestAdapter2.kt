package com.lgy.kotlinproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

import com.lgy.kotlinproject.R

/**
 * Created by LGY on 2017/8/14.
 */

//主构造参数可以是var也可以是val，val可以当作全局变量使用，var不行
class TestAdapter2(private val context: Context, private val list: List<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(i: Int): Any {
        return list[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    //次构造和方法中的参数不能使用var或val
    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {//注意这里的View?，java转换成kotlin的时候没有"?"
        var view = view//kotlin中的方法参数默认是val常量，不可变
        var viewHolder: ViewHolder? = null
        if (view == null) {
            viewHolder = ViewHolder()
            view = LayoutInflater.from(context).inflate(R.layout.item_lv, null)
            viewHolder.tv = view!!.findViewById(R.id.tv)
            view.tag = viewHolder
        } else {
            viewHolder = view.tag as ViewHolder
        }
        viewHolder.tv!!.text = list[i]
        return view
    }

    internal inner class ViewHolder {
        var tv: TextView? = null
    }
}
