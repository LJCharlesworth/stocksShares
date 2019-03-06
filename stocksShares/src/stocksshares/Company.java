package stocksshares;

public class Company {
    
    private final String name;
    private double sharePrice;

    public Company(String name, double sharePrice) {
        this.name = name;
        this.sharePrice = sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public String getName() {
        return name;
    }
    
}
