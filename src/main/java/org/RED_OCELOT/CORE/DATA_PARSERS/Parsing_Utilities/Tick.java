package org.RED_OCELOT.CORE.DATA_PARSERS.Parsing_Utilities;

import java.math.BigDecimal;
import java.util.Date;

/** Tick object that contains data*/
public class Tick
{
    BigDecimal Ask_Price;
    BigDecimal Bid_Price;

    Date TimeStamp;     //  Unix TimeStamp - base 64 not 32

    Tick_Depth AskDepth;
    Tick_Depth BidDepth;

    public Tick(BigDecimal Ask, BigDecimal Bid , Date Time)
    {

        this.Ask_Price = Ask;
        this.Bid_Price = Bid;
        this.TimeStamp = Time;

        AskDepth = new Tick_Depth();
        BidDepth = new Tick_Depth();

    }
}
