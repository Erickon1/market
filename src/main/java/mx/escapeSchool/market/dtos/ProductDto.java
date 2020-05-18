package mx.escapeSchool.market.dtos;

import java.math.BigDecimal;


public class ProductDto {

	private Long id;
	private String name;
	private BigDecimal cost;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductDto(Long id, String name, BigDecimal cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
