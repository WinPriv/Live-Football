package z4;

import java.util.Arrays;
import z4.d0;

/* compiled from: H262Reader.java */
/* loaded from: classes2.dex */
public final class k implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f37102q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f37103a;

    /* renamed from: b, reason: collision with root package name */
    public p4.w f37104b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f37105c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.w f37106d;

    /* renamed from: e, reason: collision with root package name */
    public final r f37107e;
    public final boolean[] f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final a f37108g = new a();

    /* renamed from: h, reason: collision with root package name */
    public long f37109h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37110i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37111j;

    /* renamed from: k, reason: collision with root package name */
    public long f37112k;

    /* renamed from: l, reason: collision with root package name */
    public long f37113l;

    /* renamed from: m, reason: collision with root package name */
    public long f37114m;

    /* renamed from: n, reason: collision with root package name */
    public long f37115n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37116p;

    /* compiled from: H262Reader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f37117e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f37118a;

        /* renamed from: b, reason: collision with root package name */
        public int f37119b;

        /* renamed from: c, reason: collision with root package name */
        public int f37120c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f37121d = new byte[128];

        public final void a(byte[] bArr, int i10, int i11) {
            if (!this.f37118a) {
                return;
            }
            int i12 = i11 - i10;
            byte[] bArr2 = this.f37121d;
            int length = bArr2.length;
            int i13 = this.f37119b;
            if (length < i13 + i12) {
                this.f37121d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f37121d, this.f37119b, i12);
            this.f37119b += i12;
        }
    }

    public k(e0 e0Var) {
        this.f37105c = e0Var;
        if (e0Var != null) {
            this.f37107e = new r(178);
            this.f37106d = new d6.w();
        } else {
            this.f37107e = null;
            this.f37106d = null;
        }
        this.f37113l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f37115n = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // z4.j
    public final void a() {
        d6.s.a(this.f);
        a aVar = this.f37108g;
        aVar.f37118a = false;
        aVar.f37119b = 0;
        aVar.f37120c = 0;
        r rVar = this.f37107e;
        if (rVar != null) {
            rVar.c();
        }
        this.f37109h = 0L;
        this.f37110i = false;
        this.f37113l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f37115n = com.anythink.expressad.exoplayer.b.f7291b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // z4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d6.w r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.k.c(d6.w):void");
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        this.f37113l = j10;
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f37103a = dVar.f37051e;
        dVar.b();
        this.f37104b = jVar.s(dVar.f37050d, 2);
        e0 e0Var = this.f37105c;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }

    @Override // z4.j
    public final void d() {
    }
}
