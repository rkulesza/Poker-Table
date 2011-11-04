package br.ufpb.dce.pa2.pokertable.model;

import org.droidpersistence.annotation.Column;
import org.droidpersistence.annotation.Table;
import org.droidpersistence.model.BaseModel;

@Table(name="Players")
public class Player extends BaseModel {

	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private int age;
		
	@Column(name="Money")
	private int money;
		
	@Column(name="Points")
	private int points;
		
	public Player(){
		this("Player",0,0);
		this.points = 0;
	}
		
	public Player(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.points = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoints() {
		
		return this.points;
	}
	
	public int getMoney() {
			
		return this.money;
	}
	
}
