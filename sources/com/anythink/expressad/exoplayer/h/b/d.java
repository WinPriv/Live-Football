package com.anythink.expressad.exoplayer.h.b;

import android.util.SparseArray;
import com.anythink.expressad.exoplayer.e.k;
import com.anythink.expressad.exoplayer.e.m;
import com.anythink.expressad.exoplayer.k.s;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public final class d implements com.anythink.expressad.exoplayer.e.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.expressad.exoplayer.e.e f8273a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8274b;

    /* renamed from: c, reason: collision with root package name */
    private final m f8275c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f8276d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8277e;
    private b f;

    /* renamed from: g, reason: collision with root package name */
    private k f8278g;

    /* renamed from: h, reason: collision with root package name */
    private m[] f8279h;

    /* loaded from: classes.dex */
    public interface b {
        com.anythink.expressad.exoplayer.e.m a(int i10);
    }

    private d(com.anythink.expressad.exoplayer.e.e eVar, int i10, m mVar) {
        this.f8273a = eVar;
        this.f8274b = i10;
        this.f8275c = mVar;
    }

    private k b() {
        return this.f8278g;
    }

    private m[] c() {
        return this.f8279h;
    }

    public final void a(b bVar, long j10) {
        this.f = bVar;
        if (!this.f8277e) {
            this.f8273a.a(this);
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                this.f8273a.a(0L, j10);
            }
            this.f8277e = true;
            return;
        }
        com.anythink.expressad.exoplayer.e.e eVar = this.f8273a;
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = 0;
        }
        eVar.a(0L, j10);
        for (int i10 = 0; i10 < this.f8276d.size(); i10++) {
            this.f8276d.valueAt(i10).a(bVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.g
    public final void c_() {
        m[] mVarArr = new m[this.f8276d.size()];
        for (int i10 = 0; i10 < this.f8276d.size(); i10++) {
            mVarArr[i10] = this.f8276d.valueAt(i10).f8280a;
        }
        this.f8279h = mVarArr;
    }

    /* loaded from: classes.dex */
    public static final class a implements com.anythink.expressad.exoplayer.e.m {

        /* renamed from: a, reason: collision with root package name */
        public m f8280a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8281b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8282c;

        /* renamed from: d, reason: collision with root package name */
        private final m f8283d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.e.m f8284e;

        public a(int i10, int i11, m mVar) {
            this.f8281b = i10;
            this.f8282c = i11;
            this.f8283d = mVar;
        }

        public final void a(b bVar) {
            if (bVar == null) {
                this.f8284e = new com.anythink.expressad.exoplayer.e.d();
                return;
            }
            com.anythink.expressad.exoplayer.e.m a10 = bVar.a(this.f8282c);
            this.f8284e = a10;
            m mVar = this.f8280a;
            if (mVar != null) {
                a10.a(mVar);
            }
        }

        @Override // com.anythink.expressad.exoplayer.e.m
        public final void a(m mVar) {
            m mVar2 = this.f8283d;
            if (mVar2 != null) {
                mVar = mVar.a(mVar2);
            }
            this.f8280a = mVar;
            this.f8284e.a(mVar);
        }

        @Override // com.anythink.expressad.exoplayer.e.m
        public final int a(com.anythink.expressad.exoplayer.e.f fVar, int i10, boolean z10) {
            return this.f8284e.a(fVar, i10, z10);
        }

        @Override // com.anythink.expressad.exoplayer.e.m
        public final void a(s sVar, int i10) {
            this.f8284e.a(sVar, i10);
        }

        @Override // com.anythink.expressad.exoplayer.e.m
        public final void a(long j10, int i10, int i11, int i12, m.a aVar) {
            this.f8284e.a(j10, i10, i11, i12, aVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.g
    public final com.anythink.expressad.exoplayer.e.m a(int i10, int i11) {
        a aVar = this.f8276d.get(i10);
        if (aVar == null) {
            com.anythink.expressad.exoplayer.k.a.b(this.f8279h == null);
            aVar = new a(i10, i11, i11 == this.f8274b ? this.f8275c : null);
            aVar.a(this.f);
            this.f8276d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.e.g
    public final void a(k kVar) {
        this.f8278g = kVar;
    }
}
