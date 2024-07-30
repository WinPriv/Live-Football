package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07077v {
    public static byte[] A01;
    public static String[] A02 = {"4UXivJ9bWzVmUKEORuimcsc25E9yHKjM", "eA36e27H2SQKTgfHA43cU1z3ajsDp04A", "C0QLMKXu1JepGMQqxbYq5t6gzwkqhJGP", "Vxu4w1TEkVm1YGegZeLuyUzWRGhVVehU", "9DWEeZJi13noDyT5Fh2XUwX4KzxcmXKd", "eTzqs10iSeQQ2KrnCOv26Mt4rNMbsJLV", "s8UczS0FAxqS0Axd9J", "JShALZiYLlnObKc6igiSgdntorMevFdl"};
    public static final String A03;
    public final C7G A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-17, -4, -14, 0, -3, -9, -14, -68, -2, -13, 0, -5, -9, 1, 1, -9, -3, -4, -68, -48, -41, -36, -46, -19, -49, -47, -47, -45, -31, -31, -41, -48, -41, -38, -41, -30, -25, -19, -31, -45, -32, -28, -41, -47, -45, -47, -49, -40, -49, -36, -45, -51, -13, -21, -14, -15, -24};
    }

    static {
        A02();
        A03 = Build.VERSION.RELEASE;
    }

    public C07077v(C7G c7g) {
        this.A00 = c7g;
    }

    private String A00() {
        int i10;
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 67108864;
        } else {
            i10 = 0;
        }
        PendingIntent activity = PendingIntent.getActivity(this.A00, 0, new Intent(), i10);
        if (activity == null) {
            return A01(0, 0, 80);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return activity.getCreatorPackage();
        }
        return activity.getTargetPackage();
    }

    public final int A03() {
        return KU.A01(this.A00);
    }

    @SuppressLint({"CatchGeneralException"})
    public final int A04() {
        try {
            return this.A00.getPackageManager().getPackageInfo(A00(), 0).versionCode;
        } catch (Throwable t10) {
            this.A00.A06().A8u(A01(45, 7, 22), C06977l.A1M, new C06987m(t10));
            return 0;
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final String A05() {
        try {
            CharSequence appLabel = this.A00.getPackageManager().getApplicationLabel(this.A00.getPackageManager().getApplicationInfo(A00(), 0));
            if (appLabel != null && appLabel.length() > 0) {
                return appLabel.toString();
            }
        } catch (Throwable th) {
            this.A00.A06().A8u(A01(45, 7, 22), C06977l.A1M, new C06987m(th));
        }
        if (A02[6].length() != 18) {
            throw new RuntimeException();
        }
        A02[6] = "1fZ6UIp0jk3A9Vyxip";
        return A01(0, 0, 80);
    }

    @SuppressLint({"CatchGeneralException"})
    public final String A06() {
        String str = null;
        try {
            str = this.A00.getPackageManager().getPackageInfo(A00(), 0).versionName;
        } catch (Throwable t10) {
            InterfaceC06967k A06 = this.A00.A06();
            int i10 = C06977l.A1M;
            C06987m c06987m = new C06987m(t10);
            String appVersionName = A01(45, 7, 22);
            A06.A9D(appVersionName, i10, c06987m);
        }
        return !TextUtils.isEmpty(str) ? str : A01(0, 0, 80);
    }

    public final String A07() {
        String bundleOverride = this.A00.A03().A5s();
        if (bundleOverride != null) {
            return bundleOverride;
        }
        return A00();
    }

    public final String A08() {
        String operatorName;
        TelephonyManager telephonyManager = (TelephonyManager) this.A00.getSystemService(A01(52, 5, 47));
        if (telephonyManager != null && (operatorName = telephonyManager.getNetworkOperatorName()) != null && operatorName.length() > 0) {
            return operatorName;
        }
        String[] strArr = A02;
        if (strArr[5].charAt(29) != strArr[2].charAt(29)) {
            throw new RuntimeException();
        }
        A02[0] = "4uAFXpJjJNyMuVCL4IR188dhDRybrTml";
        return A01(0, 0, 80);
    }

    public final String A09() {
        if (Build.MANUFACTURER != null) {
            int length = Build.MANUFACTURER.length();
            String[] strArr = A02;
            if (strArr[5].charAt(29) != strArr[2].charAt(29)) {
                throw new RuntimeException();
            }
            A02[0] = "4KWcrXNI2CiMu5mhxtQIP5VVZPBJmlLQ";
            if (length > 0) {
                return Build.MANUFACTURER;
            }
        }
        return A01(0, 0, 80);
    }

    public final String A0A() {
        return (Build.MODEL == null || Build.MODEL.length() <= 0) ? A01(0, 0, 80) : Build.MODEL;
    }

    @SuppressLint({"CatchGeneralException"})
    public final String A0B() {
        String installer_name;
        try {
            String A00 = A00();
            if (A00 != null && A00.length() >= 0 && (installer_name = this.A00.getPackageManager().getInstallerPackageName(A00)) != null) {
                if (installer_name.length() > 0) {
                    return installer_name;
                }
            }
        } catch (Throwable th) {
            this.A00.A06().A9D(A01(45, 7, 22), C06977l.A1M, new C06987m(th));
        }
        return A01(0, 0, 80);
    }

    public final boolean A0C() {
        return this.A00.checkCallingOrSelfPermission(A01(0, 45, 58)) == 0;
    }
}
