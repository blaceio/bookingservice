package com.blaCe.microservices.bookingservice.products;

import org.joda.time.DateTime;

public class Vanilla {

    private String tradeid;
    private DateTime tradedate;
    private String client;
    private String clienttrader;
    private String ccypair;
    private String buysell;
    private DateTime expiry;
    private DateTime delivery;
    private String callput;
    private double strike;
    private String cut;
    private double notional;
    private double price;
    private double premium;
    private double counteramount;
    private String deliverability;
    private String premiumccy;
    private String payoutccy;
    private String optionstyle;

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public DateTime getTradedate() {
        return tradedate;
    }

    public void setTradedate(DateTime tradedate) {
        this.tradedate = tradedate;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClienttrader() {
        return clienttrader;
    }

    public void setClienttrader(String clienttrader) {
        this.clienttrader = clienttrader;
    }

    public String getCcypair() {
        return ccypair;
    }

    public void setCcypair(String ccypair) {
        this.ccypair = ccypair;
    }

    public String getBuysell() {
        return buysell;
    }

    public void setBuysell(String buysell) {
        this.buysell = buysell;
    }

    public DateTime getExpiry() {
        return expiry;
    }

    public void setExpiry(DateTime expiry) {
        this.expiry = expiry;
    }

    public DateTime getDelivery() {
        return delivery;
    }

    public void setDelivery(DateTime delivery) {
        this.delivery = delivery;
    }

    public String getCallput() {
        return callput;
    }

    public void setCallput(String callput) {
        this.callput = callput;
    }

    public double getStrike() {
        return strike;
    }

    public void setStrike(double strike) {
        this.strike = strike;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public double getNotional() {
        return notional;
    }

    public void setNotional(double notional) {
        this.notional = notional;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public double getCounteramount() {
        return counteramount;
    }

    public void setCounteramount(double counteramount) {
        this.counteramount = counteramount;
    }

    public String getDeliverability() {
        return deliverability;
    }

    public void setDeliverability(String deliverability) {
        this.deliverability = deliverability;
    }

    public String getPremiumccy() {
        return premiumccy;
    }

    public void setPremiumccy(String premiumccy) {
        this.premiumccy = premiumccy;
    }

    public String getPayoutccy() {
        return payoutccy;
    }

    public void setPayoutccy(String payoutccy) {
        this.payoutccy = payoutccy;
    }

    public String getOptionstyle() {
        return optionstyle;
    }

    public void setOptionstyle(String optionstyle) {
        this.optionstyle = optionstyle;
    }

    @Override
    public String toString() {
        return "Vanilla{" +
                "tradeid='" + tradeid + '\'' +
                ", tradedate=" + tradedate +
                ", client='" + client + '\'' +
                ", clienttrader='" + clienttrader + '\'' +
                ", ccypair='" + ccypair + '\'' +
                ", buysell='" + buysell + '\'' +
                ", expiry=" + expiry +
                ", delivery=" + delivery +
                ", callput='" + callput + '\'' +
                ", strike=" + strike +
                ", cut='" + cut + '\'' +
                ", notional=" + notional +
                ", price=" + price +
                ", premium=" + premium +
                ", counteramount=" + counteramount +
                ", deliverability='" + deliverability + '\'' +
                ", premiumccy='" + premiumccy + '\'' +
                ", payoutccy='" + payoutccy + '\'' +
                ", optionstyle='" + optionstyle + '\'' +
                '}';
    }
}
