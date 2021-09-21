package com.capstone.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="gene")
public class Gene {
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="picture")
	private String picture;
	
	@Column(name="description")
	private String description;
	
	@Column(name="element")
	private String element;
	
	@Column(name="type")
	private String type;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "gene")
	private List<Monster> monsters = new ArrayList<>();

	//no argument constructor
	public Gene() {
		super();
	}
	
	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Monster> getMonsters() {
		return monsters;
	}

	public void setMonsters(List<Monster> monsters) {
		this.monsters = monsters;
	}

}
