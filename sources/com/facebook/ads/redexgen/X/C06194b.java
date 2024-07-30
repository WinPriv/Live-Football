package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06194b {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public C4a A01;
    public AbstractC06274j A04;
    public final /* synthetic */ C0849Dw A08;
    public final ArrayList<AbstractC06294l> A05 = new ArrayList<>();
    public ArrayList<AbstractC06294l> A02 = null;
    public final ArrayList<AbstractC06294l> A06 = new ArrayList<>();
    public final List<AbstractC06294l> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, Ascii.RS, Ascii.RS, 43, Ascii.GS, 44, -14, -53, -48, -62, -21, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, Ascii.DLE, Ascii.SYN, -36, -38, -33, 36, 37, Ascii.DC2, 37, Ascii.SYN, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, Ascii.RS, 19, Ascii.US, Ascii.RS, 35, Ascii.EM, 35, 36, Ascii.NAK, Ascii.RS, 19, 41, -48, Ascii.DC4, Ascii.NAK, 36, Ascii.NAK, 19, 36, Ascii.NAK, Ascii.DC4, -34, -48, -7, Ascii.RS, 38, 17, Ascii.FS, Ascii.EM, Ascii.DC4, -48, Ascii.EM, 36, Ascii.NAK, Ascii.GS, -48, 32, Ascii.US, 35, Ascii.EM, 36, Ascii.EM, Ascii.US, Ascii.RS, -48, -13, Ascii.CAN, Ascii.CR, Ascii.EM, Ascii.CAN, Ascii.GS, 19, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CR, 35, -54, Ascii.SO, Ascii.SI, Ascii.RS, Ascii.SI, Ascii.CR, Ascii.RS, Ascii.SI, Ascii.SO, -40, -54, -13, Ascii.CAN, 32, Ascii.VT, Ascii.SYN, 19, Ascii.SO, -54, 32, 19, Ascii.SI, 33, -54, Ascii.DC2, Ascii.EM, Ascii.SYN, Ascii.SO, Ascii.SI, Ascii.FS, -54, Ascii.VT, Ascii.SO, Ascii.VT, Ascii.SUB, Ascii.RS, Ascii.SI, Ascii.FS, -54, Ascii.SUB, Ascii.EM, Ascii.GS, 19, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -25, -26, -50, -31, -35, -17, -54, -35, -37, -15, -37, -28, -35, -36};
    }

    static {
        A05();
    }

    public C06194b(C0849Dw c0849Dw) {
        this.A08 = c0849Dw;
    }

    private final View A00(int i10, boolean z10) {
        return A0I(i10, z10, Long.MAX_VALUE).A0H;
    }

    private final AbstractC06294l A01(int i10) {
        int size;
        int A0D;
        ArrayList<AbstractC06294l> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC06294l abstractC06294l = this.A02.get(i11);
            if (!abstractC06294l.A0i()) {
                int i12 = abstractC06294l.A0I();
                if (i12 == i10) {
                    abstractC06294l.A0T(32);
                    return abstractC06294l;
                }
            }
        }
        if (this.A08.A04.A0B() && (A0D = this.A08.A00.A0D(i10)) > 0) {
            int offsetPosition = this.A08.A04.A0D();
            if (A0D < offsetPosition) {
                long A04 = this.A08.A04.A04(A0D);
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC06294l abstractC06294l2 = this.A02.get(i13);
                    if (!abstractC06294l2.A0i() && abstractC06294l2.A0K() == A04) {
                        abstractC06294l2.A0T(32);
                        return abstractC06294l2;
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC06294l A02(int i10, boolean z10) {
        View A08;
        int size = this.A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC06294l abstractC06294l = this.A05.get(i11);
            if (!abstractC06294l.A0i()) {
                int scrapCount = abstractC06294l.A0I();
                if (scrapCount == i10 && !abstractC06294l.A0b() && (this.A08.A0s.A09 || !abstractC06294l.A0c())) {
                    abstractC06294l.A0T(32);
                    return abstractC06294l;
                }
            }
        }
        if (!z10 && (A08 = this.A08.A01.A08(i10)) != null) {
            AbstractC06294l A0G = C0849Dw.A0G(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0W(A08);
                A0G.A0T(8224);
                return A0G;
            }
            throw new IllegalStateException(A04(727, 52, 27) + A0G + this.A08.A1I());
        }
        int size2 = this.A06.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AbstractC06294l abstractC06294l2 = this.A06.get(i12);
            if (!abstractC06294l2.A0b()) {
                int scrapCount2 = abstractC06294l2.A0I();
                if (scrapCount2 == i10) {
                    if (!z10) {
                        this.A06.remove(i12);
                    }
                    return abstractC06294l2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.AbstractC06294l A03(long r8, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06194b.A03(long, int, boolean):com.facebook.ads.redexgen.X.4l");
    }

    private final void A06() {
        boolean z10;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z10 = C0849Dw.A1E;
        if (z10) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i10) {
        A0d(this.A06.get(i10), true);
        this.A06.remove(i10);
    }

    private void A08(ViewGroup viewGroup, boolean z10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                String str = strArr[7];
                String str2 = strArr[6];
                int charAt = str.charAt(8);
                int i10 = str2.charAt(8);
                if (charAt == i10) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z10) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC06294l abstractC06294l) {
        if (this.A08.A1s()) {
            View view = abstractC06294l.A0H;
            if (AnonymousClass38.A00(view) == 0) {
                AnonymousClass38.A09(view, 1);
            }
            if (!AnonymousClass38.A0F(view)) {
                abstractC06294l.A0T(16384);
                AnonymousClass38.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC06294l abstractC06294l) {
        if (abstractC06294l.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC06294l.A0H, false);
        }
    }

    private final void A0B(AbstractC06294l abstractC06294l) {
        if (this.A08.A07 != null) {
            throw new NullPointerException(A04(779, 14, 62));
        }
        C4H c4h = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC06294l);
        }
    }

    private final boolean A0C(AbstractC06294l abstractC06294l) {
        if (abstractC06294l.A0c()) {
            return this.A08.A0s.A07();
        }
        if (abstractC06294l.A03 >= 0 && abstractC06294l.A03 < this.A08.A04.A0D()) {
            if (!this.A08.A0s.A07()) {
                int A03 = this.A08.A04.A03(abstractC06294l.A03);
                int type = abstractC06294l.A0H();
                if (A03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0B() || abstractC06294l.A0K() == this.A08.A04.A04(abstractC06294l.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + abstractC06294l + this.A08.A1I());
    }

    private boolean A0D(AbstractC06294l abstractC06294l, int i10, int i11, long startBindNs) {
        abstractC06294l.A08 = this.A08;
        int A0H = abstractC06294l.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (startBindNs != Long.MAX_VALUE) {
            C4a c4a = this.A01;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int charAt = str.charAt(0);
            int viewType = str2.charAt(0);
            if (charAt == viewType) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4a.A0A(A0H, nanoTime, startBindNs)) {
                return false;
            }
        }
        this.A08.A04.A0A(abstractC06294l, i10);
        this.A01.A05(abstractC06294l.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC06294l);
        if (this.A08.A0s.A07()) {
            abstractC06294l.A04 = i11;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i10) {
        return this.A05.get(i10).A0H;
    }

    public final View A0G(int i10) {
        return A00(i10, false);
    }

    public final C4a A0H() {
        if (this.A01 == null) {
            this.A01 = new C4a();
        }
        return this.A01;
    }

    @Nullable
    public final AbstractC06294l A0I(int i10, boolean z10, long j10) {
        C4U c4u;
        boolean fromScrapOrHiddenOrCache;
        C0849Dw A0I;
        AbstractC06274j abstractC06274j;
        View A00;
        if (i10 >= 0 && i10 < this.A08.A0s.A03()) {
            boolean z11 = false;
            AbstractC06294l abstractC06294l = null;
            boolean fromScrapOrHiddenOrCache2 = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache2) {
                abstractC06294l = A01(i10);
                z11 = abstractC06294l != null;
            }
            if (abstractC06294l == null && (abstractC06294l = A02(i10, z10)) != null) {
                boolean fromScrapOrHiddenOrCache3 = A0C(abstractC06294l);
                if (!fromScrapOrHiddenOrCache3) {
                    if (!z10) {
                        abstractC06294l.A0T(4);
                        boolean fromScrapOrHiddenOrCache4 = abstractC06294l.A0d();
                        if (fromScrapOrHiddenOrCache4) {
                            this.A08.removeDetachedView(abstractC06294l.A0H, false);
                            abstractC06294l.A0S();
                        } else {
                            boolean fromScrapOrHiddenOrCache5 = abstractC06294l.A0i();
                            if (fromScrapOrHiddenOrCache5) {
                                abstractC06294l.A0O();
                            }
                        }
                        A0b(abstractC06294l);
                    }
                    abstractC06294l = null;
                } else {
                    z11 = true;
                }
            }
            if (abstractC06294l == null) {
                int A0D = this.A08.A00.A0D(i10);
                if (A0D >= 0 && A0D < this.A08.A04.A0D()) {
                    int A03 = this.A08.A04.A03(A0D);
                    boolean fromScrapOrHiddenOrCache6 = this.A08.A04.A0B();
                    if (fromScrapOrHiddenOrCache6 && (abstractC06294l = A03(this.A08.A04.A04(A0D), A03, z10)) != null) {
                        abstractC06294l.A03 = A0D;
                        z11 = true;
                    }
                    if (abstractC06294l == null && (abstractC06274j = this.A04) != null && (A00 = abstractC06274j.A00(this, i10, A03)) != null) {
                        abstractC06294l = this.A08.A1H(A00);
                        if (abstractC06294l != null) {
                            boolean fromScrapOrHiddenOrCache7 = abstractC06294l.A0h();
                            if (fromScrapOrHiddenOrCache7) {
                                throw new IllegalArgumentException(A04(540, 113, 76) + this.A08.A1I());
                            }
                        } else {
                            throw new IllegalArgumentException(A04(653, 74, 17) + this.A08.A1I());
                        }
                    }
                    if (abstractC06294l == null) {
                        C4a A0H = A0H();
                        String[] strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            A0A[4] = "3K2bfdY4Lns5cH4Uqi6qZhk44zURNmgZ";
                            abstractC06294l = A0H.A03(A03);
                            if (abstractC06294l != null) {
                                abstractC06294l.A0Q();
                                boolean fromScrapOrHiddenOrCache8 = C0849Dw.A1C;
                                if (fromScrapOrHiddenOrCache8) {
                                    A0A(abstractC06294l);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (abstractC06294l == null) {
                        long nanoTime = this.A08.getNanoTime();
                        if (j10 != Long.MAX_VALUE) {
                            boolean fromScrapOrHiddenOrCache9 = this.A01.A0B(A03, nanoTime, j10);
                            if (!fromScrapOrHiddenOrCache9) {
                                return null;
                            }
                        }
                        C4H c4h = this.A08.A04;
                        C0849Dw c0849Dw = this.A08;
                        String[] strArr2 = A0A;
                        if (strArr2[5].charAt(0) == strArr2[3].charAt(0)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A0A;
                        strArr3[5] = "ofPrqBOY4KV1O5mmTOXtQojU6rRVoJMb";
                        strArr3[3] = "dfUBDtyf096LhSCdUEMmmzbvfUZbBbNe";
                        abstractC06294l = c4h.A05(c0849Dw, A03);
                        fromScrapOrHiddenOrCache = C0849Dw.A1E;
                        if (fromScrapOrHiddenOrCache && (A0I = C0849Dw.A0I(abstractC06294l.A0H)) != null) {
                            abstractC06294l.A09 = new WeakReference<>(A0I);
                        }
                        this.A01.A06(A03, this.A08.getNanoTime() - nanoTime);
                    }
                } else {
                    throw new IndexOutOfBoundsException(A04(165, 46, 118) + i10 + A04(13, 8, 126) + A0D + A04(35, 8, 119) + this.A08.A0s.A03() + this.A08.A1I());
                }
            }
            if (z11 && !this.A08.A0s.A07() && abstractC06294l.A0k(8192)) {
                abstractC06294l.A0U(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags = C4P.A00(abstractC06294l);
                    C4O info = this.A08.A05.A09(this.A08.A0s, abstractC06294l, changeFlags | 4096, abstractC06294l.A0L());
                    this.A08.A1m(abstractC06294l, info);
                }
            }
            boolean z12 = false;
            if (this.A08.A0s.A07() && abstractC06294l.A0a()) {
                abstractC06294l.A04 = i10;
            } else if (!abstractC06294l.A0a() || abstractC06294l.A0g() || abstractC06294l.A0b()) {
                z12 = A0D(abstractC06294l, this.A08.A00.A0D(i10), i10, j10);
            }
            ViewGroup.LayoutParams layoutParams = abstractC06294l.A0H.getLayoutParams();
            if (layoutParams == null) {
                c4u = (C4U) this.A08.generateDefaultLayoutParams();
                abstractC06294l.A0H.setLayoutParams(c4u);
            } else if (!this.A08.checkLayoutParams(layoutParams)) {
                c4u = (C4U) this.A08.generateLayoutParams(layoutParams);
                abstractC06294l.A0H.setLayoutParams(c4u);
            } else {
                if (A0A[0].length() == 16) {
                    A0A[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                    c4u = (C4U) layoutParams;
                }
                throw new RuntimeException();
            }
            c4u.A00 = abstractC06294l;
            c4u.A02 = z11 && z12;
            return abstractC06294l;
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 0) + i10 + A04(12, 1, 99) + i10 + A04(21, 14, 104) + this.A08.A0s.A03() + this.A08.A1I());
    }

    public final List<AbstractC06294l> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A0M();
        }
        int i11 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i11; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        ArrayList<AbstractC06294l> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int scrapCount2 = str.charAt(0);
        int cachedCount = str2.charAt(0);
        if (scrapCount2 != cachedCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int scrapCount3 = 0; scrapCount3 < changedScrapCount; scrapCount3++) {
                this.A02.get(scrapCount3).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AbstractC06294l> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4U c4u = (C4U) this.A06.get(i10).A0H.getLayoutParams();
            if (c4u != null) {
                c4u.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0B()) {
            int size = this.A06.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC06294l abstractC06294l = this.A06.get(i10);
                int i11 = A0A[0].length();
                if (i11 != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC06294l != null) {
                    abstractC06294l.A0T(6);
                    abstractC06294l.A0Y(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i10;
        if (this.A08.A06 != null) {
            C4T c4t = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i10 = c4t.A00;
            }
            throw new RuntimeException();
        }
        i10 = 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i10;
        int extraCache2 = this.A06.size();
        for (int i11 = extraCache2 - 1; i11 >= 0; i11--) {
            int size = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int i12 = str.charAt(0);
            int extraCache3 = str2.charAt(0);
            if (i12 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int extraCache4 = this.A00;
            if (size > extraCache4) {
                A07(i11);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i10) {
        this.A03 = i10;
        A0O();
    }

    public final void A0R(int i10, int i11) {
        int size = this.A06.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC06294l abstractC06294l = this.A06.get(i12);
            if (abstractC06294l != null) {
                int cachedCount = abstractC06294l.A03;
                if (cachedCount >= i10) {
                    abstractC06294l.A0W(i11, true);
                }
            }
        }
    }

    public final void A0S(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 < i11) {
            i12 = i10;
            i13 = i11;
            i14 = -1;
        } else {
            i12 = i11;
            i13 = i10;
            i14 = 1;
        }
        int size = this.A06.size();
        for (int i15 = 0; i15 < size; i15++) {
            AbstractC06294l abstractC06294l = this.A06.get(i15);
            if (abstractC06294l != null) {
                int start = abstractC06294l.A03;
                if (start >= i12) {
                    int start2 = abstractC06294l.A03;
                    if (start2 > i13) {
                        continue;
                    } else {
                        int i16 = abstractC06294l.A03;
                        String[] strArr = A0A;
                        String str = strArr[5];
                        String str2 = strArr[3];
                        int end = str.charAt(0);
                        int start3 = str2.charAt(0);
                        if (end == start3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                        strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                        if (i16 == i10) {
                            int start4 = i11 - i10;
                            abstractC06294l.A0W(start4, false);
                        } else {
                            abstractC06294l.A0W(i14, false);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void A0T(int i10, int i11) {
        int positionEnd;
        int i12 = i10 + i11;
        for (int i13 = this.A06.size() - 1; i13 >= 0; i13--) {
            AbstractC06294l abstractC06294l = this.A06.get(i13);
            if (abstractC06294l != null && (positionEnd = abstractC06294l.A03) >= i10 && positionEnd < i12) {
                abstractC06294l.A0T(2);
                A07(i13);
            }
        }
    }

    public final void A0U(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int removedEnd = this.A06.size();
        for (int i13 = removedEnd - 1; i13 >= 0; i13--) {
            AbstractC06294l abstractC06294l = this.A06.get(i13);
            if (abstractC06294l != null) {
                int removedEnd2 = abstractC06294l.A03;
                if (removedEnd2 >= i12) {
                    int removedEnd3 = -i11;
                    abstractC06294l.A0W(removedEnd3, z10);
                } else {
                    int removedEnd4 = abstractC06294l.A03;
                    if (removedEnd4 >= i10) {
                        abstractC06294l.A0T(8);
                        A07(i13);
                    }
                }
            }
        }
    }

    public final void A0V(View view) {
        AbstractC06294l A0G = C0849Dw.A0G(view);
        A0G.A0F = null;
        A0G.A0G = false;
        A0G.A0O();
        A0b(A0G);
    }

    public final void A0W(View view) {
        AbstractC06294l A0G = C0849Dw.A0G(view);
        if (A0G.A0k(12) || !A0G.A0f() || this.A08.A20(A0G)) {
            boolean A0b = A0G.A0b();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!A0b || A0G.A0c() || this.A08.A04.A0B()) {
                A0G.A0X(this, false);
                this.A05.add(A0G);
                return;
            } else {
                throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1I());
            }
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0G.A0X(this, true);
        this.A02.add(A0G);
    }

    public final void A0X(View view) {
        AbstractC06294l A0G = C0849Dw.A0G(view);
        if (A0G.A0e()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0G.A0d()) {
            A0G.A0S();
        } else if (A0G.A0i()) {
            A0G.A0O();
        }
        A0b(A0G);
    }

    public final void A0Y(C4H c4h, C4H c4h2, boolean z10) {
        A0P();
        A0H().A08(c4h, c4h2, z10);
    }

    public final void A0Z(C4a c4a) {
        C4a c4a2 = this.A01;
        if (c4a2 != null) {
            c4a2.A04();
        }
        this.A01 = c4a;
        if (c4a != null) {
            this.A01.A07(this.A08.getAdapter());
        }
    }

    public final void A0a(AbstractC06274j abstractC06274j) {
        this.A04 = abstractC06274j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        r0 = r10.A0k(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CAPPED_PER_SESSION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        r2 = r9.A06.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (r2 < r9.A00) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r2 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        A07(0);
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        r0 = com.facebook.ads.redexgen.X.C0849Dw.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r2 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        r0 = r9.A08.A02.A05(r10.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        if (r0 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ee, code lost:
    
        if (r2 < 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        r1 = r9.A06.get(r2).A03;
        r0 = r9.A08.A02.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r9.A06.add(r2, r10);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
    
        if (r7 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        A0d(r10, true);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(com.facebook.ads.redexgen.X.AbstractC06294l r10) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06194b.A0b(com.facebook.ads.redexgen.X.4l):void");
    }

    public final void A0c(AbstractC06294l abstractC06294l) {
        boolean z10;
        z10 = abstractC06294l.A0G;
        if (z10) {
            this.A02.remove(abstractC06294l);
        } else {
            this.A05.remove(abstractC06294l);
        }
        abstractC06294l.A0F = null;
        abstractC06294l.A0G = false;
        abstractC06294l.A0O();
    }

    public final void A0d(AbstractC06294l abstractC06294l, boolean z10) {
        C0849Dw.A0t(abstractC06294l);
        if (abstractC06294l.A0k(16384)) {
            abstractC06294l.A0U(0, 16384);
            AnonymousClass38.A0B(abstractC06294l.A0H, null);
        }
        if (z10) {
            A0B(abstractC06294l);
        }
        abstractC06294l.A08 = null;
        A0H().A09(abstractC06294l);
    }
}
