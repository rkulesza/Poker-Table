package br.ufpb.dce.pa2.pokertable.model;

import org.droidpersistence.annotation.*;
import org.droidpersistence.model.BaseModel;

@Table(name="Games")
public class Game extends BaseModel{
	
	private final int numberOfPlayers = 4;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="StartMoney")
	private int startMoney;
	
	@Column(name="SmallBlind")
	private int smallBlind;
	
	public Game(String table, int startMoney, int smallBlind) {
		super();
		this.name = table;
		this.startMoney = startMoney;
		this.smallBlind = smallBlind;
		
	}
	
	public Game(){
		this("Table",10,1);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String table) {
		this.name = table;
	}

	public int getStartMoney() {
		return startMoney;
	}

	public void setStartMoney(int startMoney) {
		this.startMoney = startMoney;
	}

	public int getSmallBlind() {
		return smallBlind;
	}

	public void setSmallBlind(int smallBlind) {
		this.smallBlind = smallBlind;
	}

	public int getNumberOfPlayers(){
		return numberOfPlayers;
	}

}
