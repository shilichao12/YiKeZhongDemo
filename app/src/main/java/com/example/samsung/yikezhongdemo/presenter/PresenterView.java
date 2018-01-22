package com.example.samsung.yikezhongdemo.presenter;

import com.example.samsung.yikezhongdemo.Bean.BannerBan;
import com.example.samsung.yikezhongdemo.Bean.Beanvideo;
import com.example.samsung.yikezhongdemo.moderl.HomeModerl;
import com.example.samsung.yikezhongdemo.moderl.IHome;
import com.example.samsung.yikezhongdemo.utlis.IPresneter;
import com.example.samsung.yikezhongdemo.view.IbeanView;

import java.lang.ref.SoftReference;

/**
 * Created by samsung on 2018/1/19.
 */

public class PresenterView implements IPresneter<IbeanView> {
    IHome home;
    SoftReference<IbeanView> softReference;

    public PresenterView(IbeanView view) {
        attch(view);
        home = new HomeModerl();

    }

    public void showpresenter() {
        home.ShowHome(new IHome.Movie() {
            @Override
            public void complpte(BannerBan bannerBan) {
                softReference.get().showData(bannerBan);
            }
        });
    }
   public  void  video_show(){
        home.show_video(new IHome.Movie_video() {
            @Override
            public void complpet_video(Beanvideo beanvideo) {
                softReference.get().show_video(beanvideo);
            }
        });
   }
    @Override
    public void attch(IbeanView view) {
        softReference = new SoftReference<IbeanView>(view);
    }

    @Override
    public void datach() {
        softReference.clear();
    }
}
