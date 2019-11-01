import java.util.ArrayList;

public class Dispatcher {
    public static void main(String[] args) throws Exception {
        ArrayList<Client> clientList = ClientsRepo.getInstance();
        ArrayList<Record> records = RecordsRepo.getInstance();
        clientList.add(new Client("Client1", 1));
        clientList.add(new Client("Client2", 2));
        records.add(Record.newRecord());
        records.add(Record.newRecord());

        records.forEach(record -> {
            ConsoleHelper.printString(record.getDate());
            ConsoleHelper.printString(record.getClient().toString());
        });
    }
}
