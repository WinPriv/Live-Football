package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05320p {
    public static byte[] A04;
    public static String[] A05 = {"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    public boolean A00;
    public final C1316Wj A01;
    public final AbstractC05330q A02;
    public final C1137Pi A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public abstract void A06(Map<String, String> map);

    static {
        A01();
    }

    public AbstractC05320p(C1316Wj c1316Wj, AbstractC05330q abstractC05330q, C1137Pi c1137Pi) {
        this.A01 = c1316Wj;
        this.A02 = abstractC05330q;
        this.A03 = c1137Pi;
    }

    public final void A02() {
        if (this.A00) {
            return;
        }
        AbstractC05330q abstractC05330q = this.A02;
        if (abstractC05330q != null) {
            abstractC05330q.A00();
        }
        Map<String, String> extraData = new N2().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        KS.A02(this.A01, A00(0, 17, 20));
        AbstractC05330q abstractC05330q2 = this.A02;
    }
}
