package com.michielswaanen;

import com.michielswaanen.creditcard.BronzeCreditCard;
import com.michielswaanen.creditcard.CreditCard;
import com.michielswaanen.creditcard.GoldCreditCard;
import com.michielswaanen.creditcard.SilverCreditCard;
import com.michielswaanen.offer.FlightOfferVisitor;
import com.michielswaanen.offer.GasOfferVisitor;
import com.michielswaanen.offer.HotelOfferVisitor;
import com.michielswaanen.offer.OfferVisitor;

/**
 * @author Michiel Swaanen
 */
public class Main {

    public static void main(String[] args) {

        // Initialization
        OfferVisitor hotelOffer = new HotelOfferVisitor();
        OfferVisitor gasOffer = new GasOfferVisitor();
        OfferVisitor flightOffer = new FlightOfferVisitor();

        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();

        // Visitor Pattern
        bronze.accept(hotelOffer);
        gold.accept(gasOffer);
        silver.accept(flightOffer);
    }
}
