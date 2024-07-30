package b6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements i7.h {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f3020s;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0038, code lost:
    
        if (r2.equals("audio/ac4") == false) goto L16;
     */
    @Override // i7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            b6.e r0 = r8.f3020s
            k4.i0 r9 = (k4.i0) r9
            java.lang.Object r1 = r0.f3023c
            monitor-enter(r1)
            b6.e$c r2 = r0.f     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r2.E0     // Catch: java.lang.Throwable -> L8e
            r3 = 1
            if (r2 == 0) goto L8c
            boolean r2 = r0.f3025e     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L8c
            int r2 = r9.Q     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r2 <= r4) goto L8c
            java.lang.String r2 = r9.D     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            if (r2 != 0) goto L1d
            goto L53
        L1d:
            int r6 = r2.hashCode()
            r7 = -1
            switch(r6) {
                case -2123537834: goto L46;
                case 187078296: goto L3b;
                case 187078297: goto L32;
                case 1504578661: goto L27;
                default: goto L25;
            }
        L25:
            r4 = r7
            goto L50
        L27:
            java.lang.String r4 = "audio/eac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L30
            goto L25
        L30:
            r4 = 3
            goto L50
        L32:
            java.lang.String r6 = "audio/ac4"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L50
            goto L25
        L3b:
            java.lang.String r4 = "audio/ac3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L44
            goto L25
        L44:
            r4 = r3
            goto L50
        L46:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4f
            goto L25
        L4f:
            r4 = r5
        L50:
            switch(r4) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L53;
            }
        L53:
            r2 = r5
            goto L56
        L55:
            r2 = r3
        L56:
            r4 = 32
            if (r2 == 0) goto L66
            int r2 = d6.g0.f27302a     // Catch: java.lang.Throwable -> L8e
            if (r2 < r4) goto L8c
            b6.e$e r2 = r0.f3026g     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L8c
            boolean r2 = r2.f3046b     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L8c
        L66:
            int r2 = d6.g0.f27302a     // Catch: java.lang.Throwable -> L8e
            if (r2 < r4) goto L8b
            b6.e$e r2 = r0.f3026g     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L8b
            boolean r4 = r2.f3046b     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8b
            boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L8b
            b6.e$e r2 = r0.f3026g     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L8b
            b6.e$e r2 = r0.f3026g     // Catch: java.lang.Throwable -> L8e
            m4.d r0 = r0.f3027h     // Catch: java.lang.Throwable -> L8e
            boolean r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L8b
            goto L8c
        L8b:
            r3 = r5
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8e
            return r3
        L8e:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8e
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.d.apply(java.lang.Object):boolean");
    }
}
