package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06615r {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -38, -20, -37, -24, -22, -33, -23, -33, -28, -35, -65, -38, -32, -13, -13, -15, -24, -31, -12, -13, -24, -18, -19, -56, -29, 1, -1, 1, 6, 3, -14, -15, -16, -4, -6, -69, -13, -18, -16, -14, -17, -4, -4, -8, -69, -18, -15, 0, -69, -10, -15, -13, -18, -39, -42, -38, -42, -31, -82, -47, -63, -33, -50, -48, -40, -42, -37, -44};
    }

    public C06615r(C7G c7g) {
        this.A00 = c7g.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 63), c7g), 0);
    }

    public final C06605q A02() {
        SharedPreferences sharedPreferences = this.A00;
        String A00 = A00(0, 13, 40);
        if (sharedPreferences.contains(A00)) {
            String string = this.A00.getString(A00, A00(0, 0, 80));
            SharedPreferences sharedPreferences2 = this.A00;
            String advertiserId = A00(54, 15, 31);
            boolean z10 = sharedPreferences2.getBoolean(advertiserId, false);
            SharedPreferences sharedPreferences3 = this.A00;
            String advertiserId2 = A00(26, 7, 80);
            long cacheTS = sharedPreferences3.getLong(advertiserId2, -1L);
            return new C06605q(string, z10, EnumC06595p.A09, cacheTS);
        }
        return C06605q.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 49), A00(0, 0, 80));
    }

    public final void A04(C06605q c06605q) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(0, 13, 40), c06605q.A03());
        edit.putBoolean(A00(54, 15, 31), c06605q.A04());
        edit.putLong(A00(26, 7, 80), c06605q.A01());
        edit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(13, 13, 49), str);
        edit.apply();
    }
}
