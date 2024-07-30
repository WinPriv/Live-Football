package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4T {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C06103r A01;

    @Nullable
    public AbstractC06244g A02;
    public C0849Dw A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC06324o A0G = new C1335Xc(this);
    public final InterfaceC06324o A0H = new C1334Xb(this);
    public C06344q A04 = new C06344q(this.A0G);
    public C06344q A05 = new C06344q(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, Ascii.RS, 48, -35, Ascii.SI, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, Ascii.RS, 48, -35, 45, Ascii.RS, 47, 34, 43, 49, -35, Ascii.US, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, Ascii.RS, -35, 47, 34, Ascii.RS, 41, -35, 32, 37, 38, 41, 33, -21, -35, Ascii.DC2, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, Ascii.SO, -70, 7, 9, Ascii.DLE, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, Ascii.FF, 9, 7, -70, 8, 9, 8, -57, -1, Ascii.DC2, 3, Ascii.CR, Ascii.SO, 3, 8, 1, -70, 3, 8, -2, -1, Ascii.DC2, -44, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, 9, Ascii.US, 37, -48, Ascii.GS, 37, 35, 36, -48, Ascii.US, 38, Ascii.NAK, 34, 34, Ascii.EM, Ascii.DC4, Ascii.NAK, -48, Ascii.US, Ascii.RS, -4, 17, 41, Ascii.US, 37, 36, -13, Ascii.CAN, Ascii.EM, Ascii.FS, Ascii.DC4, 34, Ascii.NAK, Ascii.RS, -40, 2, Ascii.NAK, 19, 41, 19, Ascii.FS, Ascii.NAK, 34, -48, 34, Ascii.NAK, 19, 41, 19, Ascii.FS, Ascii.NAK, 34, -36, -48, 3, 36, 17, 36, Ascii.NAK, -48, 35, 36, 17, 36, Ascii.NAK, -39, -48, -78, -56, -50, 121, -58, -50, -52, -51, 121, -56, -49, -66, -53, -53, -62, -67, -66, 121, -52, -58, -56, -56, -51, -63, -84, -68, -53, -56, -59, -59, -83, -56, -87, -56, -52, -62, -51, -62, -56, -57, 121, -51, -56, 121, -52, -50, -55, -55, -56, -53, -51, 121, -52, -58, -56, -56, -51, -63, 121, -52, -68, -53, -56, -59, -59, -62, -57, -64};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract C4U A1s();

    static {
        A08();
    }

    public static int A00(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int mode2 = Math.max(i11, i12);
            return Math.min(size, mode2);
        }
        if (mode != 1073741824) {
            int mode3 = Math.max(i11, i12);
            return mode3;
        }
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r7 != 1073741824) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            int r6 = r6 - r8
            r0 = 0
            int r6 = java.lang.Math.max(r0, r6)
            r3 = 0
            r2 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2
            r0 = -1
            if (r10 == 0) goto L2b
            if (r9 < 0) goto L5b
            r3 = r9
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L87
        L25:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            if (r9 < 0) goto L31
            r3 = r9
            r2 = 1073741824(0x40000000, float:2.0)
            goto L90
        L31:
            if (r9 != r0) goto L36
            r3 = r6
            r2 = r7
            goto L90
        L36:
            if (r9 != r1) goto L90
            r3 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 0
            r1 = r1[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L25
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "mbdH64CAyADsqDHKi"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "uvhJn14mL"
            r0 = 4
            r2[r0] = r1
            if (r7 == r4) goto L58
            if (r7 != r5) goto L85
        L58:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L90
        L5b:
            if (r9 != r0) goto L6a
            if (r7 == r4) goto L67
            if (r7 == 0) goto L64
            if (r7 == r5) goto L67
            goto L90
        L64:
            r3 = 0
            r2 = 0
            goto L90
        L67:
            r3 = r6
            r2 = r7
            goto L90
        L6a:
            if (r9 != r1) goto L90
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L83
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "MUtJOOU4WeR0TtYG1JH"
            r0 = 7
            r2[r0] = r1
            r2 = 0
            goto L90
        L83:
            r2 = 0
            goto L90
        L85:
            r2 = 0
            goto L90
        L87:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "ru0BYCJI67FO4KgBABZqajada"
            r0 = 6
            r2[r0] = r1
            r2 = 1073741824(0x40000000, float:2.0)
        L90:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4T.A01(int, int, int, int, boolean):int");
    }

    private final int A02(View view) {
        return ((C4U) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C4U) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C4U) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C4U) view.getLayoutParams()).A03.top;
    }

    private final int A06(C06194b c06194b, C06264i c06264i) {
        return 0;
    }

    private final void A09(int i10) {
        A0C(i10, A0t(i10));
    }

    private final void A0A(int i10) {
        View child = A0t(i10);
        if (child != null) {
            this.A01.A0D(i10);
        }
    }

    private final void A0B(int i10, int i11) {
        View view = A0t(i10);
        if (view != null) {
            A09(i10);
            A0E(view, i11);
        } else {
            throw new IllegalArgumentException(A07(85, 44, 79) + i10 + this.A03.toString());
        }
    }

    private void A0C(int i10, View view) {
        this.A01.A0C(i10);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i10) {
        A0F(view, i10, (C4U) view.getLayoutParams());
    }

    private final void A0F(View view, int i10, C4U c4u) {
        AbstractC06294l A0G = C0849Dw.A0G(view);
        if (A0G.A0c()) {
            this.A03.A0t.A09(A0G);
        } else {
            C06374t c06374t = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c06374t.A0A(A0G);
        }
        this.A01.A0H(view, i10, c4u, A0G.A0c());
    }

    private void A0G(View view, int i10, boolean z10) {
        AbstractC06294l A0G = C0849Dw.A0G(view);
        if (z10 || A0G.A0c()) {
            this.A03.A0t.A09(A0G);
        } else {
            this.A03.A0t.A0A(A0G);
        }
        C4U c4u = (C4U) view.getLayoutParams();
        if (A0G.A0i() || A0G.A0d()) {
            if (A0G.A0d()) {
                A0G.A0S();
            } else {
                A0G.A0O();
            }
            this.A01.A0H(view, i10, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C0849Dw c0849Dw = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == c0849Dw) {
                int A07 = this.A01.A07(view);
                if (i10 == -1) {
                    i10 = this.A01.A05();
                }
                if (A07 != -1) {
                    if (A07 != i10) {
                        this.A03.A06.A0B(A07, i10);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1I());
                }
            } else {
                this.A01.A0I(view, i10, false);
                c4u.A01 = true;
                AbstractC06244g abstractC06244g = this.A02;
                if (abstractC06244g != null && abstractC06244g.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c4u.A02) {
            A0G.A0H.invalidate();
            c4u.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        C0849Dw.A0p(view, rect);
    }

    private void A0J(C06194b c06194b, int i10, View view) {
        AbstractC06294l A0G = C0849Dw.A0G(view);
        if (A0G.A0h()) {
            return;
        }
        if (A0G.A0b() && !A0G.A0c() && !this.A03.A04.A0B()) {
            A0A(i10);
            c06194b.A0b(A0G);
        } else {
            A09(i10);
            c06194b.A0W(view);
            this.A03.A0t.A0C(A0G);
        }
    }

    private final void A0K(C06194b c06194b, C06264i c06264i, AccessibilityEvent accessibilityEvent) {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!c0849Dw.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0D());
    }

    private final void A0L(C06194b c06194b, C06264i c06264i, C3X c3x) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c3x.A0N(8192);
            c3x.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c3x.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c3x.A0R(true);
        }
        C3U collectionInfo = C3U.A00(A0r(c06194b, c06264i), A0q(c06194b, c06264i), A0P(c06194b, c06264i), A06(c06194b, c06264i));
        c3x.A0P(collectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AbstractC06244g abstractC06244g) {
        if (this.A02 == abstractC06244g) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AbstractC06244g abstractC06244g = this.A02;
        return abstractC06244g != null && abstractC06244g.A0F();
    }

    public static boolean A0O(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    private final boolean A0P(C06194b c06194b, C06264i c06264i) {
        return false;
    }

    private final boolean A0Q(C06194b c06194b, C06264i c06264i, int i10, Bundle bundle) {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw == null) {
            return false;
        }
        int i11 = 0;
        int i12 = 0;
        if (i10 == 4096) {
            if (c0849Dw.canScrollVertically(1)) {
                i11 = (A0X() - A0g()) - A0d();
            }
            if (this.A03.canScrollHorizontally(1)) {
                int A0h = A0h();
                int hScroll = A0e();
                if (A0J[7].length() == 8) {
                    throw new RuntimeException();
                }
                A0J[7] = "6TTpYbQ6a4";
                i12 = (A0h - hScroll) - A0f();
            }
        } else if (i10 == 8192) {
            if (c0849Dw.canScrollVertically(-1)) {
                i11 = -((A0X() - A0g()) - A0d());
            }
            if (this.A03.canScrollHorizontally(-1)) {
                i12 = -((A0h() - A0e()) - A0f());
            }
        }
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        this.A03.scrollBy(i12, i11);
        return true;
    }

    private final boolean A0R(C06194b c06194b, C06264i c06264i, View view, int i10, Bundle bundle) {
        return false;
    }

    private boolean A0S(C0849Dw c0849Dw, int i10, int i11) {
        View focusedChild = c0849Dw.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i10 >= parentTop2 || rect.right - i10 <= parentBottom || rect.top - i11 >= parentLeft2 || rect.bottom - i11 <= parentRight) {
            return false;
        }
        if (A0J[3].length() == 28) {
            throw new RuntimeException();
        }
        A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        return true;
    }

    @Deprecated
    private final boolean A0T(C0849Dw c0849Dw, View view, View view2) {
        return A0N() || c0849Dw.A1u();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childTop = rect.width() + childBottom;
        int parentLeft = rect.height();
        int childLeft = Math.min(0, childBottom - offScreenRight);
        int parentBottom = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childTop - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(childLeft, childTop - dy);
            }
        } else {
            parentTop = childLeft != 0 ? childLeft : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentBottom == 0) {
            parentBottom = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentBottom;
        if (A0J[0].charAt(31) == 'p') {
            throw new RuntimeException();
        }
        A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C06103r c06103r = this.A01;
        if (c06103r != null) {
            return c06103r.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        C0849Dw c0849Dw = this.A03;
        C4H a10 = c0849Dw != null ? c0849Dw.getAdapter() : null;
        if (a10 != null) {
            return a10.A0D();
        }
        return 0;
    }

    public final int A0a() {
        return AnonymousClass38.A01(this.A03);
    }

    public final int A0b() {
        return AnonymousClass38.A02(this.A03);
    }

    public final int A0c() {
        return AnonymousClass38.A03(this.A03);
    }

    public final int A0d() {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            return c0849Dw.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            return c0849Dw.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            return c0849Dw.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            return c0849Dw.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C4U) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C4U) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C4U) view.getLayoutParams()).A00();
    }

    public int A0q(C06194b c06194b, C06264i c06264i) {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw == null || c0849Dw.A04 == null || !A24()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    public int A0r(C06194b c06194b, C06264i c06264i) {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw == null || c0849Dw.A04 == null || !A25()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A0s() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Dw r0 = r6.A03
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            android.view.View r3 = r0.getFocusedChild()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L4c
            com.facebook.ads.redexgen.X.3r r4 = r6.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
        L4c:
            return r5
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
            goto L4c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4T.A0s():android.view.View");
    }

    public final View A0t(int i10) {
        C06103r c06103r = this.A01;
        if (c06103r != null) {
            return c06103r.A09(i10);
        }
        return null;
    }

    public final View A0u(View view, int i10) {
        return null;
    }

    public C4U A0v(Context context, AttributeSet attributeSet) {
        return new C4U(context, attributeSet);
    }

    public C4U A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C4U) {
            return new C4U((C4U) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4U((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4U(layoutParams);
    }

    public final void A0x() {
        AbstractC06244g abstractC06244g = this.A02;
        if (abstractC06244g != null) {
            abstractC06244g.A09();
        }
    }

    public final void A0y() {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            c0849Dw.requestLayout();
        }
    }

    public final void A0z(int i10) {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            c0849Dw.A1T(i10);
        }
    }

    public final void A10(int i10) {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            c0849Dw.A1U(i10);
        }
    }

    public final void A11(int i10, int i11) {
        this.A0C = View.MeasureSpec.getSize(i10);
        this.A0D = View.MeasureSpec.getMode(i10);
        if (this.A0D == 0 && !C0849Dw.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i11);
        this.A0B = View.MeasureSpec.getMode(i11);
        if (this.A0B == 0 && !C0849Dw.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i10, int i11) {
        int A0W = A0W();
        if (A0W == 0) {
            this.A03.A1a(i10, i11);
            return;
        }
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i14 = 0; i14 < A0W; i14++) {
            View A0t = A0t(i14);
            Rect rect = this.A03.A0p;
            A0H(A0t, rect);
            int count = rect.left;
            if (count < i12) {
                i12 = rect.left;
            }
            int count2 = rect.right;
            if (count2 > maxY) {
                maxY = rect.right;
            }
            int count3 = rect.top;
            if (count3 < i13) {
                i13 = rect.top;
            }
            int count4 = rect.bottom;
            if (count4 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i12, i13, maxY, maxX);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int minX = str.length();
        int count5 = str2.length();
        if (minX == count5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, i10, i11);
    }

    public final void A13(int i10, int i11) {
        this.A03.setMeasuredDimension(i10, i11);
    }

    public final void A14(int i10, C06194b c06194b) {
        View view = A0t(i10);
        A0A(i10);
        c06194b.A0X(view);
    }

    public void A15(Rect rect, int i10, int i11) {
        int usedHeight = rect.width() + A0e() + A0f();
        int height = rect.height();
        int usedWidth = A0g();
        int i12 = height + usedWidth;
        int usedWidth2 = A0d();
        int width = i12 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i10, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i11, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i10) {
        A0G(view, i10, true);
    }

    public final void A19(View view, int i10) {
        A0G(view, i10, false);
    }

    public final void A1A(View view, int i10, int i11) {
        C4U c4u = (C4U) view.getLayoutParams();
        Rect A1E = this.A03.A1E(view);
        int i12 = i10 + A1E.left + A1E.right;
        int i13 = i11 + A1E.top + A1E.bottom;
        int A01 = A01(A0h(), A0i(), A0e() + A0f() + c4u.leftMargin + c4u.rightMargin + i12, c4u.width, A24());
        int A0X = A0X();
        int A0Y = A0Y();
        int widthSpec = A0g();
        int A012 = A01(A0X, A0Y, widthSpec + A0d() + c4u.topMargin + c4u.bottomMargin + i13, c4u.height, A25());
        if (A1a(view, A01, A012, c4u)) {
            view.measure(A01, A012);
        }
    }

    public final void A1B(View view, int i10, int i11, int i12, int i13) {
        C4U c4u = (C4U) view.getLayoutParams();
        Rect rect = c4u.A03;
        view.layout(rect.left + i10 + c4u.leftMargin, rect.top + i11 + c4u.topMargin, (i12 - rect.right) - c4u.rightMargin, (i13 - rect.bottom) - c4u.bottomMargin);
    }

    public final void A1C(View view, C3X c3x) {
        AbstractC06294l A0G = C0849Dw.A0G(view);
        if (A0G != null && !A0G.A0c() && !this.A01.A0K(A0G.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c3x);
        }
    }

    public final void A1D(View view, C06194b c06194b) {
        A0D(view);
        c06194b.A0X(view);
    }

    public final void A1E(View view, boolean z10, Rect rect) {
        Matrix matrix;
        if (z10) {
            Rect rect2 = ((C4U) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int floor = (int) Math.floor(rectF.left);
            int floor2 = (int) Math.floor(rectF.top);
            float f = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(floor, floor2, (int) Math.ceil(f), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C3X c3x) {
        A0L(this.A03.A0r, this.A03.A0s, c3x);
    }

    public final void A1G(C06194b c06194b) {
        int A0E = c06194b.A0E();
        for (int i10 = A0E - 1; i10 >= 0; i10--) {
            View A0F = c06194b.A0F(i10);
            AbstractC06294l A0G = C0849Dw.A0G(A0F);
            if (!A0G.A0h()) {
                A0G.A0Z(false);
                if (A0G.A0e()) {
                    this.A03.removeDetachedView(A0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(A0G);
                }
                A0G.A0Z(true);
                c06194b.A0V(A0F);
            }
        }
        c06194b.A0L();
        if (A0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C06194b c06194b) {
        int childCount = A0W();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            A0J(c06194b, i10, A0t(i10));
        }
    }

    public final void A1I(C06194b c06194b) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            if (!C0849Dw.A0G(A0t(A0W)).A0h()) {
                A14(A0W, c06194b);
            }
        }
    }

    public void A1J(C06194b c06194b, C06264i c06264i, int i10, int i11) {
        this.A03.A1a(i10, i11);
    }

    public void A1K(C06194b c06194b, C06264i c06264i, View view, C3X c3x) {
        int A0p = A25() ? A0p(view) : 0;
        int A0p2 = A24() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        C3V itemInfo = C3V.A00(A0p, 1, A0p2, 1, false, false);
        c3x.A0Q(itemInfo);
    }

    public final void A1L(AbstractC06244g abstractC06244g) {
        AbstractC06244g abstractC06244g2 = this.A02;
        if (abstractC06244g2 != null && abstractC06244g != abstractC06244g2 && abstractC06244g2.A0F()) {
            this.A02.A09();
        }
        this.A02 = abstractC06244g;
        this.A02.A0D(this.A03, this);
    }

    public void A1M(C0849Dw c0849Dw) {
    }

    public final void A1N(C0849Dw c0849Dw) {
        this.A07 = true;
    }

    public final void A1O(C0849Dw c0849Dw) {
        A11(View.MeasureSpec.makeMeasureSpec(c0849Dw.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0849Dw.getHeight(), 1073741824));
    }

    public final void A1P(C0849Dw c0849Dw) {
        if (c0849Dw == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = c0849Dw;
            this.A01 = c0849Dw.A01;
            this.A0C = c0849Dw.getWidth();
            this.A0A = c0849Dw.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public void A1Q(C0849Dw c0849Dw, int i10, int i11) {
    }

    public void A1R(C0849Dw c0849Dw, int i10, int i11) {
    }

    public void A1S(C0849Dw c0849Dw, int i10, int i11, int i12) {
    }

    public void A1T(C0849Dw c0849Dw, int i10, int i11, Object obj) {
    }

    public final void A1U(C0849Dw c0849Dw, C06194b c06194b) {
        this.A07 = false;
        A20(c0849Dw, c06194b);
    }

    public final void A1V(boolean z10) {
        this.A06 = z10;
    }

    public final boolean A1W() {
        int A0W = A0W();
        for (int i10 = 0; i10 < A0W; i10++) {
            ViewGroup.LayoutParams layoutParams = A0t(i10).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1X() {
        C0849Dw c0849Dw = this.A03;
        return c0849Dw != null && c0849Dw.A0B;
    }

    public final boolean A1Y() {
        return this.A0E;
    }

    public final boolean A1Z(int i10, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i10, bundle);
    }

    public final boolean A1a(View view, int i10, int i11, C4U c4u) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i10, c4u.width) && A0O(view.getHeight(), i11, c4u.height)) ? false : true;
    }

    public final boolean A1b(View view, int i10, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i10, bundle);
    }

    public boolean A1c(C4U c4u) {
        return c4u != null;
    }

    public final boolean A1d(C0849Dw c0849Dw, View view, Rect rect, boolean z10) {
        return A1e(c0849Dw, view, rect, z10, false);
    }

    public final boolean A1e(C0849Dw c0849Dw, View view, Rect rect, boolean z10, boolean z11) {
        int[] scrollAmount = A0U(view, rect);
        int i10 = scrollAmount[0];
        int i11 = scrollAmount[1];
        if ((z11 && !A0S(c0849Dw, i10, i11)) || (i10 == 0 && i11 == 0)) {
            return false;
        }
        if (z10) {
            c0849Dw.scrollBy(i10, i11);
        } else {
            c0849Dw.A1e(i10, i11);
        }
        return true;
    }

    public final boolean A1f(C0849Dw c0849Dw, C06264i c06264i, View view, View view2) {
        return A0T(c0849Dw, view, view2);
    }

    public final boolean A1g(C0849Dw c0849Dw, ArrayList<View> views, int i10, int i11) {
        return false;
    }

    public int A1h(int i10, C06194b c06194b, C06264i c06264i) {
        return 0;
    }

    public int A1i(int i10, C06194b c06194b, C06264i c06264i) {
        return 0;
    }

    public int A1j(C06264i c06264i) {
        return 0;
    }

    public int A1k(C06264i c06264i) {
        return 0;
    }

    public int A1l(C06264i c06264i) {
        return 0;
    }

    public int A1m(C06264i c06264i) {
        return 0;
    }

    public int A1n(C06264i c06264i) {
        return 0;
    }

    public int A1o(C06264i c06264i) {
        return 0;
    }

    public Parcelable A1p() {
        return null;
    }

    @Nullable
    public View A1q(int i10) {
        int A0W = A0W();
        for (int i11 = 0; i11 < A0W; i11++) {
            View child = A0t(i11);
            AbstractC06294l A0G = C0849Dw.A0G(child);
            if (A0G != null) {
                int childCount = A0G.A0I();
                if (childCount == i10 && !A0G.A0h() && (this.A03.A0s.A07() || !A0G.A0c())) {
                    return child;
                }
            }
        }
        return null;
    }

    @Nullable
    public View A1r(View view, int i10, C06194b c06194b, C06264i c06264i) {
        return null;
    }

    public void A1t(int i10) {
    }

    public void A1u(int i10, int i11, C06264i c06264i, C4R c4r) {
    }

    public void A1v(int i10, C4R c4r) {
    }

    public void A1w(Parcelable parcelable) {
    }

    public void A1x(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1y(C06194b c06194b, C06264i c06264i) {
        Log.e(A07(a.T, 12, 19), A07(141, 67, 101));
    }

    public void A1z(C06264i c06264i) {
    }

    @CallSuper
    public void A20(C0849Dw c0849Dw, C06194b c06194b) {
    }

    public void A21(C0849Dw c0849Dw, C06264i c06264i, int i10) {
        Log.e(A07(a.T, 12, 19), A07(208, 68, 14));
    }

    public void A22(String str) {
        C0849Dw c0849Dw = this.A03;
        if (c0849Dw != null) {
            c0849Dw.A1p(str);
        }
    }

    public boolean A23() {
        return false;
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }
}
