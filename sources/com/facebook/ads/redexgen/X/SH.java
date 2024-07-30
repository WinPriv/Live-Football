package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class SH extends RelativeLayout implements InterfaceC1030Ld {
    public static byte[] A0D;
    public static String[] A0E = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;

    @Nullable
    public KX A01;

    @Nullable
    public OD A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass19 A05;
    public final L1 A06;
    public final InterfaceC1029Lc A07;
    public final C1375Ys A08;
    public final C1316Wj A09;
    public final IT A0A;
    public final C0954Ib A0B;
    public final AbstractC1028Lb A0C;

    public static String A0L(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{88, 84, 86, Ascii.NAK, 93, 90, 88, 94, 89, 84, 84, 80, Ascii.NAK, 90, 95, 72, Ascii.NAK, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, Ascii.NAK, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, Ascii.NAK, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    @ToolbarActionView$ToolbarActionMode
    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public SH(C1316Wj c1316Wj, IT it, InterfaceC1029Lc interfaceC1029Lc, C1375Ys c1375Ys) {
        super(c1316Wj);
        this.A04 = false;
        this.A03 = false;
        this.A09 = c1316Wj;
        this.A0A = it;
        this.A07 = interfaceC1029Lc;
        this.A06 = new L1(this);
        this.A08 = c1375Ys;
        this.A0B = new C0954Ib(this.A08.A0U(), this.A0A);
        this.A0C = new FullScreenAdToolbar(this.A09, getAudienceNetworkListener(), this.A0B, 0, this.A08.A0F());
    }

    private C1K A0K(int i10) {
        if (i10 == 1) {
            return this.A05.A01();
        }
        AnonymousClass19 anonymousClass19 = this.A05;
        if (A0E[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0E[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return anonymousClass19.A00();
    }

    private void A0M() {
        removeAllViews();
        LE.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new OB(this.A09, this.A08.A0O().A0E(), this.A08.A0R()).A08(this.A08.A0N().A01()).A0B();
            C0956Id.A04(this.A02, this.A0B, EnumC0953Ia.A0U);
            this.A07.A3H(this, 0, layoutParams);
            this.A07.A3H(this.A02, 1, layoutParams);
            this.A02.A04(new SJ(this));
            return;
        }
        this.A07.A3H(this, 0, layoutParams);
    }

    private void A0P(C1K c1k, boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0C.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0C.A04(c1k, z10);
        addView(this.A0C, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof NR)) {
            return;
        }
        if (A0Y()) {
            ((NR) this.A00).A0a();
        } else {
            ((NR) this.A00).A0Z();
        }
    }

    public final void A0T(int i10) {
        this.A01 = new KX(i10, new SI(this, i10));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z10, int i10) {
        this.A00 = view;
        this.A06.A05(L0.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z10 ? 0 : this.A0C.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1K A0K = A0K(i10);
        A0P(A0K, z10);
        LE.A0M(this, A0K.A07(false));
        if (this.A07 != null) {
            A0N();
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0E[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z10 && Build.VERSION.SDK_INT >= 19) {
                L1 l12 = this.A06;
                if (A0E[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0E[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                l12.A05(L0.A04);
            }
        }
    }

    public final void A0V(AnonymousClass59 anonymousClass59) {
        this.A06.A04(anonymousClass59.A0H().getWindow());
        this.A05 = this.A08.A0N();
        C1B c1b = null;
        C1B adInfo = this.A08.A0O();
        if (adInfo != null) {
            C1B adInfo2 = this.A08.A0O();
            if (adInfo2 != null) {
                c1b = this.A08.A0O();
            }
        }
        this.A0C.setPageDetails(this.A08.A0R(), this.A08.A0U(), c1b != null ? c1b.A0D().A03() : 0, this.A08.A0S());
        this.A0C.setToolbarListener(new SL(this, anonymousClass59));
    }

    public final void A0W(AnonymousClass59 anonymousClass59) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, gl.Code);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC1036Lj(this, this, anonymousClass59));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A08.A0c().isEmpty()) {
            boolean A0P = this.A08.A0O().A0P();
            if (A0E[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0E[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (A0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ABd(boolean z10) {
        KX kx = this.A01;
        if (kx != null && kx.A05()) {
            this.A01.A06();
        }
    }

    public void AC2(boolean z10) {
        KX kx = this.A01;
        if (kx != null && !kx.A04()) {
            this.A01.A07();
        }
    }

    public IT getAdEventManager() {
        return this.A0A;
    }

    public InterfaceC1029Lc getAudienceNetworkListener() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A06.A03();
        this.A0C.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(L6 l62) {
        l62.A05();
        if (getAudienceNetworkListener() != null) {
            getAudienceNetworkListener().A3s(A0L(0, 47, 106));
        }
    }

    public void setListener(InterfaceC1029Lc interfaceC1029Lc) {
    }
}
