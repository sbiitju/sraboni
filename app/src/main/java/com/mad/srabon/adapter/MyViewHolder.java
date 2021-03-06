package com.mad.srabon.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mad.srabon.R;


public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView studentImg;
    TextView studentName,studentNumber,studentEmail,studentDistrict;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        studentImg=itemView.findViewById(R.id.studentImage);
        studentName=itemView.findViewById(R.id.studentName);
        studentEmail=itemView.findViewById(R.id.studentEmail);
        studentDistrict=itemView.findViewById(R.id.studentDistrict);
        studentNumber=itemView.findViewById(R.id.studentNumber);
    }
}
