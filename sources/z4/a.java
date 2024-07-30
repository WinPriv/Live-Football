package z4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import p4.u;
import z4.d0;

/* compiled from: Ac3Extractor.java */
/* loaded from: classes2.dex */
public final class a implements p4.h {

    /* renamed from: a, reason: collision with root package name */
    public final b f36978a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f36979b = new d6.w(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f36980c;

    @Override // p4.h
    public final int c(p4.i iVar, p4.t tVar) throws IOException {
        d6.w wVar = this.f36979b;
        int read = ((p4.e) iVar).read(wVar.f27384a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        wVar.E(0);
        wVar.D(read);
        boolean z10 = this.f36980c;
        b bVar = this.f36978a;
        if (!z10) {
            bVar.e(4, 0L);
            this.f36980c = true;
        }
        bVar.c(wVar);
        return 0;
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        p4.e eVar;
        boolean z10;
        int a10;
        d6.w wVar = new d6.w(10);
        int i10 = 0;
        while (true) {
            eVar = (p4.e) iVar;
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            eVar.c(wVar.f27384a, 0, 6, false);
            wVar.E(0);
            if (wVar.y() != 2935) {
                eVar.f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                eVar.k(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.f27384a;
                if (bArr.length < 6) {
                    a10 = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        a10 = ((((bArr[2] & 7) << 8) | (bArr[3] & DefaultClassResolver.NAME)) + 1) * 2;
                    } else {
                        byte b10 = bArr[4];
                        a10 = m4.b.a((b10 & 192) >> 6, b10 & 63);
                    }
                }
                if (a10 == -1) {
                    return false;
                }
                eVar.k(a10 - 6, false);
            }
        }
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        this.f36978a.f(jVar, new d0.d(0, 1));
        jVar.m();
        jVar.i(new u.b(com.anythink.expressad.exoplayer.b.f7291b));
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.f36980c = false;
        this.f36978a.a();
    }

    @Override // p4.h
    public final void release() {
    }
}
