package r5;

import java.nio.ByteBuffer;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes2.dex */
public abstract class f extends n4.j<k, l, i> implements h {
    public f() {
        super(new k[2], new l[2]);
        boolean z10;
        int i10 = this.f33338g;
        n4.g[] gVarArr = this.f33337e;
        if (i10 == gVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        for (n4.g gVar : gVarArr) {
            gVar.j(1024);
        }
    }

    @Override // n4.j
    public final i e(n4.g gVar, n4.h hVar, boolean z10) {
        k kVar = (k) gVar;
        l lVar = (l) hVar;
        try {
            ByteBuffer byteBuffer = kVar.f33322u;
            byteBuffer.getClass();
            lVar.i(kVar.f33324w, g(byteBuffer.array(), byteBuffer.limit(), z10), kVar.A);
            lVar.f33298s &= Integer.MAX_VALUE;
            return null;
        } catch (i e10) {
            return e10;
        }
    }

    public abstract g g(byte[] bArr, int i10, boolean z10) throws i;

    @Override // r5.h
    public final void a(long j10) {
    }
}
