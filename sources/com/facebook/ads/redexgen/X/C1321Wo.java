package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1321Wo extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public final /* synthetic */ C1320Wn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, Ascii.SYN, 80, 87, 95, 90, Ascii.CAN, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1321Wo(C1320Wn c1320Wn, AtomicBoolean atomicBoolean) {
        this.A00 = c1320Wn;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C7G c7g;
        long j10;
        C7G c7g2;
        long j11;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC0953Ia.A0H);
                c7g2 = this.A00.A02.A04;
                AnonymousClass69 anonymousClass69 = this.A00.A01;
                int i10 = C6J.A00;
                j11 = this.A00.A02.A00;
                C6J.A02(c7g2, anonymousClass69, i10, A00(11, 14, 17), j11);
                this.A00.A02.A0T();
                this.A00.A00.AAI();
                return;
            }
            this.A00.A02.A0I(EnumC0953Ia.A0G);
            c7g = this.A00.A02.A04;
            AnonymousClass69 anonymousClass692 = this.A00.A01;
            int i11 = C6J.A04;
            j10 = this.A00.A02.A00;
            C6J.A02(c7g, anonymousClass692, i11, A00(0, 11, 41), j10);
            this.A00.A02.A0U();
            this.A00.A00.AAB();
        }
    }
}
