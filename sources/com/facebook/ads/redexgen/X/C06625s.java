package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.5s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06625s {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C06605q> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C06605q A00() {
        C06605q c06605q = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C06605q c06605q2 = c06605q;
            if (c06605q2 == null) {
                C06605q A002 = C06605q.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c06605q2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C06605q A01(com.facebook.ads.redexgen.X.C7G r5, com.facebook.ads.redexgen.X.C06605q r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5q r0 = com.facebook.ads.redexgen.X.C06675y.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.7k r5 = r5.A06()
            int r4 = com.facebook.ads.redexgen.X.C06977l.A1Q
            com.facebook.ads.redexgen.X.7m r3 = new com.facebook.ads.redexgen.X.7m
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A8u(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06625s.A01(com.facebook.ads.redexgen.X.7G, com.facebook.ads.redexgen.X.5q):com.facebook.ads.redexgen.X.5q");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C06605q A02(C7G c7g, C06605q c06605q, C06615r c06615r) {
        C06635t c06635t = null;
        try {
            if (IC.A06(c7g) && (c06605q == null || TextUtils.isEmpty(c06605q.A03()))) {
                c06635t = C06645u.A00(c7g.getContentResolver());
            }
        } catch (Throwable th) {
            c7g.A06().A8u(A04(12, 7, 6), C06977l.A1S, new C06987m(th));
        }
        if (c06635t != null && c06635t.A01 != null) {
            A03.set(c06635t.A01);
            c06615r.A05(c06635t.A01);
        }
        if (c06605q == null && c06635t != null && !TextUtils.isEmpty(c06635t.A00)) {
            return new C06605q(c06635t.A00, c06635t.A02, EnumC06595p.A05);
        }
        return c06605q;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C06615r c06615r) {
        A02.set(c06615r.A02());
        A03.set(c06615r.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C7G c7g) {
        long j10;
        C06605q advertisingIdInfo;
        try {
            C06615r c06615r = new C06615r(c7g);
            A06(c06615r);
            if (A08()) {
                return;
            }
            C06605q advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j10 = advertisingIdInfo2.A01();
            } else {
                j10 = -1;
            }
            if (j10 > 0 && System.currentTimeMillis() - j10 < IC.A00(c7g)) {
                return;
            }
            if (IC.A07(c7g)) {
                advertisingIdInfo = A01(c7g, A02(c7g, null, c06615r));
            } else {
                advertisingIdInfo = A02(c7g, A01(c7g, null), c06615r);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c06615r.A04(advertisingIdInfo);
            }
        } catch (Throwable t10) {
            c7g.A06().A8u(A04(12, 7, 6), C06977l.A1R, new C06987m(t10));
        }
    }

    public static boolean A08() {
        boolean z10 = false;
        boolean updated = KO.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            boolean updated2 = KO.A05(A04);
            if (updated2) {
                A03.set(KO.A01(A04));
                z10 = true;
            }
        }
        boolean A042 = KO.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return z10;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return z10;
            }
        }
        String A043 = A04(19, 13, 79);
        boolean updated3 = KO.A05(A043);
        if (updated3) {
            String A012 = KO.A01(A043);
            AtomicReference<C06605q> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C06605q(A012, false, EnumC06595p.A04));
            return true;
        }
        return z10;
    }
}
