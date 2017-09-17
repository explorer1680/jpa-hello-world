package personal.jpa.mapping.component;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Example {
	
	@Id
	private Integer id;
	
	@Embedded//Id
	private EmClass emClass;
	
	private String str;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EmClass getEmClass() {
		return emClass;
	}

	public void setEmClass(EmClass emClass) {
		this.emClass = emClass;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Example [id=" + id + ", emClass=" + emClass + ", str=" + str + "]";
//		return "Example [emClass=" + emClass + ", str=" + str + "]";
	}

	
}
