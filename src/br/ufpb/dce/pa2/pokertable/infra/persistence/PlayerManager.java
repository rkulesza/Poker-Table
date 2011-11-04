package br.ufpb.dce.pa2.pokertable.infra.persistence;

import java.util.List;

import br.ufpb.dce.pa2.pokertable.model.Player;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

public class PlayerManager {

	private Context context;
	private SQLiteDatabase database;
	private PlayerDao playerDao;
	
	public PlayerManager(Context context){
		
		setContext(context);
		SQLiteOpenHelper openHelper = new OpenHelper(context, "DATABASE", null, 2);
		setDatabase(openHelper.getWritableDatabase());
		this.playerDao = new PlayerDao(new PlayerTableDefinition(), database);
		
	}
	
	public void openDb(){
		if(! getDatabase().isOpen()){
			setDatabase(SQLiteDatabase.openDatabase(Environment.getDataDirectory() + "/data/br.ufpb.dce.pa2.pokertable/gamedatabase.db", null, SQLiteDatabase.OPEN_READWRITE));
		}
	}
	
	public void closeDb() {
		if (getDatabase().isOpen()) {
			getDatabase().close();
	    }
	}
	
	public Context getContext() {
		return context;
	}
	
	public void setContext(Context context) {
		this.context = context;
	}
	
	public SQLiteDatabase getDatabase() {
		return database;
	}
	
	public void setDatabase(SQLiteDatabase database) {
		this.database = database;
	}
	
	public PlayerDao getGameDao() {
		return playerDao;
	}
	
	public void setGameDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}
	
	public Player getPlayer(Long id){
		
		return playerDao.get(id);
	}
	
	public List<Player> getAllPlayers(){
		
		return playerDao.getAll();
	}
	
	public boolean deletePlayer(Long id){
		
		boolean result = false;
		getDatabase().beginTransaction();
		result = playerDao.delete(id.intValue());
		getDatabase().setTransactionSuccessful();
		getDatabase().endTransaction();
		return result;
	}
	
	public long insertPlayer(Player player){
		
		long result = 0;		
		try {
			getDatabase().beginTransaction();
			result = playerDao.save(player);
			getDatabase().setTransactionSuccessful();
		}catch(Exception e){
			return -1;
		}
		
		getDatabase().endTransaction();
		return result;
	}
	
	public boolean updatePlayer(Player player){
		
		boolean result = false;
		
		try {
			getDatabase().beginTransaction();
			getGameDao().update(player, player.getId());
			getDatabase().setTransactionSuccessful();
			result = true;
		} catch (Exception e) {
			return false;
		}		
		getDatabase().endTransaction();
		return result;
	}

	
	
}
