package com.ironsource.sdk.h;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.sdk.k.f;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, f> f26518a;

    public a(Looper looper) {
        super(looper);
        this.f26518a = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:2:0x0000, B:6:0x0013, B:13:0x0023, B:14:0x0033, B:17:0x0027), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:2:0x0000, B:6:0x0013, B:13:0x0023, B:14:0x0033, B:17:0x0027), top: B:1:0x0000 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.obj     // Catch: java.lang.Throwable -> L39
            com.ironsource.sdk.h.c r0 = (com.ironsource.sdk.h.c) r0     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.sdk.k.f> r2 = r5.f26518a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L39
            com.ironsource.sdk.k.f r2 = (com.ironsource.sdk.k.f) r2     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L13
            return
        L13:
            int r6 = r6.what     // Catch: java.lang.Throwable -> L39
            r3 = 1016(0x3f8, float:1.424E-42)
            if (r6 == r3) goto L20
            r3 = 1015(0x3f7, float:1.422E-42)
            if (r6 != r3) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 == 0) goto L27
            r2.a(r0)     // Catch: java.lang.Throwable -> L39
            goto L33
        L27:
            com.ironsource.sdk.g.e r3 = new com.ironsource.sdk.g.e     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = com.ironsource.environment.a.AnonymousClass1.a(r6)     // Catch: java.lang.Throwable -> L39
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L39
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L39
        L33:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.sdk.k.f> r6 = r5.f26518a     // Catch: java.lang.Throwable -> L39
            r6.remove(r1)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r6 = move-exception
            r6.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.h.a.handleMessage(android.os.Message):void");
    }
}
