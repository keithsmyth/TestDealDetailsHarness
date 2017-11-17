package com.keithsmyth.testdealdetailsharness.header;

import com.keithsmyth.testdealdetailsharness.model.Deal;

class HeaderModel {
    final String title;

    HeaderModel(Deal deal) {
        this.title = deal.title;
    }
}
