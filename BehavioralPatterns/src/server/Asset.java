package server;

public class Asset implements Appliance{
    private final int serialNumber;
    private String owner;
    private double rating;

    public Asset(int serialNumber, String owner, double rating) {
        this.serialNumber = serialNumber;
        this.owner = owner;
        this.rating = rating;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
