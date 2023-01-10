package com.example.mysample;

import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public  Adapter (List<ModelClass>userList){ this .userList=userList; }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String resource=userList.get(position).getText1();
        String name=userList.get(position).getText1a();

        holder.setData(resource,name);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView text;
        private TextView text1a;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            text=itemView.findViewById(R.id.text1);
            text1a=itemView.findViewById(R.id.text1a);
        }

        public void setData(String resource, String name) {
            text.setText(resource);
            text1a.setText(name);
        }
    }
}
