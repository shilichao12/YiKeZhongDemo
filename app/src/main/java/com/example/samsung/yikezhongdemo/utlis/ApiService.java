package com.example.samsung.yikezhongdemo.utlis;

import com.example.samsung.yikezhongdemo.Bean.BannerBan;
import com.example.samsung.yikezhongdemo.Bean.Beanvideo;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by samsung on 2018/1/19.
 */

public interface ApiService {
    @GET("/quarter/getAd")
    Observable<BannerBan> getData();

    Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl("https://www.zhaoapi.cn")
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(new OkHttpClient())
            .build();
    ApiService API_SERVICE = RETROFIT.create(ApiService.class);

    /**
     * RecyclerView_视频
     */
    @GET("quarter/getHotVideos?page=1&token=44ECB7BF74853A20D62CF8279AB2AEE1&source=android&appVersion=101")
    Observable<Beanvideo> getvideo();
    Retrofit RETROFIT_video = new Retrofit.Builder()
            .baseUrl("https://www.zhaoapi.cn/")
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(new OkHttpClient())
            .build();
    ApiService API_SERVICE_video = RETROFIT_video.create(ApiService.class);
}
