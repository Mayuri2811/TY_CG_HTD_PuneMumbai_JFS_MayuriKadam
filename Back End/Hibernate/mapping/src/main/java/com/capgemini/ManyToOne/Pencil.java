package com.capgemini.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Pencil {
	@Id
	@Column
private int id;
	@Column
private String colour; 
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="boxid",nullable=false)
	private PencilBox pencilBox;

public PencilBox getPencilBox() {
		return pencilBox;
	}
	public void setPencilBox(PencilBox pencilBox) {
		this.pencilBox = pencilBox;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}


}
