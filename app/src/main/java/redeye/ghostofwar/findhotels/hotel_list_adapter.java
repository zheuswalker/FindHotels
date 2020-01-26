package redeye.ghostofwar.findhotels;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.List;


public class hotel_list_adapter extends RecyclerView.Adapter<hotel_list_adapter.AllcurrentHolder>{
    RecyclerView recyclerView;
    private Context context, mcontext;
    private List<hotel_list_constructors> hotel_list_constructors_list;

    public hotel_list_adapter(Context context, List<hotel_list_constructors> hotel_list_constructors)
    {
        this.context = context;
        this.hotel_list_constructors_list = hotel_list_constructors;


    }
    @Override
    public AllcurrentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_hotel_list_adapter, null);
        AllcurrentHolder holder = new AllcurrentHolder(view);
        mcontext = parent.getContext();
        return holder;
    }




    @Override
    public void onBindViewHolder(final AllcurrentHolder holder, final int position) {

        final hotel_list_constructors hotel_list_constructors = hotel_list_constructors_list.get(position);
        holder.hotelname.setText(hotel_list_constructors.gethotel_name());
        holder.hoteldesc.setText(hotel_list_constructors.gethotel_desc());



    }


    @Override
    public int getItemCount() {
        return hotel_list_constructors_list.size();
    }


    public class AllcurrentHolder extends RecyclerView.ViewHolder{
        int position = getLayoutPosition();
        TextView hoteldesc, hotelname;

        public AllcurrentHolder(View itemView) {
            super(itemView);
            hoteldesc = itemView.findViewById(R.id.hoteldesc);
            hotelname = itemView.findViewById(R.id.hotelname);
        }
    }
}
