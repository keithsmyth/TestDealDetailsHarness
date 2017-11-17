package com.keithsmyth.testdealdetailsharness.fineprint;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.keithsmyth.testdealdetailsharness.R;

class FinePrintViewHolder extends RecyclerView.ViewHolder {

    final TextView text;

    FinePrintViewHolder(View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.text);
    }
}
