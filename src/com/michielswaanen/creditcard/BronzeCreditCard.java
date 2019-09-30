package com.michielswaanen.creditcard;

import com.michielswaanen.offer.OfferVisitor;

public class BronzeCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "Bronze Credit Card";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitBronzeCreditCard(this);
    }
}
