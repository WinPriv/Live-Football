package z4;

import java.io.IOException;
import z4.d0;

/* compiled from: AdtsExtractor.java */
/* loaded from: classes2.dex */
public final class e implements p4.h {

    /* renamed from: d, reason: collision with root package name */
    public final d6.w f37055d;

    /* renamed from: e, reason: collision with root package name */
    public final d6.v f37056e;
    public p4.j f;

    /* renamed from: g, reason: collision with root package name */
    public long f37057g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37060j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37061k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37062l;

    /* renamed from: a, reason: collision with root package name */
    public final int f37052a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final f f37053b = new f(true, null);

    /* renamed from: c, reason: collision with root package name */
    public final d6.w f37054c = new d6.w(2048);

    /* renamed from: i, reason: collision with root package name */
    public int f37059i = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f37058h = -1;

    public e(int i10) {
        d6.w wVar = new d6.w(10);
        this.f37055d = wVar;
        byte[] bArr = wVar.f27384a;
        this.f37056e = new d6.v(bArr, bArr.length);
    }

    public final int a(p4.e eVar) throws IOException {
        int i10 = 0;
        while (true) {
            d6.w wVar = this.f37055d;
            eVar.c(wVar.f27384a, 0, 10, false);
            wVar.E(0);
            if (wVar.v() != 4801587) {
                break;
            }
            wVar.F(3);
            int s10 = wVar.s();
            i10 += s10 + 10;
            eVar.k(s10, false);
        }
        eVar.f = 0;
        eVar.k(i10, false);
        if (this.f37058h == -1) {
            this.f37058h = i10;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0094, code lost:
    
        r18.f37060j = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009e, code lost:
    
        throw k4.z0.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r19, p4.t r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.e.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        boolean z10;
        p4.e eVar = (p4.e) iVar;
        int a10 = a(eVar);
        int i10 = a10;
        int i11 = 0;
        int i12 = 0;
        do {
            d6.w wVar = this.f37055d;
            eVar.c(wVar.f27384a, 0, 2, false);
            wVar.E(0);
            if ((wVar.y() & 65526) == 65520) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10++;
                eVar.f = 0;
                eVar.k(i10, false);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                eVar.c(wVar.f27384a, 0, 4, false);
                d6.v vVar = this.f37056e;
                vVar.k(14);
                int g6 = vVar.g(13);
                if (g6 <= 6) {
                    i10++;
                    eVar.f = 0;
                    eVar.k(i10, false);
                } else {
                    eVar.k(g6 - 6, false);
                    i12 += g6;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - a10 < 8192);
        return false;
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        this.f = jVar;
        this.f37053b.f(jVar, new d0.d(0, 1));
        jVar.m();
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.f37061k = false;
        this.f37053b.a();
        this.f37057g = j11;
    }

    @Override // p4.h
    public final void release() {
    }
}
