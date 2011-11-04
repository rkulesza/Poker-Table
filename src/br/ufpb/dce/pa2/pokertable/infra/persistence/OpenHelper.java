package br.ufpb.dce.pa2.pokertable.infra.persistence;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class OpenHelper extends SQLiteOpenHelper {

	
	public OpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}
	
	@Override
	public void onOpen(SQLiteDatabase db) {
		super.onOpen(db);
	      if (!db.isReadOnly()) {
	    	  db.execSQL("PRAGMA foreign_keys=ON;");
	    	  Cursor c = db.rawQuery("PRAGMA foreign_keys", null);
		         if (c.moveToFirst()) {
		        	 int result = c.getInt(0);
		         }
		         if (!c.isClosed()) {
			            c.close();
			     }
	      }
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		try{
				
			PlayerTableDefinition playerTableDefinition = new PlayerTableDefinition();
			playerTableDefinition.onCreate(db);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		try{
			
			PlayerTableDefinition playerTableDefinition = new PlayerTableDefinition();
			PlayerTableDefinition.onUpgrade(db, oldVersion, newVersion);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
