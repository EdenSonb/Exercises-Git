package client;

import server.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(new User(1, "Eden User", "123"));
        appliances.add(new Asset(2, "Eden Owner", 100.0));
        appliances.add(new Group(3, 10));

        ExportToJsonVisitor exportToJsonVisitor = new ExportToJsonVisitor();
        for (Appliance appliance : appliances) {
            System.out.println(appliance.accept(exportToJsonVisitor));
        }
    }
}
