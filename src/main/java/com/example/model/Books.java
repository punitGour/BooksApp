package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	
	@Id
	private String id;
	
	private String name;
	private String price;
	private String author;
	private String publishedYear;
	private String discount;
	private String status;
	
	
	
	public Books(String id, String name, String price, String author, String publishedYear, String discount, String status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.publishedYear = publishedYear;
		this.discount = discount;
		this.status = status;
	}
	public Books() {
		// TODO Auto-generated constructor stub
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Books [ID=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", publishedYear="
				+ publishedYear + ", discount=" + discount + ", status=" + status + "]";
	}
	
	

}
