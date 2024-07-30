package j5;

/* compiled from: BundledExtractorsAdapter.java */
/* loaded from: classes2.dex */
public final class c implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final p4.l f29681a;

    /* renamed from: b, reason: collision with root package name */
    public p4.h f29682b;

    /* renamed from: c, reason: collision with root package name */
    public p4.e f29683c;

    public c(p4.l lVar) {
        this.f29681a = lVar;
    }

    public final long a() {
        p4.e eVar = this.f29683c;
        if (eVar != null) {
            return eVar.f34314d;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r6.f34314d != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0058, code lost:
    
        if (r6.f34314d != r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(c6.j r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, p4.j r15) throws java.io.IOException {
        /*
            r7 = this;
            p4.e r6 = new p4.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f29683c = r6
            p4.h r8 = r7.f29682b
            if (r8 == 0) goto L10
            return
        L10:
            p4.l r8 = r7.f29681a
            p4.h[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 1
            r14 = 0
            if (r10 != r13) goto L21
            r8 = r8[r14]
            r7.f29682b = r8
            goto Lae
        L21:
            int r10 = r8.length
            r0 = r14
        L23:
            if (r0 >= r10) goto L66
            r1 = r8[r0]
            boolean r2 = r1.d(r6)     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            if (r2 == 0) goto L32
            r7.f29682b = r1     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            r6.f = r14
            goto L66
        L32:
            p4.h r1 = r7.f29682b
            if (r1 != 0) goto L5d
            long r1 = r6.f34314d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L5b
            goto L5d
        L3d:
            r8 = move-exception
            p4.h r9 = r7.f29682b
            if (r9 != 0) goto L4a
            long r9 = r6.f34314d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L49
            goto L4a
        L49:
            r13 = r14
        L4a:
            d6.a.d(r13)
            r6.f = r14
            throw r8
        L50:
            p4.h r1 = r7.f29682b
            if (r1 != 0) goto L5d
            long r1 = r6.f34314d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L5b
            goto L5d
        L5b:
            r1 = r14
            goto L5e
        L5d:
            r1 = r13
        L5e:
            d6.a.d(r1)
            r6.f = r14
            int r0 = r0 + 1
            goto L23
        L66:
            p4.h r10 = r7.f29682b
            if (r10 != 0) goto Lae
            j5.o0 r10 = new j5.o0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            int r12 = d6.g0.f27302a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L7a:
            int r13 = r8.length
            if (r14 >= r13) goto L97
            r13 = r8[r14]
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            int r13 = r8.length
            int r13 = r13 + (-1)
            if (r14 >= r13) goto L94
            java.lang.String r13 = ", "
            r12.append(r13)
        L94:
            int r14 = r14 + 1
            goto L7a
        L97:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lae:
            p4.h r8 = r7.f29682b
            r8.f(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.c.b(c6.j, android.net.Uri, java.util.Map, long, long, p4.j):void");
    }
}
