package com.keithsmyth.testdealdetailsharness.about;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.keithsmyth.testdealdetailsharness.R;

class AboutViewHolder extends RecyclerView.ViewHolder {

    final TextView text;

    AboutViewHolder(View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.text);
    }
}
