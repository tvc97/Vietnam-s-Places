package cf.cuong.vietnamplaces;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tvc97 on 12/14/15.
 */
public class PlaceAdapter extends BaseAdapter {

    private List<Place> places;
    private Context context;
    private Typeface font;
    public PlaceAdapter(Context context, List<Place> places) {
        this.places = places;
        this.context = context;

        font = Typeface.createFromAsset(context.getAssets(), "fonts/pintc.ttf");

    }

    @Override
    public int getCount() {
        if(places != null) {
            return places.size();
        }
        return 0;
    }


    @Override
    public Object getItem(int position) {
        return places.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = View.inflate(context, R.layout.list_item_place, null);
        }

        Place place = places.get(position);
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
        tvName.setText(place.getName());
        tvName.setTypeface(font);
        ImageView img = (ImageView) convertView.findViewById(R.id.img);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            img.setImageDrawable(context.getResources().getDrawable(place.getImage(), context.getTheme()));
        } else {
            img.setImageDrawable(context.getResources().getDrawable(place.getImage()));
        }
        return convertView;

    }
}
