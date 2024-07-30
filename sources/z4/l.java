package z4;

import java.util.Arrays;
import z4.d0;

/* compiled from: H263Reader.java */
/* loaded from: classes2.dex */
public final class l implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f37122l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final e0 f37123a;
    public b f;

    /* renamed from: g, reason: collision with root package name */
    public long f37128g;

    /* renamed from: h, reason: collision with root package name */
    public String f37129h;

    /* renamed from: i, reason: collision with root package name */
    public p4.w f37130i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37131j;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f37125c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final a f37126d = new a();

    /* renamed from: k, reason: collision with root package name */
    public long f37132k = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: e, reason: collision with root package name */
    public final r f37127e = new r(178);

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f37124b = new d6.w();

    /* compiled from: H263Reader.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final byte[] f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f37133a;

        /* renamed from: b, reason: collision with root package name */
        public int f37134b;

        /* renamed from: c, reason: collision with root package name */
        public int f37135c;

        /* renamed from: d, reason: collision with root package name */
        public int f37136d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f37137e = new byte[128];

        public final void a(byte[] bArr, int i10, int i11) {
            if (!this.f37133a) {
                return;
            }
            int i12 = i11 - i10;
            byte[] bArr2 = this.f37137e;
            int length = bArr2.length;
            int i13 = this.f37135c;
            if (length < i13 + i12) {
                this.f37137e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f37137e, this.f37135c, i12);
            this.f37135c += i12;
        }
    }

    /* compiled from: H263Reader.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final p4.w f37138a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f37139b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f37140c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f37141d;

        /* renamed from: e, reason: collision with root package name */
        public int f37142e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public long f37143g;

        /* renamed from: h, reason: collision with root package name */
        public long f37144h;

        public b(p4.w wVar) {
            this.f37138a = wVar;
        }

        public final void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            if (this.f37140c) {
                int i12 = this.f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    if (((bArr[i13] & 192) >> 6) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f37141d = z10;
                    this.f37140c = false;
                    return;
                }
                this.f = (i11 - i10) + i12;
            }
        }
    }

    public l(e0 e0Var) {
        this.f37123a = e0Var;
    }

    @Override // z4.j
    public final void a() {
        d6.s.a(this.f37125c);
        a aVar = this.f37126d;
        aVar.f37133a = false;
        aVar.f37135c = 0;
        aVar.f37134b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.f37139b = false;
            bVar.f37140c = false;
            bVar.f37141d = false;
            bVar.f37142e = -1;
        }
        r rVar = this.f37127e;
        if (rVar != null) {
            rVar.c();
        }
        this.f37128g = 0L;
        this.f37132k = com.anythink.expressad.exoplayer.b.f7291b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0279  */
    @Override // z4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d6.w r27) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.l.c(d6.w):void");
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f37132k = j10;
        }
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f37129h = dVar.f37051e;
        dVar.b();
        p4.w s10 = jVar.s(dVar.f37050d, 2);
        this.f37130i = s10;
        this.f = new b(s10);
        e0 e0Var = this.f37123a;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }

    @Override // z4.j
    public final void d() {
    }
}
