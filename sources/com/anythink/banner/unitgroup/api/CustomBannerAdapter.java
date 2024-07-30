package com.anythink.banner.unitgroup.api;

import android.view.View;
import com.anythink.core.api.ATBaseAdAdapter;

/* loaded from: classes.dex */
public abstract class CustomBannerAdapter extends ATBaseAdAdapter {
    protected CustomBannerEventListener mImpressionEventListener;

    public abstract View getBannerView();

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        if (getBannerView() != null) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public final void releaseLoadResource() {
        super.releaseLoadResource();
    }

    public final void setAdEventListener(CustomBannerEventListener customBannerEventListener) {
        this.mImpressionEventListener = customBannerEventListener;
    }
}
