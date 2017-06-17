package com.example.manya.locationapp;

/**
 * Created by Manya on 13/06/2017.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlacesListAdapter  extends RecyclerView.Adapter<PlacesListAdapter.PlaceViewHolder>  {
    private Context mContext;

    public PlacesListAdapter(Context context) {
        this.mContext = context;
    }


    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get the RecyclerView item layout
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_place_card, parent, false);
        return new PlaceViewHolder(view);
    }
    public void onBindViewHolder(PlaceViewHolder holder, int position) {

    }
    public int getItemCount() {
        return 0;
    }
    class PlaceViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        TextView addressTextView;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.name_text_view);
            addressTextView = (TextView) itemView.findViewById(R.id.address_text_view);
        }

    }


}
