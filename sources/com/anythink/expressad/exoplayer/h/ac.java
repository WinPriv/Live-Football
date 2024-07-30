package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.h.r;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.j.h;
import com.anythink.expressad.exoplayer.j.t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ac implements r, t.a<b> {

    /* renamed from: i, reason: collision with root package name */
    private static final int f8214i = 1024;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.expressad.exoplayer.m f8216b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f8217c;

    /* renamed from: d, reason: collision with root package name */
    boolean f8218d;

    /* renamed from: e, reason: collision with root package name */
    boolean f8219e;
    boolean f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f8220g;

    /* renamed from: h, reason: collision with root package name */
    int f8221h;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.k f8222j;

    /* renamed from: k, reason: collision with root package name */
    private final h.a f8223k;

    /* renamed from: l, reason: collision with root package name */
    private final int f8224l;

    /* renamed from: m, reason: collision with root package name */
    private final t.a f8225m;

    /* renamed from: n, reason: collision with root package name */
    private final af f8226n;

    /* renamed from: p, reason: collision with root package name */
    private final long f8227p;

    /* renamed from: q, reason: collision with root package name */
    private int f8228q;
    private final ArrayList<a> o = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    final com.anythink.expressad.exoplayer.j.t f8215a = new com.anythink.expressad.exoplayer.j.t("Loader:SingleSampleMediaPeriod");

    /* loaded from: classes.dex */
    public final class a implements y {

        /* renamed from: b, reason: collision with root package name */
        private static final int f8229b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8230c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8231d = 2;

        /* renamed from: e, reason: collision with root package name */
        private int f8233e;
        private boolean f;

        private a() {
        }

        private void d() {
            if (!this.f) {
                ac.this.f8225m.a(com.anythink.expressad.exoplayer.k.o.d(ac.this.f8216b.f9257h), ac.this.f8216b, 0, (Object) null, 0L);
                this.f = true;
            }
        }

        public final void a() {
            if (this.f8233e == 2) {
                this.f8233e = 1;
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final boolean b() {
            return ac.this.f8219e;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final void c() {
            ac acVar = ac.this;
            if (!acVar.f8217c) {
                acVar.f8215a.c();
            }
        }

        public /* synthetic */ a(ac acVar, byte b10) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(com.anythink.expressad.exoplayer.n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10) {
            int i10 = this.f8233e;
            if (i10 == 2) {
                eVar.b(4);
                return -4;
            }
            if (!z10 && i10 != 0) {
                ac acVar = ac.this;
                if (!acVar.f8219e) {
                    return -3;
                }
                if (acVar.f) {
                    eVar.f = 0L;
                    eVar.b(1);
                    eVar.d(ac.this.f8221h);
                    ByteBuffer byteBuffer = eVar.f7594e;
                    ac acVar2 = ac.this;
                    byteBuffer.put(acVar2.f8220g, 0, acVar2.f8221h);
                    d();
                } else {
                    eVar.b(4);
                }
                this.f8233e = 2;
                return -4;
            }
            nVar.f9274a = ac.this.f8216b;
            this.f8233e = 1;
            return -5;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(long j10) {
            if (j10 <= 0 || this.f8233e == 2) {
                return 0;
            }
            this.f8233e = 2;
            d();
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements t.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.expressad.exoplayer.j.k f8234a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.j.h f8235b;

        /* renamed from: c, reason: collision with root package name */
        private int f8236c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f8237d;

        public b(com.anythink.expressad.exoplayer.j.k kVar, com.anythink.expressad.exoplayer.j.h hVar) {
            this.f8234a = kVar;
            this.f8235b = hVar;
        }

        @Override // com.anythink.expressad.exoplayer.j.t.c
        public final void a() {
        }

        @Override // com.anythink.expressad.exoplayer.j.t.c
        public final void b() {
            int i10 = 0;
            this.f8236c = 0;
            try {
                this.f8235b.a(this.f8234a);
                while (i10 != -1) {
                    int i11 = this.f8236c + i10;
                    this.f8236c = i11;
                    byte[] bArr = this.f8237d;
                    if (bArr == null) {
                        this.f8237d = new byte[1024];
                    } else if (i11 == bArr.length) {
                        this.f8237d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    com.anythink.expressad.exoplayer.j.h hVar = this.f8235b;
                    byte[] bArr2 = this.f8237d;
                    int i12 = this.f8236c;
                    i10 = hVar.a(bArr2, i12, bArr2.length - i12);
                }
            } finally {
                com.anythink.expressad.exoplayer.k.af.a(this.f8235b);
            }
        }
    }

    public ac(com.anythink.expressad.exoplayer.j.k kVar, h.a aVar, com.anythink.expressad.exoplayer.m mVar, long j10, int i10, t.a aVar2, boolean z10) {
        this.f8222j = kVar;
        this.f8223k = aVar;
        this.f8216b = mVar;
        this.f8227p = j10;
        this.f8224l = i10;
        this.f8225m = aVar2;
        this.f8217c = z10;
        this.f8226n = new af(new ae(mVar));
        aVar2.a();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(long j10, com.anythink.expressad.exoplayer.ac acVar) {
        return j10;
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final af b() {
        return this.f8226n;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final boolean c(long j10) {
        if (this.f8219e || this.f8215a.a()) {
            return false;
        }
        this.f8225m.a(this.f8222j, 1, -1, this.f8216b, 0, null, 0L, this.f8227p, this.f8215a.a(new b(this.f8222j, this.f8223k.a()), this, this.f8224l));
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long d() {
        if (this.f8219e) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long e() {
        if (!this.f8219e && !this.f8215a.a()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    public final void f() {
        this.f8215a.a((t.d) null);
        this.f8225m.b();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a() {
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long b(long j10) {
        for (int i10 = 0; i10 < this.o.size(); i10++) {
            this.o.get(i10).a();
        }
        return j10;
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(long j10, boolean z10) {
    }

    private void b(b bVar, long j10, long j11) {
        this.f8225m.b(bVar.f8234a, 1, -1, null, 0, null, 0L, this.f8227p, j10, j11, bVar.f8236c);
    }

    @Override // com.anythink.expressad.exoplayer.j.t.a
    public final /* bridge */ /* synthetic */ int a(b bVar, long j10, long j11, IOException iOException) {
        b bVar2 = bVar;
        int i10 = this.f8228q + 1;
        this.f8228q = i10;
        boolean z10 = this.f8217c && i10 >= this.f8224l;
        this.f8225m.a(bVar2.f8234a, 1, -1, this.f8216b, 0, null, 0L, this.f8227p, j10, j11, bVar2.f8236c, iOException, z10);
        if (!z10) {
            return 0;
        }
        this.f8219e = true;
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long c() {
        if (this.f8218d) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f8225m.c();
        this.f8218d = true;
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.anythink.expressad.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j10, long j11) {
        b bVar2 = bVar;
        this.f8225m.a(bVar2.f8234a, 1, -1, this.f8216b, 0, null, 0L, this.f8227p, j10, j11, bVar2.f8236c);
        this.f8221h = bVar2.f8236c;
        this.f8220g = bVar2.f8237d;
        this.f8219e = true;
        this.f = true;
    }

    @Override // com.anythink.expressad.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j10, long j11, boolean z10) {
        this.f8225m.b(bVar.f8234a, 1, -1, null, 0, null, 0L, this.f8227p, j10, j11, r10.f8236c);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(r.a aVar, long j10) {
        aVar.a((r) this);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(com.anythink.expressad.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j10) {
        byte b10 = 0;
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            y yVar = yVarArr[i10];
            if (yVar != null && (fVarArr[i10] == null || !zArr[i10])) {
                this.o.remove(yVar);
                yVarArr[i10] = null;
            }
            if (yVarArr[i10] == null && fVarArr[i10] != null) {
                a aVar = new a(this, b10);
                this.o.add(aVar);
                yVarArr[i10] = aVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final void a_(long j10) {
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(b bVar, long j10, long j11) {
        this.f8225m.a(bVar.f8234a, 1, -1, this.f8216b, 0, null, 0L, this.f8227p, j10, j11, bVar.f8236c);
        this.f8221h = bVar.f8236c;
        this.f8220g = bVar.f8237d;
        this.f8219e = true;
        this.f = true;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private int a2(b bVar, long j10, long j11, IOException iOException) {
        int i10 = this.f8228q + 1;
        this.f8228q = i10;
        boolean z10 = this.f8217c && i10 >= this.f8224l;
        this.f8225m.a(bVar.f8234a, 1, -1, this.f8216b, 0, null, 0L, this.f8227p, j10, j11, bVar.f8236c, iOException, z10);
        if (!z10) {
            return 0;
        }
        this.f8219e = true;
        return 2;
    }
}
