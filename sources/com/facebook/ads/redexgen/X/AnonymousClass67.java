package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.67, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass67 {
    public static byte[] A03;
    public static String[] A04 = {"fwnF9NqGlDDvd3tmLjHzlBLQ0vKEWHbi", "JyVh64c57ZQhNNoyVwIaBwBMCWCp47TX", "NiVjB9zhlvCIBmozr5iuMf4XPmRpTykj", "aMEAUKQnrJbxe7", "r8tEg4U8ig5A4Tipsx9WF382DZkzVk0N", "", "NXFd2c7X4J9ga52f6GNSRbndM6EeYerJ", "Iv2mUp4tdjLGTNz"};
    public static final AtomicBoolean A05;

    @Nullable
    public C1315Wi A00;

    @Nullable
    public String A01;

    @VisibleForTesting
    public final C1016Kp A02 = new C1016Kp(300000000000L, new C1322Wp(this));

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{114, 125, 114, Ascii.DEL, 124, 116, 42, 33, 48, 51, 43, 54, 47, 59, 48, 61, 52, 33, 75, 93, 75, 75, 81, 87, 86, 71, 76, 81, 85, 93};
    }

    static {
        A04();
        A05 = new AtomicBoolean(false);
    }

    public static C8D A00(C1315Wi c1315Wi) {
        if (ID.A0x(c1315Wi)) {
            return C8E.A01(A01(0, 6, 104), A01(18, 12, 67), A01(6, 12, 63));
        }
        C8D A00 = C8E.A00();
        String[] strArr = A04;
        if (strArr[2].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        A04[0] = "UkANKLN4N59lG96lj5R5seL3Uvk1PYyc";
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1315Wi c1315Wi;
        synchronized (this) {
            c1315Wi = this.A00;
        }
        if (c1315Wi == null) {
            return;
        }
        String A7X = C8G.A00().A01(c1315Wi, true).A7X(A00(c1315Wi));
        synchronized (this) {
            this.A01 = A7X;
        }
    }

    public static void A03() {
        A05.set(true);
    }

    public final synchronized String A06(C1315Wi c1315Wi) {
        this.A00 = c1315Wi;
        this.A00.A06().A9Q();
        if (this.A00.A05().AEe() || ((A05.get() && ID.A1M(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A05.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
