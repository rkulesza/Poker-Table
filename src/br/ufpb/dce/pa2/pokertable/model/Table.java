package br.ufpb.dce.pa2.pokertable.model;

public class Table implements ITable{
	private CircularList<Player> players;
	
	private int dealerPosition;
	private int pot;
	private int minimumBet;
	
	public Table() {
		dealerPosition = -1;
		pot = 0;
		minimumBet = 0;
		players = new CircularList<Player>();
	}
	
	public boolean addPlayer(String name, int position){
		Player player = new Player(name);
		return players.add(player);
	}
	public int getDealerPosition(){
		return dealerPosition;
	}
	public int getSmallBlindPosition() {
		if(getDealerPosition() < 3)
			return getDealerPosition() + 1;
		else
			return 0;
	}
	public int getBigBlindPosition() {
		if(getSmallBlindPosition() < 3)
			return getSmallBlindPosition() + 1;
		else
			return 0;
	}
	public void setMinimumBet(int minimumBet) {
		this.minimumBet = minimumBet;
	}
	public void passDealer(){
		/*if(dealerPosition < 3)
			dealerPosition++;
		else
			dealerPosition = 0;*/
		dealerPosition = getSmallBlindPosition();
	}
	public void setDealerPostion(int dealerPosition) {
		this.dealerPosition = dealerPosition;
	}
	public int getPot(){
		return pot;
	}
	public int getSmallBlindBet(){
		return getBigBlindBet() / 2;
	}
	public int getBigBlindBet() {
		return minimumBet;
	}
	public void bet(Player player, int value) {
		
	}
	public void call(Player player, int value) {
		
	}
	public void check(Player player) {
		
	}
	public void fold(Player player) {
		
	}
	public int getActualBet() {
		return 0;
	}
	public Player getPlayer(int position) {
		return null;
	}
	public boolean EndOfTheGame() {
		return false;
	}
	public void begin() {
		
	}
}