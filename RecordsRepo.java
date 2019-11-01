import java.util.ArrayList;
import java.util.TreeMap;

public class RecordsRepo {
    private static ArrayList<Record> allRecords;

    private RecordsRepo() {}

    public static ArrayList<Record> getInstance() {
        if (allRecords == null) {
            allRecords = new ArrayList<Record>();
        }
        return allRecords;
    }
}
