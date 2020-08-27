package dom;

public class Department {
    private Integer id;
    private String name;

    protected Department() {}

    public Department(final Integer idParam, final String nameParam) {
        this.id = idParam;
        this.name = nameParam;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
