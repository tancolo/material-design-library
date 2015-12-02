package com.blunderer.materialdesignlibrary.models;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

import com.bumptech.glide.DrawableTypeRequest;

public abstract class ListItem {

    private String mTitle;
    private String mTextIcon;
    private int mSelectedColor;
    private int mTitleStyle;
    private int mTextIconStyle;
    private int mBackgroundStyle;
    private Drawable mIcon;
    private Drawable mSelectedIcon;
    private Drawable mAlertIcon;
    private DrawableTypeRequest<String> mIconUrl;
    private DrawableTypeRequest<String> mSelectedIconUrl;
    private boolean mUseTitle = false;
    private boolean mUseTextIcon = false;
    private boolean mUseSelectedColor = false;
    private boolean mUseTitleStyle = false;
    private boolean mUseTextIconStyle = false;
    private boolean mUseBackgroundStyle = false;
    private boolean mUseIconResource = false;
    private boolean mUseIconUrl = false;
    private boolean mUseSelectedIconResource = false;
    private boolean mUseSelectedIconUrl = false;

    public void setTitle(Context context, int titleResource) {
        mUseTitle = true;
        mTitle = context.getString(titleResource);
    }

    public void setTitle(String title) {
        mUseTitle = true;
        mTitle = title;
    }

    public void setTextIcon(Context context, int textIconResource) {
        mUseTextIcon = true;
        mTextIcon = context.getString(textIconResource);
    }

    public void setTextIcon(String textIcon) {
        mUseTextIcon = true;
        mTextIcon = textIcon;
    }

    public void setSelectedColor(int color) {
        mUseSelectedColor = true;
        mSelectedColor = color;
    }

    public void setTitleStyle(int titleStyle) {
        mUseTitleStyle = true;
        mTitleStyle = titleStyle;
    }

    public void setTextIconStyle(int textIconStyle) {
        mUseTextIconStyle = true;
        mTextIconStyle = textIconStyle;
    }

    public void setBackgroundStyle(int backgroundStyle) {
        mUseBackgroundStyle = true;
        mBackgroundStyle = backgroundStyle;
    }

    public void setIcon(Context context, int iconResource) {
        mUseIconResource = true;
        mUseIconUrl = false;
        Log.e("TANHQ", "\n\n");
        Log.e("TANHQ", "setIcon(): Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT
                + ",  LOLLIPOP = " + Build.VERSION_CODES.LOLLIPOP
        + "    " + Log.getStackTraceString(new Throwable()));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mIcon = context.getDrawable(iconResource);
        } else {
            Log.e("TANHQ", "setIcon()-> else111 ");
            //mIcon = context.getResources().getDrawable(iconResource);
            mIcon = ContextCompat.getDrawable(context, iconResource);
            Log.e("TANHQ", "setIcon()-> else 222:  " + mIcon);
        }
    }

    public void setIcon(Drawable icon) {
        mUseIconResource = true;
        mUseIconUrl = false;
        mIcon = icon;
    }

    public void setIcon(DrawableTypeRequest<String> iconUrl) {
        mUseIconResource = false;
        mUseIconUrl = true;
        mIconUrl = iconUrl;
    }

    public void setSelectedIcon(Context context, int selectedIconResource) {
        mUseSelectedIconResource = true;
        mUseSelectedIconUrl = false;
        Log.e("TANHQ", "setSelectedIcon==> " +
                Log.getStackTraceString(new Throwable()));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSelectedIcon = context.getDrawable(selectedIconResource);
            Log.e("TANHQ", "setSelectedIcon==>111 ");
        } else {
            Log.e("TANHQ", "\n\n setSelectedIcon==>222 ");
            //mSelectedIcon = context.getResources().getDrawable(selectedIconResource);
            mSelectedIcon = ContextCompat.getDrawable(context, selectedIconResource);
            Log.e("TANHQ", "\n\n setSelectedIcon==> 333");
        }
    }

    public void setSelectedIcon(Drawable selectedIcon) {
        mUseSelectedIconResource = true;
        mUseSelectedIconUrl = false;
        mSelectedIcon = selectedIcon;
    }

    public void setSelectedIcon(DrawableTypeRequest<String> selectedIconUrl) {
        mUseSelectedIconResource = false;
        mUseSelectedIconUrl = true;
        mSelectedIconUrl = selectedIconUrl;
    }

    public void setAlertIcon(Drawable mAlertIcon) {
        this.mAlertIcon = mAlertIcon;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getTextIcon() {
        return mTextIcon;
    }

    public int getSelectedColor() {
        return mSelectedColor;
    }

    public int getTitleStyle() {
        return mTitleStyle;
    }

    public int getTextIconStyle() {
        return mTextIconStyle;
    }

    public int getBackgroundStyle() {
        return mBackgroundStyle;
    }

    public Drawable getIconDrawable() {
        return mIcon;
    }

    public DrawableTypeRequest<String> getIconUrl() {
        return mIconUrl;
    }

    public Drawable getSelectedIconDrawable() {
        return mSelectedIcon;
    }

    public DrawableTypeRequest<String> getSelectedIconUrl() {
        return mSelectedIconUrl;
    }

    public Drawable getAlertIcon() {
        return mAlertIcon;
    }

    public boolean useTitle() {
        return mUseTitle;
    }

    public boolean useTextIcon() {
        return mUseTextIcon;
    }

    public boolean useSelectedColor() {
        return mUseSelectedColor;
    }

    public boolean useTitleStyle() {
        return mUseTitleStyle;
    }

    public boolean useTextIconStyle() {
        return mUseTextIconStyle;
    }

    public boolean useBackgroundStyle() {
        return mUseBackgroundStyle;
    }

    public boolean useIconResource() {
        return mUseIconResource;
    }

    public boolean useIconUrl() {
        return mUseIconUrl;
    }

    public boolean useSelectedIconResource() {
        return mUseSelectedIconResource;
    }

    public boolean useSelectedIconUrl() {
        return mUseSelectedIconUrl;
    }

}
