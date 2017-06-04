package personal.jpa.configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Cat")
public class Cat {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String color;

	public Cat() {
		super();
	}

	public Cat(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", color=" + color + "]";
	}
}
