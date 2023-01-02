import java.io.Serializable;

public class Employee implements Serializable {
  private String name;
  private Integer id;
  private Double salary;

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", salary=" + salary +
            '}';
  }

  public Employee(String name, Integer id, Double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public Employee setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getId() {
    return id;
  }

  public Employee setId(Integer id) {
    this.id = id;
    return this;
  }

  public Double getSalary() {
    return salary;
  }

  public Employee setSalary(Double salary) {
    this.salary = salary;
    return this;
  }
}
