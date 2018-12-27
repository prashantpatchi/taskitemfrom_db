package win.prashant.nav_item_on_fragment_tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class frgmentpageadapter extends FragmentPagerAdapter {

    ArrayList<Fragment>listfregment = new ArrayList<>();

    //title will be stored in list array
    ArrayList<String>listtitle =new ArrayList<>();


    //is constructor
    public frgmentpageadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return listfregment.get(i);
    }

    @Override
    public int getCount() {
        return listfregment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listtitle.get(position);
    }
    public void AddFragment(Fragment fragment,String Title){
        listfregment.add(fragment);
        listtitle.add(Title);
    }
}
