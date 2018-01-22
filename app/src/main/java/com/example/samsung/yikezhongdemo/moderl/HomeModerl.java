package com.example.samsung.yikezhongdemo.moderl;

import com.example.samsung.yikezhongdemo.Bean.BannerBan;
import com.example.samsung.yikezhongdemo.Bean.Beanvideo;
import com.example.samsung.yikezhongdemo.utlis.ApiService;

import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by samsung on 2018/1/19.
 */

public class HomeModerl implements IHome {
    /**
     * 广告Banner
     * @param movie
     */
    @Override
    public void ShowHome(final Movie movie) {
        ApiService.API_SERVICE.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBan>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(BannerBan bannerBan) {
                        movie.complpte(bannerBan);
                    }
                });
    }

    /**
     * RecyclerView视频
     * @param movie_video
     */
    @Override
    public void show_video(final Movie_video movie_video) {
        ApiService.API_SERVICE_video.getvideo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Beanvideo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Beanvideo beanvideo) {
                        movie_video.complpet_video(beanvideo);
                    }
                });
    }
}
