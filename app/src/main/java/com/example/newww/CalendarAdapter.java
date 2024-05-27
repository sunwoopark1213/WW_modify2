package com.example.newww;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CalendarAdapter extends BaseAdapter {

    private Context mContext;
    private int[] weatherIcons;

    public CalendarAdapter(Context context, int[] weatherIcons) {
        this.mContext = context;
        this.weatherIcons = weatherIcons;
    }

    @Override
    public int getCount() {
        return weatherIcons.length;
    }

    @Override
    public Object getItem(int position) {
        return weatherIcons[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(100, 100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(weatherIcons[position]);
        return imageView;
    }
}
