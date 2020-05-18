package mx.escapeSchool.market.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private BigDecimal cost;
	
	
	public Product() {		
	}
	
	
	public Product( String name, BigDecimal cost) {
		super();
		this.name = name;
		this.cost = cost;
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
