package com.blunderer.materialdesignlibrary.sample.cardviews;

import com.blunderer.materialdesignlibrary.handlers.ActionBarDefaultHandler;
import com.blunderer.materialdesignlibrary.handlers.ActionBarHandler;
import com.blunderer.materialdesignlibrary.sample.R;

public class CardViewWithTopImageActivity
        extends com.blunderer.materialdesignlibrary.activities.Activity {

    @Override
    protected int getContentView() {
        return R.layout.activity_cardview_with_top_image;
    }

    @Override
    protected ActionBarHandler getActionBarHandler() {
        return new ActionBarDefaultHandler(this);
    }

    //Fixed the compiling errors
    @Override
    protected boolean enableActionBarShadow() {
        return false;
    }//end Fixed
}
