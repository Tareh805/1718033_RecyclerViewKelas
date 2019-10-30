package com.example.recyclerviewkelas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>{
    private ArrayList<Profile> dataList;

    public ProfileAdapter(ArrayList<Profile> dataList) {

        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ProfileAdapter.ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_profile, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, int position) {
        holder.txtnama.setText(dataList.get(position).getNama());
        holder.txtsilsilah.setText(dataList.get(position).getSilsilah());
        holder.picture_data.setImageDrawable(dataList.get(position).getPicture());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder {
        TextView txtnama;
        TextView txtsilsilah;
        ImageView picture_data;

        public ProfileViewHolder(View itemView) {
            super(itemView);
            txtnama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtsilsilah = (TextView) itemView.findViewById(R.id.txt_silsilah);
            picture_data = (ImageView) itemView.findViewById(R.id.profile_data);
        }
    }
}
