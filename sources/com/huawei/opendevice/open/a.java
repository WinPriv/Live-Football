package com.huawei.opendevice.open;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0307a f24223a;

    /* renamed from: com.huawei.opendevice.open.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0307a {
        void h_();
    }

    public a(InterfaceC0307a interfaceC0307a) {
        this.f24223a = interfaceC0307a;
    }

    @JavascriptInterface
    public void notifyScriptLoaded() {
        InterfaceC0307a interfaceC0307a = this.f24223a;
        if (interfaceC0307a != null) {
            interfaceC0307a.h_();
        }
    }
}
