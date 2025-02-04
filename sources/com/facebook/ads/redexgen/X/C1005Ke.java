package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1005Ke {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 78, 65, 8, 91, Ascii.SI, 75, 74, 91, 74, 93, 66, 70, 65, 74, Ascii.SI, 70, 73, Ascii.SI, 78, 95, 95, Ascii.SI, 70, 92, Ascii.SI, 122, 65, 70, 91, 86, 1, Ascii.CAN, 34, 113, 4, 63, 56, 37, 40, 113, 48, 33, 33, 107, 113, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 103, 112, 116, 118, 97, 59, 71, 112, 116, 118, 97, 84, 118, 97, 124, 99, 124, 97, 108, 4, 8, 10, 73, Ascii.DC2, 9, Ascii.SO, 19, Ascii.RS, 84, 3, 73, Ascii.ETB, Ascii.VT, 6, Ascii.RS, 2, Ascii.NAK, 73, 50, 9, Ascii.SO, 19, Ascii.RS, 55, Ascii.VT, 6, Ascii.RS, 2, Ascii.NAK, 38, 4, 19, Ascii.SO, 17, Ascii.SO, 19, Ascii.RS};
    }

    static {
        A01();
        A01 = C1005Ke.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i10, int i11) {
        return i10 >= 640 && i11 >= 640;
    }

    public static boolean A05(C7G c7g) {
        boolean z10 = false;
        try {
            PackageManager packageManager = c7g.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c7g.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 62).equals(activityInfoArr[i10].name);
                    if (!activityDeclared) {
                        i10++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = c7g.A03().A8N();
            if (activityDeclared3) {
                String str = A00(32, 14, 8) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (c7g.A03().A8N()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
