package com.example.samsung.yikezhongdemo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samsung.yikezhongdemo.Adapter.RecyclerView_Adapter;
import com.example.samsung.yikezhongdemo.Bean.BannerBan;
import com.example.samsung.yikezhongdemo.Bean.Beanvideo;
import com.example.samsung.yikezhongdemo.ImagGithub.ImgGithub;
import com.example.samsung.yikezhongdemo.R;
import com.example.samsung.yikezhongdemo.presenter.PresenterView;
import com.example.samsung.yikezhongdemo.utlis.BaseFragment;
import com.example.samsung.yikezhongdemo.view.IbeanView;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by samsung on 2018/1/19.
 */

public class Fragment_great extends BaseFragment<PresenterView> implements IbeanView {


    private View view;
    private Banner banner;
    PresenterView presenter;
    List<String> list_banner;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.fragment_great, null);
        presenter = new PresenterView(this);
        banner = (Banner) view.findViewById(R.id.banner);
        recyclerView = (RecyclerView) view.findViewById(R.id.rec);
        presenter.showpresenter();
        presenter.video_show();


        return view;
    }

    @Override
    public void showData(BannerBan bannerBan) {
        List<BannerBan.DataBean> data = bannerBan.getData();
        list_banner = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            banner.setImageLoader(new ImgGithub());
            list_banner.add(data.get(i).getIcon());
            Log.i("******", "showData: " + list_banner);
            banner.setImages(list_banner);
            banner.start();

        }
    }

    @Override
    public void show_video(Beanvideo beanvideo) {
        List<Beanvideo.DataBean> data = beanvideo.getData();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView_Adapter recyclerView_adapter = new RecyclerView_Adapter(getActivity(), data);
        recyclerView.setAdapter(recyclerView_adapter);
    }

    @Override
    protected void createptesenter() {
        presenter = new PresenterView(this);
    }
}
