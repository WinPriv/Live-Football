package z4;

import android.util.SparseArray;
import d6.s;
import z4.d0;

/* compiled from: H264Reader.java */
/* loaded from: classes2.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z f37145a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37146b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37147c;

    /* renamed from: g, reason: collision with root package name */
    public long f37150g;

    /* renamed from: i, reason: collision with root package name */
    public String f37152i;

    /* renamed from: j, reason: collision with root package name */
    public p4.w f37153j;

    /* renamed from: k, reason: collision with root package name */
    public a f37154k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37155l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f37157n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f37151h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final r f37148d = new r(7);

    /* renamed from: e, reason: collision with root package name */
    public final r f37149e = new r(8);
    public final r f = new r(6);

    /* renamed from: m, reason: collision with root package name */
    public long f37156m = com.anythink.expressad.exoplayer.b.f7291b;
    public final d6.w o = new d6.w();

    /* compiled from: H264Reader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final p4.w f37158a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f37159b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f37160c;
        public final p4.y f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f37163g;

        /* renamed from: h, reason: collision with root package name */
        public int f37164h;

        /* renamed from: i, reason: collision with root package name */
        public int f37165i;

        /* renamed from: j, reason: collision with root package name */
        public long f37166j;

        /* renamed from: l, reason: collision with root package name */
        public long f37168l;

        /* renamed from: p, reason: collision with root package name */
        public long f37171p;

        /* renamed from: q, reason: collision with root package name */
        public long f37172q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f37173r;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<s.c> f37161d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<s.b> f37162e = new SparseArray<>();

        /* renamed from: m, reason: collision with root package name */
        public C0515a f37169m = new C0515a();

        /* renamed from: n, reason: collision with root package name */
        public C0515a f37170n = new C0515a();

        /* renamed from: k, reason: collision with root package name */
        public boolean f37167k = false;
        public boolean o = false;

        /* compiled from: H264Reader.java */
        /* renamed from: z4.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0515a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f37174a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f37175b;

            /* renamed from: c, reason: collision with root package name */
            public s.c f37176c;

            /* renamed from: d, reason: collision with root package name */
            public int f37177d;

            /* renamed from: e, reason: collision with root package name */
            public int f37178e;
            public int f;

            /* renamed from: g, reason: collision with root package name */
            public int f37179g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f37180h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f37181i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f37182j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f37183k;

            /* renamed from: l, reason: collision with root package name */
            public int f37184l;

            /* renamed from: m, reason: collision with root package name */
            public int f37185m;

            /* renamed from: n, reason: collision with root package name */
            public int f37186n;
            public int o;

            /* renamed from: p, reason: collision with root package name */
            public int f37187p;
        }

        public a(p4.w wVar, boolean z10, boolean z11) {
            this.f37158a = wVar;
            this.f37159b = z10;
            this.f37160c = z11;
            byte[] bArr = new byte[128];
            this.f37163g = bArr;
            this.f = new p4.y(bArr, 0, 0);
            C0515a c0515a = this.f37170n;
            c0515a.f37175b = false;
            c0515a.f37174a = false;
        }
    }

    public m(z zVar, boolean z10, boolean z11) {
        this.f37145a = zVar;
        this.f37146b = z10;
        this.f37147c = z11;
    }

    @Override // z4.j
    public final void a() {
        this.f37150g = 0L;
        this.f37157n = false;
        this.f37156m = com.anythink.expressad.exoplayer.b.f7291b;
        d6.s.a(this.f37151h);
        this.f37148d.c();
        this.f37149e.c();
        this.f.c();
        a aVar = this.f37154k;
        if (aVar != null) {
            aVar.f37167k = false;
            aVar.o = false;
            a.C0515a c0515a = aVar.f37170n;
            c0515a.f37175b = false;
            c0515a.f37174a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.m.b(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e0, code lost:
    
        if (r6.f37186n != r7.f37186n) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f1, code lost:
    
        if (r6.f37187p != r7.f37187p) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ff, code lost:
    
        if (r6.f37184l != r7.f37184l) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0205, code lost:
    
        if (r6 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0298, code lost:
    
        if (r5 != 1) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a0  */
    @Override // z4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d6.w r29) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.m.c(d6.w):void");
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        boolean z10;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f37156m = j10;
        }
        boolean z11 = this.f37157n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37157n = z10 | z11;
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f37152i = dVar.f37051e;
        dVar.b();
        p4.w s10 = jVar.s(dVar.f37050d, 2);
        this.f37153j = s10;
        this.f37154k = new a(s10, this.f37146b, this.f37147c);
        this.f37145a.a(jVar, dVar);
    }

    @Override // z4.j
    public final void d() {
    }
}
