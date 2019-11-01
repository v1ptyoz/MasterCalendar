import java.util.ArrayList;

public class ClientsRepo {
    private static ArrayList clientList;

    private ClientsRepo() {}

    public static ArrayList getInstance() {
        if (clientList == null) {
            clientList = new ArrayList();
        }
        return clientList;
    }
}
