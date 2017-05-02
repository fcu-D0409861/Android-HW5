package com.example.bluesky.androidhw5;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by bluesky on 2017/5/1.
 */

public class PlayoffArrayAdapter extends ArrayAdapter<PlayoffData> {

    Context context;
    public PlayoffArrayAdapter(Context context,
                             ArrayList<PlayoffData> items) {
        super(context, 0, items);
        this.context = context;
    }
}

