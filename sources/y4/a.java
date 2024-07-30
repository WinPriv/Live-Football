package y4;

import d6.g0;
import p4.u;
import p4.v;

/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes2.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final e f36648a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36649b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36650c;

    /* renamed from: d, reason: collision with root package name */
    public final h f36651d;

    /* renamed from: e, reason: collision with root package name */
    public int f36652e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f36653g;

    /* renamed from: h, reason: collision with root package name */
    public long f36654h;

    /* renamed from: i, reason: collision with root package name */
    public long f36655i;

    /* renamed from: j, reason: collision with root package name */
    public long f36656j;

    /* renamed from: k, reason: collision with root package name */
    public long f36657k;

    /* renamed from: l, reason: collision with root package name */
    public long f36658l;

    /* compiled from: DefaultOggSeeker.java */
    /* renamed from: y4.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0511a implements u {
        public C0511a() {
        }

        @Override // p4.u
        public final boolean e() {
            return true;
        }

        @Override // p4.u
        public final u.a h(long j10) {
            a aVar = a.this;
            long j11 = aVar.f36649b;
            long j12 = aVar.f36650c;
            v vVar = new v(j10, g0.i(((((j12 - j11) * ((aVar.f36651d.f36688i * j10) / 1000000)) / aVar.f) + j11) - 30000, j11, j12 - 1));
            return new u.a(vVar, vVar);
        }

        @Override // p4.u
        public final long i() {
            return (a.this.f * 1000000) / r0.f36651d.f36688i;
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        d6.a.a(z11);
        this.f36651d = hVar;
        this.f36649b = j10;
        this.f36650c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f36652e = 0;
        } else {
            this.f = j13;
            this.f36652e = 4;
        }
        this.f36648a = new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    @Override // y4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(p4.e r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.a.a(p4.e):long");
    }

    @Override // y4.f
    public final u b() {
        if (this.f != 0) {
            return new C0511a();
        }
        return null;
    }

    @Override // y4.f
    public final void c(long j10) {
        this.f36654h = g0.i(j10, 0L, this.f - 1);
        this.f36652e = 2;
        this.f36655i = this.f36649b;
        this.f36656j = this.f36650c;
        this.f36657k = 0L;
        this.f36658l = this.f;
    }
}
