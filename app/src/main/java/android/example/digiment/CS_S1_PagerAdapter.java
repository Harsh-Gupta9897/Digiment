package android.example.digiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CS_S1_PagerAdapter extends FragmentStatePagerAdapter {
    int NoOfTabs;
    public CS_S1_PagerAdapter(FragmentManager fm , int NumberOfTabs)
    {
        super(fm);
        this.NoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0: {
                CS_S1_1 tab1 = new CS_S1_1();
                return tab1;
            }
            case 1:
            {
                CS_S1_2 tab2 = new CS_S1_2();
                return tab2;
            }
            case 2:
            {
                CS_S1_3 tab3 = new CS_S1_3();
                return tab3;
            }
            case 3:
            {
                CS_S1_4 tab4 = new CS_S1_4();
                return tab4;
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

