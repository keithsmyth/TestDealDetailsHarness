package com.keithsmyth.testdealdetailsharness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.keithsmyth.testdealdetailsharness.about.AboutFeature;
import com.keithsmyth.testdealdetailsharness.fineprint.FinePrintFeature;
import com.keithsmyth.testdealdetailsharness.header.HeaderFeature;
import com.keithsmyth.testdealdetailsharness.map.MapFeature;
import com.keithsmyth.testdealdetailsharness.model.Deal;

import static java.util.Arrays.asList;

public class DealDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_details);

        SimpleAdapter simpleAdapter = new SimpleAdapter(asList(
            new HeaderFeature(),
            new AboutFeature(),
            new FinePrintFeature(),
            new MapFeature()
        ));

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(this));
        recyclerView.setAdapter(simpleAdapter);

        simpleAdapter.updateFeatures(Deal.create());

        findViewById(R.id.update_button).setOnClickListener(v -> simpleAdapter.notifyDataSetChanged());
    }
}
