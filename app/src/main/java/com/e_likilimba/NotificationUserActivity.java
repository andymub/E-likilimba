package com.e_likilimba;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.e_likilimba.Adapter.NotifivationListAdapter;
import com.e_likilimba.Objet.NotificationUserObject;

import java.util.ArrayList;
import java.util.List;

public class NotificationUserActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private ListView listView;
    private String titreNotif[] = {
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date...",
            "Titre / date..."
    };

    private String messageNotif[] = {
            "Message .........",
            "Message .........",
            "Message .........",
            "Message .........","Message .........",
            "Message .........",
            "Message .........",
            "Message .........","Message .........",
            "Message .........",
            "Message .........",
            "Message .........",
    };


    private String typeNotif[] = {
            "message",
            "invitation",
            "dépôt",
            "retrait", "message",
            "invitation",
            "dépôt",
            "retrait", "message",
            "invitation",
            "dépôt",
            "retrait",

    };

    List<NotificationUserObject> rowNotifItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_user);
        rowNotifItems = new ArrayList<NotificationUserObject>();
        for (int i = 0; i < titreNotif.length; i++) {
            NotificationUserObject item = new NotificationUserObject(titreNotif[i],messageNotif[i],typeNotif[i]);
            rowNotifItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        NotifivationListAdapter adapter = new NotifivationListAdapter(this, rowNotifItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowNotifItems.get(position),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

    @Override
    public void onClick(View view) {

    }
}