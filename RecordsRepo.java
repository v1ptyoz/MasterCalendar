import java.util.*;

public class RecordsRepo {
    //private static ArrayList<Record> allRecords;
    private static TreeMap<String, HashMap<Client, String>> mapRecords;

    private RecordsRepo() {}

    public static TreeMap<String, HashMap<Client, String>> getInstance() {
        if (mapRecords == null) {
            mapRecords = new TreeMap<String, HashMap<Client, String>>();
        }
        return mapRecords;
    }
}
