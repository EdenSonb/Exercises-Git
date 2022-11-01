package server;

import com.google.gson.Gson;

public class ExportToJsonVisitor implements Visitor{

    @Override
    public String visit(User user) {
        return new Gson().toJson(user);
    }

    @Override
    public String visit(Asset asset) {
        return new Gson().toJson(asset);
    }

    @Override
    public String visit(Group group) {
        return new Gson().toJson(group);
    }
}
