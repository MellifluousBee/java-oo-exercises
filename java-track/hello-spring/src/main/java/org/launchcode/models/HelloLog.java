package org.launchcode.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;//more general than the Hibernate ones in case you don't want to use Hibernate
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="hellolog")//give it the name of a table to store the data in)
public class HelloLog {
	
	//fields
	private String name;
	private Date timestamp;
	private int uid;//provides unique identifier
	
	//constructor
	public HelloLog(String name){
		this.name=name;
		timestamp= new Date();
	}
	
	//no-argument constructor,it's necessary for Hibernate ORM
	public HelloLog(){}
	
	@Id//primary key
	@GeneratedValue//Hibernate will create a value for us
	@NotNull
	@Column(name="uid", unique= true)
	public int getUid(){
		return uid;
	}
	public void setUid(int uid){
		this.uid= uid;
	}
	
	@Column(name="name")//define fields to be used in the table, in this case it will store the column as name
	//puts the name in the name part of the table
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@NotNull //don't allow me to put this property in the database if it's null
	@Column (name="timestamp")//allows the timestamp property to be stored in the database
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
}
