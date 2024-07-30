package q4;

import d6.g0;
import java.io.IOException;
import java.util.Arrays;
import p4.d;
import p4.e;
import p4.h;
import p4.i;
import p4.j;
import p4.u;
import p4.w;

/* compiled from: AmrExtractor.java */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f34636q;

    /* renamed from: t, reason: collision with root package name */
    public static final int f34639t;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34642c;

    /* renamed from: d, reason: collision with root package name */
    public long f34643d;

    /* renamed from: e, reason: collision with root package name */
    public int f34644e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34645g;

    /* renamed from: h, reason: collision with root package name */
    public long f34646h;

    /* renamed from: j, reason: collision with root package name */
    public int f34648j;

    /* renamed from: k, reason: collision with root package name */
    public long f34649k;

    /* renamed from: l, reason: collision with root package name */
    public j f34650l;

    /* renamed from: m, reason: collision with root package name */
    public w f34651m;

    /* renamed from: n, reason: collision with root package name */
    public u f34652n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f34635p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f34637r = g0.C("#!AMR\n");

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f34638s = g0.C("#!AMR-WB\n");

    /* renamed from: b, reason: collision with root package name */
    public final int f34641b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f34640a = new byte[1];

    /* renamed from: i, reason: collision with root package name */
    public int f34647i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f34636q = iArr;
        f34639t = iArr[8];
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r1 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(p4.e r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r6.f = r0
            byte[] r1 = r5.f34640a
            r2 = 1
            r6.c(r1, r0, r2, r0)
            r6 = r1[r0]
            r1 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r1 > 0) goto L6e
            int r6 = r6 >> 3
            r1 = 15
            r6 = r6 & r1
            if (r6 < 0) goto L3a
            if (r6 > r1) goto L3a
            boolean r1 = r5.f34642c
            if (r1 == 0) goto L27
            r4 = 10
            if (r6 < r4) goto L25
            r4 = 13
            if (r6 <= r4) goto L27
        L25:
            r4 = r2
            goto L28
        L27:
            r4 = r0
        L28:
            if (r4 != 0) goto L39
            if (r1 != 0) goto L36
            r1 = 12
            if (r6 < r1) goto L34
            r1 = 14
            if (r6 <= r1) goto L36
        L34:
            r1 = r2
            goto L37
        L36:
            r1 = r0
        L37:
            if (r1 == 0) goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 != 0) goto L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal AMR "
            r0.<init>(r1)
            boolean r1 = r5.f34642c
            if (r1 == 0) goto L4a
            java.lang.String r1 = "WB"
            goto L4c
        L4a:
            java.lang.String r1 = "NB"
        L4c:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            k4.z0 r6 = k4.z0.a(r6, r3)
            throw r6
        L60:
            boolean r0 = r5.f34642c
            if (r0 == 0) goto L69
            int[] r0 = q4.a.f34636q
            r6 = r0[r6]
            goto L6d
        L69:
            int[] r0 = q4.a.f34635p
            r6 = r0[r6]
        L6d:
            return r6
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            k4.z0 r6 = k4.z0.a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.a.a(p4.e):int");
    }

    public final boolean b(e eVar) throws IOException {
        eVar.f = 0;
        byte[] bArr = f34637r;
        byte[] bArr2 = new byte[bArr.length];
        eVar.c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f34642c = false;
            eVar.i(bArr.length);
            return true;
        }
        eVar.f = 0;
        byte[] bArr3 = f34638s;
        byte[] bArr4 = new byte[bArr3.length];
        eVar.c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f34642c = true;
        eVar.i(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r18, p4.t r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.a.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        return b((e) iVar);
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f34650l = jVar;
        this.f34651m = jVar.s(0, 1);
        jVar.m();
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.f34643d = 0L;
        this.f34644e = 0;
        this.f = 0;
        if (j10 != 0) {
            u uVar = this.f34652n;
            if (uVar instanceof d) {
                this.f34649k = ((Math.max(0L, j10 - ((d) uVar).f34306b) * 8) * 1000000) / r0.f34309e;
                return;
            }
        }
        this.f34649k = 0L;
    }

    @Override // p4.h
    public final void release() {
    }
}
