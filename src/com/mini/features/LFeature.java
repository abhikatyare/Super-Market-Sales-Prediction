package com.mini.features;

import java.util.Date;

public class LFeature {
	
	public Integer orderMethodType;
	public Double revenue;
	public Integer quantity;
	public Double grossMargin;
	
	
	public Integer getOrderMethodType() {
		return orderMethodType;
	}

	public void setOrderMethodType(Integer orderMethodType) {
		this.orderMethodType = orderMethodType;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getGrossMargin() {
		return grossMargin;
	}

	public void setGrossMargin(Double grossMargin) {
		this.grossMargin = grossMargin;
	}

	public LFeature(Feature l) {
		// TODO Auto-generated constructor stub
		this.setOrderMethodType(l.getOrderMethodType());
		this.setRevenue(l.getRevenue());
		this.setQuantity(l.getQuantity());
		this.setGrossMargin(l.getGrossMargin());		
	}



	public Double getY() {
		double score=0;
		score += this.getOrderMethodType()/Assumptions.WOrderMethodType;
		score += this.getRevenue()/Assumptions.WRevenue;
		score += this.getQuantity()/Assumptions.WQuantity;
		score += this.getGrossMargin()/Assumptions.WGrossMargin;
		System.out.println("SCORE : "+score);
		return score;
	}
	
	public double[] getFeatureArray() {
		return new double[] {
				this.getOrderMethodType(),
				this.getRevenue(),
				this.getQuantity(),
				this.getGrossMargin()
		};
	}

	@Override
	public String toString() {
		return "LFeature [orderMethodType=" + orderMethodType + ", revenue=" + revenue + ", quantity=" + quantity
				+ ", grossMargin=" + grossMargin + "]";
	}

	
	

}
