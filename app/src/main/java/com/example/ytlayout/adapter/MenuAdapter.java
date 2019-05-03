package com.example.ytlayout.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ytlayout.R;
import com.example.ytlayout.model.Menu;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{
    private Context context;
    private ArrayList<Menu> menus;

    public MenuAdapter(Context context, ArrayList<Menu> menus) {
        this.context = context;
        this.menus = menus;
    }

    @NonNull
    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.menu_item, viewGroup, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuViewHolder menuViewHolder, int i) {
        menuViewHolder.bind(menus.get(i));
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {

        ImageView imgView;
        TextView judul, desc;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.iv_icon);
            judul = itemView.findViewById(R.id.tv_judulMenu);
            desc = itemView.findViewById(R.id.tv_desc);
        }

        public void bind(Menu menu) {
            judul.setText(menu.getTitleText());
            desc.setText(menu.getDesc());
            imgView.setImageResource(menu.getIcon());
        }
    }
}
