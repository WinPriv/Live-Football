package com.onesignal;

import android.widget.RelativeLayout;
import com.onesignal.e5;

/* compiled from: InAppMessageView.java */
/* loaded from: classes2.dex */
public final class x implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e5.e f27186s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f27187t;

    public x(w wVar, k5 k5Var) {
        this.f27187t = wVar;
        this.f27186s = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RelativeLayout relativeLayout;
        w wVar = this.f27187t;
        boolean z10 = wVar.f27166k;
        e5.e eVar = this.f27186s;
        if (z10 && (relativeLayout = wVar.f27172r) != null) {
            w.b(relativeLayout, w.f27155w, w.f27154v, new z(wVar, eVar)).start();
            return;
        }
        w.a(wVar);
        if (eVar != null) {
            eVar.onComplete();
        }
    }
}
