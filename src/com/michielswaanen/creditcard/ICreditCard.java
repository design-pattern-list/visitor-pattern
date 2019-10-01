package com.michielswaanen.creditcard;

import com.michielswaanen.offer.IOfferVisitor;

public interface ICreditCard {
    String getName();
    void accept(IOfferVisitor v);
}
