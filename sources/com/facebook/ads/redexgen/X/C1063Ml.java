package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1063Ml implements InterfaceC1024Kx<Bundle> {
    public static byte[] A0D;
    public static String[] A0E = {"nkjKj1MvUJoP2SJPYcgbaBjYPy4EsWOF", "UEaFlSlVJfgDxU2HAGuUlGjRHCZL3UC5", "HKOtxcgqDUvcB7Zt0rEFxuoEqCvYEtNO", "rowCAjgGiKT2zEBSq3xmGSL0Kf3UrlyG", "EJAz0i2eNdRPLBpGYGjYpv17GQTuD6uU", "hVbT72qq2pp8XHiEw", "RwROuq5e2nKVw7hJaeybV0hHAIDx5UQQ", "neuOh54FNoDLqHEFUxNtW4G7fWRiy4GW"};
    public int A00;
    public int A01;

    @Nullable
    public String A02;
    public boolean A03;
    public final Y8 A04;
    public final C1316Wj A05;
    public final IT A06;
    public final InterfaceC1114Ol A07;
    public final InterfaceC1119Oq A08;
    public final C1120Or A09;
    public final Object A0A;
    public final String A0B;

    @Nullable
    public final Map<String, String> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C1063Ml(C1316Wj c1316Wj, IT it, InterfaceC1114Ol interfaceC1114Ol, List<C2A> list, String str, boolean z10, @Nullable Bundle bundle, @Nullable Map<String, String> map, InterfaceC1119Oq interfaceC1119Oq) {
        this.A0A = new Object();
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
        this.A05 = c1316Wj;
        this.A06 = it;
        this.A07 = interfaceC1114Ol;
        this.A0B = str;
        this.A0C = map;
        this.A03 = z10;
        this.A08 = interfaceC1119Oq;
        list.add(new NM(this, 0.5d, -1.0d, 2.0d, true));
        list.add(new N4(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A04 = new Y8(list, bundle.getBundle(A0G(6, 16, 29)), this.A08);
            this.A01 = bundle.getInt(A0G(57, 18, 2));
            this.A00 = bundle.getInt(A0G(39, 18, 44));
        } else {
            this.A04 = new Y8(list, this.A08);
        }
        this.A09 = new C1120Or(new Handler(), this);
    }

    public static String A0G(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{Ascii.VT, Ascii.CR, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -82, -79, -98, -62, -82, -71, -74, -63, -58, -102, -82, -69, -82, -76, -78, -65, -18, 1, -10, -6, -14, -20, -6, 0, -96, -77, -86, -85, -89, -100, -76, -96, -83, -56, -67, -49, -48, -98, -53, -47, -54, -64, -67, -50, -43, -80, -59, -55, -63, -87, -81, -98, -109, -91, -90, -126, -92, -95, -103, -92, -105, -91, -91, -122, -101, -97, -105, Ascii.DEL, -123, -21, -31, -33, -14, -35, -21, -15, -23, -33, -14, -16, -37, -23, -17, Ascii.DC4, Ascii.FF, -33, -37, -45, -43, -56, -45, Ascii.SUB, Ascii.RS, Ascii.CR, 17, 6, 10, 2, Ascii.ESC, 34, -87, -98, -94, -102, 37, Ascii.ESC, Ascii.DLE, -16, -26, -25, 19, 9, 10, -2, Ascii.NAK, -64, -70, -78, 10, 4, Ascii.VT, 5, 3, -8, -4, -12, -18, -4, 2, -64, -63, -87, -68, -67, -72, 0, 1, -21, -9, -8, -18, 5, 6, -4, -16, 7, -73, -87, -82, -92, -81, -73};
    }

    static {
        A0O();
    }

    public C1063Ml(C1316Wj c1316Wj, IT it, InterfaceC1114Ol interfaceC1114Ol, List<C2A> list, String str, boolean z10, @Nullable Bundle bundle, InterfaceC1119Oq interfaceC1119Oq) {
        this(c1316Wj, it, interfaceC1114Ol, list, str, z10, bundle, null, interfaceC1119Oq);
    }

    public C1063Ml(C1316Wj c1316Wj, IT it, InterfaceC1114Ol interfaceC1114Ol, List<C2A> list, String str, boolean z10, InterfaceC1119Oq interfaceC1119Oq) {
        this(c1316Wj, it, interfaceC1114Ol, list, str, z10, null, interfaceC1119Oq);
    }

    private final float A0E() {
        return LB.A00(this.A05) * this.A07.getVolume();
    }

    private Map<String, String> A0I(int i10) {
        HashMap<String, String> hashMap = new HashMap<>();
        LB.A03(hashMap, this.A07.getVideoStartReason() == EnumC1121Os.A02, !this.A07.A8T());
        A0S(hashMap);
        A0R(hashMap);
        A0U(hashMap, i10);
        A0T(hashMap);
        A0Q(hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(EnumC1115Om enumC1115Om) {
        return A0K(enumC1115Om, this.A07.getCurrentPositionInMillis());
    }

    private Map<String, String> A0K(EnumC1115Om enumC1115Om, int i10) {
        Map<String, String> A0I = A0I(i10);
        A0I.put(A0G(0, 6, 122), String.valueOf(enumC1115Om.A00));
        return A0I;
    }

    private void A0M() {
        this.A06.A9L(this.A0B, A0J(EnumC1115Om.A04));
    }

    private void A0N() {
        this.A06.A9L(this.A0B, A0J(EnumC1115Om.A0A));
    }

    private final void A0P(int i10, boolean z10, boolean z11) {
        int i11;
        if (i10 <= 0.0d || i10 < (i11 = this.A01)) {
            return;
        }
        if (i10 > i11) {
            this.A04.A06((i10 - i11) / 1000.0f, A0E());
            this.A01 = i10;
            if (z11 || i10 - this.A00 >= 5000) {
                IT it = this.A06;
                String str = this.A0B;
                Map<String, String> A0K = A0K(EnumC1115Om.A09, i10);
                if (A0E[5].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[1] = "IXDsMs8MiMzYVjpFmNZXbOdNx8hS7U1p";
                strArr[6] = "KaqaEYbZ8TBX2kyM8fVmd1OK78kemUif";
                it.A9L(str, A0K);
                this.A00 = this.A01;
                this.A04.A05();
                return;
            }
        }
        if (z10) {
            this.A06.A9L(this.A0B, A0K(EnumC1115Om.A09, i10));
        }
    }

    private void A0Q(HashMap<String, String> params) {
        Map<String, String> map = this.A0C;
        if (map != null) {
            params.putAll(map);
        }
    }

    private void A0R(Map<String, String> params) {
        C2C A03 = this.A04.A03();
        C2B A00 = A03.A00();
        params.put(A0G(141, 3, 90), String.valueOf(A00.A00()));
        params.put(A0G(144, 3, 81), String.valueOf(A00.A05()));
        params.put(A0G(147, 5, 95), String.valueOf(A00.A02()));
        params.put(A0G(a.R, 8, 95), String.valueOf(A00.A01() * 1000.0d));
        params.put(A0G(82, 7, 76), String.valueOf(A00.A03() * 1000.0d));
        String str = this.A02;
        if (str != null) {
            params.put(A0G(135, 6, 26), str);
        }
        C2B A01 = A03.A01();
        params.put(A0G(110, 3, a.R), String.valueOf(A01.A00()));
        params.put(A0G(113, 3, 74), String.valueOf(A01.A05()));
        params.put(A0G(116, 5, 109), String.valueOf(A01.A02()));
        params.put(A0G(22, 8, 93), String.valueOf(A01.A01() * 1000.0d));
        params.put(A0G(75, 7, 78), String.valueOf(A01.A03() * 1000.0d));
    }

    private void A0S(Map<String, String> map) {
        map.put(A0G(30, 9, 11), String.valueOf(this.A07.A8Q()));
        map.put(A0G(93, 4, 51), Long.toString(this.A07.getInitialBufferTime()));
    }

    private void A0T(Map<String, String> params) {
        Rect rect = new Rect();
        this.A07.getGlobalVisibleRect(rect);
        params.put(A0G(97, 2, 122), String.valueOf(rect.top));
        params.put(A0G(91, 2, 63), String.valueOf(rect.left));
        params.put(A0G(89, 2, 116), String.valueOf(this.A07.getMeasuredHeight()));
        params.put(A0G(104, 2, 123), String.valueOf(this.A07.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A0G(152, 6, 16));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0G(121, 3, 26), String.valueOf(displayMetrics.heightPixels));
        params.put(A0G(124, 3, 100), String.valueOf(displayMetrics.widthPixels));
    }

    private void A0U(Map<String, String> map, int i10) {
        map.put(A0G(99, 5, 109), String.valueOf(this.A00 / 1000.0f));
        map.put(A0G(106, 4, 5), String.valueOf(i10 / 1000.0f));
    }

    public final int A0V() {
        return this.A01;
    }

    public final Bundle A0W() {
        A0f(A0V(), A0V());
        Bundle bundle = new Bundle();
        bundle.putInt(A0G(57, 18, 2), this.A01);
        bundle.putInt(A0G(39, 18, 44), this.A00);
        bundle.putBundle(A0G(6, 16, 29), this.A04.A02());
        return bundle;
    }

    public final void A0X() {
        this.A06.A9L(this.A0B, A0J(EnumC1115Om.A07));
    }

    public final void A0Y() {
        this.A06.A9L(this.A0B, A0J(EnumC1115Om.A08));
    }

    public final void A0Z() {
        if (A0E() < 0.05d) {
            synchronized (this.A0A) {
                if (this.A03) {
                    A0M();
                    this.A03 = false;
                }
            }
            return;
        }
        synchronized (this.A0A) {
            if (!this.A03) {
                A0N();
                this.A03 = true;
            }
        }
    }

    public final void A0a() {
        this.A05.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A09);
    }

    public final void A0b() {
        this.A05.getContentResolver().unregisterContentObserver(this.A09);
    }

    public final void A0c(int i10) {
        this.A04.A04();
        this.A06.A9L(this.A0B, A0J(EnumC1115Om.A05));
        A0P(i10, false, ((double) i10) < 2000.0d);
    }

    public final void A0d(int i10) {
        A0P(i10, true, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A04.A05();
        this.A04.A04();
    }

    public final void A0e(int i10) {
        A0P(i10, false, false);
    }

    public final void A0f(int i10, int i11) {
        A0P(i10, true, false);
        this.A00 = i11;
        this.A01 = i11;
        this.A04.A05();
        this.A04.A04();
    }
}
