package com.hexlogics.com.myapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Windows on 01-03-2019.
 */

public class MyListAdaptor extends BaseAdapter {
    private  Context mContext;
    private ArrayList<String> mArrayListCountry;
    private int[]Images;

    public MyListAdaptor(Context context,ArrayList arrayCounty,int[] img){
        super();
        mContext=context;
        mArrayListCountry =arrayCounty;
        Images=img;
    }

    @Override
    public int getCount() {
        return mArrayListCountry.size();
    }

    @Override
    public Object getItem(int postion) {
        return postion;
    }

    @Override
    public long getItemId(int postion) {
        return postion;
    }

    @Override
    public View getView(final int postion, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= inflater.inflate(R.layout.mylist,viewGroup,false);

        ImageView img=(ImageView)view.findViewById(R.id.IVimage);
        TextView txtName=(TextView)view.findViewById(R.id.tvname);
        Button btn=(Button)view.findViewById(R.id.btnAction);

        img.setImageResource(Images[postion]);
        txtName.setText(mArrayListCountry.get(postion));
        btn.setText("Action"+postion);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast= Toast.makeText(view.getContext(),mArrayListCountry.get(postion),Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,0);
              //  TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
              //  v.setTextColor(#FFFF);
                toast.show();
            }
        });
        return view;
    }
}
