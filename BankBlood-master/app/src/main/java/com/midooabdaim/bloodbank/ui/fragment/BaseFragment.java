package com.midooabdaim.bloodbank.ui.fragment;

import androidx.fragment.app.Fragment;

import com.midooabdaim.bloodbank.ui.activity.BaseActivity;


public class BaseFragment extends Fragment {
    public BaseActivity baseActivity;

    public void BackPressed() {
        baseActivity.superOnBackPressed();
    }

    public void intialFragment() {
        baseActivity = (BaseActivity) getActivity();
        baseActivity.baseFragment = this;

    }


}
