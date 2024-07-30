package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.foundation.g.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.9Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9Z extends P1 {
    public static byte[] A0F;
    public static final String A0G;

    @Nullable
    public Uri A00;

    @Nullable
    public NativeAd A01;
    public IT A02;

    @Nullable
    public InterfaceC1037Lk A03;

    @Nullable
    public C1112Oj A04;

    @Nullable
    public C06856y A05;

    @Nullable
    public String A06;

    @Nullable
    public String A07;

    @Nullable
    public String A08;
    public final AnonymousClass16 A09;
    public final C1316Wj A0A;
    public final AbstractC1044Lr A0B;
    public final AbstractC1011Kk A0C;
    public final K6 A0D;
    public final String A0E;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{122, -104, -91, 94, -85, 87, -86, -85, -104, -87, -85, 87, 120, -84, -101, -96, -100, -91, -102, -100, -123, -100, -85, -82, -90, -87, -94, 120, -102, -85, -96, -83, -96, -85, -80, 101, 87, -124, -104, -94, -100, 87, -86, -84, -87, -100, 87, -85, -97, -104, -85, 87, -96, -85, 94, -86, 87, -96, -91, 87, -80, -90, -84, -87, 87, 120, -91, -101, -87, -90, -96, -101, -124, -104, -91, -96, -99, -100, -86, -85, 101, -81, -92, -93, 87, -99, -96, -93, -100, 101, -77, -32, -32, -35, -32, -88, -114, 109, 105, 104, -100, -117, -112, -116, -107, -118, -116, 117, -116, -101, -98, -106, -103, -110, 113, -103, -105, -104, 68, -105, -119, -104, 103, -112, -115, -119, -110, -104, 120, -109, -113, -119, -110, 68, -118, -115, -106, -105, -104, 113, -103, -105, -104, 68, -105, -119, -104, 122, -115, -120, -119, -109, 121, 118, 109, 68, -109, -106, 68, -105, -119, -104, 122, -115, -120, -119, -109, 113, 116, 104, 68, -118, -115, -106, -105, -104, -16, -3, -18, -16, -14, 3, -8, 5, -8, 3, 8, -80, -71, -74, -78, -69, -63, -95, -68, -72, -78, -69, -7, -22, -5, -4, -14, -9, -16, -107, -105, -118, -119, -118, -117, -114, -109, -118, -119, 116, -105, -114, -118, -109, -103, -122, -103, -114, -108, -109, 112, -118, -98, -48, -55, -60, -52, -48, -64, -92, -65, -39, -41, -55, -78, -59, -40, -51, -38, -55, -89, -40, -59, -90, -39, -40, -40, -45, -46, -41, -54, -59, -58, -48, -83, -48, -56, -56, -58, -45, -22, -35, -40, -39, -29, -63, -60, -72, -120, 123, 118, 119, -127, 101, 119, 119, 125, 102, 123, Ascii.DEL, 119, -40, -53, -58, -57, -47, -73, -76, -82, -3, -16, -21, -20, -10, -26, -5, -16, -12, -20, -26, -9, -10, -13, -13, -16, -11, -18, -26, -16, -11, -5, -20, -7, -3, -24, -13, -87, -100, -104, -86, -121, -84, -93, -104};
    }

    static {
        A03();
        A0G = C9Z.class.getSimpleName();
    }

    public C9Z(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new A1(this);
        this.A0C = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.9u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                InterfaceC1037Lk interfaceC1037Lk;
                InterfaceC1037Lk interfaceC1037Lk2;
                interfaceC1037Lk = C9Z.this.A03;
                if (interfaceC1037Lk != null) {
                    interfaceC1037Lk2 = C9Z.this.A03;
                    interfaceC1037Lk2.onPause();
                }
            }
        };
        this.A0B = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.9f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                InterfaceC1037Lk interfaceC1037Lk;
                InterfaceC1037Lk interfaceC1037Lk2;
                interfaceC1037Lk = C9Z.this.A03;
                if (interfaceC1037Lk != null) {
                    interfaceC1037Lk2 = C9Z.this.A03;
                    interfaceC1037Lk2.AAF();
                }
            }
        };
        this.A09 = new AnonymousClass16(this, c1316Wj);
        this.A0A = c1316Wj;
        A02();
    }

    public C9Z(C1316Wj c1316Wj, AttributeSet attributeSet) {
        super(c1316Wj, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new A1(this);
        this.A0C = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.9u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                InterfaceC1037Lk interfaceC1037Lk;
                InterfaceC1037Lk interfaceC1037Lk2;
                interfaceC1037Lk = C9Z.this.A03;
                if (interfaceC1037Lk != null) {
                    interfaceC1037Lk2 = C9Z.this.A03;
                    interfaceC1037Lk2.onPause();
                }
            }
        };
        this.A0B = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.9f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                InterfaceC1037Lk interfaceC1037Lk;
                InterfaceC1037Lk interfaceC1037Lk2;
                interfaceC1037Lk = C9Z.this.A03;
                if (interfaceC1037Lk != null) {
                    interfaceC1037Lk2 = C9Z.this.A03;
                    interfaceC1037Lk2.AAF();
                }
            }
        };
        this.A09 = new AnonymousClass16(this, c1316Wj);
        this.A0A = c1316Wj;
        A02();
    }

    public C9Z(C1316Wj c1316Wj, AttributeSet attributeSet, int i10) {
        super(c1316Wj, attributeSet, i10);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new A1(this);
        this.A0C = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.9u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                InterfaceC1037Lk interfaceC1037Lk;
                InterfaceC1037Lk interfaceC1037Lk2;
                interfaceC1037Lk = C9Z.this.A03;
                if (interfaceC1037Lk != null) {
                    interfaceC1037Lk2 = C9Z.this.A03;
                    interfaceC1037Lk2.onPause();
                }
            }
        };
        this.A0B = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.9f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                InterfaceC1037Lk interfaceC1037Lk;
                InterfaceC1037Lk interfaceC1037Lk2;
                interfaceC1037Lk = C9Z.this.A03;
                if (interfaceC1037Lk != null) {
                    interfaceC1037Lk2 = C9Z.this.A03;
                    interfaceC1037Lk2.AAF();
                }
            }
        };
        this.A09 = new AnonymousClass16(this, c1316Wj);
        this.A0A = c1316Wj;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 19));
            return;
        }
        if (this.A00 == null && this.A08 == null) {
            A05(A01(139, 37, 19));
            return;
        }
        intent.putExtra(A01(237, 18, 83), this.A07);
        intent.putExtra(A01(322, 8, 34), EnumC0981Jc.A06);
        intent.putExtra(A01(a.aU, 8, 81), this.A00.toString());
        String str = this.A06;
        if (str == null) {
            str = A01(0, 0, 39);
        }
        intent.putExtra(A01(187, 11, 60), str);
        intent.putExtra(A01(266, 8, 99), this.A08);
        intent.putExtra(A01(205, 24, 20), Kd.A00(this.A0A));
        intent.putExtra(A01(274, 13, 1), getCurrentPositionInMillis());
        intent.putExtra(A01(229, 8, 74), this.A0E);
        intent.putExtra(A01(p.f9095b, 11, 80), this.A05.A0W());
        intent.putExtra(A01(295, 27, 118), getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    private void A05(String str) {
        this.A0A.A06().A8u(A01(198, 7, 120), C06977l.A27, new C06987m(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 93) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0G, str);
        }
    }

    public final void A0m() {
        NativeAd nativeAd = this.A01;
        if (nativeAd != null) {
            nativeAd.onCtaBroadcast();
        }
    }

    public final void A0n() {
        AdActivityIntent A04 = K9.A04(this.A0A);
        A04(A04);
        try {
            A0e(false, 6);
            setVisibility(8);
            K9.A09(this.A0A, A04);
        } catch (Exception e10) {
            this.A0A.A06().A8u(A01(176, 11, 126), C06977l.A0D, new C06987m(e10));
            Log.e(A01(97, 17, 22), A01(0, 90, 38), e10);
        }
    }

    @Nullable
    public InterfaceC1037Lk getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.P1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.X.P1, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(IT it) {
        this.A02 = it;
    }

    public void setClientToken(@Nullable String str) {
        C06856y c06856y;
        C1112Oj c1112Oj = this.A04;
        if (c1112Oj != null) {
            c1112Oj.A0A();
        }
        C06856y c06856y2 = this.A05;
        if (c06856y2 != null) {
            c06856y2.A0g();
        }
        this.A06 = str;
        C1112Oj c1112Oj2 = null;
        if (str != null) {
            c06856y = new C06856y(this.A0A, this.A02, this, str);
        } else {
            c06856y = null;
        }
        this.A05 = c06856y;
        if (ID.A1L(this.A0A)) {
            if (str != null) {
                c1112Oj2 = new C1112Oj(this.A0A, this.A02, this, str, null);
            }
            this.A04 = c1112Oj2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z10) {
        super.A0D.setBackgroundPlaybackEnabled(z10);
    }

    public void setListener(@Nullable InterfaceC1037Lk interfaceC1037Lk) {
        this.A03 = interfaceC1037Lk;
    }

    public void setNativeAd(@Nullable NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(@Nullable String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.X.P1
    public void setVideoMPD(@Nullable String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 19));
        } else {
            this.A08 = str;
            super.setVideoMPD(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.P1
    public void setVideoURI(@Nullable Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 19));
        } else {
            this.A00 = uri;
            super.setVideoURI(uri);
        }
    }
}
