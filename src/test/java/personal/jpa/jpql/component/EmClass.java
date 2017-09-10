package personal.jpa.jpql.component;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class EmClass implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private AClass aClass;
	
	private String description;

	public AClass getaClass() {
		return aClass;
	}

	public void setaClass(AClass aClass) {
		this.aClass = aClass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "EmClass [aClass=" + aClass + ", description=" + description + "]";
	}
}
