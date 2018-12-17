package com.beibei.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * author: anbeibei
 * <p>
 * date: 2018/12/17
 * <p>
 * desc:
 */
public class CollapsingToolbarActivity2parallax extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_parallax);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("标题");
//        toolbar.setLogo(R.mipmap.ic_launcher);
    }
}
