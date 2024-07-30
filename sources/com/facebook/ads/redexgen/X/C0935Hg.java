package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Hg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0935Hg {
    public static String[] A07 = {"v8bLZp59B3s5kjImuBjcCmNW", "l5XLQfXbQh6R34DBcL2a2gRDiWiOWq7j", "cKC0Gfnr6KNVk9zoAEVguSpqajRxhGsy", "4MzGZFDG0CqgMdioIrH5vwyzFGAbThRu", "MvXRt7wPeDxEfDCDFesb3zWoJZhNCkxf", "mCnVL7G0HMRU3KziMebPW175T1XCPvkW", "oyPZ3wFE5cpoHVmJFEQQrP2WxUjSMaR1", "eOuchRPwSpgwlWmZThUBhEapR1FbTYXS"};
    public static final Comparator<C0934Hf> A08 = new C0932Hd();
    public static final Comparator<C0934Hf> A09 = new C0933He();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C0934Hf[] A06 = new C0934Hf[5];
    public final ArrayList<C0934Hf> A05 = new ArrayList<>();
    public int A00 = -1;

    public C0935Hg(int i10) {
        this.A04 = i10;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f) {
        A01();
        float f10 = this.A03 * f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList<C0934Hf> arrayList = this.A05;
            int accumulatedWeight = A07[7].charAt(12);
            if (accumulatedWeight != 108) {
                throw new RuntimeException();
            }
            A07[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            if (i11 < arrayList.size()) {
                C0934Hf c0934Hf = this.A05.get(i11);
                i10 += c0934Hf.A02;
                float desiredWeight = i10;
                if (desiredWeight >= f10) {
                    float desiredWeight2 = c0934Hf.A00;
                    return desiredWeight2;
                }
                i11++;
            } else {
                if (this.A05.isEmpty()) {
                    return Float.NaN;
                }
                float desiredWeight3 = this.A05.get(r1.size() - 1).A00;
                return desiredWeight3;
            }
        }
    }

    public final void A03(int i10, float f) {
        C0934Hf c0934Hf;
        A00();
        int i11 = this.A02;
        if (i11 > 0) {
            C0934Hf[] c0934HfArr = this.A06;
            int i12 = i11 - 1;
            this.A02 = i12;
            c0934Hf = c0934HfArr[i12];
        } else {
            c0934Hf = new C0934Hf(null);
        }
        int i13 = this.A01;
        this.A01 = i13 + 1;
        c0934Hf.A01 = i13;
        if (A07[6].charAt(29) != 'a') {
            throw new RuntimeException();
        }
        A07[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        c0934Hf.A02 = i10;
        c0934Hf.A00 = f;
        this.A05.add(c0934Hf);
        this.A03 += i10;
        while (true) {
            int i14 = this.A03;
            int i15 = this.A04;
            if (i14 > i15) {
                int excessWeight = i14 - i15;
                C0934Hf c0934Hf2 = this.A05.get(0);
                if (c0934Hf2.A02 <= excessWeight) {
                    this.A03 -= c0934Hf2.A02;
                    this.A05.remove(0);
                    int i16 = this.A02;
                    if (i16 < 5) {
                        C0934Hf[] c0934HfArr2 = this.A06;
                        if (A07[6].charAt(29) != 97) {
                            this.A02 = i16 + 1;
                            c0934HfArr2[i16] = c0934Hf2;
                        } else {
                            A07[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            this.A02 = i16 + 1;
                            c0934HfArr2[i16] = c0934Hf2;
                        }
                    }
                } else {
                    c0934Hf2.A02 -= excessWeight;
                    this.A03 -= excessWeight;
                }
            } else {
                return;
            }
        }
    }
}
