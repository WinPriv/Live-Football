package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import java.util.Arrays;
import java.util.HashMap;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.8o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07268o extends FrameLayout implements RH {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public C1137Pi A00;

    @DynamicWebViewController$AdFormatType
    public final int A01;
    public final AnonymousClass18 A02;
    public final C1316Wj A03;
    public final IT A04;
    public final L6 A05;
    public final InterfaceC1089Nl A06;
    public final C1099Nw A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, Ascii.DC2, 65, Ascii.NAK, 70, 65, 84, 71, 65, Ascii.NAK, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, Ascii.ESC, Ascii.NAK, 120, 84, 94, 80, Ascii.NAK, 70, 64, 71, 80, Ascii.NAK, 65, 93, 84, 65, Ascii.NAK, 92, 65, Ascii.DC2, 70, Ascii.NAK, 92, 91, Ascii.NAK, 76, 90, 64, 71, Ascii.NAK, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, Ascii.ESC, 77, 88, 89, Ascii.NAK, 83, 92, 89, 80, Ascii.ESC, Ascii.RS, Ascii.SUB, Ascii.EM, 45, 60, 49, 61, 54, 59, 61, Ascii.SYN, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 64, 79, 90, 71, 88, 75, 111, 74, 106, 79, 90, 79, 108, 91, 64, 74, 66, 75, 47, 48, 60, 46, Ascii.CR, 32, 41, 60};
    }

    static {
        A02();
    }

    public C07268o(C1316Wj c1316Wj, IT it, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i10) {
        this(c1316Wj, it, null, anonymousClass18, str, i10, null);
    }

    public C07268o(C1316Wj c1316Wj, IT it, InterfaceC1089Nl interfaceC1089Nl, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i10, L6 l62) {
        super(c1316Wj);
        this.A03 = c1316Wj;
        this.A04 = it;
        this.A02 = anonymousClass18;
        this.A08 = str;
        this.A06 = interfaceC1089Nl;
        this.A01 = i10;
        if (this.A01 == 3) {
            this.A07 = new C1099Nw(this.A03, anonymousClass18, it, i10);
            this.A09 = false;
        } else {
            C1099Nw preloadedDynamicWebViewController = C1100Nx.A02(anonymousClass18.A0Z());
            if (preloadedDynamicWebViewController != null) {
                this.A07 = preloadedDynamicWebViewController;
                this.A09 = true;
            } else {
                this.A07 = new C1099Nw(this.A03, anonymousClass18, it, i10);
                C1100Nx.A03(anonymousClass18, this.A07);
                this.A09 = false;
            }
        }
        if (l62 != null) {
            this.A05 = l62;
            this.A07.A0Z(l62);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new RO(this));
        this.A07.A0a(interfaceC1089Nl);
        EnumC1009Ki.A04(this, EnumC1009Ki.A0A);
        if (ID.A1K(c1316Wj)) {
            c1316Wj.A09().AFF(this.A07.A0O(), anonymousClass18.A0U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0D().A4v();
            this.A07.A0X();
        } else {
            this.A03.A0D().A4w();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    InterfaceC1089Nl interfaceC1089Nl = this.A06;
                    if (interfaceC1089Nl != null) {
                        interfaceC1089Nl.AAZ(this);
                    }
                    if (ID.A1K(this.A03)) {
                        this.A03.A09().AAN();
                    }
                } else {
                    AEt();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C1099Nw.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AnonymousClass18 anonymousClass18) {
        intent.putExtra(A01(136, 8, 40), EnumC0981Jc.A04);
        intent.putExtra(A01(118, 18, 95), anonymousClass18);
        intent.addFlags(268435456);
    }

    @SuppressLint({"CatchGeneralException"})
    private final void A06(AnonymousClass18 anonymousClass18) {
        AdActivityIntent A04 = K9.A04(this.A03);
        A05(A04, anonymousClass18);
        try {
            K9.A09(this.A03, A04);
        } catch (Exception e10) {
            this.A03.A06().A8u(A01(107, 11, 38), C06977l.A0D, new C06987m(e10));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e10);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new N9(this.A03, this.A08, this.A00, this.A05, this.A04).A08(this.A02.A0U(), str, new HashMap());
    }

    public final void A08() {
        LE.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7u() {
        A07(this.A02.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7v(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7z() {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A8e() {
        new Handler(Looper.getMainLooper()).post(new RN(this));
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AAl() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AAp() {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ABT(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACE() {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACh(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACj(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACw(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AEt() {
        InterfaceC1089Nl interfaceC1089Nl = this.A06;
        if (interfaceC1089Nl != null) {
            interfaceC1089Nl.AAZ(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void close() {
    }

    public IT getAdEventManager() {
        return this.A04;
    }

    public C1099Nw getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C1137Pi c1137Pi) {
        this.A00 = c1137Pi;
        this.A07.A0e(c1137Pi);
    }
}
