package com.hosannamimistries.www.hosannaministries.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by root on 3/1/16.
 */
public class LetterIndexAdapter extends RecyclerView.Adapter<LetterIndexAdapter.ViewHolder> {



    CancelRideListener mCallbackCancelRide;

    // Container Activity must implement this interface
    public interface CancelRideListener {
        public void cancelRideAlert();
    }
    RescheduleRideListener mCallbackRescheduleRide;

    // Container Activity must implement this interface
    public interface RescheduleRideListener {
        public void rescheduleTrip();
    }

    // Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView myRidesHeaderText,myRidesBodyText,myRidesFooterText;
        ImageButton vehicleButton, tripCancelButton;
        LinearLayout upcomingLayout;



        ViewHolder(View itemView) {
            super(itemView);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public LetterIndexAdapter(Context ctx) {




    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                              int viewType) {
        // create a new view
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.activity_list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
         }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return 3;
    }


}

