package firebase.sushildlh.com.firebaseoperations;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by blackgoogle on 10/29/16.
 */
public class CustomPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();
    private boolean flag;

    public CustomPagerAdapter(FragmentManager fm, boolean flag) {
        super(fm);
        this.flag = flag;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void addFragment(Fragment fragment, String name) {
        fragments.add(fragment);
        names.add(name);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (flag)
            return null; //for only icon or images ...
        else
            return names.get(position);

    }
}