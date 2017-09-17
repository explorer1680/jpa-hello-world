package personal.jpa.mapping.joincolumn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Part {

    @Id
    @GeneratedValue
    @Column(name="part_id")
    private Integer pId;
}

