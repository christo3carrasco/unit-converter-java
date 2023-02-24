package com.carrasco.model;

import com.carrasco.util.Factor;
import com.carrasco.util.NameSymbol;

public class Currency extends Unit {
    public Currency(int id) {
        this.setId(id);
        if (id >= 1 && id <= 5) {
            this.setName("Soles");
            this.setSymbol("PEN");
            this.setFactor(Factor.solesToAnother.get(id - 1));
        } else {
            this.setName(NameSymbol.currencyName.get(id - 6));
            this.setSymbol(NameSymbol.currencySymbol.get(id - 6));
            this.setFactor(Factor.anotherToSoles.get(id - 6));
        }
    }

    @Override
    public double convert(double quantity) {
        return Math.round(quantity * this.getFactor() * 100.0) / 100.0;
    }
}
