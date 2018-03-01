package com.example.linkstuct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLink<Integer> integerMyLink = new MyLink<>();
        integerMyLink.addNode(0);
        integerMyLink.addNode(1);
        integerMyLink.addNode(2);
        integerMyLink.addNode(3);
        integerMyLink.addNode(4);
        integerMyLink.traverse();
    }
}
