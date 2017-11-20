package com.example.admin.test;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Admin on 11/20/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mResources;
    public ViewPagerAdapter(Context mContext, int[] mResources) {
        this.mContext = mContext;
        this.mResources = mResources;
    }
    @Override
    //  trả về số lượng phần tử mảng data hay giờ nó là số lượng view cần hiển thị lên ViewPager
    public int getCount() {
        return mResources.length;
    }
    @Override
    //tạo page ở những cho từng position nhất định và tái sử dụng page theo từng key (position) của mảng data mResources[]
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_viewpager, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.img_pager_item);
        imageView.setImageResource(mResources[position]);
//        imageView.setImageDrawable (container.getResources().getDrawable(mResources[position]));

        container.addView(itemView);

        return itemView;
    }
    @Override
    //Xóa page từ ViewPager,
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    //trả về object dựa trên instantiateItem đang hiển thị dựa vào position.
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
