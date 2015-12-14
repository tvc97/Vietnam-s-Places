package cf.cuong.vietnamplaces;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tvc97 on 12/14/15.
 */
public class RegionActivity extends Activity implements View.OnClickListener{
    TextView tvNorthern, tvMiddle, tvSouthern;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);

        tvNorthern = (TextView) findViewById(R.id.tv_nothern);
        tvMiddle = (TextView) findViewById(R.id.tv_middle);
        tvSouthern = (TextView) findViewById(R.id.tv_southern);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/pintc.ttf");

        tvNorthern.setTypeface(font);
        tvMiddle.setTypeface(font);
        tvSouthern.setTypeface(font);

        tvNorthern.setOnClickListener(this);
        tvMiddle.setOnClickListener(this);
        tvSouthern.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == tvNorthern) {
            switchScreen(Places.NORTHERN);
        } else if(v == tvMiddle) {
            switchScreen(Places.MIDDLE);
        } else if(v == tvSouthern) {
            switchScreen(Places.SOUTHERN);
        }
    }

    public void switchScreen(int region) {
        Intent intent = new Intent(RegionActivity.this, ListActivity.class);
        intent.putExtra("REGION", region);
        startActivity(intent);
    }
}
