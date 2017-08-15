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

class TestAdapter(private val context: Context, private val list: List<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(i: Int): Any? {
        return list[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
        var view = view
        var viewHolder: ViewHolder? = null
        if (view == null) {
            viewHolder = ViewHolder()
            view = LayoutInflater.from(context).inflate(R.layout.item_lv, null)
            viewHolder.tv = view!!.findViewById(R.id.tv)
            view.tag = viewHolder
        } else {
            viewHolder = view.tag as TestAdapter.ViewHolder
        }
        viewHolder.tv!!.text = list[i]
        return view
    }

    internal inner class ViewHolder {
        var tv: TextView? = null
    }
}
