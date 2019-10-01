package com.michielswaanen;

import com.michielswaanen.creditcard.BronzeCreditCard;
import com.michielswaanen.creditcard.ICreditCard;
import com.michielswaanen.creditcard.GoldCreditCard;
import com.michielswaanen.creditcard.SilverCreditCard;
import com.michielswaanen.offer.FlightOfferVisitor;
import com.michielswaanen.offer.GasOfferVisitor;
import com.michielswaanen.offer.HotelOfferVisitor;
import com.michielswaanen.offer.IOfferVisitor;

/**
 * @author Michiel Swaanen
 */
public class Main {

    public static void main(String[] args) {

        // Initialization
        IOfferVisitor hotelOffer = new HotelOfferVisitor();
        IOfferVisitor gasOffer = new GasOfferVisitor();
        IOfferVisitor flightOffer = new FlightOfferVisitor();

        ICreditCard bronze = new BronzeCreditCard();
        ICreditCard silver = new SilverCreditCard();
        ICreditCard gold = new GoldCreditCard();

        // Visitor Pattern
        bronze.accept(hotelOffer);
        gold.accept(gasOffer);
        silver.accept(flightOffer);
    }
}
