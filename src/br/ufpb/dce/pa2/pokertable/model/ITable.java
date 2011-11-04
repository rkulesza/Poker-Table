package br.ufpb.dce.pa2.pokertable.model;

public interface ITable {
	public void setMinimumBet(int minimumBet);
	
	public int getDealerPosition();
	
	public int getSmallBlindPosition();
	
	public int getBigBlindPosition();
	
	public void passDealer();
	
	public void setDealerPostion(int dealerPosition);
	
	public int getPot();
	
	public int getSmallBlindBet();
	
	public int getBigBlindBet();
	
	public int getActualBet();
	
	public void bet(Player player, int value);
	
	public void check(Player player);
	
	public void fold(Player player);
	
	public void call(Player player, int value);
	
	public void begin();
	
	public boolean EndOfTheGame();
}