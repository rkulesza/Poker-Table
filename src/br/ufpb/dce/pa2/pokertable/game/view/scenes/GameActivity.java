package br.ufpb.dce.pa2.pokertable.game.view.scenes;


import br.ufpb.dce.pa2.pokertable.game.view.scenes.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 
 * @author Jefferson Araujo
 */
public class GameActivity extends Activity {


    private Button newGame;
    private Button searchGame;
    private Button ranking;
    private Button logout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menuLogin();
    }

    public void menuLogin() {
        setContentView(R.layout.gamelayout);

        newGame = (Button) findViewById(R.button.bt_game_newgame);
        searchGame = (Button) findViewById(R.button.bt_game_search);
        ranking = (Button) findViewById(R.button.bt_game_ranking);
        logout = (Button) findViewById(R.button.bt_game_logout);

        newGame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                newGame(); // chama a tela para iniciar um novo jogo.
            }
        });

        searchGame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                searchGame(); // chama a tela para buscar um jogo.
            }
        });
    }

    public void newGame() {
        startActivity(new Intent(GameActivity.this, NewGameActivity.class));
    }

    public void searchGame() {
        startActivity(new Intent(GameActivity.this, GameActivity.class));
    }

}
