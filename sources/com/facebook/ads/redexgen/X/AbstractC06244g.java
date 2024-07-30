package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC06244g {
    public static byte[] A07;
    public static String[] A08 = {"ffTcX10Z9", "veDPHJ", "R", "iWatF5LLo", "0slLts", "p92m", "9", "eFvKPH9TFpfstHyCObyNN72zUjBGeH"};
    public View A01;
    public C4T A02;
    public C0849Dw A03;
    public boolean A04;
    public boolean A05;
    public int A00 = -1;
    public final C06224e A06 = new C06224e(0, 0);

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {78, 105, 113, 102, 107, 110, 99, 39, 115, 102, 117, 96, 98, 115, 39, 119, 104, 116, 110, 115, 110, 104, 105, Ascii.SYN, 39, 53, 53, 35, 34, 102, 41, 48, 35, 52, 102, 50, 39, 52, 33, 35, 50, 102, 54, 41, 53, 47, 50, 47, 41, 40, 102, 49, 46, 47, 42, 35, 102, 53, 43, 41, 41, 50, 46, 102, 53, 37, 52, 41, 42, 42, 47, 40, 33, 104, 78, 121, Ascii.DEL, 101, Ascii.DEL, 112, 121, 110, 74, 117, 121, 107};
        String[] strArr = A08;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A08[7] = "8BqCBekg5p6xdwXQXpIxknueaPhzjw";
        A07 = bArr;
    }

    public abstract void A0G();

    public abstract void A0H(int i10, int i11, C06264i c06264i, C06224e c06224e);

    public abstract void A0I(View view, C06264i c06264i, C06224e c06224e);

    static {
        A03();
    }

    private final int A00(View view) {
        return this.A03.A1C(view);
    }

    private final View A01(int i10) {
        return this.A03.A06.A1q(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, int i11) {
        C0849Dw c0849Dw = this.A03;
        if (!this.A05 || this.A00 == -1 || c0849Dw == null) {
            A09();
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            int A00 = A00(view);
            int i12 = this.A00;
            String[] strArr = A08;
            if (strArr[4].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "1zDtC4ICw";
            strArr2[0] = "WYaFIbeKL";
            if (A00 == i12) {
                A0I(this.A01, c0849Dw.A0s, this.A06);
                C06224e c06224e = this.A06;
                if (A08[5].length() != 9) {
                    String[] strArr3 = A08;
                    strArr3[6] = "M";
                    strArr3[2] = "Q";
                    c06224e.A05(c0849Dw);
                    A09();
                } else {
                    A08[5] = "sldJFA0K947j";
                    c06224e.A05(c0849Dw);
                    A09();
                }
            } else {
                Log.e(A02(74, 12, 0), A02(23, 51, 90));
                this.A01 = null;
            }
        }
        if (this.A05) {
            A0H(i10, i11, c0849Dw.A0s, this.A06);
            boolean hadJumpTarget = this.A06.A06();
            this.A06.A05(c0849Dw);
            if (hadJumpTarget) {
                if (this.A05) {
                    this.A04 = true;
                    c0849Dw.A08.A07();
                } else {
                    A09();
                }
            }
        }
    }

    public final int A06() {
        return this.A03.A06.A0W();
    }

    public final int A07() {
        return this.A00;
    }

    @Nullable
    public final C4T A08() {
        return this.A02;
    }

    public final void A09() {
        if (!this.A05) {
            return;
        }
        A0G();
        this.A03.A0s.A0F = -1;
        this.A01 = null;
        this.A00 = -1;
        this.A04 = false;
        this.A05 = false;
        this.A02.A0M(this);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A0A(int i10) {
        this.A00 = i10;
    }

    public final void A0B(PointF pointF) {
        float sqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        float magnitude = pointF.x;
        pointF.x = magnitude / sqrt;
        float magnitude2 = pointF.y;
        pointF.y = magnitude2 / sqrt;
    }

    public final void A0C(View view) {
        if (A00(view) == A07()) {
            this.A01 = view;
        }
    }

    public final void A0D(C0849Dw c0849Dw, C4T c4t) {
        this.A03 = c0849Dw;
        this.A02 = c4t;
        if (this.A00 != -1) {
            this.A03.A0s.A0F = this.A00;
            this.A05 = true;
            this.A04 = true;
            this.A01 = A01(A07());
            this.A03.A08.A07();
            return;
        }
        throw new IllegalArgumentException(A02(0, 23, 27));
    }

    public final boolean A0E() {
        return this.A04;
    }

    public final boolean A0F() {
        return this.A05;
    }
}
