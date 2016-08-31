package com.gowinsw.iotsmartbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout tab = (LinearLayout)findViewById(R.id.test);

        NodeTab test = new NodeTab();
    }
}
