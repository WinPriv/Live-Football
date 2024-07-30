package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public final class J3 {
    public final AdErrorType A00;
    public final String A01;

    public J3(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public J3(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static J3 A00(AdErrorType adErrorType) {
        return new J3(adErrorType, (String) null);
    }

    public static J3 A01(AdErrorType adErrorType, @Nullable String str) {
        return new J3(adErrorType, str);
    }

    public static J3 A02(J4 j42) {
        return new J3(j42.A00(), j42.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
