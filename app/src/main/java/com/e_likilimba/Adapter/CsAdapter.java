package com.e_likilimba.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import com.e_likilimba.CaisseSocialActivity;
import com.e_likilimba.Objet.CaisseSolidaireObjet;
import com.e_likilimba.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class CsAdapter  extends ArrayAdapter<CaisseSolidaireObjet>  {

    private ArrayList<CaisseSolidaireObjet> dataSetCs;

    Context mContextCs;

    public CsAdapter(ArrayList<CaisseSolidaireObjet> dataCs, Context context) {
        super(context, R.layout.row_item_cs, dataCs);
        this.dataSetCs = dataCs;
        this.mContextCs=context;
    }

//    @Override
//    public void onClick(View view) {
//        int position=(Integer) view.getTag();
//        Object object= getItem(position);
//        CaisseSolidaireObjet dataModel=(CaisseSolidaireObjet)object;
//
//        switch (view.getId())
//        {
//            case R.id.txtNomDuGroupeCs:
//                Snackbar.make(view, "Release date " +dataModel.getNomDeCaisseSolidaire(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//                break;
//
//        }
//
//    }

    // View lookup cache
    private static class ViewHolder {
        TextView nomDeCaisseSolidaire, nombreParticipantCaisseSolidaire,
                typerDevise,prixDuCompte,dureeAvantRetrait,
                dateDeDebut, situatioActuelle;
        ImageButton deleteGroupeCs, addToGroupeCs;
        CardView card_view_cs;
    }

    private int lastPosition = -1;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        CaisseSolidaireObjet dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item_cs, parent, false);

            viewHolder.nomDeCaisseSolidaire = (TextView) convertView.findViewById(R.id.txtNomDuGroupeCs);
            viewHolder.nombreParticipantCaisseSolidaire = (TextView) convertView.findViewById(R.id.txtNombreparticipantCs);
            viewHolder.situatioActuelle = (TextView) convertView.findViewById(R.id.descProgressBarCs);
            viewHolder.dureeAvantRetrait = (TextView) convertView.findViewById(R.id.txtPeriodecs);
            viewHolder.prixDuCompte = (TextView) convertView.findViewById(R.id.txtContributionCs4);
            viewHolder.dateDeDebut = (TextView) convertView.findViewById(R.id.txtDébutCs3);
            viewHolder.deleteGroupeCs = convertView.findViewById(R.id.imgBtnSupprimerCs);
            viewHolder.addToGroupeCs = convertView.findViewById(R.id.imgeBtnAddAccountCS);
            viewHolder.card_view_cs = convertView.findViewById(R.id.card_view_cs);




            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContextCs, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.nomDeCaisseSolidaire.setText(dataModel.getNomDeCaisseSolidaire());
        viewHolder.nombreParticipantCaisseSolidaire.setText(dataModel.getNombreParticipantCaisseSolidaire());
        viewHolder.situatioActuelle.setText(dataModel.getSituatioActuelle());
        viewHolder.dureeAvantRetrait.setText(dataModel.getDureeAvantRetrait());
        //viewHolder.nomDeCaisseSolidaire.setOnClickListener(this);
       // viewHolder.card_view_cs.setOnClickListener(this);

//        viewHolder.dateDeDebut.setTag(position)
        viewHolder.dateDeDebut.setText(dataModel.getDateDeDebut());
        viewHolder.prixDuCompte.setText(dataModel.getPrixDuCompte());
        viewHolder.deleteGroupeCs.setImageResource(R.drawable.ic_delete_black_24dp);
        viewHolder.addToGroupeCs.setImageResource(R.drawable.ic_group_add_black_24dp);

        return convertView;

    }
}