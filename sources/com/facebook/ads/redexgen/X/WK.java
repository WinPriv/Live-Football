package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.anythink.expressad.d.a.b;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WK implements C7L {
    public static byte[] A01;
    public static String[] A02 = {"5s7Vvh0NyBhQSPw27iRWGG1DtqQsP1Sv", "FrTyZebbkrmGpsa0d1dFSR1fbKrcWzi5", "vbBgTS8gp4295EX74czAq4g", b.cZ, "WolquZ0AL0Qdfn", "cakCtq0fnE5al5DYRrCiV1B2lu7xESbR", "HXQXhYUpdji2Kg3a54R03lC9IEJsCvaM", "NPxj8bqKiKcB9Z0ZqCVSMRQGt9eaxHA1"};
    public final C7G A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 16);
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "3cPMFplOUK5Ssg4O5bRCUJRCJG4m75Bq";
            strArr2[6] = "bSCrfJrMY4RCrVdm5HRU5l61ngvuX2qf";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-81, -36, -46, -32, -35, -41, -46};
    }

    static {
        A01();
    }

    public WK(C7G c7g) {
        this.A00 = c7g;
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    @Nullable
    public final String A5s() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    public final String A6c() {
        return C0979Ja.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    @Nullable
    public final String A6d() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    @Nullable
    public final String A6x() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    @Nullable
    public final String A70() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    @Nullable
    public final C7K A7I() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new WL(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    @Nullable
    public final String A7j() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    public final String A7k() {
        return A00(0, 7, 94);
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    public final String A7l() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7L
    public final boolean A8N() {
        return BuildConfigApi.isDebug();
    }
}
