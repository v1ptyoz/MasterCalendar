public class Client {
    private int id;
    private String name;
    private boolean isGood;

    public Client(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", isGood=" + isGood +
                '}';
    }
}
