package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends Exception {
    public final int A00;
    public final int A01;

    public AnonymousClass98(int i10, String str, Throwable th, int i11) {
        super(str, th);
        this.A01 = i10;
        this.A00 = i11;
    }

    public static AnonymousClass98 A00(IOException iOException) {
        return new AnonymousClass98(0, null, iOException, -1);
    }

    public static AnonymousClass98 A01(Exception exc, int i10) {
        return new AnonymousClass98(1, null, exc, i10);
    }

    public static AnonymousClass98 A02(RuntimeException runtimeException) {
        return new AnonymousClass98(2, null, runtimeException, -1);
    }
}
