package com.keithsmyth.testdealdetailsharness.fineprint;

import com.keithsmyth.testdealdetailsharness.model.Deal;

class FinePrintModel {
    final String finePrint;

    FinePrintModel(Deal deal) {
        this.finePrint = deal.finePrint;
    }
}
