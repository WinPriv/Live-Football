package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class T8 extends C5E implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1316Wj A01;

    @Nullable
    public InterfaceC0963Ik A02;

    @Nullable
    public C9Z A04;
    public C6Z A05;
    public C6R A06;

    @DoNotStrip
    public AbstractC1136Ph A07;
    public C1137Pi A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1117Oo A0C = new TE(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC0975Iw A03 = EnumC0975Iw.A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ a.R);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 60, 43, 32, 42, 43, 60, 43, 60, 110, 45, 38, 39, 34, 42, 110, 45, 33, 32, 40, 39, 41, 96, Ascii.SO, 38, 39, 42, 34, Ascii.NAK, 42, 38, 52, Ascii.NAK, 42, 39, 38, 44, 99, 42, 48, 99, 45, 54, 47, 47, 120, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, 42, 45, 39, 99, 42, 55, 109, Ascii.DLE, 43, 36, 39, 41, 32, 101, 49, 42, 101, 35, 44, 43, 33, 101, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, 42, 101, 38, 45, 44, 41, 33, 107};
    }

    static {
        A0E();
        A0H = T8.class.getSimpleName();
    }

    private InterfaceC0965Im A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new TD(this, mediaViewVideoRendererApi);
    }

    private InterfaceC0965Im A02(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        InterfaceC0965Im mediaViewVideoRendererChild = new TC(this, mediaViewVideoRendererApi);
        return mediaViewVideoRendererChild;
    }

    private AbstractC1136Ph A04() {
        return new TA(this);
    }

    private C1137Pi A05() {
        return new C1137Pi(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        C9Z c9z = this.A04;
        if (c9z != null) {
            C1118Op c1118Op = (C1118Op) c9z.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            c1118Op.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        C9Z c9z = this.A04;
        if (c9z != null) {
            c9z.getVideoView().setOnTouchListener(new ViewOnTouchListenerC0962Ij(this));
        }
    }

    private void A0B() {
        C9Z c9z = this.A04;
        if (c9z != null) {
            C1118Op c1118Op = (C1118Op) c9z.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[7] = "MUEPyY1MJMWvhU3XHu";
            c1118Op.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0U();
                return;
            }
        }
        C9Z c9z = this.A04;
        if (c9z != null && c9z.getState() == EnumC1134Pf.A05) {
            this.A0B = true;
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC0975Iw.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C1228Sw c1228Sw, @Nullable InterfaceC0963Ik interfaceC0963Ik) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC0963Ik;
        A09();
        C6Z c6z = this.A05;
        if (c1228Sw != null) {
            C0970Ir adCoverImage = c1228Sw.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[3] = "zpp3cHPhluFOPvL30kkcY8af";
            if (adCoverImage != null) {
                str = c1228Sw.getAdCoverImage().getUrl();
                c6z.setImage(str, new TB(this));
                this.A03 = c1228Sw.A18();
                this.A06.setPlayAccessibilityLabel(c1228Sw.A1E());
                this.A06.setPauseAccessibilityLabel(c1228Sw.A1D());
                this.A08.A0U();
            }
        }
        str = null;
        c6z.setImage(str, new TB(this));
        this.A03 = c1228Sw.A18();
        this.A06.setPlayAccessibilityLabel(c1228Sw.A1E());
        this.A06.setPauseAccessibilityLabel(c1228Sw.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC1121Os enumC1121Os) {
        C9Z c9z = this.A04;
        if (c9z != null) {
            c9z.A0b(enumC1121Os, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        C9Z c9z = this.A04;
        if (c9z == null || c9z.getState() == EnumC1134Pf.A06) {
            return false;
        }
        return this.A03 == EnumC0975Iw.A05 || this.A03 == EnumC0975Iw.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10) {
        InterfaceC0965Im A02;
        ((C5E) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        if (i10 == 0) {
            A02 = A02(mediaViewVideoRendererApi);
        } else if (i10 == 1) {
            A02 = A01(mediaViewVideoRendererApi);
        } else {
            throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C5L) mediaViewVideoRendererApi).A06(A02);
        this.A01 = C5G.A02(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C6Z(this.A01);
        this.A07 = A04();
        this.A08 = A05();
        float density = Kd.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C6R(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int bigPadding2 = 0;
        while (true) {
            int childCount = this.A00.getChildCount();
            if (A0G[3].length() == 24) {
                String[] strArr = A0G;
                strArr[2] = "oEzbzrDqpY4LpZuK9aeaZZijHYv0V";
                strArr[0] = "65U2aK7TrzSKlLOXQMMYyslcv3rZK";
                if (bigPadding2 >= childCount) {
                    break;
                }
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C9Z) {
                    this.A04 = (C9Z) childAt;
                    break;
                }
                bigPadding2++;
            } else {
                throw new RuntimeException();
            }
        }
        C9Z c9z = this.A04;
        if (c9z == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 58));
            }
        } else {
            c9z.A0c(this.A05);
            this.A04.A0c(this.A06);
        }
        this.A08.A0W(0);
        this.A08.A0X(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        A02.AES();
        String[] strArr2 = A0G;
        if (strArr2[4].length() != strArr2[1].length()) {
            String[] strArr3 = A0G;
            strArr3[4] = "NjD77g9sbns6FUonJskLzorZMVzfs";
            strArr3[1] = "sF6jyMJNRDvSJleY8k7g51skJQqlgl";
        } else {
            String[] strArr4 = A0G;
            strArr4[2] = "irNdkufru0tgAA9z3l7YlJhRv0dZK";
            strArr4[0] = "zN5wNlZvELtjdUjcESL7VUEU7ru13";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new ViewOnTouchListenerC0961Ii(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0C();
    }
}
