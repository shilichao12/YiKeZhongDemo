package com.example.samsung.yikezhongdemo.moderl;

import com.example.samsung.yikezhongdemo.Bean.BannerBan;
import com.example.samsung.yikezhongdemo.Bean.Beanvideo;

/**
 * Created by samsung on 2018/1/19.
 */

public interface IHome {
    /**
     * Banner
     */
    void ShowHome(Movie movie);

    interface Movie {
        void complpte(BannerBan bannerBan);
    }

    /**
     * RecyclerView_视频
     */
    void show_video(Movie_video movie_video);

    interface Movie_video {
        void complpet_video(Beanvideo beanvideo);
    }
}
