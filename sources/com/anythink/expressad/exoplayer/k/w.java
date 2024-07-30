package com.anythink.expressad.exoplayer.k;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9133a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9134b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9135c = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    private w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:2:0x0002->B:12:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(int r5, int r6) {
        /*
            r0 = 1
            r1 = r0
        L2:
            r2 = 2
            if (r1 > r2) goto L21
            int r3 = r5 + r1
            int r3 = r3 % 3
            if (r3 == 0) goto L1a
            r4 = 0
            if (r3 == r0) goto L16
            if (r3 == r2) goto L11
            goto L1b
        L11:
            r2 = r6 & 2
            if (r2 == 0) goto L1b
            goto L1a
        L16:
            r2 = r6 & 1
            if (r2 == 0) goto L1b
        L1a:
            r4 = r0
        L1b:
            if (r4 == 0) goto L1e
            return r3
        L1e:
            int r1 = r1 + 1
            goto L2
        L21:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.w.a(int, int):int");
    }

    private static boolean b(int i10, int i11) {
        if (i10 == 0) {
            return true;
        }
        if (i10 != 1) {
            if (i10 == 2 && (i11 & 2) != 0) {
                return true;
            }
            return false;
        }
        if ((i11 & 1) != 0) {
            return true;
        }
        return false;
    }
}
