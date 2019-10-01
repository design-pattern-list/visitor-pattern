package com.michielswaanen.creditcard;

import com.michielswaanen.offer.IOfferVisitor;

public class SilverCreditCard implements ICreditCard {

    @Override
    public String getName() {
        return "Silver Credit Card";
    }

    @Override
    public void accept(IOfferVisitor v) {
        v.visitSilverCreditCard(this);
    }
}
