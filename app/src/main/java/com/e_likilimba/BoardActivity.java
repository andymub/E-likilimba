package com.e_likilimba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.e_likilimba.Adapter.CardAdapter;
import com.e_likilimba.Objet.CardData;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BoardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;
    private List cardDataList = new ArrayList<>();
    private TextView txtScrowllMessage;
    BottomNavigationView bottomNavigation;
    private CardView cardCaisseSoc, cardCrowFound,cardEpargne, cardPretEtEmprunt;

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        bottomNavigation=findViewById(R.id.bottom_navigation);
        findViewById(R.id.txtDefillante).setSelected(true);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        recyclerView = findViewById(R.id.recycler_view);
        cardCaisseSoc=findViewById(R.id.cardViewCs);
        cardCrowFound=findViewById(R.id.cardViewCf);
        cardEpargne=findViewById(R.id.cardViewEp);
        cardPretEtEmprunt=findViewById(R.id.cardViewPeE);
        cardAdapter = new CardAdapter(cardDataList,BoardActivity.this);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(cardAdapter);
        cardDataPrepare();


        cardCaisseSoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCaisseSolidaire =new Intent(BoardActivity.this, CaisseSocialActivity.class);
                startActivity(intentCaisseSolidaire);
            }
        });
        cardCrowFound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCardCrowFound =new Intent(BoardActivity.this, Caiss_Finacement_participatif_Activity.class);
                startActivity(intentCardCrowFound);
            }
        });
        cardEpargne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCardEpargne =new Intent(BoardActivity.this, Epargne_perso_Activity.class);
                startActivity(intentCardEpargne);
            }
        });
        cardPretEtEmprunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCardPretEtEmprunt =new Intent(BoardActivity.this, PreEtEmpruntActivity.class);
                startActivity(intentCardPretEtEmprunt);
            }
        });

    }

    private void cardDataPrepare() {

        CardData cardData = new CardData("Joe Miler","05/06/2021","$","054 545","35");
        cardDataList.add(cardData);
        cardData = new CardData("Joe Miler","05/06/2021","Fc","054 545","35254");
        cardDataList.add(cardData);

    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_transfert:

                            Intent intentTranfert =new Intent(BoardActivity.this, TransfertActivity.class);
                            startActivity(intentTranfert);
                            return true;
                        case R.id.navigation_retrait:
                            Intent intentRetrait =new Intent(BoardActivity.this, RetraitActivity.class);
                            startActivity(intentRetrait);

                            return true;
                        case R.id.navigation_depot:
                            Intent intentDepot =new Intent(BoardActivity.this, DepotActivity.class);
                            startActivity(intentDepot);
                            return true;
                        case R.id.navigation_notifications:
                            Intent intentNotification =new Intent(BoardActivity.this, NotificationUserActivity.class);
                            startActivity(intentNotification);
                            return true;

                    }
                    return false;
                }
            };

}
