package android.example.digiment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.Util;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        BoomMenuButton bmb = null;
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            SimpleCircleButton.Builder builder = new SimpleCircleButton.Builder()
                    .normalImageRes(R.drawable.ic_arrow_forward_black_24dp)
                    .rotateImage(false)
                    .isRound(false)
                    .shadowCornerRadius(Util.dp2px(20))
                    .buttonCornerRadius(Util.dp2px(20))
                    .rippleEffect(true)
                    .shadowEffect(true);

            bmb.addBuilder(builder);
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_calendar) {

        } else if (id == R.id.nav_profile) {

        } else if (id == R.id.nav_grade) {

        } else if (id == R.id.nav_subject1) {

        } else if (id == R.id.nav_subject2) {

        }
        else if (id == R.id.nav_subject3) {

        }else if (id == R.id.nav_subject4) {

        }else if (id == R.id.nav_notifications) {

        }else if (id == R.id.nav_messages) {

        }
        else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
