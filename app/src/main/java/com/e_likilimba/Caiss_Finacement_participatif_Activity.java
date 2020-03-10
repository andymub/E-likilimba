package com.e_likilimba;

import android.os.Bundle;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

public class Caiss_Finacement_participatif_Activity extends AppCompatActivity {
    private FloatingActionMenu fam;
    private FloatingActionButton fabAddCf, fabHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caiss__finacement_participatif_);

        //FloatingActionButton fab = findViewById(R.id.fab);
        fabAddCf =  findViewById(R.id.fabCf2);
        fabHelp =  findViewById(R.id.fabCf1);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        fam = (FloatingActionMenu) findViewById(R.id.fab_menu_cf);
        //handling menu status (open or close)
        fam.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
            @Override
            public void onMenuToggle(boolean opened) {
                if (opened) {
                    // showToast("Menu is opened");
                } else {
                    // showToast("Menu is closed");
                }
            }
        });
        //handling each floating action button clicked

        fabHelp.setOnClickListener(onButtonClick());
        fabAddCf.setOnClickListener(onButtonClick());

        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fam.isOpened()) {
                    fam.close(true);
                }
            }
        });

    }
    private void showToast (String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    private View.OnClickListener onButtonClick () {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == fabAddCf) {
                    showToast("Add a groupe");
                } else if (view == fabHelp) {
                    showToast("Button Help");
                } else {
                    //showToast("Button Edit clicked");
                }
                fam.close(true);
            }
        };
    }

}
