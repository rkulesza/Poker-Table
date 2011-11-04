package br.ufpb.dce.pa2.pokertable.game.view.scenes;


import br.ufpb.dce.pa2.pokertable.game.view.scenes.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 *
 * @author Jefferson Araujo
 */
public class LoginActivity extends Activity {

    private Button createAccount;
    private Button login;
    private EditText campoLogin;
    private EditText campoSenha;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menuLogin();
    }

    public void menuLogin() {
        setContentView(R.layout.loginlayout);

        createAccount = (Button) findViewById(R.button.buttoncreateaccount);
        login = (Button) findViewById(R.button.buttonlogar);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login(); // chama a tela inicial do game ao clicar
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                createAccount(); // chama a tela para criar uma nova conta
            }
        });

    }

    public void login() {
        startActivity(new Intent(LoginActivity.this, GameActivity.class));
    }

    public void createAccount() {
        startActivity(new Intent(LoginActivity.this, CreateAccountActivity.class));
    }
}
