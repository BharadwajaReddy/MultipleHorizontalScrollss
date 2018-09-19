package filters.com.multiplehorizontalscrolls;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;


public class AvaliableHotelsAdaptor extends RecyclerView.Adapter<AvaliableHotelsAdaptor.HotelsViewHolder> {

    private ArrayList<Hotels> hotels_list;
    private Context context;

    AvaliableHotelsAdaptor() {

    }

    AvaliableHotelsAdaptor(ArrayList<Hotels> hotels_list, Context context) {
        this.hotels_list = hotels_list;
        this.context = context;
    }

    @Override
    public HotelsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.v("adaptor_called", "onCreate");
        View view = LayoutInflater.from(context).inflate(R.layout.hotel_item, parent, false);
        return new HotelsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HotelsViewHolder holder, final int position) {
        Log.v("adaptor_called", "onBind");
        Hotels hotels = hotels_list.get(position);
        holder.textView.setText(hotels.getHotel_Id() + "");
        holder.simpleProgressBar.setProgress(hotels.getDownloadStatus());
        // holder.simpleProgressBar.setProgress(20);
        holder.itemview.setTag(hotels.getHotel_Id() + "");
        holder.itemview.setId(hotels.getHotel_Id());


    }

    @Override
    public int getItemCount() {
        return hotels_list.size();
    }


  /*  public void UpdateProgress(int id, int val) {
        if (hotels_list != null) {
            int i = 0;
            for (Hotels item : hotels_list) {
                if (item.getHotel_Id() == id) {
                    hotels_list.set(i, new Hotels(id, null, null, 0, 0, false, val));
                    notifyItemChanged(i);
                    Log.v("update_this2", "cxv");
                    Log.v("update_this2", id + "");
                    Log.v("update_this2", val + "");
                }
                i++;
            }
        }
    }*/

    public void UpdateProgress(int id, int val) {
        if (hotels_list != null) {
            int i = 0;
            for (Hotels item : hotels_list) {
                if (item.getHotel_Id() == id) {
                    hotels_list.set(i, new Hotels(id, null, null, 0, 0, false, val));
                    notifyItemChanged(i);
                    Log.v("update_this2", "cxv");
                    Log.v("update_this2", id + "");
                    Log.v("update_this2", val + "");
                }
                i++;
            }



        }
    }


    public class HotelsViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CheckBox checkBox;
        ProgressBar simpleProgressBar;

        View itemview;

        public HotelsViewHolder(View itemView) {
            super(itemView);
            itemview = itemView;
            textView = itemView.findViewById(R.id.textview);
            checkBox = itemView.findViewById(R.id.checkbox);
            simpleProgressBar = itemView.findViewById(R.id.simpleProgressBar);


        }


    }


}
