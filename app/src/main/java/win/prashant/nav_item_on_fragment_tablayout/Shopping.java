package win.prashant.nav_item_on_fragment_tablayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Shopping extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        viewPager = findViewById(R.id.viewpager);
        setupwithviewpager(viewPager);
        tabLayout= findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        /*tabLayout.getTabAt(0).setIcon(R.drawable.ic_chat_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_cast_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_call_black_24dp);*/
    }

    private void setupwithviewpager(ViewPager viewPager) {

        FragmentPagerAdapter ff = new frgmentpageadapter(getSupportFragmentManager());
        ((frgmentpageadapter) ff).AddFragment(new FragmentOne(),"Chat");
        ((frgmentpageadapter) ff).AddFragment(new fragment_three(),"Status");
        ((frgmentpageadapter) ff).AddFragment(new fragment_two(),"Calls");
        viewPager.setAdapter(ff);





    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //***********************




    //********************

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.shopping, menu);
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

        if (id == R.id.nav_Offer) {
            // Handle the nav_offer
            FragmentOne  fragmentone = new FragmentOne();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, fragmentone).commit();

        } else if (id == R.id.nav_electronics) {

        } else if (id == R.id.nav_Lifestyle) {

        } else if (id == R.id.nav_home_appliance) {

        } else if (id == R.id.nav_books) {

        } else if (id == R.id.nav_more) {

        }else if (id == R.id.nav_share) {

        }else if (id == R.id.nav_send) {

        }else if (id == R.id.nav_order) {

        }else if (id == R.id.nav_cart) {

        }else if (id == R.id.nav_wishlist){

        }else if (id == R.id.nav_reward){

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
