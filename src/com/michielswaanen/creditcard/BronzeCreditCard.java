package com.michielswaanen.creditcard;

import com.michielswaanen.offer.IOfferVisitor;

public class BronzeCreditCard implements ICreditCard {

    @Override
    public String getName() {
        return "Bronze Credit Card";
    }

    @Override
    public void accept(IOfferVisitor v) {
        v.visitBronzeCreditCard(this);
    }
}
