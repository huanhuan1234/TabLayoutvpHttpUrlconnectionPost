package bawei.com.a20170429_yuekaoa;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import bawei.com.a20170429_yuekaoa.fragment.FragmentDuty;
import bawei.com.a20170429_yuekaoa.fragment.FragmentInfo;
import bawei.com.a20170429_yuekaoa.fragment.FragmentMy;


public class MainActivity extends FragmentActivity {
    private TabLayout tablayout;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.vp);

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());

        vp.setAdapter(adapter);

        tablayout.setupWithViewPager(vp);

        tablayout.setTabTextColors(Color.BLACK,Color.RED);

        tablayout.setSelectedTabIndicatorColor(Color.RED);

        tablayout.setTabMode(TabLayout.MODE_FIXED);

    }
    class MyAdapter extends FragmentPagerAdapter{

        public String[] TITLE = {"本社介绍","履行职责","自我建设"};

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = null;

            switch (position){

                case 0:

                    fragment = new FragmentInfo();
                    break;

                case  1:

                    fragment = new FragmentDuty();

                    break;

                case 2:

                    fragment = new FragmentMy();

                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return TITLE.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLE[position];
        }
    }
}
