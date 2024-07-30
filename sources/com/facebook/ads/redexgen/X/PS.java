package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

@TargetApi(14)
/* loaded from: assets/audience_network.dex */
public final class PS {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final C0816Cn A00;
    public final C1251Tt A01 = new C1251Tt();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public PS(C1316Wj c1316Wj) {
        GB trackSelectionFactory = new U0(this.A01);
        this.A00 = C9A.A00(new W3(c1316Wj), new AZ(trackSelectionFactory), new W5());
    }

    @VisibleForTesting
    public static String A01(AnonymousClass98 anonymousClass98) {
        return A00(41, 11, 55) + anonymousClass98.A01 + A00(14, 22, 116) + anonymousClass98.A00 + A00(0, 14, 98) + anonymousClass98.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A5p();
    }

    public final long A06() {
        return this.A00.A6D();
    }

    public final long A07() {
        return this.A00.A6P();
    }

    @Nullable
    public final PQ A08() {
        Format vf = this.A00.A0L();
        if (vf == null) {
            return null;
        }
        return new PQ(vf.A0F, vf.A08);
    }

    public final void A09() {
        this.A00.ADf();
    }

    public final void A0A() {
        this.A00.AEG();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j10) {
        this.A00.AEF(j10);
    }

    public final void A0E(@Nullable Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C1315Wi c1315Wi, Uri uri) {
        if (ID.A28(c1315Wi, A03())) {
            PW cacheManager = PW.A05(c1315Wi);
            UJ uj = new UJ(cacheManager.A0F(c1315Wi));
            String A08 = PW.A08(c1315Wi, uri);
            if (A08 != null) {
                uj.A00(A08);
            }
            this.A00.A0P(uj.A01(uri));
            return;
        }
        EM mediaSource = new UJ(new C1249Tr(c1315Wi, C0940Hl.A0K(c1315Wi, A00(38, 3, 4)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(PP pp) {
        this.A00.A3E(new H5(this, pp));
    }

    public final void A0H(PR pr) {
        this.A00.A0Q(new HF(this, pr));
    }

    public final void A0I(boolean z10) {
        this.A00.AEW(z10);
    }

    public final boolean A0J() {
        return this.A00.A7B();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
