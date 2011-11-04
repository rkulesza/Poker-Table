package br.ufpb.dce.pa2.pokertable.game.view.scenes;

import br.ufpb.dce.pa2.pokertable.game.view.scenes.R;
import android.app.Activity;
import android.os.Bundle;

/**
 *
 * @author Jefferson Araujo
 */
public class AboutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menuAbout();
    }

    public void menuAbout() {
        setContentView(R.layout.aboutlayout);
    }
}
