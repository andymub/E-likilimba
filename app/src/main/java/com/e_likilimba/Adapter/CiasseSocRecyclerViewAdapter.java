package com.e_likilimba.Adapter;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e_likilimba.Objet.CaisseSolidaireObjet;
import com.e_likilimba.R;

import java.util.ArrayList;

public class CiasseSocRecyclerViewAdapter extends RecyclerView
        .Adapter<CiasseSocRecyclerViewAdapter
        .DataObjectHolder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<CaisseSolidaireObjet> mDataset;
    private static MyClickListener myClickListener;

    public CiasseSocRecyclerViewAdapter(ArrayList<CaisseSolidaireObjet> dataSet) {
        mDataset = dataSet;
    }

    @NonNull
    @Override
    public DataObjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DataObjectHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView txtNomdeCaisse,txtNombreparticipantCs,descProgressBarCs,txtPeriodeCs,txtContributionCs4,txtDébutCs;


        public DataObjectHolder(View itemView) {
            super(itemView);
            txtNomdeCaisse = (TextView) itemView.findViewById(R.id.txtNomDuGroupeCs);
            txtNombreparticipantCs = (TextView) itemView.findViewById(R.id.txtNombreparticipantCs);
            descProgressBarCs = (TextView) itemView.findViewById(R.id.descProgressBarCs);
            txtPeriodeCs = (TextView) itemView.findViewById(R.id.txtPeriodecs);
            txtContributionCs4 = (TextView) itemView.findViewById(R.id.txtContributionCs4);
            txtDébutCs = (TextView) itemView.findViewById(R.id.txtDébutCs3);
            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }
    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }

}

