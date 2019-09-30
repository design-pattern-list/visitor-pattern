package com.michielswaanen.creditcard;

import com.michielswaanen.offer.OfferVisitor;

public interface CreditCard {
    String getName();
    void accept(OfferVisitor v);
}
