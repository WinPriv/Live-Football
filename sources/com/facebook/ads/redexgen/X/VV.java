package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class VV extends Bc {
    public static byte[] A01;
    public static String[] A02 = {"VtWAGSJcoPK1ZfQIT7kg70", "uvijoF7s18JkyzfLjC52JO", "UbwrKHlSsB9uBr4pHbp3GiHEJPcDIn2y", "M5IiKhc4TX4EBu4m9nlnlg4KrGcCYGid", "uZSF2L4tKNd9pS0dTFbwskwuDNdjgXB", "5", "JxfitwILt0nkPD2n3YPqqh4", "RXlbAzoXPs3VSjVZyf6us5"};
    public long A00;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{47, 62, 57, 42, 63, 34, 36, 37, 83, 82, 113, 89, 72, 93, 120, 93, 72, 93};
    }

    static {
        A0A();
    }

    public VV() {
        super(null);
        this.A00 = b.f7291b;
    }

    public static int A00(HV hv) {
        return hv.A0E();
    }

    public static Boolean A01(HV hv) {
        return Boolean.valueOf(hv.A0E() == 1);
    }

    public static Double A02(HV hv) {
        return Double.valueOf(Double.longBitsToDouble(hv.A0L()));
    }

    public static Object A03(HV hv, int i10) {
        if (i10 == 0) {
            return A02(hv);
        }
        if (i10 == 1) {
            return A01(hv);
        }
        if (i10 == 2) {
            return A05(hv);
        }
        if (i10 == 3) {
            return A09(hv);
        }
        if (i10 == 8) {
            HashMap<String, Object> A08 = A08(hv);
            if (A02[5].length() != 0) {
                String[] strArr = A02;
                strArr[7] = "dv1uUJDV50UY3341cCSHZj";
                strArr[6] = "lZLu8OCPwS2vewsoll9LjNz";
                return A08;
            }
        } else {
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                return A07(hv);
            }
            ArrayList<Object> A06 = A06(hv);
            String[] strArr2 = A02;
            if (strArr2[1].length() == strArr2[0].length()) {
                A02[4] = "2Wm";
                return A06;
            }
        }
        throw new RuntimeException();
    }

    public static String A05(HV hv) {
        int A0I = hv.A0I();
        int A06 = hv.A06();
        hv.A0Z(A0I);
        return new String(hv.A00, A06, A0I);
    }

    public static ArrayList<Object> A06(HV hv) {
        int A0H = hv.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int i10 = 0; i10 < A0H; i10++) {
            int count = A00(hv);
            arrayList.add(A03(hv, count));
        }
        return arrayList;
    }

    public static Date A07(HV hv) {
        Date date = new Date((long) A02(hv).doubleValue());
        hv.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(HV hv) {
        int A0H = hv.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int i10 = 0; i10 < A0H; i10++) {
            String A05 = A05(hv);
            int count = A00(hv);
            hashMap.put(A05, A03(hv, count));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(HV hv) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(hv);
            int A00 = A00(hv);
            if (A02[4].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "V4HwzONZDXYgxClN6ndm7q";
            strArr[0] = "UAxIIFeY73WGzRiRR4AY1i";
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(hv, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bc
    public final void A0B(HV hv, long j10) throws C9R {
        if (A00(hv) == 2) {
            if (!A04(8, 10, 28).equals(A05(hv)) || A00(hv) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(hv);
            String name = A04(0, 8, 107);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((Double) metadata.get(name)).doubleValue();
                if (durationSeconds > 0.0d) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new C9R();
    }

    @Override // com.facebook.ads.redexgen.X.Bc
    public final boolean A0C(HV hv) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
