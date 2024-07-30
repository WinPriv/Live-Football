package com.onesignal;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public class OSWebView extends WebView {
    public OSWebView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void computeScroll() {
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
    }
}
