package com.example.a10118327_uas_akb.view.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.a10118327_uas_akb.R;

public class ViewpagerAdapter extends PagerAdapter {
    String[] texts = {
            "Halo Netizen",
            "Bingung mau main di daerah Bandung?",
            "Tenang, ada Sobat Wisata Bandung"
    };

    int[] image = {
            R.drawable.viewpager1,
            R.drawable.viewpager2,
            R.drawable.viewpager3,
    };


    Context ctx;

    public ViewpagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.viewpager_layout, null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.imageviewpager);
        TextView title = layoutScreen.findViewById(R.id.text_judul);

        title.setText(texts[position]);
        imgSlide.setImageResource(image[position]);
        container.addView(layoutScreen);
        return layoutScreen;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
