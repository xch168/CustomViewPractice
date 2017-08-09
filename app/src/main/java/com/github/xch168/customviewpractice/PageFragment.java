package com.github.xch168.customviewpractice;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;


public class PageFragment extends Fragment
{
    private static final String EXTRAL_PRACTICE_LAYOUT_RES = "practice_layout_res";

    private @LayoutRes int mPracticeLayoutRes;

    public PageFragment()
    {
        // Required empty public constructor
    }

    public static PageFragment newInstance(@LayoutRes int parcticeLayoutRes)
    {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(EXTRAL_PRACTICE_LAYOUT_RES, parcticeLayoutRes);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {
            mPracticeLayoutRes = getArguments().getInt(EXTRAL_PRACTICE_LAYOUT_RES);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        ViewStub sampleStub = view.findViewById(R.id.sample_stub);
        sampleStub.setLayoutResource(mPracticeLayoutRes);
        sampleStub.inflate();
        return view;
    }

}
