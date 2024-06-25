package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double dollarPrice, double dollarQuantity) {
        return dollarPrice * dollarQuantity * (1.0 + IOF);
    }
}
