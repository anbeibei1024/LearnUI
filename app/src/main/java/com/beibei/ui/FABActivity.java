package com.beibei.ui;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FABActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
    }

    public void fabClick(View view) {
        Snackbar.make(view, "snackBar", Snackbar.LENGTH_SHORT).show();
    }
}
