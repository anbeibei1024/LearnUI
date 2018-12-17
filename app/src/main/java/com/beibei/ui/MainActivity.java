package com.beibei.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * @author anbeibei
 *
 * http://zhuhf.tech/2017/02/09/CoordinatorLayout/
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toFAB(View view) {
        startActivity(new Intent(this, FABActivity.class));
    }

    public void toAppbarLayout(View view) {
        startActivity(new Intent(this, AppBarLayoutActivity.class));
    }

    public void toAppbarLayout1(View view) {
        startActivity(new Intent(this, AppBarLayoutActivity1.class));
    }

    public void toAppbarLayout2(View view) {
        startActivity(new Intent(this, AppBarLayoutActivity2.class));
    }

    public void toAppbarLayout3(View view) {
        startActivity(new Intent(this, AppBarLayoutActivity3.class));
    }

    public void toCollapsingToolbarLayout(View view) {
        startActivity(new Intent(this, CollapsingToolbarActivity.class));
    }

    public void toCollapsingToolbarLayout1(View view) {
        startActivity(new Intent(this, CollapsingToolbarActivity1.class));
    }
    public void toCollapsingToolbarLayout2(View view) {
        startActivity(new Intent(this, CollapsingToolbarActivity2parallax.class));
    }
}
