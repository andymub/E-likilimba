package com.e_likilimba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import com.e_likilimba.Adapter.CardAdapter;
import com.e_likilimba.Objet.CardData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BoardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;
    private List cardDataList = new ArrayList<>();

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        recyclerView = findViewById(R.id.recycler_view);
        cardAdapter = new CardAdapter(cardDataList,BoardActivity.this);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(cardAdapter);
        cardDataPrepare();
    }

    private void cardDataPrepare() {

        CardData cardData = new CardData("Joe Miler","05/06/2021","$","054 545","35");
        cardDataList.add(cardData);
        cardData = new CardData("Joe Miler","05/06/2021","Fc","054 545","35254");
        cardDataList.add(cardData);

    }
}
