package br.ufpb.dce.pa2.pokertable.game.view;



import br.ufpb.dce.pa2.pokertable.game.view.scenes.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context context;
	private int itemBackground;
	private Integer[] imageIDs = { R.drawable.player0, R.drawable.player1,
			R.drawable.player2, R.drawable.player3, R.drawable.player4,
			R.drawable.player5, R.drawable.player6, R.drawable.player7};

	public ImageAdapter(Context c) {
		context = c;
		// ---setting the style---
		TypedArray a = context.obtainStyledAttributes(R.styleable.Gallery1);
		itemBackground = a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground, 0);
		a.recycle();
	}

	// ---returns the number of images---
	public int getCount() {
		return imageIDs.length;
	}

	// ---returns the ID of an item---
	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	// ---returns an ImageView view---
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = new ImageView(context);
		imageView.setImageResource(imageIDs[position]);
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setLayoutParams(new Gallery.LayoutParams(150, 120));
		imageView.setBackgroundResource(itemBackground);
		return imageView;
	}
}