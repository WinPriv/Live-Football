package z4;

import android.util.SparseArray;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* compiled from: PsExtractor.java */
/* loaded from: classes2.dex */
public final class w implements p4.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f37280e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37281g;

    /* renamed from: h, reason: collision with root package name */
    public long f37282h;

    /* renamed from: i, reason: collision with root package name */
    public u f37283i;

    /* renamed from: j, reason: collision with root package name */
    public p4.j f37284j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37285k;

    /* renamed from: a, reason: collision with root package name */
    public final d6.d0 f37276a = new d6.d0(0);

    /* renamed from: c, reason: collision with root package name */
    public final d6.w f37278c = new d6.w(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f37277b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public final v f37279d = new v();

    /* compiled from: PsExtractor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f37286a;

        /* renamed from: b, reason: collision with root package name */
        public final d6.d0 f37287b;

        /* renamed from: c, reason: collision with root package name */
        public final d6.v f37288c = new d6.v(new byte[64], 64);

        /* renamed from: d, reason: collision with root package name */
        public boolean f37289d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f37290e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public long f37291g;

        public a(j jVar, d6.d0 d0Var) {
            this.f37286a = jVar;
            this.f37287b = d0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r19, p4.t r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.w.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        byte[] bArr = new byte[14];
        p4.e eVar = (p4.e) iVar;
        eVar.c(bArr, 0, 14, false);
        if (442 != (((bArr[0] & DefaultClassResolver.NAME) << 24) | ((bArr[1] & DefaultClassResolver.NAME) << 16) | ((bArr[2] & DefaultClassResolver.NAME) << 8) | (bArr[3] & DefaultClassResolver.NAME)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        eVar.k(bArr[13] & 7, false);
        eVar.c(bArr, 0, 3, false);
        if (1 != (((bArr[0] & DefaultClassResolver.NAME) << 16) | ((bArr[1] & DefaultClassResolver.NAME) << 8) | (bArr[2] & DefaultClassResolver.NAME))) {
            return false;
        }
        return true;
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        this.f37284j = jVar;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        long j12;
        boolean z10;
        d6.d0 d0Var = this.f37276a;
        synchronized (d0Var) {
            j12 = d0Var.f27293b;
        }
        boolean z11 = true;
        if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long c10 = d0Var.c();
            if (c10 == com.anythink.expressad.exoplayer.b.f7291b || c10 == 0 || c10 == j11) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            d0Var.d(j11);
        }
        u uVar = this.f37283i;
        if (uVar != null) {
            uVar.c(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.f37277b;
            if (i10 < sparseArray.size()) {
                a valueAt = sparseArray.valueAt(i10);
                valueAt.f = false;
                valueAt.f37286a.a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // p4.h
    public final void release() {
    }
}
