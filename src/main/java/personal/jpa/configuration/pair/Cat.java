package personal.jpa.configuration.pair;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cat {
	
	@Id
	@GeneratedValue
	private Integer id;

}
