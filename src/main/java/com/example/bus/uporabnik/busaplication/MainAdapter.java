package com.example.bus.uporabnik.busaplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;



/**
 * Created by Uporabnik on 27. 07. 2016.
 */
public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private ItemClickListener clickListener;
    private int rowLayout;

    List<Maindata> GlavniPodatki = Collections.emptyList();
    Maindata current;
    int currentPos = 0;
    private RecyclerView mRecyclerView = null;





    public MainAdapter(Context context){
        this.context=context;
        this.GlavniPodatki = GlavniPodatki;
        this.rowLayout = rowLayout;
        inflater = LayoutInflater.from(context);

    }

    public void setData(List<Maindata> UpdateData){
        GlavniPodatki = UpdateData;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.prikazpodatkov,parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }




    // prikaz casov postaj NAPAKA NEMOGOCE POPRAVITI
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder= (MyHolder) holder;
        MyHolder myHolder1 = (MyHolder) holder;
        Maindata current=GlavniPodatki.get(position);
        myHolder.textFishName.setText(current.nameStation);
        myHolder1.textPrice.setText(String.valueOf(current.ArrivalsTimes));
        myHolder1.textPrice.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));


//        Glide.with(context).load("http://192.168.1.7/test/images/" + current.fishImage)
//                .placeholder(R.drawable.ic_img_error)
//                .error(R.drawable.ic_img_error)
//                .into(myHolder.ivFish);



    }

    @Override
    public int getItemCount() {
        return GlavniPodatki == null ? 0 : GlavniPodatki.size();
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
        //Log.i("MainAdapter","OnClickListener set");
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textFishName;
        ImageView ivFish;
        TextView textSize;
        TextView textType;
        TextView textPrice;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textFishName= (TextView) itemView.findViewById(R.id.textFishName);
            ivFish= (ImageView) itemView.findViewById(R.id.ivFish);
            textSize = (TextView) itemView.findViewById(R.id.textSize);
            textType = (TextView) itemView.findViewById(R.id.textType);
            textPrice = (TextView) itemView.findViewById(R.id.textPrice);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (clickListener != null) clickListener.onClick(v, getAdapterPosition());
            Log.i("MainAdapter", "OnClick");
        }
    }


}
