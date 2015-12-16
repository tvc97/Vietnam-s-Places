package cf.cuong.vietnamplaces;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Tvc97 on 12/14/15.
 */
public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        int region = getIntent().getIntExtra("REGION", 0);
        ListView lvPlaces = (ListView) findViewById(R.id.lv_places);
        final List<Place> places = Places.get(region);
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);

        lvPlaces.setAdapter(placeAdapter);
        lvPlaces.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                Place place = places.get(position);
                intent.putExtra("NAME", place.getName());
                intent.putExtra("DETAIL", place.getDetail());
                intent.putExtra("IMAGE", place.getImage());
                startActivity(intent);
            }
        });
    }

}