package com.example.ahmadnajjar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private long id;
	  private String name, area;
	  private int length;

	  public Trip() {}
	  
	  
	  public Trip(String name, String area, 
			    long id, int length) {
			    super();
			    this.id = id;
			    this.area = area;
			    this.name = name;
			    this.length = length;
			  }


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}
}
