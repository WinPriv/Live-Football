package com.facebook.ads.redexgen.X;

import android.R;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

@TargetApi(19)
/* loaded from: assets/audience_network.dex */
public final class SO implements InterfaceC1030Ld {
    public static byte[] A0C;
    public static String[] A0D = {"VjNTozFJBHBTAbZvfj55MfAwGP9LBSf6", "Pq0aBOwFzXTv3d8c4kUbGJ29Dl7JaeBe", "6Jh9GB1FdSmhvo4jirjJmKwQUVM2B32M", "TGGBgusTs1FvyAgmLwAY3Gsc6eBuJSRW", "x90wDNv6CtBtNBa5WCDyDNAaFj8t5cCY", "GDNjvFSJPJLifqCEdIwxfegvvEeKItWd", "ZGbO0A4ZRQBBFZeQfXm02pkO19XETszh", "zRbEM6nv1u3uOOYe"};
    public static final String A0E;
    public long A00;
    public String A02;
    public String A03;
    public final AnonymousClass59 A07;
    public final IT A08;
    public final C1056Me A09;
    public final C1057Mf A0A;
    public final C1206Rz A0B;
    public final AnonymousClass57 A06 = new SR(this);
    public boolean A05 = true;
    public long A01 = -1;
    public boolean A04 = true;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            A0D[7] = "WrA4t0RN";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
            i13++;
        }
    }

    public static void A04() {
        A0C = new byte[]{114, -120, -120, -107, -120, -84, -41, -43, -120, -85, -41, -42, -36, -51, -42, -36, -120, -76, -41, -55, -52, -51, -52, -120, -68, -47, -43, -51, -94, -120, -70, -48, -48, -35, -48, -4, Ascii.US, 17, Ascii.DC4, -48, -10, Ascii.EM, Ascii.RS, Ascii.EM, 35, Ascii.CAN, -48, 4, Ascii.EM, Ascii.GS, Ascii.NAK, -22, -48, -98, -76, -76, -63, -76, -32, 3, -11, -8, -76, -25, 8, -11, 6, 8, -76, -24, -3, 1, -7, -50, -76, -101, -79, -79, -66, -79, -29, -10, 4, 1, 0, -1, 4, -10, -79, -42, -1, -11, -79, -27, -6, -2, -10, -53, -79, -57, -35, -35, -22, -35, Ascii.DLE, 32, 47, 44, 41, 41, -35, Ascii.SI, 34, Ascii.RS, 33, 54, -35, 17, 38, 42, 34, -9, -35, -112, -90, -90, -77, -90, -39, -21, -7, -7, -17, -11, -12, -90, -52, -17, -12, -17, -7, -18, -90, -38, -17, -13, -21, -64, -90, -116, 92, 114, 114, Ascii.DEL, 114, -102, -77, -64, -74, -66, -73, -60, 114, -90, -69, -65, -73, -116, 114, -90, -42, -45, -37, -41, -55, -42, -124, -41, -55, -41, -41, -51, -45, -46, -124, -56, -59, -40, -59, -124, -48, -45, -53, -53, -55, -56, -124, -92, -124, -58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 9, Ascii.EM, Ascii.SYN, Ascii.RS, Ascii.SUB, Ascii.FF, Ascii.EM, -4, -7, -13, Ascii.CAN, 33, Ascii.RS, Ascii.SUB, 35, 41, 9, 36, 32, Ascii.SUB, 35, -54, -61, -48, -58, -50, -57, -44, -74, -53, -49, -57};
    }

    static {
        A04();
        A0E = SO.class.getSimpleName();
    }

    public SO(AnonymousClass59 anonymousClass59, C1316Wj c1316Wj, IT it, InterfaceC1029Lc interfaceC1029Lc) {
        C1206Rz c1206Rz;
        this.A07 = anonymousClass59;
        this.A08 = it;
        int i10 = (int) (Kd.A02 * 2.0f);
        SQ sq = new SQ(this, interfaceC1029Lc);
        if (c1316Wj.A0C() == null) {
            c1316Wj.A0D().A86();
        }
        if (IE.A02(c1316Wj) || c1316Wj.A0C() == null) {
            c1206Rz = new C1206Rz(c1316Wj, sq);
        } else {
            c1206Rz = new C1206Rz(c1316Wj, c1316Wj.A0C(), sq);
        }
        this.A0B = c1206Rz;
        this.A09 = new C1056Me(c1316Wj, this.A0B);
        C1056Me c1056Me = this.A09;
        int progressBarHeightPx = View.generateViewId();
        c1056Me.setId(progressBarHeightPx);
        RelativeLayout.LayoutParams controlsViewParams = new RelativeLayout.LayoutParams(-1, -2);
        controlsViewParams.addRule(10);
        this.A09.setListener(new SP(this, anonymousClass59));
        interfaceC1029Lc.A3I(this.A09, controlsViewParams);
        this.A0B.setBrowserNavigationListener(this.A09.getBrowserNavigationListener());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int progressBarHeightPx2 = this.A09.getId();
        layoutParams.addRule(3, progressBarHeightPx2);
        layoutParams.addRule(12);
        interfaceC1029Lc.A3I(this.A0B, layoutParams);
        this.A0A = new C1057Mf(c1316Wj, null, R.attr.progressBarStyleHorizontal);
        RelativeLayout.LayoutParams controlsViewParams2 = new RelativeLayout.LayoutParams(-1, i10);
        int progressBarHeightPx3 = this.A09.getId();
        controlsViewParams2.addRule(3, progressBarHeightPx3);
        this.A0A.setProgress(0);
        interfaceC1029Lc.A3I(this.A0A, controlsViewParams2);
        anonymousClass59.A0K(this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void A8k(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String A03 = A03(231, 11, 36);
        String A032 = A03(220, 11, 119);
        String A033 = A03(210, 10, 105);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(A033);
            this.A03 = intent.getStringExtra(A032);
            String[] strArr = A0D;
            if (strArr[0].charAt(28) != strArr[2].charAt(28)) {
                throw new RuntimeException();
            }
            A0D[5] = "h34ynCyxETZN0C4DuHOjqZ0ETc7IsjOt";
            this.A00 = intent.getLongExtra(A03, -1L);
        } else {
            this.A02 = bundle.getString(A033);
            this.A03 = bundle.getString(A032);
            this.A00 = bundle.getLong(A03, -1L);
        }
        String str = this.A02;
        if (str == null) {
            str = A03(199, 11, 39);
        }
        this.A09.setUrl(str);
        this.A0B.loadUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void ABd(boolean z10) {
        this.A0B.onPause();
        if (this.A04) {
            this.A04 = false;
            C1060Mi A07 = new C1059Mh(this.A0B.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0B.getResponseEndMs()).A00(this.A0B.getDomContentLoadedMs()).A05(this.A0B.getScrollReadyMs()).A02(this.A0B.getLoadFinishMs()).A06(System.currentTimeMillis()).A07();
            this.A08.A8p(this.A03, A07.A02());
            if (BuildConfigApi.isDebug()) {
                String str = A03(169, 30, 38) + System.currentTimeMillis() + A03(149, 20, 20) + A07.A01 + A03(53, 22, 86) + A07.A03 + A03(75, 24, 83) + A07.A04 + A03(0, 30, 42) + A07.A00 + A03(99, 24, a.R) + A07.A05 + A03(30, 23, 114) + A07.A02 + A03(123, 26, 72) + A07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AC2(boolean z10) {
        this.A0B.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AEA(Bundle bundle) {
        bundle.putString(A03(210, 10, 105), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void onDestroy() {
        this.A07.A0L(this.A06);
        C1076My.A03(this.A0B);
        this.A0B.destroy();
    }
}
