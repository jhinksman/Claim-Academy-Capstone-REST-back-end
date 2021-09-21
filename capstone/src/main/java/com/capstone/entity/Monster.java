package com.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="monster")
public class Monster {

	@Id
	@Column(name="name")
	private String name;
	@Column(name="name_picture")
	private String namePicture;
	@Column(name="type")
	private String type;
	@Column(name="type_picture")
	private String typePicture;
	@Column(name="element")
	private String element;
	@Column(name="element_picture")
	private String elementPicture;
	@ManyToOne
	@JoinColumn(name="gene_name")
	private Gene gene;
	
	
	//no argument constructor
	public Monster() {
		super();
	}

	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNamePicture() {
		return namePicture;
	}
	
	public void setNamePicture(String namePicture) {
		this.namePicture = namePicture;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getTypePicture() {
		return typePicture;
	}
	
	public void setTypePicture(String typePicture) {
		this.typePicture = typePicture;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getElementPicture() {
		return elementPicture;
	}

	public void setElementPicture(String elementPicture) {
		this.elementPicture = elementPicture;
	}

	//comment out to avoid bidirectional loop	
//	public Gene getGene() {
//		return gene;
//	}
//
//	public void setGene(Gene gene) {
//		this.gene = gene;
//	}

	

}
