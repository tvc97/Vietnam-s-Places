package cf.cuong.vietnamplaces;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/pintc.ttf");
        ((TextView)findViewById(R.id.tv_text_intro)).setTypeface(font);
        ((TextView)findViewById(R.id.tv_gdg)).setTypeface(font);
        ((TextView)findViewById(R.id.tv_copyright)).setTypeface(font);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, RegionActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1500);
    }
}
