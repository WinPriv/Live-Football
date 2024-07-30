package com.anythink.nativead.unitgroup.api;

import com.anythink.core.api.ATBaseAdAdapter;

/* loaded from: classes.dex */
public abstract class CustomNativeAdapter extends ATBaseAdAdapter {
    protected int mRequestNum = 1;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public final boolean isAdReady() {
        return false;
    }

    public void setRequestNum(int i10) {
        if (i10 > 0) {
            this.mRequestNum = i10;
        }
    }
}
