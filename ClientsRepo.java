import java.util.ArrayList;

public class ClientsRepo {
    private static ArrayList<Client> clientList;

    private ClientsRepo() {}

    public static ArrayList<Client> getInstance() {
        if (clientList == null) {
            clientList = new ArrayList<Client>();
        }
        return clientList;
    }
}
