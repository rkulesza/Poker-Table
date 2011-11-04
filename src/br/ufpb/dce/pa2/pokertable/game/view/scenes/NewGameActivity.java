package br.ufpb.dce.pa2.pokertable.game.view.scenes;

import br.ufpb.dce.pa2.pokertable.game.view.scenes.R;
import br.ufpb.dce.pa2.pokertable.model.Game;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewGameActivity extends Activity {
	
	private EditText nameOfTable;
	private EditText startMoney;
	private EditText smallBlind;
	private Button cancel;
	private Button create;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newgamelayout);
        
        loadComponents();
        
        cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				back();
			}
		});
        
        create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				create();
			}
		});
    }

	
	private void back(){
		startActivity(new Intent(NewGameActivity.this, GameActivity.class));
	}
	
	private void create(){
		
		Game game;
		
		String tableName = this.nameOfTable.getEditableText().toString();
		int startMoney = Integer.valueOf(this.startMoney.getEditableText().toString());
		int smallBlind = Integer.valueOf(this.smallBlind.getEditableText().toString());
		
		if (tableName.equals(null) && startMoney == 0 && smallBlind == 0){
			game = new Game();
		}
		
		game = new Game(tableName, startMoney, smallBlind);
		
		/*
		 * Falta passar o objeto para a outra Activity! 
		 */
		Intent in = new Intent(NewGameActivity.this, TableActivity.class);
		startActivity(in);
		
	}
	
	private void loadComponents() {
		
		this.nameOfTable = (EditText) findViewById(R.id.et_newgame_nameOfTable);
		this.startMoney = (EditText) findViewById(R.id.et_newgame_StartMoney);
		this.smallBlind = (EditText) findViewById(R.id.et_newgame_smallBlindValue);
		this.cancel = (Button) findViewById(R.id.bt_newgame_cancel);
		this.create = (Button) findViewById(R.id.bt_newgame_create);
	}

}
