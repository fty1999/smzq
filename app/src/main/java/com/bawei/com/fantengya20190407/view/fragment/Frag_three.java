package com.bawei.com.fantengya20190407.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.com.fantengya20190407.R;

/**
 * @Auther: 樊腾亚
 * @Date: 2019/4/7 14:00:02
 * @Description:
 */
public class Frag_three extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_three,container,false);
        return view;
    }
}
