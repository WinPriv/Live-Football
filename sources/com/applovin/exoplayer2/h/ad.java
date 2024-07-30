package com.applovin.exoplayer2.h;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ad implements com.applovin.exoplayer2.g {

    /* renamed from: a */
    public static final ad f15284a = new ad(new ac[0]);

    /* renamed from: c */
    public static final g.a<ad> f15285c = new com.applovin.exoplayer2.a0(6);

    /* renamed from: b */
    public final int f15286b;

    /* renamed from: d */
    private final ac[] f15287d;

    /* renamed from: e */
    private int f15288e;

    public ad(ac... acVarArr) {
        this.f15287d = acVarArr;
        this.f15286b = acVarArr.length;
    }

    public static /* synthetic */ ad b(Bundle bundle) {
        return a(bundle);
    }

    public ac a(int i10) {
        return this.f15287d[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad.class != obj.getClass()) {
            return false;
        }
        ad adVar = (ad) obj;
        if (this.f15286b == adVar.f15286b && Arrays.equals(this.f15287d, adVar.f15287d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f15288e == 0) {
            this.f15288e = Arrays.hashCode(this.f15287d);
        }
        return this.f15288e;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public int a(ac acVar) {
        for (int i10 = 0; i10 < this.f15286b; i10++) {
            if (this.f15287d[i10] == acVar) {
                return i10;
            }
        }
        return -1;
    }

    public boolean a() {
        return this.f15286b == 0;
    }

    public static /* synthetic */ ad a(Bundle bundle) {
        return new ad((ac[]) com.applovin.exoplayer2.l.c.a(ac.f15280b, bundle.getParcelableArrayList(b(0)), com.applovin.exoplayer2.common.a.s.g()).toArray(new ac[0]));
    }
}
