package com.vungle.warren.utility;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public class UtilityResource {
    public long getElapsedMillis() {
        return SystemClock.elapsedRealtime();
    }

    public long getSystemTimeMillis() {
        return System.currentTimeMillis();
    }
}
