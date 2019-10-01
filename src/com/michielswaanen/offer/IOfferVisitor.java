package com.michielswaanen.offer;

import com.michielswaanen.creditcard.BronzeCreditCard;
import com.michielswaanen.creditcard.GoldCreditCard;
import com.michielswaanen.creditcard.SilverCreditCard;

public interface IOfferVisitor {
    void visitBronzeCreditCard(BronzeCreditCard bronze);
    void visitSilverCreditCard(SilverCreditCard silver);
    void visitGoldCreditCard(GoldCreditCard gold);
}
