package personal.jpa;

import javax.persistence.*;

@Entity
@NamedQuery(query = "SELECT e FROM Employee e WHERE e.eid = :id", name = "find employee by id")
public class Employee {

    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private Integer eid;

    private String ename;

    private Double salary;

    private String deg;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }
}