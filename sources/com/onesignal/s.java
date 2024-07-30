package com.onesignal;

import android.view.ViewGroup;
import android.webkit.WebView;

/* compiled from: InAppMessageView.java */
/* loaded from: classes2.dex */
public final class s implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27017s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f27018t;

    public s(w wVar, int i10) {
        this.f27018t = wVar;
        this.f27017s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.f27018t;
        WebView webView = wVar.f27171q;
        if (webView == null) {
            e3.b(4, "WebView height update skipped, new height will be used once it is displayed.", null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        if (layoutParams == null) {
            e3.b(4, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null);
            return;
        }
        int i10 = this.f27017s;
        layoutParams.height = i10;
        wVar.f27171q.setLayoutParams(layoutParams);
        DraggableRelativeLayout draggableRelativeLayout = wVar.f27173s;
        if (draggableRelativeLayout != null) {
            draggableRelativeLayout.a(wVar.c(i10, wVar.f27170p, wVar.f27169n));
        }
    }
}
