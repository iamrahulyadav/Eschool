package sas.eschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import sas.eschool.fragment.Events_parentsFragment;
import sas.eschool.fragment.LearningSuppportFragments;
import sas.eschool.fragment.StudentsList_msging;
import sas.eschool.fragment.TeachersList_messging;

public class ParentSideMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_side_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view ->
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new TeachersList_messging()).commit()
        );

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Events_parentsFragment()).commit();
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
        getMenuInflater().inflate(R.menu.parent_side_menu, menu);
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

        if (id == R.id.nav_learning_support) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new LearningSuppportFragments()).commit();

        } else if (id == R.id.nav_massaging) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new TeachersList_messging()).commit();


        } else if (id == R.id.nav_class_room) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new StudentsList_msging()).commit();


        } else if (id == R.id.nav_home_work) {


        } else if (id == R.id.nav_events)

        {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new Events_parentsFragment()).commit();
        }

//            startActivity(new Intent(this, EventList.class));

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
