package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Em, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0865Em extends ZO {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, Ascii.FS, 72, 83, Ascii.FS, 83, 76, 89, 82, Ascii.FS, 80, 85, 82, 87, Ascii.FS, 73, 78, 80, 6, Ascii.FS, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0865Em.class.getSimpleName();
    }

    public C0865Em(C1316Wj c1316Wj, IT it, String str, Uri uri, Map<String, String> mExtraData, @Nullable C05290m c05290m, boolean z10) {
        super(c1316Wj, it, str, c05290m, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05230f
    @Nullable
    public final EnumC05220e A0A() {
        try {
            KL.A09(new KL(), ((AbstractC05230f) this).A00, KM.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC05230f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC05220e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZO
    public final void A0D() {
        EnumC05220e enumC05220e = null;
        if (((ZO) this).A02) {
            enumC05220e = A0A();
        }
        A0E(this.A01, enumC05220e);
    }
}
