package com.lgy.kotlinproject.activity

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by LGY on 2017/8/7.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadViewLayout()
        setListener()
        loadData()
    }

    /**
     * 初始化控件
     */
    fun <T : View> initView(activity: Activity, id: Int): T {
        return activity.findViewById<View>(id) as T
    }

    fun <T> findA():T{
        return 5 as T
    }

    /**
     * 加载布局文件
     */
    protected abstract fun loadViewLayout()

    /**
     * 监听时间初始化
     */
    protected abstract fun setListener()

    /**
     * 数据加载
     */
    protected abstract fun loadData()

}