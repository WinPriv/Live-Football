package com.anythink.basead.ui;

import com.anythink.basead.ui.BaseSplashAdView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4491s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4492t;

    public /* synthetic */ c(Object obj, int i10) {
        this.f4491s = i10;
        this.f4492t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4491s;
        Object obj = this.f4492t;
        switch (i10) {
            case 0:
                BaseSplashAdView.AnonymousClass3.a((BaseSplashAdView.AnonymousClass3) obj);
                return;
            default:
                PlayerView.A((PlayerView) obj);
                return;
        }
    }
}
