package r4;

import androidx.activity.n;
import d6.g0;
import d6.w;
import java.io.IOException;
import p4.i;
import p4.j;
import p4.u;

/* compiled from: AviExtractor.java */
/* loaded from: classes2.dex */
public final class b implements p4.h {

    /* renamed from: c, reason: collision with root package name */
    public int f34853c;

    /* renamed from: e, reason: collision with root package name */
    public c f34855e;

    /* renamed from: h, reason: collision with root package name */
    public long f34857h;

    /* renamed from: i, reason: collision with root package name */
    public e f34858i;

    /* renamed from: m, reason: collision with root package name */
    public int f34862m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34863n;

    /* renamed from: a, reason: collision with root package name */
    public final w f34851a = new w(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0470b f34852b = new C0470b();

    /* renamed from: d, reason: collision with root package name */
    public j f34854d = new n();

    /* renamed from: g, reason: collision with root package name */
    public e[] f34856g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public long f34860k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f34861l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f34859j = -1;
    public long f = com.anythink.expressad.exoplayer.b.f7291b;

    /* compiled from: AviExtractor.java */
    /* loaded from: classes2.dex */
    public class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public final long f34864a;

        public a(long j10) {
            this.f34864a = j10;
        }

        @Override // p4.u
        public final boolean e() {
            return true;
        }

        @Override // p4.u
        public final u.a h(long j10) {
            b bVar = b.this;
            u.a b10 = bVar.f34856g[0].b(j10);
            int i10 = 1;
            while (true) {
                e[] eVarArr = bVar.f34856g;
                if (i10 < eVarArr.length) {
                    u.a b11 = eVarArr[i10].b(j10);
                    if (b11.f34350a.f34356b < b10.f34350a.f34356b) {
                        b10 = b11;
                    }
                    i10++;
                } else {
                    return b10;
                }
            }
        }

        @Override // p4.u
        public final long i() {
            return this.f34864a;
        }
    }

    /* compiled from: AviExtractor.java */
    /* renamed from: r4.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0470b {

        /* renamed from: a, reason: collision with root package name */
        public int f34866a;

        /* renamed from: b, reason: collision with root package name */
        public int f34867b;

        /* renamed from: c, reason: collision with root package name */
        public int f34868c;
    }

    public final e a(int i10) {
        boolean z10;
        for (e eVar : this.f34856g) {
            if (eVar.f34878b != i10 && eVar.f34879c != i10) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r23, p4.t r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.b.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        w wVar = this.f34851a;
        ((p4.e) iVar).c(wVar.f27384a, 0, 12, false);
        wVar.E(0);
        if (wVar.g() != 1179011410) {
            return false;
        }
        wVar.F(4);
        if (wVar.g() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f34853c = 0;
        this.f34854d = jVar;
        this.f34857h = -1L;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.f34857h = -1L;
        this.f34858i = null;
        for (e eVar : this.f34856g) {
            if (eVar.f34885j == 0) {
                eVar.f34883h = 0;
            } else {
                eVar.f34883h = eVar.f34887l[g0.f(eVar.f34886k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f34856g.length == 0) {
                this.f34853c = 0;
                return;
            } else {
                this.f34853c = 3;
                return;
            }
        }
        this.f34853c = 6;
    }

    @Override // p4.h
    public final void release() {
    }
}
