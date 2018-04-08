package com.mini.features;

import java.util.Date;

public class Feature {
	public String retailerCountry;
	public Integer orderMethodType;
	public String retailerType;
	public String productLine;
	public String productType;
	public String product;
	public Integer year;
	public String quarter;
	public Double revenue;
	public Integer quantity;
	public Double grossMargin;
	
	public Feature(String retailerCountry, Integer orderMethodType, String retailerType, String productLine,
			String productType, String product, Integer year, String quarter, Double revenue, Integer quantity,
			Double grossMargin) {
		super();
		this.retailerCountry = retailerCountry;
		this.orderMethodType = orderMethodType;
		this.retailerType = retailerType;
		this.productLine = productLine;
		this.productType = productType;
		this.product = product;
		this.year = year;
		this.quarter = quarter;
		this.revenue = revenue;
		this.quantity = quantity;
		this.grossMargin = grossMargin;
	}

	public String getRetailerCountry() {
		return retailerCountry;
	}

	public void setRetailerCountry(String retailerCountry) {
		this.retailerCountry = retailerCountry;
	}

	public Integer getOrderMethodType() {
		return orderMethodType;
	}

	public void setOrderMethodType(Integer orderMethodType) {
		this.orderMethodType = orderMethodType;
	}

	public String getRetailerType() {
		return retailerType;
	}

	public void setRetailerType(String retailerType) {
		this.retailerType = retailerType;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
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

	@Override
	public String toString() {
		return "Feature [retailerCountry=" + retailerCountry + ", orderMethodType=" + orderMethodType
				+ ", retailerType=" + retailerType + ", productLine=" + productLine + ", productType=" + productType
				+ ", product=" + product + ", year=" + year + ", quarter=" + quarter + ", revenue=" + revenue
				+ ", quantity=" + quantity + ", grossMargin=" + grossMargin + "]";
	}
	
}
	
