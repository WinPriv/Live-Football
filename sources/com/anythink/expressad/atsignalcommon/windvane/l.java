package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: e, reason: collision with root package name */
    protected Context f7070e;
    protected Object f;

    /* renamed from: g, reason: collision with root package name */
    protected WindVaneWebView f7071g;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f7070e = context;
        this.f7071g = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f = obj;
        this.f7071g = windVaneWebView;
    }
}
