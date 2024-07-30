package k4;

import j5.u;

/* compiled from: ExoPlaybackException.java */
/* loaded from: classes2.dex */
public final class m extends b1 {
    public final boolean A;

    /* renamed from: u, reason: collision with root package name */
    public final int f30565u;

    /* renamed from: v, reason: collision with root package name */
    public final String f30566v;

    /* renamed from: w, reason: collision with root package name */
    public final int f30567w;

    /* renamed from: x, reason: collision with root package name */
    public final i0 f30568x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final j5.t f30569z;

    static {
        d6.g0.F(1001);
        d6.g0.F(1002);
        d6.g0.F(1003);
        d6.g0.F(1004);
        d6.g0.F(1005);
        d6.g0.F(1006);
    }

    public m() {
        throw null;
    }

    public m(int i10, Throwable th, int i11) {
        this(i10, th, i11, null, -1, null, 4, false);
    }

    public final m a(u.b bVar) {
        return new m(getMessage(), getCause(), this.f30369s, this.f30565u, this.f30566v, this.f30567w, this.f30568x, this.y, bVar, this.f30370t, this.A);
    }

    public m(String str, Throwable th, int i10, int i11, String str2, int i12, i0 i0Var, int i13, u.b bVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        d6.a.a(!z10 || i11 == 1);
        d6.a.a(th != null || i11 == 3);
        this.f30565u = i11;
        this.f30566v = str2;
        this.f30567w = i12;
        this.f30568x = i0Var;
        this.y = i13;
        this.f30569z = bVar;
        this.A = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, k4.i0 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            goto L10
        Le:
            java.lang.String r0 = "Remote error"
        L10:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = d6.g0.f27302a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = com.ironsource.adapters.facebook.a.h(r0, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.m.<init>(int, java.lang.Throwable, int, java.lang.String, int, k4.i0, int, boolean):void");
    }
}
