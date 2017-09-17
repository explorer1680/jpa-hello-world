package personal.jpa.mapping.joincolumn;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Product {

	@Id
	private String serialNumber;

	@OneToMany
	@JoinColumn(name = "P_ID", nullable = false, referencedColumnName = "uniqueNumber", foreignKey = @ForeignKey(name = "FK_00001"))
	// private Set<Part> parts = new HashSet<>();
	private List<Part> parts = new ArrayList<>();

	@Column(unique = true)
	private Integer uniqueNumber;
}
