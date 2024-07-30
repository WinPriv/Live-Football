package com.applovin.exoplayer2;

/* loaded from: classes.dex */
public final class u extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f16674a;

    public u(int i10) {
        super(a(i10));
        this.f16674a = i10;
    }

    private static String a(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "Undefined timeout.";
                }
                return "Detaching surface timed out.";
            }
            return "Setting foreground mode timed out.";
        }
        return "Player release timed out.";
    }
}
