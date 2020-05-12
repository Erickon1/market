package mx.escapeSchool.market.domain;

import java.math.BigDecimal;

public class Product {
	
	public Product() {		
	}
	
	public Product(String name, BigDecimal cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	private String name;
	private BigDecimal cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

}
