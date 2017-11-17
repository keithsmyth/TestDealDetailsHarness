package com.keithsmyth.testdealdetailsharness.header;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.keithsmyth.testdealdetailsharness.R;

class HeaderViewHolder extends RecyclerView.ViewHolder {

    final TextView textView;

    HeaderViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.title);
    }
}
