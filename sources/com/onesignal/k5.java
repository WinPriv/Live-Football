package com.onesignal;

import com.onesignal.e5;

/* compiled from: WebViewManager.java */
/* loaded from: classes2.dex */
public final class k5 implements e5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e5.e f26890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e5 f26891b;

    public k5(e5 e5Var, e5.b bVar) {
        this.f26891b = e5Var;
        this.f26890a = bVar;
    }

    @Override // com.onesignal.e5.e
    public final void onComplete() {
        e5 e5Var = this.f26891b;
        e5Var.f26812i = false;
        synchronized (e5Var.f26805a) {
            e5Var.f26807c = null;
        }
        e5.e eVar = this.f26890a;
        if (eVar != null) {
            eVar.onComplete();
        }
    }
}
