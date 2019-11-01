import java.util.*;

public class Dispatcher {
    public static void main(String[] args) throws Exception {
        ArrayList<Client> clientList = ClientsRepo.getInstance();
        //ArrayList<Record> records = RecordsRepo.getInstance();

        clientList.add(new Client("Client1", 1));
        clientList.add(new Client("Client2", 2));

        Record r1 = Record.newRecord();
        Record r2 = Record.newRecord();

        writeData(r1);
        writeData(r2);

        ConsoleHelper.printString("Done!");
    }

    private static void writeData(Record record) {
        TreeMap<String, HashMap<Client, String>> records = RecordsRepo.getInstance();
        if (!records.containsKey(record.getDayMonthYear())) {
            records.put(record.getDayMonthYear(), new HashMap<>());
        }

        HashMap<Client, String> map = records.get(record.getDayMonthYear());
        map.put(record.getClient(), record.getHoursMinutes());
        records.put(record.getDayMonthYear(), map);
    }
}
