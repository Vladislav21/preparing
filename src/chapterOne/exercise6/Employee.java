package chapterOne.exercise6;

public class Employee {
    private String lastName;

    public Employee() {
    }

    public Employee(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return lastName != null ? lastName.equals(employee.lastName) : employee.lastName == null;
    }

    @Override
    public int hashCode() {
        return lastName != null ? lastName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Фамилия рабочего: "+lastName;
    }
}
