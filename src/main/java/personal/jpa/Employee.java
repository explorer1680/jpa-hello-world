package personal.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer eid;

    private String ename;

    private Double salary;

    private String deg;
}