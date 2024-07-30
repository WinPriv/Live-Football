package com.anythink.basead.ui;

import a3.k;
import k4.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4500s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4501t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4502u;

    public /* synthetic */ g(int i10, int i11, Object obj) {
        this.f4500s = i11;
        this.f4502u = obj;
        this.f4501t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4500s;
        int i11 = this.f4501t;
        Object obj = this.f4502u;
        switch (i10) {
            case 0:
                ThirdPartyFullScreenAdView.X((ThirdPartyFullScreenAdView) obj, i11);
                return;
            default:
                k4.c cVar = ((c.a) obj).f30379b;
                cVar.getClass();
                boolean z10 = true;
                if (i11 != -3 && i11 != -2) {
                    if (i11 != -1) {
                        if (i11 != 1) {
                            k.s("Unknown focus change type: ", i11, "AudioFocusManager");
                            return;
                        } else {
                            cVar.d(1);
                            cVar.b(1);
                            return;
                        }
                    }
                    cVar.b(-1);
                    cVar.a();
                    return;
                }
                if (i11 != -2) {
                    m4.d dVar = cVar.f30374d;
                    if (dVar == null || dVar.f32719s != 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        cVar.d(3);
                        return;
                    }
                }
                cVar.b(0);
                cVar.d(2);
                return;
        }
    }
}
