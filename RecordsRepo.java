import java.util.ArrayList;
import java.util.TreeMap;

public class RecordsRepo {
    private static ArrayList allRecords;

    private RecordsRepo() {}

    public static ArrayList getInstance() {
        if (allRecords == null) {
            allRecords = new ArrayList();
        }
        return allRecords;
    }
}
