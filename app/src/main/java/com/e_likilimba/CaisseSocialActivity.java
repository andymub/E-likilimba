package com.e_likilimba;

import android.os.Bundle;

import com.e_likilimba.Adapter.CsAdapter;
import com.e_likilimba.Objet.CaisseSolidaireObjet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CaisseSocialActivity extends AppCompatActivity {
    ArrayList<CaisseSolidaireObjet> dataModelsCs;
    private ListView listViewCS;
    private static CsAdapter adapterCs;
    private static String LOG_TAG = "CardViewActivity";
    private String nomCs,typeCs, nombreCs, prixCs, dureeCs,dateDebutCs,situationCs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listViewCS=findViewById(R.id.listCS);
        setContentView(R.layout.activity_caisse_social);
        nomCs="Nom: ";typeCs="Type de dévise: "; nombreCs="Participants: ";prixCs="Montant de dépôt: ";
        dureeCs="Période: "; situationCs ="Compte: ";
        dateDebutCs="Date de création: ";


        listViewCS=findViewById(R.id.listCS);
        dataModelsCs= new ArrayList<>();

        dataModelsCs.add(new CaisseSolidaireObjet(nomCs+"caisse DGM",typeCs+"$",nombreCs+"10"
        ,prixCs+"100$",dureeCs+"1 mois",dateDebutCs+"02/01/2012",situationCs+"250/500$"));

        dataModelsCs.add(new CaisseSolidaireObjet(nomCs+"caisse Famille",typeCs+"Fc",nombreCs+"7"
                ,prixCs+"10000$",dureeCs+"1 mois",dateDebutCs+"02/01/2012",situationCs+"50000/70000fc"));

        dataModelsCs.add(new CaisseSolidaireObjet(nomCs+"Caisse Groupe Foot",typeCs+"dollars",nombreCs+"10"
                ,prixCs+"100$",dureeCs+"1 mois",dateDebutCs+"02/01/2012",situationCs+"250/500$"));

        dataModelsCs.add(new CaisseSolidaireObjet(nomCs+"Caisse mam Chirika",typeCs+"dollars",nombreCs+"10"
                ,prixCs+"100$",dureeCs+"1 mois",dateDebutCs+"02/01/2012",situationCs+"250/500$"));


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        adapterCs= new CsAdapter(dataModelsCs,getApplicationContext());

        listViewCS.setAdapter(adapterCs);
        listViewCS.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                CaisseSolidaireObjet dataModel= dataModelsCs.get(position);

                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
