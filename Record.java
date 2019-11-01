import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Record {
    private Calendar date;
    private Client client;

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy, EEEE '-' HH:mm");
        return dateFormat.format(this.date.getTime());
    }

    public void setDate(String dateString) {
        String[] str = dateString.split(" ");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        int hour = Integer.parseInt(str[3]);
        int minute = Integer.parseInt(str[4]);
        Calendar calendar = new GregorianCalendar(year, month-1 , day);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        this.date = calendar;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Record(String str, Client client) {
        this.client = client;
        setDate(str);
    }

    public static Record newRecord() throws Exception {
        ArrayList<Client> clients = ClientsRepo.getInstance();
        ConsoleHelper.printString("Введите id клиента: ");
        int id = Integer.parseInt(ConsoleHelper.getString());
        for (Client client: clients) {
            if (client.getId() == id) {
                ConsoleHelper.printString("Введите время в формате 'дд мм гггг чч мм': ");
                String time = ConsoleHelper.getString();
                return new Record(time, client);
            }
        }
        throw new Exception("Клиент с заданным id " + id + " не найден");
    }

}
