package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1015Ko extends Thread implements Closeable {
    public boolean A00 = false;
    public final /* synthetic */ C1016Kp A01;

    public C1015Ko(C1016Kp c1016Kp) {
        this.A01 = c1016Kp;
        start();
    }

    public final synchronized void A00() {
        C1014Kn c1014Kn;
        c1014Kn = this.A01.A02;
        c1014Kn.A02();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C1014Kn c1014Kn;
        synchronized (this) {
            this.A00 = true;
            c1014Kn = this.A01.A02;
            c1014Kn.A02();
        }
        try {
            join();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r0 = r5.A01.A03;
        r0.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004d, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        monitor-enter(r5.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        r0 = r5.A01.A02;
        r0.A03();
        r5.A01.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        throw r2;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            boolean r0 = com.facebook.ads.redexgen.X.C0990Jm.A02(r5)
            if (r0 == 0) goto L7
            return
        L7:
            r3 = r5
        L8:
            r4 = 0
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            com.facebook.ads.redexgen.X.Kn r0 = com.facebook.ads.redexgen.X.C1016Kp.A00(r0)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            r0.A04()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            com.facebook.ads.redexgen.X.Kp r2 = r3.A01     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L55
            boolean r1 = r3.A00     // Catch: java.lang.Throwable -> L4f
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L4f
            com.facebook.ads.redexgen.X.Kn r0 = com.facebook.ads.redexgen.X.C1016Kp.A00(r0)     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r0.A05()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L27
            goto L35
        L27:
            if (r0 == 0) goto L8
            goto L2c
        L2a:
            r0 = move-exception
            goto L56
        L2c:
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L6f
            java.lang.Runnable r0 = com.facebook.ads.redexgen.X.C1016Kp.A02(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L6f
            r0.run()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L6f
        L35:
            com.facebook.ads.redexgen.X.Kp r1 = r3.A01     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L88
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L48
            com.facebook.ads.redexgen.X.Kn r0 = com.facebook.ads.redexgen.X.C1016Kp.A00(r0)     // Catch: java.lang.Throwable -> L48
            r0.A03()     // Catch: java.lang.Throwable -> L48
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L48
            com.facebook.ads.redexgen.X.C1016Kp.A01(r0, r4)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            goto L81
        L48:
            r0 = move-exception
        L49:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            goto L87
        L4b:
            r0 = move-exception
            goto L49
        L4d:
            r2 = move-exception
            goto L59
        L4f:
            r0 = move-exception
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r0 = move-exception
            goto L50
        L54:
            throw r0     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L6f
        L58:
            r2 = move-exception
        L59:
            com.facebook.ads.redexgen.X.Kp r1 = r3.A01     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L88
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L6c
            com.facebook.ads.redexgen.X.Kn r0 = com.facebook.ads.redexgen.X.C1016Kp.A00(r0)     // Catch: java.lang.Throwable -> L6c
            r0.A03()     // Catch: java.lang.Throwable -> L6c
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L6c
            com.facebook.ads.redexgen.X.C1016Kp.A01(r0, r4)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r2     // Catch: java.lang.Throwable -> L88
        L6c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L88
        L6f:
            com.facebook.ads.redexgen.X.Kp r1 = r3.A01     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L88
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L82
            com.facebook.ads.redexgen.X.Kn r0 = com.facebook.ads.redexgen.X.C1016Kp.A00(r0)     // Catch: java.lang.Throwable -> L82
            r0.A03()     // Catch: java.lang.Throwable -> L82
            com.facebook.ads.redexgen.X.Kp r0 = r3.A01     // Catch: java.lang.Throwable -> L82
            com.facebook.ads.redexgen.X.C1016Kp.A01(r0, r4)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
        L81:
            return
        L82:
            r0 = move-exception
        L83:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto L83
        L87:
            throw r0     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            com.facebook.ads.redexgen.X.C0990Jm.A00(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1015Ko.run():void");
    }
}
