package com.bigbearg.yuantu.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bigbearg.yuantu.R;


public class HomeFragment extends Fragment {
    private ImageView mHomeMonitor;
    private ImageView mHomeParaset;
    private ImageView mHomeHistory;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_home, null);
        initView(view);
        initClick();
        return view;
    }

    private void initClick() {
        mHomeHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        mHomeMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(getActivity(), MonitorActivity.class));
            }
        });
        mHomeParaset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initView(View view) {
        mHomeMonitor = view.findViewById(R.id.home_monitor);
        mHomeParaset = view.findViewById(R.id.home_paraset);
        mHomeHistory = view.findViewById(R.id.home_history);
    }
}
