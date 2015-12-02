package com.blunderer.materialdesignlibrary.fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import com.astuetz.PagerSlidingTabStrip;
import com.blunderer.materialdesignlibrary.R;
import com.blunderer.materialdesignlibrary.adapters.ViewPagerAdapter;
import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.blunderer.materialdesignlibrary.models.ViewPagerItem;
import com.blunderer.materialdesignlibrary.views.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

public abstract class ViewPagerWithTabsFragment extends AFragment
        implements com.blunderer.materialdesignlibrary.interfaces.ViewPager {

    protected ViewPager mViewPager;
    protected PagerSlidingTabStrip mViewPagerTabs;
    private List<ViewPagerItem> mViewPagerItems;
    private ViewPager.OnPageChangeListener mUserOnPageChangeListener;
    private ViewPagerAdapter mViewPagerAdapter;

    public ViewPagerWithTabsFragment() {
        mViewPagerItems = new ArrayList<>();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewPagerHandler viewPagerHandler = getViewPagerHandler();
        if (viewPagerHandler == null) viewPagerHandler = new ViewPagerHandler(getActivity());
        mViewPagerItems = viewPagerHandler.getViewPagerItems();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mdl_fragment_view_pager_with_tabs, container, false);

        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), mViewPagerItems);
        mViewPager.setAdapter(mViewPagerAdapter);

        int defaultViewPagerPageSelectedPosition = defaultViewPagerPageSelectedPosition();
        if (defaultViewPagerPageSelectedPosition >= 0 &&
                defaultViewPagerPageSelectedPosition < mViewPagerItems.size()) {
            selectPage(defaultViewPagerPageSelectedPosition);
        }

        mViewPagerTabs = (PagerSlidingTabStrip) view.findViewById(R.id.tabs);
        if (!mViewPagerItems.isEmpty()) showTabs(mViewPager);
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (mViewPagerItems != null && mViewPagerItems.size() > 0 && mViewPager != null) {
            int tabPosition = mViewPager.getCurrentItem();
            if (tabPosition >= 0 && tabPosition < mViewPagerItems.size()) {
                mViewPagerItems.get(tabPosition).getFragment()
                        .onActivityResult(requestCode, resultCode, data);
            }
        }
    }

    @Override
    public void selectPage(int position) {
        mViewPager.setCurrentItem(position);
    }

    @Override
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener userOnPageChangeListener) {
        mUserOnPageChangeListener = userOnPageChangeListener;
    }

    @Override
    public void updateNavigationDrawerTopHandler(ViewPagerHandler viewPagerHandler,
                                                 int defaultViewPagerPageSelectedPosition) {
        if (viewPagerHandler == null) viewPagerHandler = new ViewPagerHandler(getActivity());
        mViewPagerItems.clear();
        mViewPagerItems.addAll(viewPagerHandler.getViewPagerItems());
        mViewPagerAdapter.notifyDataSetChanged();

        selectPage(defaultViewPagerPageSelectedPosition);

        if (!mViewPagerItems.isEmpty()) showTabs(mViewPager);
    }

    private void showTabs(ViewPager pager) {
        mViewPagerTabs.setTextColor(getResources().getColor(android.R.color.black));
        //setCustomTabsStyle(mViewPagerTabs);

        mViewPagerTabs.setShouldExpand(expandTabs());
        mViewPagerTabs.setOnPageChangeListener(mUserOnPageChangeListener);
        mViewPagerTabs.setViewPager(pager);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            mViewPagerTabs.setTabBackground(android.R.attr.selectableItemBackgroundBorderless);
        }
    }

    protected abstract boolean expandTabs();
    //protected abstract void setCustomTabsStyle(PagerSlidingTabStrip tabs);
}
