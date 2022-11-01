package server;

public class Group implements Appliance{
    private final int id;
    private int size;

    public Group(int id, int size) {
        this.id = id;
        this.size = size;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
