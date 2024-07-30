package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0775Am extends AbstractC1292Vl<C0774Al, AbstractC0772Aj, FL> implements UD {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{63, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract FK A0b(byte[] bArr, int i10, boolean z10) throws FL;

    public AbstractC0775Am(String str) {
        super(new C0774Al[2], new AbstractC0772Aj[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1292Vl
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final FL A0W(C0774Al c0774Al, AbstractC0772Aj abstractC0772Aj, boolean z10) {
        try {
            ByteBuffer inputData = c0774Al.A01;
            abstractC0772Aj.A09(((C1294Vn) c0774Al).A00, A0b(inputData.array(), inputData.limit(), z10), c0774Al.A00);
            abstractC0772Aj.A01(Integer.MIN_VALUE);
            return null;
        } catch (FL e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1292Vl
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final FL A0X(Throwable th) {
        return new FL(A0I(0, 23, 109), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1292Vl
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0774Al A0T() {
        return new C0774Al();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1292Vl
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final AbstractC0772Aj A0V() {
        return new AbstractC0772Aj(this) { // from class: com.facebook.ads.redexgen.X.34
            public final AbstractC0775Am A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0772Aj
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1292Vl
    /* renamed from: A0c, reason: merged with bridge method [inline-methods] */
    public final void A0a(AbstractC0772Aj abstractC0772Aj) {
        super.A0a(abstractC0772Aj);
    }

    @Override // com.facebook.ads.redexgen.X.UD
    public final void AEY(long j10) {
    }
}
