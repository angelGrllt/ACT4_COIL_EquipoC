public class city {
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public city(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
