package com.github.xch168.customviewpractice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class DrawBaseActivity extends AppCompatActivity
{
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private static final String[] TITLES = { "drawColor()", "drawCircle()", "drawRect()", "drawPoint()", "drawOval()", "drawLine()", "drawRoundRect()", "drawArc()", "drawPath()", "直方图", "饼图"};

    private static final int[] LAYOUT_IDS = { R.layout.practice_color, R.layout.practice_circle, R.layout.practice_rect, R.layout.practice_point, R.layout.practice_oval, R.layout.practice_line,
                                              R.layout.practice_round_rect, R.layout.practice_arc, R.layout.practice_path, R.layout.practice_histogram, R.layout.practice_pie_chart};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_base);

        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager())
        {
            @Override
            public Fragment getItem(int position)
            {
                return PageFragment.newInstance(LAYOUT_IDS[position]);
            }

            @Override
            public int getCount()
            {
                return TITLES.length;
            }

            @Override
            public CharSequence getPageTitle(int position)
            {
                return TITLES[position];
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, DrawBaseActivity.class);
        context.startActivity(intent);
    }
}
