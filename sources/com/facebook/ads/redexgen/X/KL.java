package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.anythink.expressad.foundation.g.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class KL {
    public static byte[] A00;
    public static String[] A01 = {"HfGv3264Bq2TQ34NqRtE4P30TXR", "AZVpgJ8fi5FDz5AiC", "FCmmf0GU", "NGZF99o8OEHjBvmOxlLxN", "MEp80XUn5zKurDhCJ73", "hVp2plT6ulDLwck", "CErebgOhZelO8plRL7vU3", "v0a34uu5Y8rm3tpqkSr554RtUBdvL4ru"};

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-47, -17, -4, -75, 2, -82, 1, 2, -17, 0, 2, -82, -49, 3, -14, -9, -13, -4, -15, -13, -36, -13, 2, 5, -3, 0, -7, -49, -15, 2, -9, 4, -9, 2, 7, -68, -82, -37, -17, -7, -13, -82, 1, 3, 0, -13, -82, 2, -10, -17, 2, -82, -9, 2, -75, 1, -82, -9, -4, -82, 7, -3, 3, 0, -82, -49, -4, -14, 0, -3, -9, -14, -37, -17, -4, -9, -12, -13, 1, 2, -68, 6, -5, -6, -82, -12, -9, -6, -13, -68, -15, -19, -20, 32, Ascii.SI, Ascii.DC4, Ascii.DLE, Ascii.EM, Ascii.SO, Ascii.DLE, -7, Ascii.DLE, Ascii.US, 34, Ascii.SUB, Ascii.GS, Ascii.SYN, -26, -13, -28, -26, -24, -7, -18, -5, -18, -7, -2, Ascii.CAN, 37, Ascii.ESC, 41, 38, 32, Ascii.ESC, -27, 32, 37, 43, Ascii.FS, 37, 43, -27, Ascii.CAN, Ascii.SUB, 43, 32, 38, 37, -27, Ascii.CR, 0, -4, Ascii.SO, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -58, -60, -41, -56, -54, -46, -43, -36, -111, -91, -75, -78, -70, -74, -92, -91, -81, -88, -32, -16, -19, -11, -15, -29, -16, -45, -48, -54, -23, -25, -14, -14, -21, -8, -49, -22, -82, -73, -76, -80, -71, -65, -97, -70, -74, -80, -71, -56, -44, -46, -109, -58, -45, -55, -41, -44, -50, -55, -109, -57, -41, -44, -36, -40, -54, -41, -109, -58, -43, -43, -47, -50, -56, -58, -39, -50, -44, -45, -60, -50, -55, -47, -35, -37, -100, -49, -36, -46, -32, -35, -41, -46, -100, -28, -45, -36, -46, -41, -36, -43, -30, -18, -20, -83, -27, -32, -30, -28, -31, -18, -18, -22, -83, -22, -32, -13, -32, -19, -32, -89, -74, -87, -91, -72, -87, -93, -78, -87, -69, -93, -72, -91, -90, -13, -17, -70, -77, -64, -74, -66, -73, -60, -90, -69, -65, -73, -73, -61, -61, -65, -34, -22, -22, -26, -80, -91, -91, -26, -30, -41, -17, -92, -35, -27, -27, -35, -30, -37, -92, -39, -27, -29, -91, -23, -22, -27, -24, -37, -91, -41, -26, -26, -23, -91, -67, -55, -55, -59, -56, -67, -79, -62, -69, -75, -60, -54, -47, -64, -51, -57, -68, -44, 37, 33, Ascii.SYN, 46, -29, Ascii.FS, 36, 36, Ascii.FS, 33, Ascii.SUB, -29, Ascii.CAN, 36, 34, Ascii.FF, -1, -5, Ascii.CR, -22, Ascii.SI, 6, -5};
    }

    static {
        A04();
    }

    public static Intent A00(Uri uri) {
        Intent intent = new Intent(A03(118, 26, 123), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    @VisibleForTesting
    public static Intent A01(C1316Wj c1316Wj, Uri uri) {
        Intent A002 = A00(uri);
        A002.addCategory(A03(144, 33, 39));
        A002.addFlags(268435456);
        A002.putExtra(A03(206, 34, 41), c1316Wj.getPackageName());
        A002.putExtra(A03(a.aS, 14, 8), false);
        if (ID.A1O(c1316Wj)) {
            if (A03(292, 2, 81).equals(uri.getScheme())) {
                A002.setPackage(A03(259, 19, 67));
            }
        }
        return A002;
    }

    public static Intent A02(C1316Wj c1316Wj, Uri uri) {
        Intent A002 = A00(uri);
        A002.setPackage(A03(240, 19, 50));
        A002.putExtra(A03(187, 8, 74), c1316Wj.getPackageName());
        A002.putExtra(A03(354, 7, 31), true);
        return A002;
    }

    private void A05(C1316Wj c1316Wj, Uri uri) throws K7 {
        K9.A0B(c1316Wj, A01(c1316Wj, uri));
    }

    private final void A06(C1316Wj c1316Wj, Uri uri) throws KJ, K7 {
        if (A0C(c1316Wj)) {
            if (ID.A1h(c1316Wj)) {
                Intent intent = A02(c1316Wj, uri);
                if (K9.A0C(c1316Wj, intent)) {
                    return;
                }
            }
            Intent A012 = A01(c1316Wj, uri);
            A012.setPackage(A03(240, 19, 50));
            K9.A0B(c1316Wj, A012);
            return;
        }
        throw new KJ();
    }

    private void A07(C1316Wj c1316Wj, Uri uri, String str) {
        AdActivityIntent A04 = K9.A04(c1316Wj);
        A04.addFlags(268435456);
        A04.putExtra(A03(376, 8, 90), EnumC0981Jc.A02);
        A04.putExtra(A03(177, 10, 66), uri.toString());
        A04.putExtra(A03(195, 11, 15), str);
        A04.putExtra(A03(294, 11, 22), System.currentTimeMillis());
        try {
            K9.A09(c1316Wj, A04);
        } catch (K7 e10) {
            Throwable cause = e10.getCause();
            Throwable th = e10;
            if (cause != null) {
                th = e10.getCause();
            }
            c1316Wj.A06().A8u(A03(107, 11, 73), C06977l.A0D, new C06987m(th));
            Log.e(A03(90, 17, 111), A03(0, 90, 82), th);
        }
    }

    private final void A08(C1316Wj c1316Wj, Uri uri, String str) throws K7 {
        boolean A05 = IE.A05(c1316Wj);
        boolean isInAppBrowserEnabled = A0B(uri);
        if (isInAppBrowserEnabled && A05) {
            A07(c1316Wj, uri, str);
        } else {
            c1316Wj.A0D().A87(A05);
            A05(c1316Wj, uri);
        }
    }

    public static void A09(KL kl, C1316Wj c1316Wj, Uri uri, String str) {
        kl.A0D(c1316Wj, uri, str);
    }

    public static void A0A(KL kl, C1316Wj c1316Wj, Uri uri, String str) throws K7 {
        boolean z10;
        boolean isGooglePlayWebLink;
        try {
            if (A0B(uri)) {
                if (A03(361, 15, 121).equals(uri.getHost())) {
                    z10 = true;
                    isGooglePlayWebLink = A03(348, 6, 20).equals(uri.getScheme());
                    if (!isGooglePlayWebLink || z10) {
                        kl.A06(c1316Wj, uri);
                        return;
                    } else {
                        kl.A08(c1316Wj, uri, str);
                        return;
                    }
                }
            }
            kl.A06(c1316Wj, uri);
            return;
        } catch (KJ unused) {
            kl.A08(c1316Wj, uri, str);
            return;
        }
        z10 = false;
        isGooglePlayWebLink = A03(348, 6, 20).equals(uri.getScheme());
        if (!isGooglePlayWebLink) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0B(android.net.Uri r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 24
            if (r1 < r0) goto L38
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r3 = r0.isCleartextTrafficPermitted()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.KL.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L61
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.KL.A01
            java.lang.String r1 = "9DaYNTGnU6m41BFJKxw5hEDOoLHVmNBK"
            r0 = 7
            r2[r0] = r1
            if (r3 != 0) goto L38
            android.security.NetworkSecurityPolicy r1 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r0 = r5.getHost()
            boolean r0 = r1.isCleartextTrafficPermitted(r0)
            if (r0 == 0) goto L5f
        L38:
            r0 = 1
        L39:
            java.lang.String r3 = r5.getScheme()
            if (r0 == 0) goto L4e
            r2 = 305(0x131, float:4.27E-43)
            r1 = 4
            r0 = 19
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L5d
        L4e:
            r2 = 343(0x157, float:4.8E-43)
            r1 = 5
            r0 = 25
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L5e
        L5d:
            r4 = 1
        L5e:
            return r4
        L5f:
            r0 = 0
            goto L39
        L61:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.KL.A0B(android.net.Uri):boolean");
    }

    private boolean A0C(C1316Wj c1316Wj) {
        Intent playStoreIntent = new Intent(A03(118, 26, 123), KM.A00(A03(309, 34, 58)));
        Iterator<ResolveInfo> it = c1316Wj.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.applicationInfo.packageName.equals(A03(240, 19, 50))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0D(C1316Wj c1316Wj, Uri uri, String str) {
        return K9.A0E(c1316Wj, uri, str);
    }

    public static boolean A0E(KL kl, C1316Wj c1316Wj, Uri uri, String str) {
        try {
            A0A(kl, c1316Wj, uri, str);
            return true;
        } catch (K7 e10) {
            Throwable cause = e10.getCause();
            Throwable th = e10;
            if (cause != null) {
                th = e10.getCause();
            }
            c1316Wj.A06().A8u(A03(107, 11, 73), C06977l.A05, new C06987m(th));
            return false;
        }
    }
}
