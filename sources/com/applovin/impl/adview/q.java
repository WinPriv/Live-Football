package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import com.applovin.impl.adview.i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class q extends i {
    public q(Context context) {
        super(context);
    }

    @Override // com.applovin.impl.adview.i
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
    }

    @Override // com.applovin.impl.adview.i
    public i.a getStyle() {
        return i.a.INVISIBLE;
    }
}
