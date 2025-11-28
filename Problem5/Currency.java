package Problem5;

public enum Currency {
    USD(57),
    EUR(62),
    JPY(0.39);

    private final double rate;
    Currency(double rate) { this.rate = rate; }
    public double getRate() { return rate; }
}
