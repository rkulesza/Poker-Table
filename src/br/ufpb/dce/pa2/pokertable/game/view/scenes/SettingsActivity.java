package br.ufpb.dce.pa2.pokertable.game.view.scenes;

import br.ufpb.dce.pa2.pokertable.game.view.scenes.R;
import android.app.Activity;
import android.os.Bundle;

/**
 *
 * @author Jefferson Araujo
 */
public class SettingsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menuSettings();
    }

    public void menuSettings() {
        setContentView(R.layout.settingslayout);
    }
}
