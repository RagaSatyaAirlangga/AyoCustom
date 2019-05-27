package com.example.ip310.ayocustom.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ip310.ayocustom.R;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<Endangeriditem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<Endangeriditem>();
        Endangeriditem nama = new Endangeriditem();
        nama.setName("T-Shirt Pendek");
        nama.setThumbnail(R.drawable.t_shirt_pen);
        mItems.add(nama);

        nama = new Endangeriditem();
        nama.setName("T-Shirt Panjang");
        nama.setThumbnail(R.drawable.panjang);
        mItems.add(nama);

        nama = new Endangeriditem();
        nama.setName("T-Shirt Raglan");
        nama.setThumbnail(R.drawable.t_shirt_rag);
        mItems.add(nama);

        nama = new Endangeriditem();
        nama.setName("Kaos Polo");
        nama.setThumbnail(R.drawable.polo);
        mItems.add(nama);

        nama = new Endangeriditem();
        nama.setName("Jersey Full Print");
        nama.setThumbnail(R.drawable.jersey);
        mItems.add(nama);

        nama = new Endangeriditem();
        nama.setName("PDH");
        nama.setThumbnail(R.drawable.pdh);
        mItems.add(nama);

        nama = new Endangeriditem();
        nama.setName("Jaket Hoodie");
        nama.setThumbnail(R.drawable.jaket_hoodi);
        mItems.add(nama);

        nama = new Endangeriditem();
        nama.setName("Sweater");
        nama.setThumbnail(R.drawable.sweater);
        mItems.add(nama);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Endangeriditem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
