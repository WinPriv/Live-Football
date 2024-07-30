package p4;

import java.io.EOFException;
import java.io.IOException;
import k4.i0;
import p4.w;

/* compiled from: DummyTrackOutput.java */
/* loaded from: classes2.dex */
public final class g implements w {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f34323a = new byte[4096];

    @Override // p4.w
    public final int d(c6.h hVar, int i10, boolean z10) throws IOException {
        byte[] bArr = this.f34323a;
        int read = hVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // p4.w
    public final void e(int i10, d6.w wVar) {
        wVar.F(i10);
    }

    @Override // p4.w
    public final void b(i0 i0Var) {
    }

    @Override // p4.w
    public final void c(long j10, int i10, int i11, int i12, w.a aVar) {
    }
}
