package com.e_likilimba.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.e_likilimba.Objet.NotificationUserObject;
import com.e_likilimba.R;

import java.util.List;

public class NotifivationListAdapter extends BaseAdapter {
    Context context;
    List<NotificationUserObject> rowNotifItems;

    public NotifivationListAdapter(Context context, List<NotificationUserObject> items) {
        this.context = context;
        this.rowNotifItems = items;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView txtTitle;
        TextView txtDescMessage;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_notif_item, null);
            holder = new ViewHolder();
            holder.txtDescMessage = convertView.findViewById(R.id.desc);
            holder.txtTitle = convertView.findViewById(R.id.title);
            holder.imageView = convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        NotificationUserObject rowNotifItem = (NotificationUserObject) getItem(position);

        holder.txtDescMessage.setText(rowNotifItem.getMessageNotification());
        holder.txtTitle.setText(rowNotifItem.getTitreDeNotification());
        if (rowNotifItem.getTypeNotification().trim().toLowerCase()=="message")
        {
            holder.imageView.setImageResource(R.drawable.ic_mail_outline_black_24dp);
        }
        else if (rowNotifItem.getTypeNotification().trim().toLowerCase()=="dépôt"){
            holder.imageView.setImageResource(R.drawable.ic_action_name);
        }
        else if (rowNotifItem.getTypeNotification().trim().toLowerCase()=="retrait"){
            holder.imageView.setImageResource(R.drawable.ic_action_transfert);
        }
        else if (rowNotifItem.getTypeNotification().trim().toLowerCase()=="invitation"){
            holder.imageView.setImageResource(R.drawable.ic_group_invitation_24dp);
        }


        return convertView;
    }

    @Override
    public int getCount() {
        return rowNotifItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowNotifItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowNotifItems.indexOf(getItem(position));
    }
}