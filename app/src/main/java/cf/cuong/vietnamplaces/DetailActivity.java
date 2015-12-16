package cf.cuong.vietnamplaces;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tvc97 on 12/14/15.
 */
public class DetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/droidsans.ttf");
        TextView tvName = (TextView) findViewById(R.id.tv_name);
        TextView tvDetail = (TextView) findViewById(R.id.tv_detail);
        ImageView img = (ImageView) findViewById(R.id.image);

        tvDetail.setTypeface(font);
        tvName.setTypeface(font);

        String name = getIntent().getStringExtra("NAME");
        String detail = getIntent().getStringExtra("DETAIL");
        int image = getIntent().getIntExtra("IMAGE", R.drawable.halong);

        tvName.setText(name);
        tvDetail.setText(detail);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            img.setImageDrawable(getResources().getDrawable(image, getTheme()));
        } else {
            img.setImageDrawable(getResources().getDrawable(image));
        }
    }
}
