package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.59 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass59 implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0P;
    public static String[] A0Q = {"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public C0954Ib A07;
    public EnumC0981Jc A08;

    @Nullable
    public InterfaceC1030Ld A09;
    public M9 A0A;
    public N0 A0B;

    @Nullable
    public OU A0C;
    public String A0D;
    public String A0E;

    @Nullable
    public String A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AudienceNetworkActivity A0L;
    public final AudienceNetworkActivityApi A0M;
    public final C1316Wj A0N;
    public final List<AnonymousClass57> A0O = new ArrayList();
    public int A01 = -1;
    public boolean A0G = false;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0P = new byte[]{-37, 7, 40, 37, 56, 42, 55, 80, 67, 68, 78, 71, 2, 86, 81, 2, 75, 80, 72, 71, 84, 2, 88, 75, 71, 89, 54, 91, 82, 71, 2, 72, 84, 81, 79, 2, 75, 80, 86, 71, 80, 86, 2, 81, 84, 2, 85, 67, 88, 71, 70, 43, 80, 85, 86, 67, 80, 69, 71, 53, 86, 67, 86, 71, -24, -11, -26, -24, -22, -5, -16, -3, -16, -5, 0, -10, -1, -4, -8, 1, 7, -25, 2, -2, -8, 1, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, -43, -28, -97, -46, -43, -29, -42, -31, -32, -29, -27, -38, -33, -40, -97, -73, -70, -65, -70, -60, -71, -48, -78, -75, -48, -61, -74, -63, -64, -61, -59, -70, -65, -72, -48, -73, -67, -64, -56, 1, Ascii.CR, Ascii.VT, -52, 4, -1, 1, 3, 0, Ascii.CR, Ascii.CR, 9, -52, -1, 2, 17, -52, 7, Ascii.FF, Ascii.DC2, 3, Ascii.DLE, 17, Ascii.DC2, 7, Ascii.DC2, 7, -1, 10, -52, -1, 1, Ascii.DC2, 7, Ascii.DC4, 7, Ascii.DC2, Ascii.ETB, -3, 2, 3, 17, Ascii.DC2, Ascii.DLE, Ascii.CR, Ascii.ETB, 3, 2, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, -31, -16, -85, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -85, -31, -26, -16, -22, -26, -16, -16, -30, -31, Ascii.SI, Ascii.ESC, Ascii.EM, -38, Ascii.DC2, Ascii.CR, Ascii.SI, 17, Ascii.SO, Ascii.ESC, Ascii.ESC, Ascii.ETB, -38, Ascii.CR, Ascii.DLE, Ascii.US, -38, Ascii.NAK, Ascii.SUB, 32, 17, Ascii.RS, Ascii.US, 32, Ascii.NAK, 32, Ascii.NAK, Ascii.CR, Ascii.CAN, -38, Ascii.DLE, Ascii.NAK, Ascii.US, Ascii.FS, Ascii.CAN, Ascii.CR, 37, 17, Ascii.DLE, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -21, -8, -8, -11, -8, Ascii.DLE, Ascii.FS, Ascii.SUB, -37, 19, Ascii.SO, Ascii.DLE, Ascii.DC2, Ascii.SI, Ascii.FS, Ascii.FS, Ascii.CAN, -37, Ascii.SO, 17, 32, -37, Ascii.SYN, Ascii.ESC, 33, Ascii.DC2, Ascii.US, 32, 33, Ascii.SYN, 33, Ascii.SYN, Ascii.SO, Ascii.EM, -37, 19, Ascii.SYN, Ascii.ESC, Ascii.SYN, 32, Ascii.NAK, Ascii.FF, Ascii.SO, Ascii.DLE, 33, Ascii.SYN, 35, Ascii.SYN, 33, 38, 54, 66, 64, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 52, 55, 70, 1, 60, 65, 71, 56, 69, 70, 71, 60, 71, 60, 52, 63, 1, 60, 64, 67, 69, 56, 70, 70, 60, 66, 65, 1, 63, 66, 58, 58, 56, 55, 77, 94, 77, 86, 92, 49, 38, 51, 41, 56, 40, 38, 53, 42, 69, 61, 60, 65, 57, 76, 65, 71, 70, Ascii.FS, 57, 76, 57, Ascii.DC2, Ascii.SO, 3, 5, 7, Ascii.SI, 7, Ascii.DLE, Ascii.SYN, -21, 6, -7, -8, -5, -3, -5, -22, -14, -3, 87, 89, 76, 75, 76, 77, 80, 85, 76, 75, 54, 89, 80, 76, 85, 91, 72, 91, 80, 86, 85, 50, 76, 96, 78, 65, 77, 81, 65, 79, 80, 48, 69, 73, 65, -7, -15, -17, -10, -57, -20, -6, -21, -8, -39, -21, -23, -11, -12, -22, -7, 45, 40, Ascii.CAN, 40, 43, 34, Ascii.RS, 39, 45, Ascii.SUB, 45, 34, 40, 39, -11, -18, -23, -15, -11, -27, -55, -28, 58, 45, 41, 59, Ascii.CAN, 61, 52, 41};
    }

    static {
        A07();
    }

    public AnonymousClass59(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0L = audienceNetworkActivity;
        this.A0M = audienceNetworkActivityApi;
        this.A0N = C5G.A01(audienceNetworkActivity);
        this.A0N.A0G(this);
    }

    @Nullable
    private InterfaceC1030Ld A01(Intent intent) {
        InterfaceC1030Ld A04;
        InterfaceC1030Ld A03;
        InterfaceC1030Ld A05;
        InterfaceC1030Ld A08;
        InterfaceC1030Ld A06;
        InterfaceC1030Ld A07;
        InterfaceC1030Ld A09;
        InterfaceC1030Ld A02;
        InterfaceC1030Ld A0B;
        InterfaceC1030Ld A0A;
        InterfaceC1030Ld A0C;
        AnonymousClass56 anonymousClass56 = new AnonymousClass56(this, intent, this.A0N.A08(), this.A0N);
        if (this.A08 == null) {
            return null;
        }
        switch (this.A08) {
            case A06:
                A0C = anonymousClass56.A0C(this.A06);
                return A0C;
            case A0C:
                A0A = anonymousClass56.A0A();
                return A0A;
            case A0B:
                A0B = anonymousClass56.A0B();
                return A0B;
            case A02:
                A02 = anonymousClass56.A02();
                return A02;
            case A0A:
                A09 = anonymousClass56.A09();
                return A09;
            case A08:
                A07 = anonymousClass56.A07();
                if (A0Q[1].length() != 0) {
                    A0Q[1] = "wwrXZHO6We2";
                    return A07;
                }
                A0Q[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return A07;
            case A07:
                A06 = anonymousClass56.A06();
                return A06;
            case A09:
                A08 = anonymousClass56.A08();
                if (A0Q[2].length() == 25) {
                    throw new RuntimeException();
                }
                A0Q[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                return A08;
            case A04:
                A05 = anonymousClass56.A05();
                return A05;
            case A03:
                A03 = anonymousClass56.A03();
                if (A0Q[7].charAt(27) == 'B') {
                    throw new RuntimeException();
                }
                A0Q[1] = "x";
                return A03;
            case A05:
                A04 = anonymousClass56.A04();
                return A04;
            default:
                return null;
        }
    }

    private void A05() {
        String str = this.A0F;
        if (str != null) {
            this.A0C = OT.A01(this.A0N, str);
            if (this.A0C != null) {
                this.A06.addView(this.A0C, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A06() {
        if (!this.A0J) {
            if (A0G()) {
                A0D(EnumC1124Ov.A03.A02());
            } else {
                A0D(A04(139, 48, 47));
            }
            this.A0J = true;
        }
    }

    private void A08(Intent intent) {
        if (ID.A0y(this.A0L)) {
            EnumC0981Jc enumC0981Jc = this.A08;
            EnumC0981Jc enumC0981Jc2 = EnumC0981Jc.A02;
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            A0Q[1] = "ROWUzhbvPevH2";
            if (enumC0981Jc != enumC0981Jc2 && Build.VERSION.SDK_INT >= 18) {
                this.A0B = new N0();
                this.A0B.A0C(intent.getStringExtra(A04(419, 11, 51)));
                N0 n02 = this.A0B;
                String placementId = this.A0L.getPackageName();
                n02.A0B(placementId);
                String placementId2 = A04(462, 11, 109);
                long longExtra = intent.getLongExtra(placementId2, 0L);
                if (longExtra != 0) {
                    this.A0B.A09(longExtra);
                }
                TextView textView = new TextView(this.A0L);
                String placementId3 = A04(1, 5, 84);
                textView.setText(placementId3);
                textView.setTextColor(-1);
                LE.A0M(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                AnonymousClass58 anonymousClass58 = new AnonymousClass58(this, null);
                textView.setOnLongClickListener(anonymousClass58);
                this.A06.setOnLongClickListener(anonymousClass58);
                this.A06.getOverlay().add(this.A0B);
            }
        }
    }

    private void A09(Intent intent, @Nullable Bundle bundle) {
        String A04 = A04(511, 8, 85);
        String A042 = A04(503, 8, 17);
        String A043 = A04(438, 24, 120);
        if (bundle != null) {
            Bundle A02 = K9.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = A02.getInt(A043, -1);
            this.A0D = A02.getString(A042);
            this.A08 = (EnumC0981Jc) A02.getSerializable(A04);
            return;
        }
        this.A01 = intent.getIntExtra(A043, -1);
        this.A0D = intent.getStringExtra(A042);
        this.A08 = (EnumC0981Jc) intent.getSerializableExtra(A04);
        this.A02 = intent.getIntExtra(A04(473, 16, 23), 0) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r3.equals(r6) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0D(java.lang.String r6) {
        /*
            r5 = this;
            r2 = 345(0x159, float:4.83E-43)
            r1 = 47
            r0 = 100
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            r4 = 1
            if (r0 != 0) goto L1d
            com.facebook.ads.redexgen.X.Ov r0 = com.facebook.ads.redexgen.X.EnumC1124Ov.A0A
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
        L1d:
            r5.A0I = r4
        L1f:
            r2 = 265(0x109, float:3.71E-43)
            r1 = 35
            r0 = 23
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L5a
            com.facebook.ads.redexgen.X.Ov r0 = com.facebook.ads.redexgen.X.EnumC1124Ov.A09
            java.lang.String r3 = r0.A02()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "BsUqgJlN3izr4734FAkiK4"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "DZ4pb9dksBh2p0w2isnwDh"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L5c
        L5a:
            r5.A0H = r4
        L5c:
            r2 = 86
            r1 = 53
            r0 = 2
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L71
            r0 = 9
            r5.finish(r0)
            return
        L71:
            r2 = 300(0x12c, float:4.2E-43)
            r1 = 45
            r0 = 62
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L87
            r0 = 10
            r5.finish(r0)
            return
        L87:
            r0 = 0
            r5.A0F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass59.A0D(java.lang.String):void");
    }

    public void A0E(String str, C1U c1u) {
        if (this.A09 == null) {
            return;
        }
        if (this.A0A == null) {
            C1316Wj c1316Wj = this.A0N;
            this.A0A = MA.A02(c1316Wj, c1316Wj.A08(), str, c1u, this.A09, new XR(this));
            this.A0A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        LE.A0J(this.A0A);
        LE.A0T(this.A06);
        this.A06.addView(this.A0A);
        this.A0A.A0K();
    }

    public void A0F(String str, @Nullable C8M c8m) {
        Intent intent = new Intent(str + A04(0, 1, 50) + this.A0D);
        if (c8m != null) {
            intent.putExtra(A04(392, 5, 121), c8m);
        }
        C2T.A00(this.A0L).A07(intent);
    }

    private boolean A0G() {
        return this.A08 == EnumC0981Jc.A0C || this.A08 == EnumC0981Jc.A0B || this.A08 == EnumC0981Jc.A05;
    }

    public final AudienceNetworkActivity A0H() {
        return this.A0L;
    }

    public final C1316Wj A0I() {
        return this.A0N;
    }

    @VisibleForTesting
    public final void A0J() {
        if (A0G()) {
            A0D(EnumC1124Ov.A09.A02());
        } else {
            A0D(A04(265, 35, 23));
        }
    }

    public final void A0K(AnonymousClass57 anonymousClass57) {
        this.A0O.add(anonymousClass57);
    }

    public final void A0L(AnonymousClass57 anonymousClass57) {
        this.A0O.remove(anonymousClass57);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        KG customDumpsysWriter = KH.A00();
        if (customDumpsysWriter != null) {
            boolean overrideDumpsys = customDumpsysWriter.overrideDumpsys(str, fileDescriptor, printWriter, strArr);
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            A0Q[6] = "QxWYw7ht1er43uY";
            if (overrideDumpsys) {
                return;
            }
        }
        this.A0M.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i10) {
        this.A0N.A0D().A2Q(String.valueOf(A0H().hashCode()), i10);
        if (this.A0L.isFinishing()) {
            return;
        }
        if (ID.A1I(this.A0N) && !this.A0I && !this.A0H) {
            this.A0N.A0D().A9c();
            A0J();
        }
        if (A0G() && !this.A0G) {
            A0D(EnumC1124Ov.A05.A02());
        } else {
            A0D(A04(187, 39, 14));
        }
        A06();
        this.A0M.finish(i10);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i10, int i11, Intent intent) {
        InterfaceC1030Ld interfaceC1030Ld = this.A09;
        if (interfaceC1030Ld != null && interfaceC1030Ld.onActivityResult(i10, i11, intent)) {
            return;
        }
        C1206Rz.A09(i10, i11, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.A03;
        long currentTime = currentTimeMillis - this.A04;
        this.A03 = j10 + currentTime;
        this.A04 = currentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            Iterator<AnonymousClass57> it = this.A0O.iterator();
            while (it.hasNext()) {
                if (it.next().A8K()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0M.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap hashMap = new HashMap();
            int i10 = configuration.orientation;
            String A04 = A04(489, 14, 74);
            if (i10 == 1) {
                hashMap.put(A04, A04(430, 8, 26));
            } else {
                hashMap.put(A04, A04(397, 9, 86));
            }
            this.A07.A02(EnumC0953Ia.A0K, hashMap);
            this.A00 = configuration.orientation;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(@Nullable Bundle bundle) {
        LG.A02();
        if (ID.A1Y(this.A0L)) {
            Window window = this.A0L.getWindow();
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0Q[6] = "7njofUp2AYjKONZ";
            window.setFlags(b.f7294bc, b.f7294bc);
        }
        Intent intent = K9.A01(this.A0L.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        this.A05 = intent;
        Intent intent2 = this.A05;
        C1316Wj A03 = K9.A03(intent2);
        if (A03 != null) {
            C1316Wj startAdContext = this.A0N;
            startAdContext.A0E(A03.A0D());
            C1316Wj startAdContext2 = this.A0N;
            startAdContext2.A0B(A03.A0A());
        }
        this.A0N.A0D().A2R(String.valueOf(A0H().hashCode()));
        this.A0L.requestWindowFeature(1);
        this.A0L.getWindow().setFlags(1024, 1024);
        this.A06 = new RelativeLayout(this.A0L);
        LE.A0M(this.A06, 0);
        this.A0L.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent3 = this.A05;
        A09(intent3, bundle);
        Intent intent4 = this.A05;
        this.A09 = A01(intent4);
        InterfaceC1030Ld interfaceC1030Ld = this.A09;
        if (interfaceC1030Ld == null) {
            this.A0N.A06().A8u(A04(64, 11, 24), C06977l.A0A, new C06987m(A04(6, 58, 115)));
            A0J();
            finish(7);
            return;
        }
        Intent intent5 = this.A05;
        interfaceC1030Ld.A8k(intent5, bundle, this);
        A0D(A04(226, 39, 61));
        this.A04 = System.currentTimeMillis();
        this.A0F = this.A05.getStringExtra(A04(406, 13, 105));
        A05();
        Intent intent6 = this.A05;
        A08(intent6);
        this.A00 = this.A0L.getResources().getConfiguration().orientation;
        String A04 = A04(75, 11, 36);
        if (bundle != null) {
            this.A0E = bundle.getString(A04);
        } else {
            Intent intent7 = this.A05;
            this.A0E = intent7.getStringExtra(A04);
        }
        this.A07 = new C0954Ib(this.A0E, this.A0N.A08());
        if (ID.A1g(this.A0L) && this.A0L.getWindow() != null) {
            this.A0L.getWindow().addFlags(128);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r3 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (com.facebook.ads.redexgen.X.ID.A0y(r4.A0L) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r4.A0B.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        r3 = r4.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (com.facebook.ads.redexgen.X.AnonymousClass59.A0Q[2].length() == 25) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q;
        r2[5] = "rHb3ILEFnyWtMYiOwcguj0";
        r2[3] = "XKBHK5KZoSEcfbvzOM5yLt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r3 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        r3.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r3 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r3 != null) goto L46;
     */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.Wj r0 = r4.A0N
            com.facebook.ads.redexgen.X.0R r1 = r0.A0D()
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0H()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A2S(r0)
            r4.A06()
            android.widget.RelativeLayout r0 = r4.A06
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            com.facebook.ads.redexgen.X.Ld r0 = r4.A09
            if (r0 == 0) goto L4a
            r0.onDestroy()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L40
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L40:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "BK5JyIukG"
            r0 = 1
            r2[r0] = r1
            r0 = 0
            r4.A09 = r0
        L4a:
            com.facebook.ads.redexgen.X.N0 r3 = r4.A0B
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L93
            if (r3 == 0) goto L6f
        L62:
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0L
            boolean r0 = com.facebook.ads.redexgen.X.ID.A0y(r0)
            if (r0 == 0) goto L6f
            com.facebook.ads.redexgen.X.N0 r0 = r4.A0B
            r0.A07()
        L6f:
            com.facebook.ads.redexgen.X.M9 r3 = r4.A0A
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "rHb3ILEFnyWtMYiOwcguj0"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "XKBHK5KZoSEcfbvzOM5yLt"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L8f
        L8c:
            r3.A0J()
        L8f:
            return
        L90:
            if (r3 == 0) goto L8f
            goto L8c
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "VoJV9dI9dal5KZ60JkB8i5Bpps"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L6f
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass59.onDestroy():void");
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0N.A0D().A2T(String.valueOf(A0H().hashCode()));
        this.A03 += System.currentTimeMillis() - this.A04;
        InterfaceC1030Ld interfaceC1030Ld = this.A09;
        if (interfaceC1030Ld != null) {
            interfaceC1030Ld.ABd(false);
            if (!this.A0L.isFinishing()) {
                this.A07.A02(EnumC0953Ia.A0E, null);
                this.A0K = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0N.A0D().A2U(String.valueOf(A0H().hashCode()));
        this.A04 = System.currentTimeMillis();
        InterfaceC1030Ld interfaceC1030Ld = this.A09;
        if (interfaceC1030Ld != null) {
            interfaceC1030Ld.AC2(false);
            if (this.A0K) {
                this.A07.A02(EnumC0953Ia.A0F, null);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        InterfaceC1030Ld interfaceC1030Ld = this.A09;
        if (interfaceC1030Ld != null) {
            interfaceC1030Ld.AEA(bundle2);
        }
        bundle2.putInt(A04(438, 24, 120), this.A01);
        bundle2.putString(A04(503, 8, 17), this.A0D);
        bundle2.putString(A04(75, 11, 36), this.A0E);
        bundle2.putSerializable(A04(511, 8, 85), this.A08);
        K9.A08(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0N.A0D().A2V(String.valueOf(A0H().hashCode()));
        int i10 = this.A01;
        if (i10 != -1) {
            LX.A02(this.A0L, i10, this.A0N);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0N.A0D().A2W(String.valueOf(A0H().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A0M.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        A0J();
        finish(5);
    }
}
