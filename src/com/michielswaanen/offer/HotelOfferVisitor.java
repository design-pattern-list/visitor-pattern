package com.michielswaanen.offer;

import com.michielswaanen.creditcard.BronzeCreditCard;
import com.michielswaanen.creditcard.GoldCreditCard;
import com.michielswaanen.creditcard.SilverCreditCard;

public class HotelOfferVisitor implements OfferVisitor {

    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronze) {
        System.out.println("Computing the cashback for a *" + bronze.getName() + "* buying *a hotel room*");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silver) {
        System.out.println("Computing the cashback for a *" + silver.getName() + "* buying *a hotel room*");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard gold) {
        System.out.println("Computing the cashback for a *" + gold.getName() + "* buying *a hotel room*");

    }
}
