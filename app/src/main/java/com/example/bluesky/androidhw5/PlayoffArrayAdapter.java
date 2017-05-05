package com.example.bluesky.androidhw5;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bluesky on 2017/5/1.
 */

public class PlayoffArrayAdapter extends ArrayAdapter<PlayoffData> {

    Context context;

    public PlayoffArrayAdapter(Context context,ArrayList<PlayoffData> items) {
        super(context, 0, items);
        this.context = context;
    }
    @Override
    public View getView (int position, View converView, ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        // 若 View類別是 null 則將 listview.xml 轉換成LinearLayout
        if(converView == null)
        {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listview,null);
        }
        else
        {
            itemlayout = (LinearLayout) converView;
        }
        PlayoffData item = (PlayoffData) getItem(position);

        TextView score1 = (TextView)itemlayout.findViewById(R.id.score_team1);
        // TextView 裡面必須傳入字串才可
        score1.setText(String.valueOf(item.team1_score));
        TextView score2 = (TextView)itemlayout.findViewById(R.id.score_team2);
        score2.setText(String.valueOf(item.team2_score));
        // 勝者分數顯示紅色
        if(item.team1_score > item.team2_score)
        {
            score1.setTextColor(Color.RED);
        }
        else if(item.team2_score > item.team1_score)
        {
            score2.setTextColor(Color.RED);
        }
        // 圖片顯示
        ImageView team1 = (ImageView)itemlayout.findViewById(R.id.img_team1);
        team1.setImageResource(item.team1_id);
        ImageView team2 = (ImageView)itemlayout.findViewById(R.id.img_team2);
        team2.setImageResource(item.team2_id);
        return itemlayout;
    }
}

