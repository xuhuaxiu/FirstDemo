package com.example.xhxer.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.xhxer.common.getVmClazz

/**
 * 作者  : xiuer
 * 时间  : 2022/11/29
 * 描述  : 所以activity的基类
 */
abstract class BaseVmActivity<VM: ViewModel>:AppCompatActivity() {
    lateinit var mViewModel: VM

    /**
     * 加载布局
     */
    abstract fun layoutId(): Int

    /**
     * 页面初始化
     */
    abstract fun initView(savedInstanceState: Bundle?)

    /**
     * 创建数据观察者
     */
    abstract fun createObserver()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = createViewModel()
        setContentView(layoutId())
        initView(savedInstanceState)
        createObserver()
    }

    /**
     * 创建viewModel
     */
    private fun createViewModel(): VM {
        return ViewModelProvider(this).get(getVmClazz(this))
    }

}