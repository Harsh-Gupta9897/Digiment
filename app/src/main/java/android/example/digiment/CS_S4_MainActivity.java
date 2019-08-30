package android.example.digiment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CS_S4_MainActivity extends AppCompatActivity  implements CS_S4_1.OnFragmentInteractionListener , CS_S4_2.OnFragmentInteractionListener,CS_S4_3.OnFragmentInteractionListener , CS_S4_4.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("cs_s4_1"));
        tabLayout.addTab(tabLayout.newTab().setText("cs_s4_2"));
        tabLayout.addTab(tabLayout.newTab().setText("cs_s4_3"));
        tabLayout.addTab(tabLayout.newTab().setText("cs_s4_4"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager=(ViewPager)findViewById(R.id.pager);
        final CS_S4_PagerAdapter adapter =new CS_S4_PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    public  void next(View view)
    {
        Intent abc = new Intent(CS_S4_MainActivity.this,slide1.class);
        startActivity(abc);
    }
}