package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* loaded from: assets/audience_network.dex */
public final class KU {
    public static int A00;
    public static byte[] A01;
    public static volatile KT A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 48, Ascii.FS, 19, Ascii.DC4, Ascii.ESC, Ascii.CAN, Ascii.SO, 9, 83, 5, Ascii.DLE, 17, 119, 115, 116, 73, 126, 113, 76, Ascii.DEL, 104, 105, 115, 117, 116, 2, 4, Ascii.DC2, 4, 90, 4, 19, Ascii.FS};
    }

    static {
        A07();
        A00 = -1;
        A02 = KT.A04;
    }

    public static int A01(Context context) {
        if (A02 == KT.A04) {
            A08(context);
        }
        return A00;
    }

    @SuppressLint({"CatchGeneralException"})
    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 71));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0027 */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A05(org.xmlpull.v1.XmlPullParser r5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
        L0:
            int r1 = r5.next()
            r0 = 1
            if (r1 == r0) goto L49
            int r1 = r5.getEventType()
            r0 = 2
            if (r1 != r0) goto L0
            java.lang.String r3 = r5.getName()
            r2 = 32
            r1 = 8
            r0 = 77
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L0
            r4 = 0
        L23:
            int r0 = r5.getAttributeCount()
            if (r4 >= r0) goto L0
            java.lang.String r3 = r5.getAttributeName(r4)
            r2 = 19
            r1 = 13
            r0 = 32
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L46
            java.lang.String r0 = r5.getAttributeValue(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
        L46:
            int r4 = r4 + 1
            goto L23
        L49:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.KU.A05(org.xmlpull.v1.XmlPullParser):int");
    }

    public static void A08(Context context) {
        if (A0A()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A02 != KT.A04) {
            return;
        }
        A02 = KT.A03;
        Executors.newSingleThreadExecutor().execute(new C1211Se(context));
    }

    public static boolean A0A() {
        return A02 == KT.A02;
    }
}
