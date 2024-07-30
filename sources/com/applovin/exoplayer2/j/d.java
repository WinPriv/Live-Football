package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public interface d extends g {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ac f15973a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f15974b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15975c;

        public a(ac acVar, int... iArr) {
            this(acVar, iArr, 0);
        }

        public a(ac acVar, int[] iArr, int i10) {
            this.f15973a = acVar;
            this.f15974b = iArr;
            this.f15975c = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        d[] a(a[] aVarArr, com.applovin.exoplayer2.k.d dVar, p.a aVar, ba baVar);
    }

    void a();

    void a(float f);

    void b();

    int c();

    v f();

    default void g() {
    }

    default void h() {
    }

    default void a(boolean z10) {
    }
}
