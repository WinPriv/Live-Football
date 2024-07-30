package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Xk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1343Xk extends C4T implements InterfaceC06234f {
    public static byte[] A0F;
    public static String[] A0G = {"VKH6HNPW", "5SG7ZkmA1SrYT5HpW6e3lHPIEdQjCnoY", "GUFAcNFlkHbDslOxTlAKu2zM5da70L8W", "8EarDdUd0wjX", "ogiAdIZLqFL2ODTGKcli7xbzAuQZVFku", "k0c9canuweazyFazM74f3pFcokchiBr", "yJQv9VjGutzUoxdr6", "vBYUiSK7FkagYmvZS"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public C4D A04;
    public boolean A05;
    public int A06;
    public AnonymousClass48 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass46 A0D;
    public final AnonymousClass47 A0E;

    public static String A0T(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{Ascii.RS, Ascii.EM, 1, Ascii.SYN, Ascii.ESC, Ascii.RS, 19, 87, Ascii.CAN, 5, Ascii.RS, Ascii.DC2, Ascii.EM, 3, Ascii.SYN, 3, Ascii.RS, Ascii.CAN, Ascii.EM, 77};
    }

    static {
        A0V();
    }

    public C1343Xk(Context context) {
        this(context, 1, false);
    }

    public C1343Xk(Context context, int i10, boolean z10) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new AnonymousClass46(this);
        this.A0E = new AnonymousClass47();
        this.A06 = 2;
        A2E(i10);
        A0h(z10);
        A1V(true);
    }

    private final int A04(int i10, C06194b c06194b, C06264i c06264i) {
        if (A0W() == 0 || i10 == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2D();
        int absDy = i10 > 0 ? 1 : -1;
        int consumed = Math.abs(i10);
        A0Y(absDy, consumed, true, c06264i);
        int i11 = this.A07.A07;
        int layoutDirection = A08(c06194b, this.A07, c06264i, false);
        int i12 = i11 + layoutDirection;
        if (i12 < 0) {
            return 0;
        }
        int absDy2 = consumed > i12 ? absDy * i12 : i10;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i10, C06194b c06194b, C06264i c06264i, boolean z10) {
        int gap = this.A04.A07() - i10;
        if (gap > 0) {
            int i11 = -A04(-gap, c06194b, c06264i);
            int i12 = i10 + i11;
            if (z10) {
                int A07 = this.A04.A07();
                int fixOffset = A0G[0].length();
                if (fixOffset == 7) {
                    throw new RuntimeException();
                }
                A0G[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                int i13 = A07 - i12;
                if (i13 > 0) {
                    this.A04.A0J(i13);
                    return i13 + i11;
                }
            }
            return i11;
        }
        return 0;
    }

    private int A06(int i10, C06194b c06194b, C06264i c06264i, boolean z10) {
        int A0A;
        int gap = i10 - this.A04.A0A();
        if (gap > 0) {
            int i11 = -A04(gap, c06194b, c06264i);
            int i12 = i10 + i11;
            if (z10 && (A0A = i12 - this.A04.A0A()) > 0) {
                this.A04.A0J(-A0A);
                return i11 - A0A;
            }
            return i11;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r0 = r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        return r7 - r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A08(com.facebook.ads.redexgen.X.C06194b r10, com.facebook.ads.redexgen.X.AnonymousClass48 r11, com.facebook.ads.redexgen.X.C06264i r12, boolean r13) {
        /*
            r9 = this;
            int r7 = r11.A00
            int r0 = r11.A07
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r6) goto L16
            int r0 = r11.A00
            if (r0 >= 0) goto L13
            int r1 = r11.A07
            int r0 = r11.A00
            int r1 = r1 + r0
            r11.A07 = r1
        L13:
            r9.A0e(r10, r11)
        L16:
            int r5 = r11.A00
            int r0 = r11.A02
            int r5 = r5 + r0
            com.facebook.ads.redexgen.X.47 r4 = r9.A0E
        L1d:
            boolean r0 = r11.A09
            if (r0 != 0) goto L23
            if (r5 <= 0) goto L33
        L23:
            boolean r0 = r11.A05(r12)
            if (r0 == 0) goto L33
            r4.A00()
            r9.A2H(r10, r12, r11, r4)
            boolean r0 = r4.A01
            if (r0 == 0) goto L37
        L33:
            int r0 = r11.A00
            int r7 = r7 - r0
            return r7
        L37:
            int r2 = r11.A06
            int r1 = r4.A00
            int r0 = r11.A05
            int r1 = r1 * r0
            int r2 = r2 + r1
            r11.A06 = r2
            boolean r0 = r4.A03
            if (r0 == 0) goto L51
            com.facebook.ads.redexgen.X.48 r0 = r9.A07
            java.util.List<com.facebook.ads.redexgen.X.4l> r0 = r0.A08
            if (r0 != 0) goto L51
            boolean r0 = r12.A07()
            if (r0 != 0) goto L5b
        L51:
            int r1 = r11.A00
            int r0 = r4.A00
            int r1 = r1 - r0
            r11.A00 = r1
            int r0 = r4.A00
            int r5 = r5 - r0
        L5b:
            int r0 = r11.A07
            if (r0 == r6) goto L87
            int r1 = r11.A07
            int r0 = r4.A00
            int r1 = r1 + r0
            r11.A07 = r1
            int r0 = r11.A00
            if (r0 >= 0) goto L84
            int r8 = r11.A07
            int r3 = r11.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1343Xk.A0G
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto La1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1343Xk.A0G
            java.lang.String r1 = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf"
            r0 = 5
            r2[r0] = r1
            int r8 = r8 + r3
            r11.A07 = r8
        L84:
            r9.A0e(r10, r11)
        L87:
            if (r13 == 0) goto L1d
            boolean r3 = r4.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1343Xk.A0G
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto La1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1343Xk.A0G
            java.lang.String r1 = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L1d
            goto L33
        La1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1343Xk.A08(com.facebook.ads.redexgen.X.4b, com.facebook.ads.redexgen.X.48, com.facebook.ads.redexgen.X.4i, boolean):int");
    }

    private int A09(C06264i c06264i) {
        if (A0W() != 0) {
            A2D();
            return C06304m.A00(c06264i, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        if (A0G[5].length() != 31) {
            throw new RuntimeException();
        }
        A0G[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
        return 0;
    }

    private int A0A(C06264i c06264i) {
        if (A0W() == 0) {
            return 0;
        }
        A2D();
        return C06304m.A02(c06264i, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0B(C06264i c06264i) {
        if (A0W() != 0) {
            A2D();
            return C06304m.A01(c06264i, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[2] = "SnDsIEYZVkVP365fclIsQ2wSHS1GnuqA";
        strArr2[4] = "cd1sjhoNq3y2dBxKlbos6To2J3BafTHs";
        return 0;
    }

    private final int A0C(C06264i c06264i) {
        if (c06264i.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i10, int i11) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A2D();
        if (i11 > i10) {
            next = 1;
        } else {
            next = i11 < i10 ? -1 : 0;
        }
        if (next == 0) {
            View A0t = A0t(i10);
            String[] strArr = A0G;
            String str = strArr[6];
            String str2 = strArr[7];
            int length = str.length();
            int next2 = str2.length();
            if (length != next2) {
                throw new RuntimeException();
            }
            A0G[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            return A0t;
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i10));
        int next3 = this.A04.A0A();
        if (preferredBoundsFlag2 < next3) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = 4097;
        }
        int next4 = this.A00;
        if (next4 == 0) {
            return super.A04.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        A2D();
        int i13 = 0;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (z11) {
            i13 = 320;
        }
        int i14 = this.A00;
        int acceptableBoundsFlag = A0G[1].charAt(30);
        if (acceptableBoundsFlag != 111) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "NnwW0AnvRBQDKBAe7Vp9NN4SqY6y39Zg";
        strArr[4] = "snWQRfIRwdJNOSPMdDWVpUmegwlUrdsl";
        if (i14 == 0) {
            return super.A04.A00(i10, i11, i12, i13);
        }
        return super.A05.A00(i10, i11, i12, i13);
    }

    private View A0K(C06194b c06194b, C06264i c06264i) {
        return A2C(c06194b, c06264i, 0, A0W(), c06264i.A03());
    }

    private View A0L(C06194b c06194b, C06264i c06264i) {
        return A2C(c06194b, c06264i, A0W() - 1, -1, c06264i.A03());
    }

    private View A0M(C06194b c06194b, C06264i c06264i) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C06194b c06194b, C06264i c06264i) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C06194b c06194b, C06264i c06264i) {
        return this.A05 ? A0K(c06194b, c06264i) : A0L(c06194b, c06264i);
    }

    private View A0P(C06194b c06194b, C06264i c06264i) {
        return this.A05 ? A0L(c06194b, c06264i) : A0K(c06194b, c06264i);
    }

    private View A0Q(boolean z10, boolean z11) {
        if (this.A05) {
            return A0J(0, A0W(), z10, z11);
        }
        return A0J(A0W() - 1, -1, z10, z11);
    }

    private View A0R(boolean z10, boolean z11) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z10, z11);
        }
        return A0J(0, A0W(), z10, z11);
    }

    private final AnonymousClass48 A0S() {
        return new AnonymousClass48();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2J()) {
            this.A05 = this.A0A;
            return;
        }
        boolean z10 = !this.A0A;
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "rvopS3hSB7itRsuyG";
        strArr2[7] = "9RTUShXs4ZXrU4n03";
        this.A05 = z10;
    }

    private void A0W(int i10, int i11) {
        this.A07.A00 = this.A04.A07() - i11;
        this.A07.A03 = this.A05 ? -1 : 1;
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A01 = i10;
        anonymousClass48.A05 = 1;
        anonymousClass48.A06 = i11;
        anonymousClass48.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i10, int i11) {
        this.A07.A00 = i11 - this.A04.A0A();
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A01 = i10;
        anonymousClass48.A03 = this.A05 ? 1 : -1;
        AnonymousClass48 anonymousClass482 = this.A07;
        anonymousClass482.A05 = -1;
        anonymousClass482.A06 = i11;
        anonymousClass482.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i10, int i11, boolean z10, C06264i c06264i) {
        int A0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c06264i);
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A05 = i10;
        if (i10 == 1) {
            anonymousClass48.A02 += this.A04.A08();
            View A0F2 = A0F();
            AnonymousClass48 anonymousClass482 = this.A07;
            if (!this.A05) {
                r4 = 1;
            }
            anonymousClass482.A03 = r4;
            this.A07.A01 = A0p(A0F2) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(A0F2);
            A0A = this.A04.A0C(A0F2) - this.A04.A07();
        } else {
            View A0G2 = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(A0G2) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(A0G2);
            A0A = (-this.A04.A0F(A0G2)) + this.A04.A0A();
        }
        AnonymousClass48 anonymousClass483 = this.A07;
        anonymousClass483.A00 = i11;
        if (z10) {
            anonymousClass483.A00 -= A0A;
        }
        this.A07.A07 = A0A;
        int scrollingOffset = A0G[0].length();
        if (scrollingOffset == 7) {
            throw new RuntimeException();
        }
        A0G[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
    }

    private void A0Z(AnonymousClass46 anonymousClass46) {
        A0W(anonymousClass46.A01, anonymousClass46.A00);
    }

    private void A0a(AnonymousClass46 anonymousClass46) {
        A0X(anonymousClass46.A01, anonymousClass46.A00);
    }

    private void A0b(C06194b c06194b, int i10) {
        int A0W = A0W();
        if (i10 < 0) {
            return;
        }
        int A06 = this.A04.A06() - i10;
        if (this.A05) {
            for (int i11 = 0; i11 < A0W; i11++) {
                View A0t = A0t(i11);
                int childCount = this.A04.A0F(A0t);
                if (childCount >= A06) {
                    int childCount2 = this.A04.A0H(A0t);
                    if (childCount2 >= A06) {
                    }
                }
                A0d(c06194b, 0, i11);
                return;
            }
            return;
        }
        for (int i12 = A0W - 1; i12 >= 0; i12--) {
            View A0t2 = A0t(i12);
            int childCount3 = this.A04.A0F(A0t2);
            if (childCount3 >= A06) {
                int childCount4 = this.A04.A0H(A0t2);
                if (childCount4 >= A06) {
                }
            }
            int childCount5 = A0W - 1;
            A0d(c06194b, childCount5, i12);
            return;
        }
    }

    private void A0c(C06194b c06194b, int i10) {
        if (i10 < 0) {
            return;
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[0] = "66";
        int A0W = A0W();
        if (this.A05) {
            for (int i11 = A0W - 1; i11 >= 0; i11--) {
                View A0t = A0t(i11);
                int limit = this.A04.A0C(A0t);
                if (limit <= i10) {
                    C4D c4d = this.A04;
                    String[] strArr2 = A0G;
                    String str = strArr2[6];
                    String str2 = strArr2[7];
                    int childCount = str.length();
                    int limit2 = str2.length();
                    if (childCount != limit2) {
                        int limit3 = c4d.A0G(A0t);
                        if (limit3 <= i10) {
                        }
                    } else {
                        A0G[3] = "uDZbJl3GZvnd0";
                        int limit4 = c4d.A0G(A0t);
                        if (limit4 <= i10) {
                        }
                    }
                }
                int limit5 = A0W - 1;
                A0d(c06194b, limit5, i11);
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < A0W; i12++) {
            View A0t2 = A0t(i12);
            int A0C = this.A04.A0C(A0t2);
            int childCount2 = A0G[3].length();
            if (childCount2 == 28) {
                throw new RuntimeException();
            }
            A0G[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            if (A0C <= i10) {
                int limit6 = this.A04.A0G(A0t2);
                if (limit6 <= i10) {
                }
            }
            A0d(c06194b, 0, i12);
            return;
        }
    }

    private void A0d(C06194b c06194b, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                A14(i12, c06194b);
            }
            return;
        }
        while (i10 > i11) {
            A14(i10, c06194b);
            i10--;
        }
    }

    private void A0e(C06194b c06194b, AnonymousClass48 anonymousClass48) {
        if (!anonymousClass48.A0B || anonymousClass48.A09) {
            return;
        }
        int i10 = anonymousClass48.A05;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[7].length()) {
            String[] strArr2 = A0G;
            strArr2[2] = "M7iaeQoExhHh03f7x1XNzmreS2Lq1zJK";
            strArr2[4] = "3weclwG7n9RXAySrMV3Jn51LrKgutG4n";
            if (i10 == -1) {
                int i11 = anonymousClass48.A07;
                if (A0G[1].charAt(30) == 'o') {
                    A0G[3] = "CiNTyTfZO3PW6tP";
                    A0b(c06194b, i11);
                    return;
                }
            } else {
                A0c(c06194b, anonymousClass48.A07);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0f(C06194b c06194b, C06264i c06264i, int i10, int i11) {
        if (!c06264i.A08() || A0W() == 0 || c06264i.A07() || !A26()) {
            return;
        }
        int i12 = 0;
        int scrapExtraEnd = 0;
        List<AbstractC06294l> A0J = c06194b.A0J();
        int i13 = A0J.size();
        int A0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i13; scrapSize++) {
            AbstractC06294l abstractC06294l = A0J.get(scrapSize);
            if (!abstractC06294l.A0c()) {
                int direction = 1;
                if ((abstractC06294l.A0I() < A0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    i12 += this.A04.A0D(abstractC06294l.A0H);
                } else {
                    scrapExtraEnd += this.A04.A0D(abstractC06294l.A0H);
                }
            }
        }
        this.A07.A08 = A0J;
        if (i12 > 0) {
            A0X(A0p(A0G()), i10);
            AnonymousClass48 anonymousClass48 = this.A07;
            anonymousClass48.A02 = i12;
            anonymousClass48.A00 = 0;
            anonymousClass48.A04();
            A08(c06194b, this.A07, c06264i, false);
        }
        if (scrapExtraEnd > 0) {
            A0W(A0p(A0F()), i11);
            AnonymousClass48 anonymousClass482 = this.A07;
            anonymousClass482.A02 = scrapExtraEnd;
            anonymousClass482.A00 = 0;
            anonymousClass482.A04();
            A08(c06194b, this.A07, c06264i, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C06194b c06194b, C06264i c06264i, AnonymousClass46 anonymousClass46) {
        if (A0k(c06264i, anonymousClass46)) {
            return;
        }
        boolean A0j = A0j(c06194b, c06264i, anonymousClass46);
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[3] = "XDJ2jDWhUW9a7iN";
        if (A0j) {
            return;
        }
        anonymousClass46.A02();
        anonymousClass46.A01 = this.A0C ? c06264i.A03() - 1 : 0;
    }

    private final void A0h(boolean z10) {
        A22(null);
        if (z10 == this.A0A) {
            return;
        }
        this.A0A = z10;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C06194b c06194b, C06264i c06264i, AnonymousClass46 anonymousClass46) {
        View A0P;
        int A0A;
        if (A0W() == 0) {
            return false;
        }
        View A0s = A0s();
        if (A0s != null && anonymousClass46.A06(A0s, c06264i)) {
            anonymousClass46.A05(A0s);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (anonymousClass46.A02) {
            A0P = A0O(c06194b, c06264i);
        } else {
            A0P = A0P(c06194b, c06264i);
        }
        if (A0P == null) {
            return false;
        }
        anonymousClass46.A04(A0P);
        if (!c06264i.A07() && A26()) {
            if (this.A04.A0F(A0P) >= this.A04.A07() || this.A04.A0C(A0P) < this.A04.A0A()) {
                if (anonymousClass46.A02) {
                    A0A = this.A04.A07();
                } else {
                    A0A = this.A04.A0A();
                }
                anonymousClass46.A00 = A0A;
            }
        }
        return true;
    }

    private boolean A0k(C06264i c06264i, AnonymousClass46 anonymousClass46) {
        int i10;
        int startGap;
        if (c06264i.A07() || (i10 = this.A01) == -1) {
            return false;
        }
        if (i10 < 0 || i10 >= c06264i.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        anonymousClass46.A01 = this.A01;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.A01()) {
            if (this.A02 == Integer.MIN_VALUE) {
                View A1q = A1q(this.A01);
                if (A1q != null) {
                    if (this.A04.A0D(A1q) > this.A04.A0B()) {
                        anonymousClass46.A02();
                        return true;
                    }
                    if (this.A04.A0F(A1q) - this.A04.A0A() < 0) {
                        anonymousClass46.A00 = this.A04.A0A();
                        anonymousClass46.A02 = false;
                        return true;
                    }
                    int endGap = this.A04.A07() - this.A04.A0C(A1q);
                    if (endGap < 0) {
                        anonymousClass46.A00 = this.A04.A07();
                        anonymousClass46.A02 = true;
                        return true;
                    }
                    if (anonymousClass46.A02) {
                        int startGap2 = this.A04.A0C(A1q);
                        C4D c4d = this.A04;
                        String[] strArr = A0G;
                        String str = strArr[2];
                        String str2 = strArr[4];
                        int endGap2 = str.charAt(4);
                        if (endGap2 == str2.charAt(4)) {
                            throw new RuntimeException();
                        }
                        A0G[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        startGap = startGap2 + c4d.A05();
                    } else {
                        startGap = this.A04.A0F(A1q);
                    }
                    anonymousClass46.A00 = startGap;
                } else {
                    if (A0W() > 0) {
                        View child = A0t(0);
                        int endGap3 = A0p(child);
                        boolean z10 = this.A01 < endGap3;
                        boolean z11 = this.A05;
                        int endGap4 = A0G[1].charAt(30);
                        if (endGap4 != 111) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0G;
                        strArr2[2] = "1tNDA9T9nSDYektAgKE77gOe81bMFJSk";
                        strArr2[4] = "TZYqXNdWGZVKxzfIQyf7YZEk7yb7IRTm";
                        anonymousClass46.A02 = z10 == z11;
                    }
                    anonymousClass46.A02();
                }
                return true;
            }
            boolean z12 = this.A05;
            anonymousClass46.A02 = z12;
            if (z12) {
                anonymousClass46.A00 = this.A04.A07() - this.A02;
            } else {
                anonymousClass46.A00 = this.A04.A0A() + this.A02;
            }
            return true;
        }
        anonymousClass46.A02 = this.A03.A02;
        if (anonymousClass46.A02) {
            anonymousClass46.A00 = this.A04.A07() - this.A03.A00;
        } else {
            anonymousClass46.A00 = this.A04.A0A() + this.A03.A00;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public int A1h(int i10, C06194b c06194b, C06264i c06264i) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i10, c06194b, c06264i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public int A1i(int i10, C06194b c06194b, C06264i c06264i) {
        if (this.A00 == 0) {
            return 0;
        }
        int A04 = A04(i10, c06194b, c06264i);
        String[] strArr = A0G;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "CDnF1shpb";
        return A04;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1j(C06264i c06264i) {
        return A09(c06264i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1k(C06264i c06264i) {
        return A0A(c06264i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1l(C06264i c06264i) {
        return A0B(c06264i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1m(C06264i c06264i) {
        return A09(c06264i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1n(C06264i c06264i) {
        return A0A(c06264i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1o(C06264i c06264i) {
        return A0B(c06264i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final Parcelable A1p() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(linearLayoutManager$SavedState));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A2D();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState2.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState2.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState2.A01 = A0p(refChild);
            } else {
                View A0G2 = A0G();
                linearLayoutManager$SavedState2.A01 = A0p(A0G2);
                linearLayoutManager$SavedState2.A00 = this.A04.A0F(A0G2) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState2.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState2);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    @Nullable
    public final View A1q(int i10) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i10 - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View A0t = A0t(childCount);
            if (A0p(A0t) == i10) {
                return A0t;
            }
        }
        return super.A1q(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public View A1r(View view, int i10, C06194b c06194b, C06264i c06264i) {
        int maxScroll;
        View A0M;
        View nextCandidate;
        A0U();
        if (A0W() == 0 || (maxScroll = A2B(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        A2D();
        A2D();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, c06264i);
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A07 = Integer.MIN_VALUE;
        anonymousClass48.A0B = false;
        A08(c06194b, anonymousClass48, c06264i, true);
        if (maxScroll == -1) {
            A0M = A0N(c06194b, c06264i);
        } else {
            A0M = A0M(c06194b, c06264i);
        }
        if (maxScroll == -1) {
            nextCandidate = A0G();
        } else {
            nextCandidate = A0F();
        }
        boolean hasFocusable = nextCandidate.hasFocusable();
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "JGtMOr7ZHjmwUVfbInfaZmEhr0nxGN38";
        strArr[4] = "jCrgpf8bwQbyd1C9u6FfAt5OnK6gBhSa";
        if (hasFocusable) {
            if (A0M == null) {
                return null;
            }
            return nextCandidate;
        }
        return A0M;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public C4U A1s() {
        return new C4U(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public void A1t(int i10) {
        this.A01 = i10;
        this.A02 = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1u(int i10, int i11, C06264i c06264i, C4R c4r) {
        if (this.A00 != 0) {
            i10 = i11;
        }
        int delta = A0W();
        if (delta == 0 || i10 == 0) {
            return;
        }
        A2D();
        int i12 = i10 > 0 ? 1 : -1;
        int delta2 = Math.abs(i10);
        A0Y(i12, delta2, true, c06264i);
        A2I(c06264i, this.A07, c4r);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1v(int i10, C4R c4r) {
        boolean z10;
        int direction;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            z10 = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z10 = this.A05;
            int i11 = this.A01;
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0G[1] = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM";
            if (i11 == -1) {
                direction = z10 ? i10 - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.A06 && direction >= 0 && direction < i10; i13++) {
            c4r.A3G(direction, 0);
            direction += i12;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1w(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (A0G[1].charAt(30) == 'o') {
            A0G[1] = "tHEWx5U9TGfOm0s3U2zrO5nR7UMaVIoI";
            if (classLoader == null) {
                return;
            }
            if (A0G[5].length() == 31) {
                A0G[3] = "tm";
                Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
                if (state instanceof LinearLayoutManager$SavedState) {
                    this.A03 = (LinearLayoutManager$SavedState) state;
                    A0y();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1x(AccessibilityEvent accessibilityEvent) {
        super.A1x(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A28());
            int A29 = A29();
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[3] = "9E5bhv9RVKulu";
            accessibilityEvent.setToIndex(A29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if (r8 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r9.A02 == Integer.MIN_VALUE) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r1 = A1q(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r9.A05 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        r8 = r9.A04.A07() - r9.A04.A0C(r1);
        r5 = com.facebook.ads.redexgen.X.C1343Xk.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        if (r5[2].charAt(4) == r5[4].charAt(4)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        com.facebook.ads.redexgen.X.C1343Xk.A0G[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
        r8 = r8 - r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (r8 <= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        r6 = r6 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fa, code lost:
    
        r7 = r7 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01fd, code lost:
    
        r5 = com.facebook.ads.redexgen.X.C1343Xk.A0G;
        r5[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
        r5[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
        r8 = r8 - r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x020e, code lost:
    
        r8 = r9.A02 - (r9.A04.A0F(r1) - r9.A04.A0A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022c, code lost:
    
        if (r8 != (-1)) goto L33;
     */
    @Override // com.facebook.ads.redexgen.X.C4T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A1y(com.facebook.ads.redexgen.X.C06194b r10, com.facebook.ads.redexgen.X.C06264i r11) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1343Xk.A1y(com.facebook.ads.redexgen.X.4b, com.facebook.ads.redexgen.X.4i):void");
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public void A1z(C06264i c06264i) {
        super.A1z(c06264i);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A20(C0849Dw c0849Dw, C06194b c06194b) {
        super.A20(c0849Dw, c06194b);
        if (this.A09) {
            A1I(c06194b);
            c06194b.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public void A21(C0849Dw c0849Dw, C06264i c06264i, int i10) {
        C1342Xj linearSmoothScroller = new C1342Xj(c0849Dw.getContext());
        linearSmoothScroller.A0A(i10);
        A1L(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A22(String str) {
        if (this.A03 == null) {
            super.A22(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final boolean A23() {
        if (A0Y() != 1073741824 && A0i() != 1073741824) {
            boolean A1W = A1W();
            if (A0G[0].length() == 7) {
                throw new RuntimeException();
            }
            A0G[0] = "ZYU5Lu8KJdo1W8";
            if (A1W) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final boolean A24() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final boolean A25() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public boolean A26() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A27() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A28() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A29() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A2A() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A2B(int r8) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1343Xk.A2B(int):int");
    }

    public View A2C(C06194b c06194b, C06264i c06264i, int i10, int i11, int i12) {
        A2D();
        View view = null;
        View view2 = null;
        int A0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View outOfBoundsMatch = A0t(i10);
            int A0p = A0p(outOfBoundsMatch);
            if (A0p >= 0 && A0p < i12) {
                if (((C4U) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < A0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i10 += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2D() {
        if (this.A07 == null) {
            this.A07 = A0S();
        }
        if (this.A04 == null) {
            this.A04 = C4D.A02(this, this.A00);
        }
    }

    public final void A2E(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(A0T(0, 20, 1) + i10);
        }
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
        A22(null);
        if (i10 == this.A00) {
            return;
        }
        this.A00 = i10;
        this.A04 = null;
        A0y();
    }

    public final void A2F(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[3] = "tDl3kZGUKMTs";
    }

    public void A2G(C06194b c06194b, C06264i c06264i, AnonymousClass46 anonymousClass46, int i10) {
    }

    public void A2H(C06194b c06194b, C06264i c06264i, AnonymousClass48 anonymousClass48, AnonymousClass47 anonymousClass47) {
        int A0g;
        int left;
        int i10;
        int i11;
        View A03 = anonymousClass48.A03(c06194b);
        if (A03 == null) {
            anonymousClass47.A01 = true;
            return;
        }
        C4U c4u = (C4U) A03.getLayoutParams();
        if (anonymousClass48.A08 == null) {
            if (this.A05 == (anonymousClass48.A05 == -1)) {
                A17(A03);
            } else {
                A19(A03, 0);
            }
        } else {
            boolean z10 = this.A05;
            int top = anonymousClass48.A05;
            if (z10 == (top == -1)) {
                A16(A03);
            } else {
                A18(A03, 0);
            }
        }
        A1A(A03, 0, 0);
        anonymousClass47.A00 = this.A04.A0D(A03);
        if (this.A00 == 1) {
            if (A2J()) {
                i11 = A0h() - A0f();
                int right = this.A04.A0E(A03);
                i10 = i11 - right;
            } else {
                i10 = A0e();
                i11 = this.A04.A0E(A03) + i10;
            }
            int right2 = anonymousClass48.A05;
            if (right2 == -1) {
                left = anonymousClass48.A06;
                int i12 = anonymousClass48.A06;
                int right3 = anonymousClass47.A00;
                A0g = i12 - right3;
            } else {
                A0g = anonymousClass48.A06;
                left = anonymousClass48.A06 + anonymousClass47.A00;
            }
        } else {
            A0g = A0g();
            left = this.A04.A0E(A03) + A0g;
            int top2 = anonymousClass48.A05;
            if (top2 == -1) {
                i11 = anonymousClass48.A06;
                int i13 = anonymousClass48.A06;
                int top3 = anonymousClass47.A00;
                i10 = i13 - top3;
            } else {
                i10 = anonymousClass48.A06;
                int i14 = anonymousClass48.A06;
                int top4 = anonymousClass47.A00;
                i11 = i14 + top4;
            }
        }
        A1B(A03, i10, A0g, i11, left);
        if (c4u.A02() || c4u.A01()) {
            anonymousClass47.A03 = true;
        }
        anonymousClass47.A02 = A03.hasFocusable();
    }

    public void A2I(C06264i c06264i, AnonymousClass48 anonymousClass48, C4R c4r) {
        int i10 = anonymousClass48.A01;
        if (i10 >= 0) {
            int pos = c06264i.A03();
            if (i10 < pos) {
                int pos2 = anonymousClass48.A07;
                c4r.A3G(i10, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2J() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06234f
    public final PointF A45(int i10) {
        if (A0W() == 0) {
            return null;
        }
        int i11 = (i10 < A0p(A0t(0))) != this.A05 ? -1 : 1;
        int i12 = this.A00;
        int firstChildPos = A0G[0].length();
        if (firstChildPos == 7) {
            throw new RuntimeException();
        }
        A0G[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
        if (i12 == 0) {
            return new PointF(i11, gl.Code);
        }
        return new PointF(gl.Code, i11);
    }
}
