package com.onesignal;

import com.onesignal.v3;
import java.util.ArrayList;

/* compiled from: TrackGooglePurchase.java */
/* loaded from: classes2.dex */
public final class p4 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f26976b;

    public p4(n4 n4Var, ArrayList arrayList) {
        this.f26976b = n4Var;
        this.f26975a = arrayList;
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        n4 n4Var = this.f26976b;
        n4Var.f.addAll(this.f26975a);
        r3.h(n4Var.f.toString(), "GTPlayerPurchases", "purchaseTokens");
        r3.i("GTPlayerPurchases", "ExistingPurchases", true);
        n4Var.f26949g = false;
        n4Var.f26950h = false;
    }
}
