package y4;

import com.anythink.expressad.exoplayer.k.p;
import d6.w;
import java.io.EOFException;
import java.io.IOException;
import k4.z0;

/* compiled from: OggPageHeader.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f36673a;

    /* renamed from: b, reason: collision with root package name */
    public long f36674b;

    /* renamed from: c, reason: collision with root package name */
    public int f36675c;

    /* renamed from: d, reason: collision with root package name */
    public int f36676d;

    /* renamed from: e, reason: collision with root package name */
    public int f36677e;
    public final int[] f = new int[p.f9095b];

    /* renamed from: g, reason: collision with root package name */
    public final w f36678g = new w(p.f9095b);

    public final boolean a(p4.e eVar, boolean z10) throws IOException {
        boolean z11;
        boolean z12;
        this.f36673a = 0;
        this.f36674b = 0L;
        this.f36675c = 0;
        this.f36676d = 0;
        this.f36677e = 0;
        w wVar = this.f36678g;
        wVar.B(27);
        try {
            z11 = eVar.c(wVar.f27384a, 0, 27, z10);
        } catch (EOFException e10) {
            if (z10) {
                z11 = false;
            } else {
                throw e10;
            }
        }
        if (!z11 || wVar.u() != 1332176723) {
            return false;
        }
        if (wVar.t() != 0) {
            if (z10) {
                return false;
            }
            throw z0.c("unsupported bit stream revision");
        }
        this.f36673a = wVar.t();
        this.f36674b = wVar.h();
        wVar.j();
        wVar.j();
        wVar.j();
        int t10 = wVar.t();
        this.f36675c = t10;
        this.f36676d = t10 + 27;
        wVar.B(t10);
        try {
            z12 = eVar.c(wVar.f27384a, 0, this.f36675c, z10);
        } catch (EOFException e11) {
            if (z10) {
                z12 = false;
            } else {
                throw e11;
            }
        }
        if (!z12) {
            return false;
        }
        for (int i10 = 0; i10 < this.f36675c; i10++) {
            int t11 = wVar.t();
            this.f[i10] = t11;
            this.f36677e += t11;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r10.f34314d >= r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r10.o(1) == (-1)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(p4.e r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r10.f34314d
            long r2 = r10.d()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            d6.a.a(r0)
            d6.w r0 = r9.f36678g
            r3 = 4
            r0.B(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f34314d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f27384a
            boolean r5 = r10.c(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.E(r1)
            long r4 = r0.u()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f = r1
            return r2
        L42:
            r10.i(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f34314d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.o(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e.b(p4.e, long):boolean");
    }
}
