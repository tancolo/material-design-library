package com.blunderer.materialdesignlibrary.sample.viewpagers;

import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.blunderer.materialdesignlibrary.sample.MainFragment;
import com.blunderer.materialdesignlibrary.sample.R;
import com.blunderer.materialdesignlibrary.views.PagerSlidingTabStrip;

public class ViewPagerWithTabsFragment
        extends com.blunderer.materialdesignlibrary.fragments.ViewPagerWithTabsFragment {

    @Override
    public ViewPagerHandler getViewPagerHandler() {
        return new ViewPagerHandler(getActivity())
                .addPage(R.string.title_item1,
                        MainFragment.newInstance("Material Design Fragment ViewPager with Tabs"))
                .addPage(R.string.title_item2,
                        MainFragment.newInstance("Material Design Fragment ViewPager with Tabs"));
    }

    @Override
    public boolean expandTabs() {
        return false;
    }

    @Override
    public int defaultViewPagerPageSelectedPosition() {
        return 0;
    }

    //library中ViewPagerWithTabsFragment.java新增该方法, 这里没有实际使用
//    @Override
//    protected void setCustomTabsStyle(PagerSlidingTabStrip tabs) {
//    }

}
