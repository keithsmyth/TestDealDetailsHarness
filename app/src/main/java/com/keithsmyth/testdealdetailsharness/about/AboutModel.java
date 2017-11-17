package com.keithsmyth.testdealdetailsharness.about;

import com.keithsmyth.testdealdetailsharness.model.Deal;

class AboutModel {
    final String about;

    AboutModel(Deal deal) {
        this.about = deal.about;
    }
}
