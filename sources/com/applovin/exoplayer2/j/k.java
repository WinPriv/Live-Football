package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f16021a;

    /* renamed from: b, reason: collision with root package name */
    public final at[] f16022b;

    /* renamed from: c, reason: collision with root package name */
    public final d[] f16023c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16024d;

    public k(at[] atVarArr, d[] dVarArr, Object obj) {
        this.f16022b = atVarArr;
        this.f16023c = (d[]) dVarArr.clone();
        this.f16024d = obj;
        this.f16021a = atVarArr.length;
    }

    public boolean a(int i10) {
        return this.f16022b[i10] != null;
    }

    public boolean a(k kVar) {
        if (kVar == null || kVar.f16023c.length != this.f16023c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f16023c.length; i10++) {
            if (!a(kVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(k kVar, int i10) {
        return kVar != null && ai.a(this.f16022b[i10], kVar.f16022b[i10]) && ai.a(this.f16023c[i10], kVar.f16023c[i10]);
    }
}
