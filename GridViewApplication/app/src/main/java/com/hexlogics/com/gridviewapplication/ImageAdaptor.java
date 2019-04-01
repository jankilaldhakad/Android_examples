package com.hexlogics.com.gridviewapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Windows on 01-03-2019.
 */

public class ImageAdaptor extends BaseAdapter {
    private Context mContext;

    public ImageAdaptor(Context context){
        mContext=context;
    }
    @Override
    public int getCount() {
        return thumbImages.length;
    }


    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);

        return imageView;
    }
    public Integer[] thumbImages={
            R.drawable.ic_btoff,R.drawable.ic_bton,
            R.drawable.ic_delete,R.drawable.ic_excel,
            R.drawable.ic_launcher,R.drawable.ic_logo

    };
}
