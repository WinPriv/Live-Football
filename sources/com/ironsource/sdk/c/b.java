package com.ironsource.sdk.c;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f26046a;

    public b(c cVar) {
        this.f26046a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f26046a.handleMessageFromAd(str);
    }
}
