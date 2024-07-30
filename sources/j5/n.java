package j5;

import android.net.Uri;
import j5.b0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: IcyDataSource.java */
/* loaded from: classes2.dex */
public final class n implements c6.j {

    /* renamed from: a, reason: collision with root package name */
    public final c6.j f29806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29807b;

    /* renamed from: c, reason: collision with root package name */
    public final a f29808c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f29809d;

    /* renamed from: e, reason: collision with root package name */
    public int f29810e;

    /* compiled from: IcyDataSource.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public n(c6.g0 g0Var, int i10, a aVar) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        this.f29806a = g0Var;
        this.f29807b = i10;
        this.f29808c = aVar;
        this.f29809d = new byte[1];
        this.f29810e = i10;
    }

    @Override // c6.j
    public final void b(c6.h0 h0Var) {
        h0Var.getClass();
        this.f29806a.b(h0Var);
    }

    @Override // c6.j
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // c6.j
    public final long f(c6.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c6.j
    public final Map<String, List<String>> g() {
        return this.f29806a.g();
    }

    @Override // c6.j
    public final Uri getUri() {
        return this.f29806a.getUri();
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long max;
        int i12 = this.f29810e;
        c6.j jVar = this.f29806a;
        if (i12 == 0) {
            byte[] bArr2 = this.f29809d;
            boolean z10 = false;
            if (jVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & com.anythink.expressad.exoplayer.k.p.f9095b) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    int i15 = 0;
                    while (i14 > 0) {
                        int read = jVar.read(bArr3, i15, i14);
                        if (read == -1) {
                            break;
                        }
                        i15 += read;
                        i14 -= read;
                    }
                    while (i13 > 0) {
                        int i16 = i13 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i13 = i16;
                    }
                    if (i13 > 0) {
                        d6.w wVar = new d6.w(bArr3, i13);
                        b0.a aVar = (b0.a) this.f29808c;
                        if (!aVar.f29671m) {
                            max = aVar.f29668j;
                        } else {
                            Map<String, String> map = b0.f29647g0;
                            max = Math.max(b0.this.w(true), aVar.f29668j);
                        }
                        int i17 = wVar.f27386c - wVar.f27385b;
                        e0 e0Var = aVar.f29670l;
                        e0Var.getClass();
                        e0Var.e(i17, wVar);
                        e0Var.c(max, 1, i17, 0, null);
                        aVar.f29671m = true;
                    }
                }
                z10 = true;
            }
            if (!z10) {
                return -1;
            }
            this.f29810e = this.f29807b;
        }
        int read2 = jVar.read(bArr, i10, Math.min(this.f29810e, i11));
        if (read2 != -1) {
            this.f29810e -= read2;
        }
        return read2;
    }
}
