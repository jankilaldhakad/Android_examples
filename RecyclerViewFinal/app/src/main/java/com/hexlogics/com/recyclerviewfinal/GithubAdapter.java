package com.hexlogics.com.recyclerviewfinal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.zip.Inflater;

/**
 * Created by Windows on 26-03-2019.
 */

public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.GithubViewHolder>{

    private Context context;
    private User[] data;
    public GithubAdapter(Context context,User[] data){
        this.context =context;
        this.data=data;
    }
    @Override
    public GithubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_user_layout,parent,false);

        return new GithubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GithubViewHolder holder, int position) {
        final User user = data[position];
        holder.txtUser.setText(user.getLogin());
        Glide.with(holder.imgUSer.getContext()).load(user.getAvatarUrl()).into(holder.imgUSer);

        //Click Listener Recycler View
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,user.getLogin()+ "Was Clicked..!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class GithubViewHolder extends RecyclerView.ViewHolder{

        ImageView imgUSer;
        TextView txtUser;
        public GithubViewHolder(View itemView) {
            super(itemView);

            imgUSer = itemView.findViewById(R.id.imgUser);
            txtUser = itemView.findViewById(R.id.txtUser);

        }
    }
}
