package com.example.bluesky.androidhw5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView Playoff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //動態陣列 list
        ArrayList<PlayoffData> playoffArrayList = new ArrayList<PlayoffData>();

        //巫師 111 : 塞爾提克 123 05/01
        //增加到Arraylist
        playoffArrayList.add(new PlayoffData
                (111,123,R.drawable.washington_wizards_primary,R.drawable.boston_celtics_logo,"巫師","塞爾提克"));

        //巫師 119 : 塞爾提克 129 05/04
         playoffArrayList.add(new PlayoffData
              (119,129,R.drawable.washington_wizards_primary,R.drawable.boston_celtics_logo,"巫師","塞爾提克"));

        //把資料放到MainActivity
        PlayoffArrayAdapter adapter = new PlayoffArrayAdapter(this,playoffArrayList);
        Playoff = (ListView)findViewById(R.id.Playoff); //listview
        Playoff.setAdapter(adapter);
    }
}
