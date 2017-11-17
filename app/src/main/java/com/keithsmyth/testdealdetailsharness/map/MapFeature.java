package com.keithsmyth.testdealdetailsharness.map;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.keithsmyth.testdealdetailsharness.BaseFeatureController;
import com.keithsmyth.testdealdetailsharness.R;
import com.keithsmyth.testdealdetailsharness.model.Deal;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class MapFeature extends BaseFeatureController<MapModel, MapViewHolder> {

    @Override
    public List<MapModel> buildItems(Deal deal) {
        if (deal == null) {
            return emptyList();
        }
        return singletonList(new MapModel(deal));
    }

    @Override
    public MapViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        super.createViewHolder(parent, inflater);
        return new MapViewHolder(inflater.inflate(R.layout.map, parent, false));
    }

    @Override
    public void bindViewHolder(MapViewHolder holder, MapModel mapModel) {
        super.bindViewHolder(holder, mapModel);
    }
}
