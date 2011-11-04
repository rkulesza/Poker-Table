package br.ufpb.dce.pa2.pokertable.game.view.scenes;

import br.ufpb.dce.pa2.pokertable.game.view.scenes.R;
import br.ufpb.dce.pa2.pokertable.model.Player;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.app.Dialog;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Spinner;

/**
*
* @author Jefferson Araujo
*/
public class TableActivity extends Activity {
	
	private Button newplayer;
	private Dialog dialog;
	private Spinner spinner;
	private Gallery gallery;
	private ImageView imageview;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        game();
    }
    
    public void game() {
        setContentView(R.layout.tablelayout);
        
        newplayer = (Button) findViewById(R.button.buttonnewplayer);
        
        newplayer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showCustomDialog(); // chama o dialogo ao clicar
            }
        });

    }
    
    private void showCustomDialog(){
    	
    	dialog = new Dialog(this);
    	
    	this.gallery = (Gallery) dialog.findViewById(R.id.gallery1);
    	this.imageview = (ImageView) dialog.findViewById(R.id.image1);
//        gallery.setOnItemClickListener(new OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, 
//            View v, int position, long id) 
//            {                
//                Toast.makeText(getBaseContext(), 
//                        "pic" + (position + 1) + " selected", 
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
    	
    	dialog.setContentView(R.layout.newplayerlayout);//carregando o layout do dialog do xml
    	dialog.setTitle("Add new player");//título do dialog

    	this.spinner = (Spinner) dialog.findViewById(R.id.spinner1);
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[] {"1","2","3","4"});
    	spinner.setAdapter(adapter);
//    	this.spinner.setOnItemSelectedListener(new OnItemSelectedListener()
//        {
//            public void onItemSelected(AdapterView<?> arg0, 
//            View arg1, int arg2, long arg3) 
//            {
//                int index = spinner.getSelectedItemPosition();
//                Toast.makeText(getBaseContext(), 
//                    "You have selected item : " + index, 
//                    Toast.LENGTH_SHORT).show();                
//            }
// 
//            public void onNothingSelected(AdapterView<?> arg0) {}
//        });

    	final Button ok = (Button) dialog.findViewById(R.id.bt_ok);//se atentem ao dialog.
    	final Button cancelar = (Button) dialog.findViewById(R.id.bt_cancel);
    	final EditText editText = (EditText) dialog.findViewById(R.id.inputText);

    	ok.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View v) {
    			Player p = new Player(editText.getText().toString(),1000, spinner.getSelectedItemPosition()+1);
    			AlertDialog.Builder ad = new AlertDialog.Builder(TableActivity.this);
    			ad.setTitle("PokerTable");
    			ad.setMessage("Bem vindo ao Jogo !" + "\n" + p.toString());
    			ad.setNeutralButton("OK", null);
    			ad.show();
    			
    			dialog.cancel();
    		}
    	});

    	cancelar.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View v) {

    			//ação do botão cancelar
    			dialog.cancel();//encerra o dialog

    		}
    	});

    dialog.show();//mostra o dialog

    }

}

