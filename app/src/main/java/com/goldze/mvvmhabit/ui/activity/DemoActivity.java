package com.goldze.mvvmhabit.ui.activity;

import com.goldze.mvvmhabit.BR;
import com.goldze.mvvmhabit.R;
import com.goldze.mvvmhabit.databinding.ActivityDemoBinding;
import com.goldze.mvvmhabit.ui.vm.DemoViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by 曾宪泽 on 2017/7/17.
 */

public class DemoActivity extends BaseActivity<ActivityDemoBinding, DemoViewModel> {
    @Override
    public int initContentView() {
        return R.layout.activity_demo;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public DemoViewModel initViewModel() {
        return new DemoViewModel(this);
    }
}
