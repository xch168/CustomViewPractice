package com.github.xch168.customviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 自定义 View 1-1：绘制基础
     *
     * @param view
     */
    public void drawBase(View view)
    {
        DrawBaseActivity.startActivity(this);
    }
}
