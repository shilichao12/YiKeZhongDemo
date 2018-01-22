package com.example.samsung.yikezhongdemo.Adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dou361.ijkplayer.widget.IjkVideoView;
import com.example.samsung.yikezhongdemo.Bean.Beanvideo;
import com.example.samsung.yikezhongdemo.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by samsung on 2018/1/20.
 */

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.MyHolder> {
    List<Beanvideo.DataBean> list;
    Context context;
    private View view;

    public RecyclerView_Adapter(Context context, List<Beanvideo.DataBean> data) {
        this.context = context;
        this.list = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = View.inflate(context, R.layout.recyclerview_one, null);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.textView.setText(list.get(position).getWorkDesc());
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {


        private final TextView title;
        private final IjkVideoView ijv;
        private final TextView commentA;
        private final TextView commentB;
        private final TextView textView;

        public MyHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title_name);
            ijv = (IjkVideoView) itemView.findViewById(R.id.ijv);
            textView = (TextView) itemView.findViewById(R.id.title_name);
            commentA = (TextView) itemView.findViewById(R.id.commentA);
            commentB = (TextView) itemView.findViewById(R.id.commentB);
        }
    }


}
