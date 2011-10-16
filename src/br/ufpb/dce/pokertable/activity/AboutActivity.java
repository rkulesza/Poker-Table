package br.ufpb.dce.pokertable.activity;

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
