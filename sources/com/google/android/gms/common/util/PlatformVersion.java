package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import j0.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastM() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastO() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isAtLeastP() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isAtLeastQ() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isAtLeastR() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isAtLeastS() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isAtLeastSv2() {
        if (Build.VERSION.SDK_INT >= 32) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isAtLeastT() {
        if (Build.VERSION.SDK_INT < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
            return false;
        }
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastU() {
        if (!isAtLeastT() || Build.VERSION.SDK_INT < 33 || !a.a("UpsideDownCake", Build.VERSION.CODENAME)) {
            return false;
        }
        return true;
    }
}
