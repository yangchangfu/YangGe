package com.yangchangfu.yangge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yangchangfu.yangge_lib.SystemUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SystemUtil.show("你开始了吗？");
        SystemUtil.show("YCF", "你开始了吗？");
    }
}
