package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;

/* loaded from: classes.dex */
final class j {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void a(boolean z10) {
        Preconditions.checkState(z10, "no calls to next() since the last call to remove()");
    }
}
