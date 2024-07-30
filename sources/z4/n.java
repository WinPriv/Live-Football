package z4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import z4.d0;

/* compiled from: H265Reader.java */
/* loaded from: classes2.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f37188a;

    /* renamed from: b, reason: collision with root package name */
    public String f37189b;

    /* renamed from: c, reason: collision with root package name */
    public p4.w f37190c;

    /* renamed from: d, reason: collision with root package name */
    public a f37191d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37192e;

    /* renamed from: l, reason: collision with root package name */
    public long f37198l;
    public final boolean[] f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final r f37193g = new r(32);

    /* renamed from: h, reason: collision with root package name */
    public final r f37194h = new r(33);

    /* renamed from: i, reason: collision with root package name */
    public final r f37195i = new r(34);

    /* renamed from: j, reason: collision with root package name */
    public final r f37196j = new r(39);

    /* renamed from: k, reason: collision with root package name */
    public final r f37197k = new r(40);

    /* renamed from: m, reason: collision with root package name */
    public long f37199m = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: n, reason: collision with root package name */
    public final d6.w f37200n = new d6.w();

    /* compiled from: H265Reader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final p4.w f37201a;

        /* renamed from: b, reason: collision with root package name */
        public long f37202b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f37203c;

        /* renamed from: d, reason: collision with root package name */
        public int f37204d;

        /* renamed from: e, reason: collision with root package name */
        public long f37205e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f37206g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f37207h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f37208i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f37209j;

        /* renamed from: k, reason: collision with root package name */
        public long f37210k;

        /* renamed from: l, reason: collision with root package name */
        public long f37211l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f37212m;

        public a(p4.w wVar) {
            this.f37201a = wVar;
        }
    }

    public n(z zVar) {
        this.f37188a = zVar;
    }

    @Override // z4.j
    public final void a() {
        this.f37198l = 0L;
        this.f37199m = com.anythink.expressad.exoplayer.b.f7291b;
        d6.s.a(this.f);
        this.f37193g.c();
        this.f37194h.c();
        this.f37195i.c();
        this.f37196j.c();
        this.f37197k.c();
        a aVar = this.f37191d;
        if (aVar != null) {
            aVar.f = false;
            aVar.f37206g = false;
            aVar.f37207h = false;
            aVar.f37208i = false;
            aVar.f37209j = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void b(byte[] bArr, int i10, int i11) {
        boolean z10;
        a aVar = this.f37191d;
        if (aVar.f) {
            int i12 = aVar.f37204d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.f37206g = z10;
                aVar.f = false;
            } else {
                aVar.f37204d = (i11 - i10) + i12;
            }
        }
        if (!this.f37192e) {
            this.f37193g.a(bArr, i10, i11);
            this.f37194h.a(bArr, i10, i11);
            this.f37195i.a(bArr, i10, i11);
        }
        this.f37196j.a(bArr, i10, i11);
        this.f37197k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0458 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    @Override // z4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d6.w r38) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.n.c(d6.w):void");
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f37199m = j10;
        }
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f37189b = dVar.f37051e;
        dVar.b();
        p4.w s10 = jVar.s(dVar.f37050d, 2);
        this.f37190c = s10;
        this.f37191d = new a(s10);
        this.f37188a.a(jVar, dVar);
    }

    @Override // z4.j
    public final void d() {
    }
}
