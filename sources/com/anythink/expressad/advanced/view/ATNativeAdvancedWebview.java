package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.expressad.advanced.a.c;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class ATNativeAdvancedWebview extends WindVaneWebView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6938a = "ATNativeAdvancedWebview";

    /* renamed from: b, reason: collision with root package name */
    private c f6939b;

    public ATNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f6939b == null) {
                this.f6939b = new c(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f6939b, intentFilter);
        } catch (Throwable th) {
            o.a(f6938a, th.getMessage());
        }
    }

    public void unregisterNetWorkReceiver() {
        try {
            c cVar = this.f6939b;
            if (cVar != null) {
                cVar.a();
                getContext().unregisterReceiver(this.f6939b);
            }
        } catch (Throwable th) {
            o.a(f6938a, th.getMessage());
        }
    }
}
