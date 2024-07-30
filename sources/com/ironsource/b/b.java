package com.ironsource.b;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final c f24592s;

    /* renamed from: t, reason: collision with root package name */
    public final String f24593t;

    /* renamed from: u, reason: collision with root package name */
    public final String f24594u;

    public b(c cVar, String str, String str2, ArrayList<com.ironsource.mediationsdk.a.c> arrayList) {
        this.f24592s = cVar;
        this.f24593t = str;
        this.f24594u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            com.ironsource.d.c a10 = com.ironsource.d.b.a(this.f24594u, this.f24593t, arrayList);
            if (a10 != null) {
                int i10 = a10.f24612a;
                if (i10 == 200 || i10 == 204) {
                    z10 = true;
                }
            }
        } catch (Exception unused) {
        }
        c cVar = this.f24592s;
        if (cVar != null) {
            cVar.a(null, z10);
        }
    }
}
