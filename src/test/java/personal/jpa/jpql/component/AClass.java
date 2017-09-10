package personal.jpa.jpql.component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AClass {
	
	@Id
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AClass [id=" + id + "]";
	}
}
