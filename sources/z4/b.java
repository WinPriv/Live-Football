package z4;

import k4.i0;
import z4.d0;

/* compiled from: Ac3Reader.java */
/* loaded from: classes2.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final d6.v f36985a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f36986b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36987c;

    /* renamed from: d, reason: collision with root package name */
    public String f36988d;

    /* renamed from: e, reason: collision with root package name */
    public p4.w f36989e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f36990g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36991h;

    /* renamed from: i, reason: collision with root package name */
    public long f36992i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f36993j;

    /* renamed from: k, reason: collision with root package name */
    public int f36994k;

    /* renamed from: l, reason: collision with root package name */
    public long f36995l;

    public b(String str) {
        d6.v vVar = new d6.v(new byte[128], 128);
        this.f36985a = vVar;
        this.f36986b = new d6.w(vVar.f27378a);
        this.f = 0;
        this.f36995l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f36987c = str;
    }

    @Override // z4.j
    public final void a() {
        this.f = 0;
        this.f36990g = 0;
        this.f36991h = false;
        this.f36995l = com.anythink.expressad.exoplayer.b.f7291b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0286  */
    @Override // z4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d6.w r24) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.b.c(d6.w):void");
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f36995l = j10;
        }
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f36988d = dVar.f37051e;
        dVar.b();
        this.f36989e = jVar.s(dVar.f37050d, 1);
    }

    @Override // z4.j
    public final void d() {
    }
}
