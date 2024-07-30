package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import com.anythink.expressad.exoplayer.k.p;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0881Fe {
    public static String[] A09 = {"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final HV A07 = new HV();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(HV hv, int i10) {
        int totalLength;
        if (i10 < 4) {
            return;
        }
        hv.A0Z(3);
        int i11 = i10 - 4;
        if ((hv.A0E() & 128) != 0) {
            if (i11 < 7 || (totalLength = hv.A0G()) < 4) {
                return;
            }
            this.A01 = hv.A0I();
            this.A00 = hv.A0I();
            this.A07.A0W(totalLength - 4);
            i11 -= 7;
        }
        int limit = this.A07.A06();
        int position = this.A07.A07();
        if (limit < position && i11 > 0) {
            int min = Math.min(i11, position - limit);
            hv.A0c(this.A07.A00, limit, min);
            this.A07.A0Y(limit + min);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(HV hv, int i10) {
        if (i10 < 19) {
            return;
        }
        this.A05 = hv.A0I();
        this.A04 = hv.A0I();
        hv.A0Z(11);
        this.A02 = hv.A0I();
        this.A03 = hv.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(HV hv, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        hv.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i11 = i10 / 5;
        for (int i12 = 0; i12 < i11; i12++) {
            int entryCount = hv.A0E();
            int a10 = hv.A0E();
            int A0E = hv.A0E();
            int A0E2 = hv.A0E();
            int entryCount2 = A0E - 128;
            int cb2 = (int) (a10 + (entryCount2 * 1.402d));
            int r10 = (int) ((a10 - ((A0E2 - 128) * 0.34414d)) - ((A0E - 128) * 0.71414d));
            int g6 = hv.A0E() << 24;
            this.A08[entryCount] = g6 | (C0940Hl.A06(cb2, 0, p.f9095b) << 16) | (C0940Hl.A06(r10, 0, p.f9095b) << 8) | C0940Hl.A06((int) (a10 + ((A0E2 - 128) * 1.772d)), 0, p.f9095b);
        }
        this.A06 = true;
    }

    public final FJ A06() {
        int A0E;
        int argbBitmapDataIndex;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A07() == 0 || this.A07.A06() != this.A07.A07() || !this.A06) {
            return null;
        }
        this.A07.A0Y(0);
        int[] iArr = new int[this.A01 * this.A00];
        int runLength = 0;
        while (runLength < iArr.length) {
            int argbBitmapDataIndex2 = this.A07.A0E();
            if (argbBitmapDataIndex2 != 0) {
                int[] argbBitmapData = this.A08;
                iArr[runLength] = argbBitmapData[argbBitmapDataIndex2];
                runLength++;
            } else {
                int argbBitmapDataIndex3 = this.A07.A0E();
                if (argbBitmapDataIndex3 == 0) {
                    continue;
                } else {
                    if ((argbBitmapDataIndex3 & 64) == 0) {
                        A0E = argbBitmapDataIndex3 & 63;
                    } else {
                        A0E = ((argbBitmapDataIndex3 & 63) << 8) | this.A07.A0E();
                    }
                    if ((argbBitmapDataIndex3 & 128) == 0) {
                        argbBitmapDataIndex = 0;
                    } else {
                        int[] iArr2 = this.A08;
                        HV hv = this.A07;
                        String[] strArr = A09;
                        if (strArr[6].length() != strArr[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A09;
                        strArr2[6] = "LobxqobSp0chhe0OZFFwjgoplyKrXQLj";
                        strArr2[2] = "nSlIIcYQrdb8UpaoVkH7kLQAXSG8FoO0";
                        argbBitmapDataIndex = iArr2[hv.A0E()];
                    }
                    Arrays.fill(iArr, runLength, runLength + A0E, argbBitmapDataIndex);
                    runLength += A0E;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888);
        float f = this.A02;
        int argbBitmapDataIndex4 = this.A05;
        float f10 = f / argbBitmapDataIndex4;
        float f11 = this.A03;
        int i10 = this.A04;
        return new FJ(createBitmap, f10, 0, f11 / i10, 0, this.A01 / argbBitmapDataIndex4, this.A00 / i10);
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
