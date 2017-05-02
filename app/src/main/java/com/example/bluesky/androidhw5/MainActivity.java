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

        ArrayList<PlayoffData> playoffArrayList = new ArrayList<PlayoffData>();
        Playoff = (ListView)findViewById(R.id.Playoff); //listview

        playoffArrayList.add(new PlayoffData
                (111,123,R.drawable.washington_wizards_primary,R.drawable.boston_celtics_logo,"巫師","塞爾提克"));

        PlayoffArrayAdapter adapter = new PlayoffArrayAdapter(this,playoffArrayList);
        Playoff.setAdapter(adapter);
    }
}
