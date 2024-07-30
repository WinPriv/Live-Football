package com.onesignal;

import com.onesignal.w;

/* compiled from: InAppMessageView.java */
/* loaded from: classes2.dex */
public final class v implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f27105s;

    public v(w wVar) {
        this.f27105s = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.f27105s;
        w.b bVar = wVar.f27174t;
        if (bVar != null) {
            v0 n10 = e3.n();
            b1 b1Var = ((j5) bVar).f26881a.f26809e;
            ((c3) n10.f27108a).r("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
        }
        if (wVar.f27158b != null) {
            wVar.e(null);
            wVar.f27175u = null;
        } else {
            wVar.f27167l = true;
        }
    }
}
