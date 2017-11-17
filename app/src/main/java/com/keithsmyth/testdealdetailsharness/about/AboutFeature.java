package com.keithsmyth.testdealdetailsharness.about;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.keithsmyth.testdealdetailsharness.BaseFeatureController;
import com.keithsmyth.testdealdetailsharness.R;
import com.keithsmyth.testdealdetailsharness.model.Deal;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class AboutFeature extends BaseFeatureController<AboutModel, AboutViewHolder> {

    @Override
    public List<AboutModel> buildItems(Deal deal) {
        if (deal == null) {
            return emptyList();
        }
        return singletonList(new AboutModel(deal));
    }

    @Override
    public AboutViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        super.createViewHolder(parent, inflater);
        return new AboutViewHolder(inflater.inflate(R.layout.about, parent, false));
    }

    @Override
    public void bindViewHolder(AboutViewHolder holder, AboutModel model) {
        super.bindViewHolder(holder, model);
        holder.text.setText(model.about);
    }
}
