package dom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;

    private Integer departmentId;
    // private Department department;

    protected Employee() {}

    public Employee(final String firstNameParam, final String lastNameParam) {
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
    }

    @Override
    public String toString() {
        return String.format("Employee [id = %d, firstName = '%s', lastName = '%s'",
                id, firstName, lastName);
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }
}
