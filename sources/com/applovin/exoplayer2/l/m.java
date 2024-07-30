package com.applovin.exoplayer2.l;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f16311a;

    public boolean a(int i10) {
        return this.f16311a.get(i10);
    }

    public int b(int i10) {
        com.applovin.exoplayer2.l.a.a(i10, 0, a());
        return this.f16311a.keyAt(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (ai.f16274a < 24) {
            if (a() != mVar.a()) {
                return false;
            }
            for (int i10 = 0; i10 < a(); i10++) {
                if (b(i10) != mVar.b(i10)) {
                    return false;
                }
            }
            return true;
        }
        return this.f16311a.equals(mVar.f16311a);
    }

    public int hashCode() {
        if (ai.f16274a < 24) {
            int a10 = a();
            for (int i10 = 0; i10 < a(); i10++) {
                a10 = (a10 * 31) + b(i10);
            }
            return a10;
        }
        return this.f16311a.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f16312a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f16313b;

        public a a(int i10) {
            com.applovin.exoplayer2.l.a.b(!this.f16313b);
            this.f16312a.append(i10, true);
            return this;
        }

        public a a(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public a a(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public a a(m mVar) {
            for (int i10 = 0; i10 < mVar.a(); i10++) {
                a(mVar.b(i10));
            }
            return this;
        }

        public m a() {
            com.applovin.exoplayer2.l.a.b(!this.f16313b);
            this.f16313b = true;
            return new m(this.f16312a);
        }
    }

    private m(SparseBooleanArray sparseBooleanArray) {
        this.f16311a = sparseBooleanArray;
    }

    public boolean a(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f16311a.size();
    }
}
