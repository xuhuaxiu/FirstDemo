package com.example.xhxer.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.xhxer.common.getVmClazz

/**
 * 作者  : xiuer
 * 时间  : 2022/11/29
 * 描述  :
 */
abstract class BaseVmFragment<VM: ViewModel>: Fragment() {

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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel = createViewModel()
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