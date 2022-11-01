package server;

public interface Appliance {
    String accept(Visitor visitor);
}
