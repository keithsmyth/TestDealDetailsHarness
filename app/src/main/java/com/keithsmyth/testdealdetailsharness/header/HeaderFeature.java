package com.keithsmyth.testdealdetailsharness.header;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.keithsmyth.testdealdetailsharness.BaseFeatureController;
import com.keithsmyth.testdealdetailsharness.R;
import com.keithsmyth.testdealdetailsharness.model.Deal;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class HeaderFeature extends BaseFeatureController<HeaderModel, HeaderViewHolder> {

    @Override
    public List<HeaderModel> buildItems(Deal deal) {
        if (deal == null) {
            return emptyList();
        }
        return singletonList(new HeaderModel(deal));
    }

    @Override
    public HeaderViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        super.createViewHolder(parent, inflater);
        return new HeaderViewHolder(inflater.inflate(R.layout.header, parent, false));
    }

    @Override
    public void bindViewHolder(HeaderViewHolder holder, HeaderModel model) {
        super.bindViewHolder(holder, model);
        holder.textView.setText(model.title);
    }
}
