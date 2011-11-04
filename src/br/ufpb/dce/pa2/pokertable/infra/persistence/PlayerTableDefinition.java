package br.ufpb.dce.pa2.pokertable.infra.persistence;

import org.droidpersistence.dao.TableDefinition;

import br.ufpb.dce.pa2.pokertable.model.Player;

public class PlayerTableDefinition extends TableDefinition<Player>{

	public PlayerTableDefinition(){
		super(Player.class);
	}
}
