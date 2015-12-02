package com.blunderer.materialdesignlibrary.models;

import android.support.v4.app.Fragment;

public class NavigationDrawerListItemTopFragment extends ListItem {

    private Fragment mFragment;
    private String mModuleTitle;

    public Fragment getFragment() {
        return mFragment;
    }

    public void setFragment(Fragment fragment) {
        this.mFragment = fragment;
    }

    public String getModuleTitle() {
        return mModuleTitle;
    }

    public void setModuleTitle(String mModuleTitle) {
        this.mModuleTitle = mModuleTitle;
    }

}
