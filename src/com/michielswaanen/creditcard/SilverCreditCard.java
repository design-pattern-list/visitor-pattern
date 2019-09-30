package com.michielswaanen.creditcard;

import com.michielswaanen.offer.OfferVisitor;

public class SilverCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "Silver Credit Card";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitSilverCreditCard(this);
    }
}
