package com.e_likilimba;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.e_likilimba.Adapter.NotifivationListAdapter;

public class NotificationUserActivity extends AppCompatActivity {
    private ListView listView;
    private String titreNotif[] = {
            "India",
            "China",
            "Nepal",
            "Bhutan"
    };

    private String messageNotif[] = {
            "Delhi",
            "Beijing",
            "Kathmandu",
            "Thimphu"
    };


    private String typeNotif[] = {
            "Message",
            "Invitation",
            "Dépôt",
            "retrait"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_user);
        ListView listView=findViewById(R.id.listNotification);

        // For populating list data
        NotifivationListAdapter customCountryList = new NotifivationListAdapter(this, titreNotif, messageNotif, typeNotif);
        listView.setAdapter(customCountryList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+titreNotif[position-1]+ " as Message ",Toast.LENGTH_SHORT).show();        }
        });
    }
}
