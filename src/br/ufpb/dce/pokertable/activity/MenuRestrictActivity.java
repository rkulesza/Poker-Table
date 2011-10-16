package br.ufpb.dce.pokertable.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 * @author Jefferson Araujo
 */
public class MenuRestrictActivity extends Activity {

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

        newGame = (Button) findViewById(R.button.buttonnewgame);
        searchGame = (Button) findViewById(R.button.buttonsearshgame);
        ranking = (Button) findViewById(R.button.buttonranking);
        logout = (Button) findViewById(R.button.buttonlogout);

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
        startActivity(new Intent(MenuRestrictActivity.this, MenuRestrictActivity.class));
    }

    public void searchGame() {
        startActivity(new Intent(MenuRestrictActivity.this, MenuRestrictActivity.class));
    }
}
