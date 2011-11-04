package br.ufpb.dce.pa2.pokertable.infra.persistence;

import org.droidpersistence.dao.DroidDao;
import org.droidpersistence.dao.TableDefinition;
import android.database.sqlite.SQLiteDatabase;
import br.ufpb.dce.pa2.pokertable.model.Player;

public class PlayerDao extends DroidDao<Player>{

	public PlayerDao(TableDefinition<Player> tableDefinition, SQLiteDatabase database){
		super(Player.class, tableDefinition, database);
	}
}
