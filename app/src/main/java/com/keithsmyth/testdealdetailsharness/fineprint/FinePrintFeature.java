package com.keithsmyth.testdealdetailsharness.fineprint;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.keithsmyth.testdealdetailsharness.BaseFeatureController;
import com.keithsmyth.testdealdetailsharness.R;
import com.keithsmyth.testdealdetailsharness.model.Deal;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class FinePrintFeature extends BaseFeatureController<FinePrintModel, FinePrintViewHolder> {

    @Override
    public List<FinePrintModel> buildItems(Deal deal) {
        if (deal == null) {
            return emptyList();
        }
        return singletonList(new FinePrintModel(deal));
    }

    @Override
    public FinePrintViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        super.createViewHolder(parent, inflater);
        return new FinePrintViewHolder(inflater.inflate(R.layout.fine_print, parent, false));
    }

    @Override
    public void bindViewHolder(FinePrintViewHolder holder, FinePrintModel model) {
        super.bindViewHolder(holder, model);
        holder.text.setText(model.finePrint);
    }
}
