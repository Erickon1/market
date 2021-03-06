package mx.escapeSchool.market.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.ToString;

@ToString(of = {"id","name"},
	includeFieldNames = true)
@Entity
@Table(name = "type_product")
public class TypeProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, unique = true)
	private String name;

	@OneToMany(mappedBy = "typeProduct", fetch = FetchType.EAGER)
	private Set<Product> products;
	
	public TypeProduct() {
		// TODO Auto-generated constructor stub
	}

	public TypeProduct(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
