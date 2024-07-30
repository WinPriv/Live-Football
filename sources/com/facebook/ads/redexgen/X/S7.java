package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class S7 implements InterfaceC1030Ld {
    public static byte[] A0C;
    public int A00;
    public C1112Oj A01;
    public C06856y A02;
    public final C1316Wj A03;
    public final IT A04;
    public final InterfaceC1029Lc A05;
    public final InterfaceC1051Lz A06;
    public final P1 A07;
    public final K6 A0B = new K6() { // from class: com.facebook.ads.redexgen.X.9V
        public static byte[] A01;
        public static String[] A02 = {"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", "", "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};

        public static String A00(int i10, int i11, int i12) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
            int i13 = 0;
            while (true) {
                int length = copyOfRange.length;
                if (A02[1].charAt(16) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
                strArr[2] = "";
                if (i13 >= length) {
                    return new String(copyOfRange);
                }
                copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
                i13++;
            }
        }

        public static void A01() {
            A01 = new byte[]{35, Ascii.SYN, 17, Ascii.DC2, Ascii.FS, -10, Ascii.ESC, 33, Ascii.DC2, Ascii.US, 32, 33, Ascii.SYN, 33, Ascii.SO, Ascii.EM, -14, 35, Ascii.DC2, Ascii.ESC, 33};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(KV kv) {
            InterfaceC1029Lc interfaceC1029Lc;
            interfaceC1029Lc = S7.this.A05;
            interfaceC1029Lc.A3t(A00(0, 21, 113), kv);
        }
    };
    public final AbstractC1011Kk A0A = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.9U
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i10, int i11, int i12) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C06836s c06836s) {
            InterfaceC1029Lc interfaceC1029Lc;
            interfaceC1029Lc = S7.this.A05;
            interfaceC1029Lc.A3t(A00(0, 21, 1), c06836s);
        }
    };
    public final AbstractC1044Lr A08 = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.99
        public static byte[] A01;
        public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};

        public static String A00(int i10, int i11, int i12) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            byte[] bArr = {17, 4, -1, 0, 10, -28, 9, Ascii.SI, 0, Ascii.CR, Ascii.SO, Ascii.SI, 4, Ascii.SI, -4, 7, -32, 17, 0, 9, Ascii.SI};
            String[] strArr = A02;
            if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
                throw new RuntimeException();
            }
            A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
            A01 = bArr;
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C6v c6v) {
            InterfaceC1029Lc interfaceC1029Lc;
            interfaceC1029Lc = S7.this.A05;
            interfaceC1029Lc.A3t(A00(0, 21, 69), c6v);
        }
    };
    public final AbstractC1042Lp A09 = new AbstractC1042Lp() { // from class: com.facebook.ads.redexgen.X.97
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C1043Lq c1043Lq) {
            InterfaceC1051Lz interfaceC1051Lz;
            interfaceC1051Lz = S7.this.A06;
            interfaceC1051Lz.AAi();
        }
    };

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0C = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, Ascii.CAN, Ascii.VT, 6, 7, 17, -11, 7, 7, Ascii.CR, -10, Ascii.VT, Ascii.SI, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public S7(C1316Wj c1316Wj, InterfaceC1051Lz interfaceC1051Lz, IT it, InterfaceC1029Lc interfaceC1029Lc) {
        this.A03 = c1316Wj;
        this.A04 = it;
        this.A06 = interfaceC1051Lz;
        this.A07 = new P1(c1316Wj);
        this.A07.A0c(new C06746h(c1316Wj));
        this.A07.getEventBus().A03(this.A0B, this.A0A, this.A08, this.A09);
        this.A05 = interfaceC1029Lc;
        this.A07.setIsFullScreen(true);
        this.A07.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC1029Lc.A3I(this.A07, layoutParams);
        C1032Lf closeButton = new C1032Lf(c1316Wj);
        closeButton.setOnClickListener(new ViewOnClickListenerC1049Lx(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC1029Lc.A3I(closeButton, params);
    }

    public final void A04(int i10) {
        this.A07.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A07.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void A8k(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            OK ok = new OK(this.A03, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * Kd.A02);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            ok.setOnClickListener(new ViewOnClickListenerC1050Ly(this));
            this.A05.A3I(ok, layoutParams);
        }
        String ctaText = A02(77, 13, 124);
        this.A00 = intent.getIntExtra(ctaText, 0);
        C1316Wj c1316Wj = this.A03;
        IT it = this.A04;
        P1 p12 = this.A07;
        String A02 = A02(8, 11, 102);
        String stringExtra2 = intent.getStringExtra(A02);
        String ctaText2 = A02(58, 11, 1);
        this.A02 = new C06856y(c1316Wj, it, p12, stringExtra2, intent.getBundleExtra(ctaText2));
        if (ID.A1L(this.A03)) {
            this.A01 = new C1112Oj(this.A03, this.A04, this.A07, intent.getStringExtra(A02), null);
        } else {
            this.A01 = null;
        }
        P1 p13 = this.A07;
        String ctaText3 = A02(69, 8, 98);
        p13.setVideoMPD(intent.getStringExtra(ctaText3));
        P1 p14 = this.A07;
        String ctaText4 = A02(90, 8, 34);
        p14.setVideoURI(intent.getStringExtra(ctaText4));
        int i11 = this.A00;
        if (i11 > 0) {
            this.A07.A0Y(i11);
        }
        String ctaText5 = A02(0, 8, 72);
        if (intent.getBooleanExtra(ctaText5, false)) {
            this.A07.A0b(EnumC1121Os.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void ABd(boolean z10) {
        this.A05.A3t(A02(37, 21, 27), new L7());
        this.A07.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AC2(boolean z10) {
        this.A05.A3t(A02(37, 21, 27), new C1012Kl());
        if (!this.A07.A0j()) {
            this.A07.A0b(EnumC1121Os.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void onDestroy() {
        this.A05.A3t(A02(37, 21, 27), new C0992Jp(this.A00, this.A07.getCurrentPositionInMillis()));
        this.A02.A0d(this.A07.getCurrentPositionInMillis());
        C1112Oj c1112Oj = this.A01;
        if (c1112Oj != null) {
            c1112Oj.A09();
        }
        this.A07.A0Z(1);
        this.A07.A0V();
    }
}
