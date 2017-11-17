package com.keithsmyth.testdealdetailsharness;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.keithsmyth.testdealdetailsharness.model.Deal;
import java.util.ArrayList;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<FeatureController> features = new ArrayList<>();
    private final List<Object> items = new ArrayList<>();

    SimpleAdapter(List<FeatureController> features) {
        this.features.addAll(features);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return features.get(viewType).createViewHolder(parent, LayoutInflater.from(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        features.get(position).bindViewHolder(holder, items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    void updateFeatures(Deal deal) {
        items.clear();
        for (FeatureController feature : this.features) {
            items.addAll(feature.buildItems(deal));
        }
        notifyDataSetChanged();
    }
}
