package com.michielswaanen.creditcard;

import com.michielswaanen.offer.IOfferVisitor;

public class GoldCreditCard implements ICreditCard {

    @Override
    public String getName() {
        return "Gold Credit Card";
    }

    @Override
    public void accept(IOfferVisitor v) {
        v.visitGoldCreditCard(this);
    }
}
