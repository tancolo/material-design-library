package com.blunderer.materialdesignlibrary.handlers;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.blunderer.materialdesignlibrary.models.ListItem;
import com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemDivider;
import com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemHeader;
import com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemTopFragment;
import com.blunderer.materialdesignlibrary.models.NavigationDrawerListItemTopIntent;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class NavigationDrawerTopHandler {

    private final Context mContext;
    private List<ListItem> mItems;

    public NavigationDrawerTopHandler(Context context) {
        mContext = context;
        mItems = new ArrayList<>();
        Log.e("TANHQ", "NavigationDrawerTopHandler");
    }

    public NavigationDrawerTopHandler addSection(int titleResource) {
        Log.e("TANHQ", "NavigationDrawerTopHandler->addSection 1");
        NavigationDrawerListItemHeader item = new NavigationDrawerListItemHeader();
        item.setTitle(mContext, titleResource);
        mItems.add(item);
        Log.e("TANHQ", "End->addSection");
        return this;
    }

    public NavigationDrawerTopHandler addSection(int titleResource, int titleStyle) {
        Log.e("TANHQ", "NavigationDrawerTopHandler->addSection 2");
        NavigationDrawerListItemHeader item = new NavigationDrawerListItemHeader();
        item.setTitle(mContext, titleResource);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addSection(int titleResource,
                                                 int titleStyle,
                                                 int backgroundStyle) {
        NavigationDrawerListItemHeader item = new NavigationDrawerListItemHeader();
        item.setTitle(mContext, titleResource);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addSection(String title) {
        NavigationDrawerListItemHeader item = new NavigationDrawerListItemHeader();
        item.setTitle(title);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addSection(String title, int titleStyle) {
        NavigationDrawerListItemHeader item = new NavigationDrawerListItemHeader();
        item.setTitle(title);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addSection(String title,
                                                 int titleStyle,
                                                 int backgroundStyle) {
        NavigationDrawerListItemHeader item = new NavigationDrawerListItemHeader();
        item.setTitle(title);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addDivider() {
        NavigationDrawerListItemDivider item = new NavigationDrawerListItemDivider();
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addDivider(int backgroundStyle) {
        NavigationDrawerListItemDivider item = new NavigationDrawerListItemDivider();
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource, Fragment fragment) {
        Log.e("TANHQ", "NavigationDrawerTopHandler->addItem: fragment = " + fragment);
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setFragment(fragment);
        mItems.add(item);
        Log.e("TANHQ", "End addItem");
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title, Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title, Fragment fragment, int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Fragment fragment,
                                              String moduleTitle,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setFragment(fragment);
        item.setModuleTitle(moduleTitle);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int textIconResource,
                                              String title,
                                              Fragment fragment,
                                              String moduleTitle,
                                              int textIconStyle,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setTextIcon(mContext, textIconResource);
        item.setFragment(fragment);
        item.setModuleTitle(moduleTitle);
        item.setTitleStyle(titleStyle);
        item.setTextIconStyle(textIconStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String textIcon,
                                              String title,
                                              Fragment fragment,
                                              String moduleTitle,
                                              int textIconStyle,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setTextIcon(textIcon);
        item.setFragment(fragment);
        item.setModuleTitle(moduleTitle);
        item.setTitleStyle(titleStyle);
        item.setTextIconStyle(textIconStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String textIcon,
                                              String title,
                                              Fragment fragment,
                                              String moduleTitle,
                                              int selectedColor,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setTextIcon(textIcon);
        item.setFragment(fragment);
        item.setModuleTitle(moduleTitle);
        item.setSelectedColor(selectedColor);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String textIcon,
                                              String title,
                                              Drawable alertIcon,
                                              Fragment fragment,
                                              String moduleTitle,
                                              int textIconStyle,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setTextIcon(textIcon);
        item.setAlertIcon(alertIcon);
        item.setFragment(fragment);
        item.setModuleTitle(moduleTitle);
        item.setTitleStyle(titleStyle);
        item.setTextIconStyle(textIconStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String textIcon,
                                              String title,
                                              Drawable alertIcon,
                                              Fragment fragment,
                                              String moduleTitle,
                                              int selectedColor,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setTextIcon(textIcon);
        item.setAlertIcon(alertIcon);
        item.setFragment(fragment);
        item.setModuleTitle(moduleTitle);
        item.setSelectedColor(selectedColor);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              int selectedIconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              int selectedIconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Drawable selectedIcon,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Drawable selectedIcon,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              int selectedIconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              String selectedIconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              String selectedIconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              String selectedIconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              int selectedIconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              int selectedIconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Drawable selectedIcon,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Drawable selectedIcon,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Drawable selectedIcon,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(selectedIcon);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              int selectedIconResource,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              int selectedIconResource,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(mContext, selectedIconResource);
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              String selectedIconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              String selectedIconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(icon);
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              String selectedIconUrl,
                                              Fragment fragment) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              String selectedIconUrl,
                                              Fragment fragment,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopFragment item = new NavigationDrawerListItemTopFragment();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setSelectedIcon(Glide.with(mContext).load(selectedIconUrl));
        item.setFragment(fragment);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource, Intent intent) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIntent(intent);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource, Intent intent, int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String textIcon,
                                              String title,
                                              Intent intent,
                                              int textIconStyle,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setTextIcon(textIcon);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setTextIconStyle(textIconStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title, Intent intent) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIntent(intent);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title, Intent intent, int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource, int iconResource, Intent intent) {
        Log.e("TANHQ", "NavigationDrawerTopHandler->addItem3-1");
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setIntent(intent);
        mItems.add(item);
        Log.e("TANHQ", "NavigationDrawerTopHandler->addItem3-2");
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Intent intent,
                                              int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              int iconResource,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(mContext, iconResource);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title, int iconResource, Intent intent) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setIntent(intent);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Intent intent,
                                              int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              int iconResource,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(mContext, iconResource);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource, Drawable icon, Intent intent) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setIntent(intent);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Intent intent,
                                              int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              Drawable icon,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(icon);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title, Drawable icon, Intent intent) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(icon);
        item.setIntent(intent);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Intent intent,
                                              int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(icon);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              Drawable icon,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(icon);
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource, String iconUrl, Intent intent) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setIntent(intent);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              Intent intent,
                                              int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(int titleResource,
                                              String iconUrl,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(mContext, titleResource);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title, String iconUrl, Intent intent) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setIntent(intent);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              Intent intent,
                                              int titleStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        mItems.add(item);
        return this;
    }

    public NavigationDrawerTopHandler addItem(String title,
                                              String iconUrl,
                                              Intent intent,
                                              int titleStyle,
                                              int backgroundStyle) {
        NavigationDrawerListItemTopIntent item = new NavigationDrawerListItemTopIntent();
        item.setTitle(title);
        item.setIcon(Glide.with(mContext).load(iconUrl));
        item.setIntent(intent);
        item.setTitleStyle(titleStyle);
        item.setBackgroundStyle(backgroundStyle);
        mItems.add(item);
        return this;
    }

    public List<ListItem> getNavigationDrawerTopItems() {
        return mItems;
    }

}
