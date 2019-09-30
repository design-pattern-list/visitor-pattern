package com.michielswaanen.creditcard;

import com.michielswaanen.offer.OfferVisitor;

public class GoldCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "Gold Credit Card";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitGoldCreditCard(this);
    }
}
