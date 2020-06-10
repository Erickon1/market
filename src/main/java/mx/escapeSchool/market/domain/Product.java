package mx.escapeSchool.market.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.ToString;

@ToString(includeFieldNames = true)
@Entity
public class Product extends AuditModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private BigDecimal cost;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "type_product_id", nullable = false)
	private TypeProduct typeProduct;
	
	public Product() {		
	}
	
	
	public Product(String name, BigDecimal cost, TypeProduct typeProduct) {
		super();
		this.name = name;
		this.cost = cost;
		this.typeProduct = typeProduct;
	}


	public TypeProduct getTypeProduct() {
		return typeProduct;
	}


	public void setTypeProduct(TypeProduct typeProduct) {
		this.typeProduct = typeProduct;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
	public Long getId() {
		return id;
	}
	

}
