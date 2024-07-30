package o5;

import j5.f0;
import java.io.IOException;

/* compiled from: HlsSampleStream.java */
/* loaded from: classes2.dex */
public final class m implements f0 {

    /* renamed from: s, reason: collision with root package name */
    public final int f33687s;

    /* renamed from: t, reason: collision with root package name */
    public final n f33688t;

    /* renamed from: u, reason: collision with root package name */
    public int f33689u = -1;

    public m(n nVar, int i10) {
        this.f33688t = nVar;
        this.f33687s = i10;
    }

    @Override // j5.f0
    public final void a() throws IOException {
        int i10 = this.f33689u;
        n nVar = this.f33688t;
        if (i10 != -2) {
            if (i10 == -1) {
                nVar.D();
                return;
            } else {
                if (i10 != -3) {
                    nVar.D();
                    nVar.N[i10].t();
                    return;
                }
                return;
            }
        }
        nVar.u();
        throw new m5.b(nVar.f33691c0.a(this.f33687s).f29804v[0].D);
    }

    public final void b() {
        boolean z10;
        if (this.f33689u == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        n nVar = this.f33688t;
        nVar.u();
        nVar.f33693e0.getClass();
        int[] iArr = nVar.f33693e0;
        int i10 = this.f33687s;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (nVar.f33692d0.contains(nVar.f33691c0.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = nVar.f33696h0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f33689u = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r7.hasNext() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        r2 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r7.hasNext() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r7 = r2;
     */
    @Override // j5.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(long r6) {
        /*
            r5 = this;
            int r0 = r5.f33689u
            r1 = 0
            r2 = -1
            if (r0 == r2) goto Le
            r3 = -3
            if (r0 == r3) goto Le
            r3 = -2
            if (r0 == r3) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = r1
        Lf:
            if (r3 == 0) goto L6c
            o5.n r3 = r5.f33688t
            boolean r4 = r3.B()
            if (r4 == 0) goto L1a
            goto L6c
        L1a:
            o5.n$c[] r1 = r3.N
            r1 = r1[r0]
            boolean r4 = r3.f33702n0
            int r6 = r1.p(r6, r4)
            java.util.ArrayList<o5.j> r7 = r3.F
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L3b
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L31
            goto L51
        L31:
            int r3 = r7.size()
            int r3 = r3 + r2
            java.lang.Object r7 = r7.get(r3)
            goto L52
        L3b:
            java.util.Iterator r7 = r7.iterator()
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L51
        L45:
            java.lang.Object r2 = r7.next()
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L45
            r7 = r2
            goto L52
        L51:
            r7 = 0
        L52:
            o5.j r7 = (o5.j) r7
            if (r7 == 0) goto L68
            boolean r2 = r7.K
            if (r2 != 0) goto L68
            int r2 = r1.f29727q
            int r3 = r1.f29729s
            int r2 = r2 + r3
            int r7 = r7.f(r0)
            int r7 = r7 - r2
            int r6 = java.lang.Math.min(r6, r7)
        L68:
            r1.y(r6)
            r1 = r6
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.m.i(long):int");
    }

    @Override // j5.f0
    public final boolean isReady() {
        boolean z10;
        boolean z11;
        int i10 = this.f33689u;
        if (i10 == -3) {
            return true;
        }
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            n nVar = this.f33688t;
            if (!nVar.B() && nVar.N[i10].r(nVar.f33702n0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        if (r8.get(0).K == false) goto L85;
     */
    @Override // j5.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(j1.a r18, n4.g r19, int r20) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.m.m(j1.a, n4.g, int):int");
    }
}
