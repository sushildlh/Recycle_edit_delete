package firebase.sushildlh.com.firebaseoperations;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FirebaseActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.viewpager)
    ViewPager mPager;

    @BindView(R.id.tabs)
    TabLayout mTabs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        setTitle("App");

        setupViewPager(mPager);

        mTabs.setupWithViewPager(mPager);

    }

    public void setupViewPager(ViewPager upViewPager) {
        CustomPagerAdapter adapter =new CustomPagerAdapter(getSupportFragmentManager(),false);
        adapter.addFragment(new AddFragment(),"Add");
        adapter.addFragment(new ViewFragment(),"View");
        upViewPager.setAdapter(adapter);
    }



}
