package com.example.sch.activity;

import android.widget.TextView;

import com.example.sch.R;
import com.example.sch.common.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MyOrderActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    public int getContentViewId() {
        return R.layout.activity_my_order;
    }

    @Override
    protected void initView() {
        super.initView();
        tvTitle.setText("我的订单");
    }

    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }
}
