package br.ufpb.dce.pokertable.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

/**
 *
 * @author Jefferson Araujo
 */
public class MainActivity extends Activity {

    private Button login;
    private Button settings;
    private Button about;
    private Button exit;
    private MediaPlayer media = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menuPrincipal();
    }

    public void menuPrincipal() {
        setContentView(R.layout.masterlayout);

        login = (Button) findViewById(R.button.buttonlogin);
        settings = (Button) findViewById(R.button.buttonsettings);
        about = (Button) findViewById(R.button.buttonabout);
        exit = (Button) findViewById(R.button.buttonexit);
        
        try{
        	media = MediaPlayer.create(this.getApplicationContext(), R.raw.audio);
        	media.start();
        }catch  (Exception e){
        	e.printStackTrace();
        }

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startLogin(); // chama a tela de login ao clicar
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                settings(); // chama a tela de configuração ao clicar
            }
        });

        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                about(); // chama a tela de informações
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                media.stop();
            	exit(); // fecha a aplicação
            }
        });

    }

    private void startLogin() {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    private void settings() {
        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
    }

    private void about() {
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
    }

    private void exit() {
        MainActivity.this.finish();
    }
}