package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.79, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass79 extends SH implements OR {
    public static byte[] A0N;
    public static String[] A0O = {"jpfQHsJU1lQWxp7CXlwdVdxcmzkEjD3g", "zEjz0M8mBGIlVid6uM60nN2wm9TWrUGD", "N1PpSZkKdQQSk7AxXPBdtL04F7CB9SRH", "NsCDsqdLjA318x1fHEY8u0Kcg9miAoAi", "WmIcjMDFfLwNDk", "", "Zb94j8IQkKLdVAKFmXIR3eGQpuAhW41l", "pxOHyfKHQ8aixQeNEjeruqZzDXsiYM9P"};
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public int A00;
    public int A01;
    public int A02;

    @Nullable
    public RelativeLayout A03;
    public C1375Ys A04;
    public C6G A05;

    @Nullable
    public C2M A06;

    @Nullable
    public N5 A07;

    @Nullable
    public NH A08;

    @Nullable
    public C1176Qv A09;

    @Nullable
    @DoNotStrip
    public AbstractC1136Ph A0A;
    public C1137Pi A0B;

    @Nullable
    public String A0C;
    public List<OM> A0D;
    public final int A0E;
    public final C1K A0F;
    public final C1316Wj A0G;
    public final L6 A0H;
    public final InterfaceC1029Lc A0I;
    public final NV A0J;
    public final OS A0K;
    public final OS A0L;
    public final IX A0M;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 14;
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0A() {
        int min;
        int i10;
        int i11;
        int i12 = getResources().getConfiguration().orientation;
        int i13 = Kd.A03.widthPixels;
        int i14 = Kd.A03.heightPixels;
        if (i12 == 1) {
            min = Math.min(i13 - (A0Q * 4), i14 / 2);
            i10 = (i13 - min) / 8;
            i11 = i10 * 4;
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
        } else {
            min = Math.min(i14, i13);
            i10 = (i13 - min) / 2;
            i11 = i10;
            A08();
        }
        C2M c2m = this.A06;
        if (c2m == null) {
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
            return;
        }
        C1175Qu fullscreenCarouselRecyclerViewAdapter = c2m.getFullscreenCarouselRecyclerViewAdapter();
        if (fullscreenCarouselRecyclerViewAdapter != null) {
            fullscreenCarouselRecyclerViewAdapter.A0F(min, i10, i11);
            fullscreenCarouselRecyclerViewAdapter.A07();
        }
    }

    public static void A0B() {
        byte[] bArr = {94, -117, -117, -120, -117, 57, 124, -117, 126, 122, -115, -126, -121, Byte.MIN_VALUE, 57, 124, 122, -117, -120, -114, -116, 126, -123, 57, -113, -126, 126, -112, 89, -122, -122, -125, -122, 52, -117, 124, 125, Byte.MIN_VALUE, 121, 52, 119, 117, -122, -125, -119, -121, 121, Byte.MIN_VALUE, 52, 119, 117, -122, 120, 52, 119, 124, 117, -126, 123, 121, 66, 91, 87, 86, -118, 121, 126, 122, -125, 120, 122, 99, 122, -119, -116, -124, -121, Byte.MIN_VALUE, -97, -94, -99, -94, -97, -78, -97, -99, -96, -77, -84, -94, -86, -93, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -17, -16, -27, -16, -27, -35, -24, -86, -33, -24, -27, -33, -25, -31, -32};
        if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0O[0] = "0pXVmbGKHAzIVbBBK7Eyv6Mrdc2f0VIY";
        A0N = bArr;
    }

    static {
        A0B();
        A0Q = (int) (Kd.A02 * 8.0f);
        A0R = (int) (Kd.A02 * 8.0f);
        A0S = (int) (Kd.A02 * 12.0f);
        A0P = (int) (Kd.A02 * 42.0f);
    }

    public AnonymousClass79(C1316Wj c1316Wj, IT it, C6G c6g, InterfaceC1029Lc interfaceC1029Lc, C1375Ys c1375Ys) {
        super(c1316Wj, it, interfaceC1029Lc, c1375Ys);
        this.A0H = new L6();
        this.A00 = -1;
        this.A05 = c6g;
        this.A0G = c1316Wj;
        this.A0I = interfaceC1029Lc;
        this.A0E = super.A08.A0c().size();
        this.A0M = new IX(this.A0G);
        this.A0L = new OS(this.A0G, OQ.A04, this);
        this.A0K = new OS(this.A0G, OQ.A03, this);
        this.A0J = new NU(this.A0G, it, getAudienceNetworkListener(), this.A04, null, this.A0B, this.A0H).A0J();
        this.A0F = c1375Ys.A0N().A01();
        if (ID.A1Z(this.A0G)) {
            super.A0C.setProgressSpinnerInvisible(true);
        }
    }

    private void A08() {
        if (this.A00 > 0) {
            this.A0K.setVisibility(0);
        } else {
            this.A0K.setVisibility(8);
        }
        if (this.A00 != this.A0E - 1) {
            OS os = this.A0L;
            String[] strArr = A0O;
            if (strArr[7].charAt(14) == strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            A0O[0] = "6a52QfyEa3IWfhbHGHqjZ8J10HxaoQoC";
            os.setVisibility(0);
            return;
        }
        this.A0L.setVisibility(8);
    }

    private void A09() {
        if (this.A08 != null && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams.addRule(3, this.A06.getId());
                layoutParams.setMargins(0, A0Q, 0, 0);
            } else {
                layoutParams.addRule(12);
                layoutParams.setMargins(0, 0, 0, A0Q);
            }
            layoutParams.addRule(14);
            this.A08.setLayoutParams(layoutParams);
        }
    }

    private final void A0C() {
        C2M c2m = this.A06;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A06 = null;
        }
        NH nh = this.A08;
        if (nh != null) {
            nh.removeAllViews();
            this.A08 = null;
        }
        RelativeLayout relativeLayout = this.A03;
        if (A0O[5].length() != 0) {
            throw new RuntimeException();
        }
        A0O[5] = "";
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    private final void A0D(int i10, @Nullable Bundle bundle) {
        boolean z10 = i10 == 1;
        this.A03 = new RelativeLayout(getContext());
        this.A07 = new C1189Ri(this.A0G, 0, this.A0D.get(0).A03().A0E().A00() == C1G.A05, this.A0F, super.A08.A0O().A0F().A06(), A06(92, 37, 110), getAdEventManager(), this.A0I, this.A0B, this.A0H);
        this.A07.A0A(z10 ? 1 : 0);
        this.A03.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A0A = new C1174Qt(this);
        this.A0B = new C1137Pi(this, 1, new WeakReference(this.A0A), this.A0G);
        this.A0B.A0W(this.A01);
        this.A0B.A0X(this.A02);
        this.A06 = new C2M(this.A0G);
        LE.A0K(this.A06);
        RelativeLayout.LayoutParams adDetailsLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        adDetailsLayoutParams.addRule(13);
        this.A09 = new C1176Qv(this.A06, i10, this.A0D, this.A0B, bundle);
        if (this.A0C != null) {
            this.A06.setAdapter(new C1175Qu(this.A0G, this.A0D, this.A04, super.A0A, this.A05, this.A0B, this.A0H, getAudienceNetworkListener(), this.A0C, this.A09, this.A0M));
            A0A();
        } else {
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
        }
        A0F(this.A09);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (ID.A1K(this.A0G)) {
            InterfaceC0958If A09 = this.A0G.A09();
            C2M c2m = this.A06;
            String A0U = super.A08.A0U();
            if (A0O[4].length() == 17) {
                throw new RuntimeException();
            }
            A0O[5] = "";
            A09.AFD(c2m, A0U, false);
        }
        this.A03.addView(this.A06, adDetailsLayoutParams);
        A09();
        this.A03.addView(this.A08);
        this.A07.setTitleMaxLines(3);
        this.A07.A09();
        this.A07.A08();
        this.A03.addView(this.A07, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        int i11 = A0P;
        layoutParams2.width = i11;
        layoutParams2.height = i11;
        layoutParams2.setMargins(A0Q, 0, 0, 0);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        int i12 = A0P;
        layoutParams3.width = i12;
        layoutParams3.height = i12;
        layoutParams3.setMargins(0, 0, A0Q, 0);
        this.A03.addView(this.A0K, layoutParams2);
        this.A03.addView(this.A0L, layoutParams3);
        RelativeLayout.LayoutParams rightArrowLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        rightArrowLayoutParams.addRule(12);
        this.A03.addView(this.A0M, rightArrowLayoutParams);
        A0U(this.A03, true, i10);
        removeView(findViewById(NP.A00));
        if (ID.A23(this.A0G)) {
            LE.A0M(this, -1);
        } else {
            NP.A00(this.A0J.A05(), this, this.A04.A0O().A0D().A07());
        }
        if (this.A0C != null) {
            this.A07.setInfo(this.A04.A0O().A0E(), this.A04.A0O().A0F(), this.A0C, super.A08.A0R().A01(), null);
        }
    }

    private void A0E(C1375Ys c1375Ys) {
        this.A04 = c1375Ys;
        this.A0C = this.A04.A0U();
        this.A01 = this.A04.A0H();
        this.A02 = this.A04.A0I();
        List<C1B> A0c = this.A04.A0c();
        List<AdInfo> adInfoList = new ArrayList<>(A0c.size());
        this.A0D = adInfoList;
        for (int i10 = 0; i10 < A0c.size(); i10++) {
            C1B c1b = A0c.get(i10);
            List<OM> list = this.A0D;
            int i11 = A0c.size();
            list.add(new OM(i10, i11, c1b));
        }
    }

    private void A0F(C1176Qv c1176Qv) {
        new C0850Dx().A0G(this.A06);
        c1176Qv.A0Z(new C1173Qs(this));
        this.A08 = new NH(this.A0G, super.A05.A01(), this.A0D.size());
        LE.A0K(this.A08);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0R);
        layoutParams.setMargins(0, A0S, 0, 0);
        this.A08.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void A8k(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        C1375Ys dataBundle = (C1375Ys) intent.getSerializableExtra(A06(78, 14, 48));
        A0V(anonymousClass59);
        if (dataBundle != null) {
            A0E(dataBundle);
        }
        A0D(anonymousClass59.A0H().getResources().getConfiguration().orientation, bundle);
        anonymousClass59.A0K(new C1172Qr(this, anonymousClass59));
        int A03 = super.A08.A0O().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void ABd(boolean z10) {
        super.ABd(z10);
        C1176Qv c1176Qv = this.A09;
        if (c1176Qv != null) {
            c1176Qv.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AC2(boolean z10) {
        super.AC2(z10);
        C1176Qv c1176Qv = this.A09;
        if (c1176Qv != null) {
            c1176Qv.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.OR
    public final void ACN(OQ oq) {
        int i10;
        C2M c2m = this.A06;
        if (c2m != null) {
            C1343Xk layoutManager = c2m.getLayoutManager();
            if (oq == OQ.A03) {
                int i11 = this.A00;
                i10 = i11 <= 0 ? 0 : i11 - 1;
                layoutManager.A21(this.A06, new C06264i(), i10);
            } else {
                int i12 = this.A00;
                int i13 = this.A0E;
                i10 = i12 >= i13 + (-1) ? i13 - 1 : i12 + 1;
                layoutManager.A21(this.A06, new C06264i(), i10);
            }
            setUpLayoutForCardAtIndex(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AEA(Bundle bundle) {
        C1176Qv c1176Qv = this.A09;
        if (c1176Qv != null) {
            c1176Qv.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle savedInstanceState = new Bundle();
        AEA(savedInstanceState);
        super.onConfigurationChanged(configuration);
        A0A();
        C2M c2m = this.A06;
        if (c2m != null && this.A09 != null) {
            c2m.getLayoutManager().A1t(Math.max(this.A00, 0));
            this.A09.A0U(Math.max(this.A00, 0));
        }
        A09();
        N5 n52 = this.A07;
        if (n52 != null) {
            n52.A0A(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void onDestroy() {
        super.onDestroy();
        if (ID.A1K(this.A0G)) {
            InterfaceC0958If A09 = this.A0G.A09();
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[4] = "nCvA44nJ0TVVJ";
            A09.AF4(this.A06);
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            super.A0A.A8r(this.A0C, new N2().A03(this.A0B).A02(this.A0H).A05());
        }
        A0C();
        this.A0B.A0V();
        this.A0B = null;
        this.A0A = null;
        this.A0D = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0H.A06(this.A0G, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUpLayoutForCardAtIndex(int r12) {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.NH r0 = r11.A08
            if (r0 == 0) goto L7
            r0.A00(r12)
        L7:
            com.facebook.ads.redexgen.X.Ys r0 = r11.A04
            com.facebook.ads.redexgen.X.1B r4 = r0.A0P(r12)
            if (r4 == 0) goto L81
            int r0 = r11.A00
            if (r0 == r12) goto L81
            r11.A00 = r12
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L25
            r11.A08()
        L25:
            int r0 = com.facebook.ads.redexgen.X.NP.A00
            android.view.View r0 = r11.findViewById(r0)
            r11.removeView(r0)
            com.facebook.ads.redexgen.X.Wj r0 = r11.A0G
            boolean r0 = com.facebook.ads.redexgen.X.ID.A23(r0)
            if (r0 == 0) goto La3
            r0 = -1
            com.facebook.ads.redexgen.X.LE.A0M(r11, r0)
        L3a:
            java.lang.String r0 = r11.A0C
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.N5 r5 = r11.A07
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass79.A0O
            r0 = 0
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto Lb5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass79.A0O
            java.lang.String r1 = "kFih28rpO37RepskuaJrvvoNb65qRIkh"
            r0 = 6
            r2[r0] = r1
            if (r5 != 0) goto L8a
        L58:
            r2 = 61
            r1 = 17
            r0 = 7
            java.lang.String r3 = A06(r2, r1, r0)
            r2 = 28
            r1 = 33
            r0 = 6
            java.lang.String r0 = A06(r2, r1, r0)
            android.util.Log.e(r3, r0)
        L6d:
            com.facebook.ads.redexgen.X.1E r0 = r4.A0D()
            java.lang.String r0 = r0.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.IX r1 = r11.A0M
            r0 = 0
            r1.setVisibility(r0)
        L81:
            return
        L82:
            com.facebook.ads.redexgen.X.IX r1 = r11.A0M
            r0 = 8
            r1.setVisibility(r0)
            goto L81
        L8a:
            com.facebook.ads.redexgen.X.1I r6 = r4.A0E()
            com.facebook.ads.redexgen.X.1L r7 = r4.A0F()
            java.lang.String r8 = r11.A0C
            com.facebook.ads.redexgen.X.Ys r0 = r11.A08
            com.facebook.ads.redexgen.X.1U r0 = r0.A0R()
            java.lang.String r9 = r0.A01()
            r10 = 0
            r5.setInfo(r6, r7, r8, r9, r10)
            goto L6d
        La3:
            com.facebook.ads.redexgen.X.NV r0 = r11.A0J
            com.facebook.ads.redexgen.X.Wj r1 = r0.A05()
            com.facebook.ads.redexgen.X.1E r0 = r4.A0D()
            java.lang.String r0 = r0.A07()
            com.facebook.ads.redexgen.X.NP.A00(r1, r11, r0)
            goto L3a
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass79.setUpLayoutForCardAtIndex(int):void");
    }
}
