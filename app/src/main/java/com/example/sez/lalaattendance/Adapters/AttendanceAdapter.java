package com.example.sez.lalaattendance.Adapters;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sez.lalaattendance.Classes.AttendanceClass;
import com.example.sez.lalaattendance.R;
import com.example.sez.lalaattendance.Classes.AttendanceClass;
import java.util.List;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.ProductViewHolder> {
    private Context mCtx;
    private List<AttendanceClass> AttendanceClass;

    public AttendanceAdapter(Context mCtx, List<AttendanceClass> attendanceClass) {
        this.mCtx = mCtx;
        AttendanceClass = attendanceClass;
    }

    @Override
    public AttendanceAdapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.attendance_view, null);
        final ProductViewHolder viewHolder = new ProductViewHolder(view) ;

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AttendanceAdapter.ProductViewHolder holder, int position) {
        final AttendanceClass aClass = AttendanceClass.get(position);
        //final String Column1 = aClass.getCol1();
        final String sstringval1,sstringval2;

        final int nu = position;

        //final String sstringval = Column1.substring(0,Column1.length()-14);
        Log.d("POSITION; " , "Position "+ nu);
        String Column1 = aClass.getCol1();
        String Column2 = aClass.getCol2();
        String Column3 = aClass.getCol3();

        if(position == 0)
        {
            Column1 = "D";
            Column2 = Column2.substring(0,Column2.length()-14);
            Column3 = Column3.substring(0,Column3.length()-14);
        }
        if(position == 1)
        {
            Column1 = "Sub";
        }
        if(position == 2)
        {
            Column1 = "N.O.L";
        }

        holder.Col1.setText(Column1);
        holder.Col2.setText(Column2);
        holder.Col3.setText(Column3);


    }

    @Override
    public int getItemCount() {
        return AttendanceClass.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        CardView layout;
        TextView Col1,Col2,Col3;

        public ProductViewHolder(View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.layout);
            Col1 = itemView.findViewById(R.id.Col1);
            Col2 = itemView.findViewById(R.id.Col2);
            Col3 = itemView.findViewById(R.id.Col3);


        }
    }
}
