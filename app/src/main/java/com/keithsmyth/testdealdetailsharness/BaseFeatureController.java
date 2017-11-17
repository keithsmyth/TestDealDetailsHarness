package com.keithsmyth.testdealdetailsharness;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.keithsmyth.testdealdetailsharness.model.Deal;

public abstract class BaseFeatureController<VIEW_MODEL, VIEW_HOLDER extends RecyclerView.ViewHolder> implements FeatureController<Deal, VIEW_MODEL, VIEW_HOLDER> {

    private int createCount = 0;
    private int bindCount = 0;

    @Override
    public VIEW_HOLDER createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        Log.d("Delegate", String.format("createViewHolder %1$d %2$s", ++createCount, getClass().getSimpleName()));
        return null;
    }

    @Override
    public void bindViewHolder(VIEW_HOLDER holder, VIEW_MODEL view_model) {
        //Log.d("Delegate", String.format("bindViewHolder %1$d %2$s", ++bindCount, getClass().getSimpleName()));
    }
}
