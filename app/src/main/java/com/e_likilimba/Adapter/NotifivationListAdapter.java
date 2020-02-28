package com.e_likilimba.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.e_likilimba.R;

public class NotifivationListAdapter extends ArrayAdapter {
    private String[] titreDeNotification;
    private String[] messageNotification;
    private String[] typeNotification;
    private Activity context;

    public NotifivationListAdapter(Activity context, String[] titreDeNotification, String[] messageNotification, String[] typeNotification) {
        super(context, R.layout.row_item);
        this.context = context;
        this.titreDeNotification = titreDeNotification;
        this.messageNotification = messageNotification;
        this.typeNotification = typeNotification;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView txtTitreNotification = row.findViewById(R.id.txtNotifiactionTitle);
        TextView txtMessageNotification = row.findViewById(R.id.txtNotificationMessage);
        ImageView imageFlag = row.findViewById(R.id.imageViewFlag);

        txtTitreNotification.setText(titreDeNotification[position]);
        txtMessageNotification.setText(messageNotification[position]);
        String typ=typeNotification[position];
        if (typeNotification[position].toLowerCase()=="message")
        {
        imageFlag.setImageResource(R.drawable.ic_mail_outline_black_24dp);
        }
        else if (typeNotification[position].toLowerCase()=="dépôt"){
            imageFlag.setImageResource(R.drawable.ic_action_name);
        }
        else if (typeNotification[position].toLowerCase()=="retrait"){
            imageFlag.setImageResource(R.drawable.ic_action_transfert);
        }
        else if (typeNotification[position].toLowerCase()=="invitation"){
            imageFlag.setImageResource(R.drawable.ic_group_invitation_24dp);
        }

        return  row;
    }
}