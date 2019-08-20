package android.example.digiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class basic_PagerAdapter extends FragmentStatePagerAdapter {
    int NoOfTabs;
    public basic_PagerAdapter(FragmentManager fm , int NumberOfTabs)
    {
        super(fm);
        this.NoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0: {
                basic_1 tab1 = new basic_1();
                return tab1;
            }
            case 1:
            {
                basic_2 tab2 = new basic_2();
                return tab2;
            }

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 0;
    }
}

