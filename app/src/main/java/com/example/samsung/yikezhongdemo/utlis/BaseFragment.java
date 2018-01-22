package com.example.samsung.yikezhongdemo.utlis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by samsung on 2018/1/19.
 */

public abstract class BaseFragment<T extends IPresneter> extends Fragment {
    T presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createptesenter();
    }

    protected abstract void createptesenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (presenter != null) {
            presenter.datach();
        }
    }
}
