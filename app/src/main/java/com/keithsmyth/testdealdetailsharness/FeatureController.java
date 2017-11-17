package com.keithsmyth.testdealdetailsharness;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

public interface FeatureController<MODEL, VIEW_MODEL, VIEW_HOLDER extends RecyclerView.ViewHolder> {

    List<VIEW_MODEL> buildItems(MODEL model);

    VIEW_HOLDER createViewHolder(ViewGroup parent, LayoutInflater inflater);

    void bindViewHolder(VIEW_HOLDER holder, VIEW_MODEL model);
}
