package com.anythink.expressad.splash.view;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes.dex */
public class ATSplashWebview extends WindVaneWebView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11171a = "ATSplashWebview";

    /* renamed from: b, reason: collision with root package name */
    private String f11172b;

    public ATSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public String getRequestId() {
        return this.f11172b;
    }

    public void setRequestId(String str) {
        this.f11172b = str;
    }
}
