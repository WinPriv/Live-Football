package z4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import p4.u;
import z4.d0;

/* compiled from: Ac4Extractor.java */
/* loaded from: classes2.dex */
public final class c implements p4.h {

    /* renamed from: a, reason: collision with root package name */
    public final d f37004a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f37005b = new d6.w(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f37006c;

    @Override // p4.h
    public final int c(p4.i iVar, p4.t tVar) throws IOException {
        d6.w wVar = this.f37005b;
        int read = ((p4.e) iVar).read(wVar.f27384a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        wVar.E(0);
        wVar.D(read);
        boolean z10 = this.f37006c;
        d dVar = this.f37004a;
        if (!z10) {
            dVar.e(4, 0L);
            this.f37006c = true;
        }
        dVar.c(wVar);
        return 0;
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        p4.e eVar;
        int i10;
        d6.w wVar = new d6.w(10);
        int i11 = 0;
        while (true) {
            eVar = (p4.e) iVar;
            eVar.c(wVar.f27384a, 0, 10, false);
            wVar.E(0);
            if (wVar.v() != 4801587) {
                break;
            }
            wVar.F(3);
            int s10 = wVar.s();
            i11 += s10 + 10;
            eVar.k(s10, false);
        }
        eVar.f = 0;
        eVar.k(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            eVar.c(wVar.f27384a, 0, 7, false);
            wVar.E(0);
            int y = wVar.y();
            if (y != 44096 && y != 44097) {
                eVar.f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                eVar.k(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.f27384a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & DefaultClassResolver.NAME) << 8) | (bArr[3] & DefaultClassResolver.NAME);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & DefaultClassResolver.NAME) << 16) | ((bArr[5] & DefaultClassResolver.NAME) << 8) | (bArr[6] & DefaultClassResolver.NAME);
                    } else {
                        i14 = 4;
                    }
                    if (y == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                eVar.k(i10 - 7, false);
            }
        }
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        this.f37004a.f(jVar, new d0.d(0, 1));
        jVar.m();
        jVar.i(new u.b(com.anythink.expressad.exoplayer.b.f7291b));
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.f37006c = false;
        this.f37004a.a();
    }

    @Override // p4.h
    public final void release() {
    }
}
