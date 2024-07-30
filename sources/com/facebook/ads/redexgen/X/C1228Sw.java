package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.dynview.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.huawei.hms.ads.gl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1228Sw implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, InterfaceC0978Iz {
    public static C6G A0k;
    public static byte[] A0l;
    public static String[] A0m = {"Bl7Z7O36thNMsAQG86cT5hXAswukL2TU", "w0l3kgVUfrf8f1EzcfbBJ9JqF1JIQyF1", "3FYeVZ4P9Hva0brxRfDXnSutu97odoaf", "TkemScCQ72wM3yeu7V5OcaIZTlgQuG0T", "aV5nfdXEnoj7uvLi", "brDFWAS69jf159nGVdOYVvf", "WGIwYSb5Wjcv", "W7skGFSknqdZoaqu210O1mF"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<C1228Sw>> A0o;
    public long A00;

    @Nullable
    public Drawable A01;

    @Nullable
    public View.OnTouchListener A02;

    @Nullable
    public View A03;

    @Nullable
    public View A04;

    @Nullable
    public View A05;

    @Nullable
    public View A06;

    @Nullable
    public NativeAdLayout A07;
    public EnumC05420z A08;

    @Nullable
    public Z0 A09;

    @Nullable
    public EB A0A;

    @Nullable
    public YV A0B;

    @Nullable
    public C6L A0C;

    @Nullable
    public AnonymousClass84 A0D;
    public EnumC0964Il A0E;

    @Nullable
    public ViewOnClickListenerC1230Sy A0F;

    @Nullable
    public InterfaceC1227Sv A0G;

    @Nullable
    public C0972It A0H;
    public EnumC0973Iu A0I;
    public J8 A0J;

    @Nullable
    public M3 A0K;

    @Nullable
    public N0 A0L;

    @Nullable
    @DoNotStrip
    public C1099Nw A0M;

    @Nullable
    public OU A0N;

    @Nullable
    @DoNotStrip
    public AbstractC1136Ph A0O;

    @Nullable
    @DoNotStrip
    public AbstractC1136Ph A0P;

    @Nullable
    public C1137Pi A0Q;

    @Nullable
    public C1137Pi A0R;

    @Nullable
    public String A0S;

    @Nullable
    public String A0T;
    public WeakReference<XS> A0U;

    @Nullable
    public WeakReference<AbstractC1136Ph> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;

    @Nullable
    public Z9 A0a;
    public final C6G A0b;
    public final C1316Wj A0c;

    @Nullable
    public final InterfaceC0969Iq A0d;
    public final J1 A0e;
    public final L6 A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    public static String A0W(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0l, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0d() {
        A0l = new byte[]{86, -112, -100, -107, -108, -91, -85, -43, -84, -86, -87, -91, -38, -74, -30, -75, -76, -77, -76, -26, -25, -25, 10, -58, Ascii.DC4, Ascii.NAK, Ascii.SUB, -58, Ascii.DC2, Ascii.NAK, 7, 10, Ascii.VT, 10, 125, -96, -112, -95, -87, -84, -88, -99, -80, -95, 92, 99, 97, -81, 99, 92, -91, -81, 92, -86, -85, -80, 92, -99, 92, -86, -99, -80, -91, -78, -95, 92, -99, -96, -62, -66, -67, -15, -32, -27, -31, -22, -33, -31, -54, -31, -16, -13, -21, -18, -25, -105, -78, -70, -67, -74, -75, 113, -59, -64, 113, -67, -64, -78, -75, 113, -98, -74, -75, -70, -78, Ascii.DEL, -83, -56, -48, -45, -52, -53, -121, -37, -42, -121, -42, -55, -37, -56, -48, -43, -121, -37, -52, -44, -41, -45, -56, -37, -52, -121, -80, -85, -121, -51, -39, -42, -44, -121, -55, -48, -53, -121, -41, -56, -32, -45, -42, -56, -53, -121, -114, -116, -38, -114, -93, -56, -50, -65, -52, -56, -69, -58, 122, -65, -52, -52, -55, -52, -120, 100, -79, -42, -34, -55, -44, -47, -52, -120, -37, -51, -36, -120, -41, -50, -120, -53, -44, -47, -53, -45, -55, -54, -44, -51, -120, -34, -47, -51, -33, -37, -43, -19, -20, -15, -23, -34, -15, -19, -1, -88, -18, -9, -6, -88, -15, -21, -9, -10, -88, -15, -5, -88, -15, -5, -88, -11, -15, -5, -5, -15, -10, -17, -74, -73, -49, -50, -45, -53, -64, -45, -49, -31, -118, -45, -35, -118, -41, -45, -35, -35, -45, -40, -47, -104, -71, -31, -33, -32, -116, -36, -34, -37, -30, -43, -48, -47, -116, -51, -116, -62, -43, -47, -29, -116, -97, -78, -89, -76, -93, 94, Ascii.DEL, -94, 94, -75, -97, -79, 94, -97, -86, -80, -93, -97, -94, -73, 94, -80, -93, -91, -89, -79, -78, -93, -80, -93, -94, 94, -75, -89, -78, -90, 94, -97, 94, -108, -89, -93, -75, 108, 94, Ascii.DEL, -77, -78, -83, 94, -77, -84, -80, -93, -91, -89, -79, -78, -93, -80, -89, -84, -91, 94, -97, -84, -94, 94, -82, -80, -83, -95, -93, -93, -94, -89, -84, -91, 108, -49, -30, -11, -22, -9, -26, -95, -30, -27, -95, -27, -26, -12, -11, -13, -16, -6, -26, -27, -115, -96, -77, -88, -75, -92, 95, -96, -93, 95, -85, -82, -96, -93, 95, -79, -92, -80, -76, -92, -78, -77, -92, -93, -32, -13, -17, 1, -86, -21, -10, -4, -17, -21, -18, 3, -86, -4, -17, -15, -13, -3, -2, -17, -4, -17, -18, -86, 1, -13, -2, -14, -86, -21, -86, -40, -21, -2, -13, 0, -17, -53, -18, -72, -86, -53, -1, -2, -7, -86, -1, -8, -4, -17, -15, -13, -3, -2, -17, -4, -13, -8, -15, -86, -21, -8, -18, -86, -6, -4, -7, -19, -17, -17, -18, -13, -8, -15, -72, -115, -96, -100, -82, 87, -91, -90, -85, 87, -87, -100, -98, -96, -86, -85, -100, -87, -100, -101, 87, -82, -96, -85, -97, 87, -85, -97, -96, -86, 87, -123, -104, -85, -96, -83, -100, 120, -101, -47, -44, -112, -35, -43, -44, -39, -47, -112, -28, -23, -32, -43, -112, -39, -29, -112, -34, -33, -28, -112, -29, -27, -32, -32, -33, -30, -28, -43, -44, -98, -104, -89, -96, -113, -112, -98, -97, -99, -102, -92, -108, 103, 100, -107, 98, 95, -110, -94, -91, -105, -102, 119, -102, 7, 10, -4, -1, -36, -1, -61, -60, -69, -2, -4, 7, 7, 0, -1, -69, 8, 10, Ascii.CR, 0, -69, Ascii.SI, 3, -4, 9, -69, 10, 9, -2, 0, -17, -30, -11, -22, -9, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0f(View view, View view2, List<View> list, boolean z10) {
        InterfaceC1227Sv interfaceC1227Sv;
        if (!A0q()) {
            this.A0c.A0D().ADe();
        }
        if (view == null) {
            String A0W = A0W(256, 19, 68);
            if (!A0q()) {
                this.A0c.A0D().ADd(A0W);
            }
            throw new IllegalArgumentException(A0W);
        }
        if (list == null || list.size() == 0) {
            String A0W2 = A0W(172, 30, 64);
            if (!A0q()) {
                this.A0c.A0D().ADd(A0W2);
            }
            throw new IllegalArgumentException(A0W2);
        }
        Z9 A0C = A0C();
        if (A0C == null) {
            String A0W3 = A0W(21, 13, 126);
            if (!A0q()) {
                this.A0c.A0D().ADd(A0W3);
            }
            Log.e(A0n, A0W3);
            J3 j32 = new J3(AdErrorType.NATIVE_AD_IS_NOT_LOADED, A0W3);
            A11().A0D().A2a(L5.A01(this.A00), j32.A03().getErrorCode(), j32.A04());
            if (!ID.A1x(this.A0c) || (interfaceC1227Sv = this.A0G) == null) {
                return;
            }
            interfaceC1227Sv.AAc(j32);
            return;
        }
        String str = this.A0T;
        boolean z11 = view instanceof FrameLayout;
        String[] strArr = A0m;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[0] = "EctJGKY0XxsuqG0UQd3u1zsk6i1LiKEB";
        strArr2[2] = "xfmrtxxFdZMJNwdY4ICwqytBKlocc6OO";
        if (z11 && str != null) {
            A0g((FrameLayout) view, str);
        }
        NativeAdLayout nativeAdLayout = this.A07;
        if (nativeAdLayout != null) {
            ((XB) nativeAdLayout.getNativeAdLayoutApi()).A02();
        }
        XS xs = this.A0U.get();
        if (xs != null && A0C.A08() == 1) {
            xs.A03(LM.AN_INFO_ICON);
        }
        if (view2 == null) {
            if (this.A0J == J8.A05) {
                AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                String A0W4 = A0W(235, 21, 66);
                J3 j33 = new J3(adErrorType, A0W4);
                A11().A0D().A2a(L5.A01(this.A00), j33.A03().getErrorCode(), j33.A04());
                InterfaceC1227Sv interfaceC1227Sv2 = this.A0G;
                if (interfaceC1227Sv2 != null) {
                    interfaceC1227Sv2.AAc(j33);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0n, A0W4);
                    return;
                }
                return;
            }
            AdErrorType adErrorType2 = AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
            String A0W5 = A0W(a.f11393p, 33, 96);
            J3 j34 = new J3(adErrorType2, A0W5);
            A11().A0D().A2a(L5.A01(this.A00), j34.A03().getErrorCode(), j34.A04());
            InterfaceC1227Sv interfaceC1227Sv3 = this.A0G;
            if (interfaceC1227Sv3 != null) {
                interfaceC1227Sv3.AAc(j34);
            }
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0n, A0W5);
                return;
            }
            return;
        }
        boolean z12 = (view2 instanceof AdNativeComponentView) && ((AdNativeComponentView) view2).getAdContentsView() != null;
        boolean z13 = z10 && (view2 instanceof ImageView);
        if (!z12 && !z13) {
            if (this.A0G != null) {
                J3 j35 = new J3(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(511, 31, 72));
                A11().A0D().A2a(L5.A01(this.A00), j35.A03().getErrorCode(), j35.A04());
                this.A0G.AAc(j35);
                return;
            }
            return;
        }
        if (this.A04 != null) {
            Log.w(A0n, A0W(275, 80, 22));
            String[] strArr3 = A0m;
            if (strArr3[7].length() != strArr3[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0m;
            strArr4[7] = "Yitqb4l5O5wHhToyiUZG328";
            strArr4[5] = "n4uNZUYEyoiQJdMJgH58rRy";
            unregisterView();
        }
        if (A0o.containsKey(view) && A0o.get(view).get() != null) {
            Log.w(A0n, A0W(398, 75, 98));
            A0o.get(view).get().unregisterView();
        }
        this.A0F = new ViewOnClickListenerC1230Sy(this, this.A0c, null);
        this.A04 = view;
        this.A06 = view2;
        if (view instanceof ViewGroup) {
            this.A0K = new M3(this.A0c, new T2(this));
            ((ViewGroup) view).addView(this.A0K);
        }
        if (A0C.A0U()) {
            this.A0O = new T1(this);
            this.A0Q = new C1137Pi(view, 1, new WeakReference(this.A0O), this.A0c);
            this.A0Q.A0Y(false);
            this.A0Q.A0X(A0C.A09());
            this.A0Q.A0U();
            this.A0c.A0D().A9Y();
        }
        ArrayList arrayList = new ArrayList(list);
        View view3 = this.A05;
        if (view3 != null) {
            arrayList.add(view3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1K((View) it.next());
        }
        int A00 = A00();
        this.A0P = new T0(this, view2, z13, A0C);
        if (view2 instanceof AdNativeComponentView) {
            this.A03 = ((AdNativeComponentView) view2).getAdContentsView();
        } else {
            this.A03 = view2;
        }
        if (ID.A1K(this.A0c)) {
            String A1B = A1B();
            InterfaceC0958If A09 = A11().A09();
            View view4 = this.A03;
            if (A1B == null) {
                A1B = A0W(0, 0, 21);
            }
            A09.AFE(view4, A1B, this.A03 instanceof C1118Op, true);
        }
        this.A0R = new C1137Pi(this.A03, A00, A03(), true, new WeakReference(this.A0P), this.A0c);
        this.A0R.A0Y(!A0q());
        this.A0R.A0W(A01());
        this.A0R.A0X(A02());
        View view5 = this.A03;
        if (view5 instanceof C1068Mq) {
            ((C1068Mq) view5).A06(this.A0R);
        }
        this.A09 = new Z0(this.A0c, new C1229Sx(this, null), this.A0R, this.A0a);
        this.A09.A0D(arrayList);
        A0o.put(view, new WeakReference<>(this));
        if (Build.VERSION.SDK_INT < 18 || !ID.A0y(this.A0c)) {
            return;
        }
        this.A0L = new N0();
        this.A0L.A0C(this.A0g);
        this.A0L.A0B(this.A0c.getPackageName());
        this.A0L.A0A(this.A0R);
        Z9 z92 = this.A0a;
        if (z92 != null && z92.A0E().A03() > 0) {
            AnonymousClass11 A0E = this.A0a.A0E();
            this.A0L.A08(A0E.A03(), A0E.A04());
        }
        AnonymousClass84 anonymousClass84 = this.A0D;
        if (anonymousClass84 != null) {
            this.A0L.A09(anonymousClass84.A0C());
        } else {
            EB eb2 = this.A0A;
            if (eb2 != null && eb2.A0D() != null) {
                this.A0L.A09(this.A0A.A0D().A0C());
            }
        }
        View view6 = this.A04;
        String[] strArr5 = A0m;
        if (strArr5[4].length() != strArr5[6].length()) {
            String[] strArr6 = A0m;
            strArr6[4] = "DFdj5aRKmThGOYGM";
            strArr6[6] = "4rU7VADNdisg";
            view6.getOverlay().add(this.A0L);
            return;
        }
        String[] strArr7 = A0m;
        strArr7[7] = "HovrQjOKGOU1glve9p8eAJs";
        strArr7[5] = "lnqkcQfVF9X2NaZpGo2NogE";
        view6.getOverlay().add(this.A0L);
    }

    static {
        A0d();
        A0n = C1228Sw.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public C1228Sw(Context context, String str, @Nullable InterfaceC0969Iq interfaceC0969Iq, boolean z10) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = J8.A05;
        this.A0E = EnumC0964Il.A04;
        this.A08 = EnumC05420z.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new L6();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C1316Wj) {
            this.A0c = (C1316Wj) context;
        } else if (!z10) {
            this.A0c = C5G.A04(context);
        } else {
            this.A0c = C5G.A02(context);
        }
        this.A0c.A0G(this);
        this.A0g = str;
        this.A0d = interfaceC0969Iq;
        C6G c6g = A0k;
        if (c6g != null) {
            this.A0b = c6g;
        } else {
            this.A0b = new C6G(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new J1(this.A0c, this);
    }

    public C1228Sw(C1228Sw c1228Sw) {
        this((Context) c1228Sw.A0c, (String) null, c1228Sw.A0d, true);
        this.A0D = c1228Sw.A0D;
        this.A0a = c1228Sw.A0a;
        this.A0B = c1228Sw.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public C1228Sw(C1316Wj c1316Wj, Z9 z92, @Nullable AnonymousClass84 anonymousClass84, @Nullable InterfaceC0969Iq interfaceC0969Iq) {
        this((Context) c1316Wj, (String) null, interfaceC0969Iq, true);
        this.A0a = z92;
        this.A0D = anonymousClass84;
        this.A0j = true;
        this.A05 = new View(c1316Wj);
    }

    public C1228Sw(C1316Wj c1316Wj, Z9 z92, @Nullable AnonymousClass84 anonymousClass84, InterfaceC0969Iq interfaceC0969Iq, @Nullable YV yv) {
        this(c1316Wj, z92, anonymousClass84, interfaceC0969Iq);
        this.A0B = yv;
    }

    private int A00() {
        AnonymousClass84 anonymousClass84 = this.A0D;
        if (anonymousClass84 != null) {
            return anonymousClass84.A04();
        }
        EB eb2 = this.A0A;
        if (eb2 == null || eb2.A0D() == null) {
            return 1;
        }
        return this.A0A.A0D().A04();
    }

    private int A01() {
        AnonymousClass84 anonymousClass84 = this.A0D;
        if (anonymousClass84 != null) {
            return anonymousClass84.A07();
        }
        Z9 z92 = this.A0a;
        if (z92 != null) {
            int A0C = z92.A0C();
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "EUscbuPuA5cZxxPx7y6ncGc";
            strArr2[5] = "07NrZ6juCFttxvE5hiFlF8c";
            return A0C;
        }
        EB eb2 = this.A0A;
        if (eb2 != null && eb2.A0D() != null) {
            return this.A0A.A0D().A07();
        }
        return 0;
    }

    private int A02() {
        AnonymousClass84 anonymousClass84 = this.A0D;
        if (anonymousClass84 != null) {
            return anonymousClass84.A08();
        }
        Z9 z92 = this.A0a;
        if (z92 != null) {
            int A0D = z92.A0D();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[1] = "wlXrbCoONy6aNPfJSLZ4JGG9g8lWOQWJ";
            strArr2[3] = "zMDzXw8vWIk5v34E7N5RdIcOKoPIh5je";
            return A0D;
        }
        EB eb2 = this.A0A;
        String[] strArr3 = A0m;
        if (strArr3[4].length() != strArr3[6].length()) {
            String[] strArr4 = A0m;
            strArr4[7] = "IJhE7OuQr9AUmHg0gZAU0NE";
            strArr4[5] = "Tpbr9nnLmrgR8Cas3OKWnYo";
            if (eb2 == null) {
                return 1000;
            }
        } else {
            String[] strArr5 = A0m;
            strArr5[0] = "x7i9CQzVOJPdqJX1dHOWNRL80PPtBuUS";
            strArr5[2] = "xh5QtfSCbDAINUU48h4MV8p0ljd4aaCa";
            if (eb2 == null) {
                return 1000;
            }
        }
        if (eb2.A0D() != null) {
            return this.A0A.A0D().A08();
        }
        return 1000;
    }

    private int A03() {
        AnonymousClass84 anonymousClass84 = this.A0D;
        if (anonymousClass84 != null) {
            return anonymousClass84.A09();
        }
        EB eb2 = this.A0A;
        if (eb2 == null || eb2.A0D() == null) {
            return 0;
        }
        return this.A0A.A0D().A09();
    }

    public static Drawable A05(C1316Wj c1316Wj, Bitmap bitmap, boolean z10, @Nullable String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1316Wj.getResources(), bitmap);
        if (z10 && (A00 = OT.A00(c1316Wj, str)) != null) {
            Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
            return iconViewDrawable;
        }
        return bitmapDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws J4 {
        J8 A00 = JD.A00(str2);
        if (A00 != null) {
            J8 j82 = J8.A04;
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "9sjWaS9CbZxjWOFrlYfgckD2h0ahWze6";
            strArr2[2] = "CgLfFBC4KJYZcdRIWMiGUMQeYT9XpqO1";
            if (A00 == j82) {
                return new NativeBannerAd(context, str);
            }
            J8 template = J8.A05;
            if (A00 == template) {
                return new NativeAd(context, str);
            }
            throw new J4(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(34, 34, 20), A00));
        }
        throw new J4(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(106, 50, 63), str2));
    }

    @Nullable
    private final Z9 A0C() {
        Z9 z92 = this.A0a;
        if (z92 != null && z92.A0T()) {
            return z92;
        }
        return null;
    }

    private AnonymousClass11 A0F() {
        return A0G(false);
    }

    private AnonymousClass11 A0G(boolean z10) {
        Z9 z92 = this.A0a;
        if (z92 != null && z92.A0T()) {
            if (z10) {
                this.A0a.A0I();
            }
            Z9 z93 = this.A0a;
            String[] strArr = A0m;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "bGIdjP48JCmqHZjd8yMcvy0";
            strArr2[5] = "TixE3qv3ULKos9kbBUakVg1";
            return z93.A0E();
        }
        return new AnonymousClass11();
    }

    public static InterfaceC0969Iq A0K() {
        return new C1231Sz();
    }

    public static C1228Sw A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C1228Sw) ((AnonymousClass50) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (C1228Sw) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final C0970Ir getAdChoicesIcon() {
        return A0F().A0E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final C0971Is getAdStarRating() {
        return A0F().A0H();
    }

    private AdPlacementType A0R() {
        if (this.A0J == J8.A05) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0Z() {
        for (View v3 : this.A0i) {
            v3.setOnClickListener(null);
            v3.setOnTouchListener(null);
            v3.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0a() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            KL.A0E(new KL(), this.A0c, KM.A00(getAdChoicesLinkUrl()), A1B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0b() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        C1137Pi c1137Pi = this.A0Q;
        if (c1137Pi != null) {
            c1137Pi.A0V();
            this.A0c.A0D().A9Z();
            this.A0Q = null;
        }
    }

    public static void A0e(@Nullable Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0g(FrameLayout frameLayout, String str) {
        OU ou = this.A0N;
        if (ou != null) {
            frameLayout.removeView(ou);
        }
        this.A0N = OT.A01(C5G.A02(this.A0c), str);
        OU ou2 = this.A0N;
        if (ou2 != null) {
            frameLayout.addView(ou2, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0h(@Nullable Z9 z92, boolean z10) {
        if (z92 == null) {
            return;
        }
        boolean equals = this.A0E.equals(EnumC0964Il.A04);
        String A0W = A0W(595, 6, 89);
        if (equals) {
            AnonymousClass11 A0E = z92.A0E();
            String clientToken = z92.A63();
            if (!TextUtils.isEmpty(clientToken)) {
                this.A0b.A0d(new C0954Ib(clientToken, this.A0c.A08()));
            }
            if (A0E.A0G() != null) {
                C6E c6e = new C6E(A0E.A0G().getUrl(), A0E.A0G().getHeight(), A0E.A0G().getWidth(), z92.A0G(), A0W(595, 6, 89));
                c6e.A00 = this.A0C;
                this.A0b.A0V();
                this.A0b.A0b(c6e);
            }
            if (!this.A0J.equals(J8.A04)) {
                if (A0E.A0F() != null) {
                    this.A0b.A0b(new C6E(A0E.A0F().getUrl(), A0E.A0F().getHeight(), A0E.A0F().getWidth(), z92.A0G(), A0W(595, 6, 89)));
                }
                List<C1228Sw> A0H = z92.A0H();
                String[] strArr = A0m;
                if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "BiVeVWtUTguxpSjeMqAkCwQXeKWOVTz4";
                strArr2[3] = "8sdR9nWPZ664Gt9BvBocaDJi5It1hBkX";
                if (A0H != null) {
                    for (C1228Sw c1228Sw : z92.A0H()) {
                        if (c1228Sw.getAdCoverImage() != null) {
                            this.A0b.A0b(new C6E(c1228Sw.getAdCoverImage().getUrl(), c1228Sw.getAdCoverImage().getHeight(), c1228Sw.getAdCoverImage().getWidth(), z92.A0G(), A0W(595, 6, 89)));
                        }
                    }
                }
                String A0d = A0E.A0d();
                if (!TextUtils.isEmpty(A0d)) {
                    this.A0b.A0a(new C6C(A0d, z92.A0G(), A0W(595, 6, 89), A0E.A0A()));
                }
            }
            AnonymousClass18 A0D = A0E.A0D();
            if (A0D != null && A0D.A0r()) {
                C6C c6c = new C6C(A0D.A0V(), A0D.A0Z(), A0W);
                c6c.A04 = true;
                c6c.A03 = A0W(0, 5, 0);
                this.A0b.A0X(c6c);
            }
        }
        this.A0b.A0W(new T3(this, z92, z10), new AnonymousClass69(z92.A0G(), A0W));
    }

    private void A0i(AnonymousClass12 anonymousClass12) {
        Z9 z92 = this.A0a;
        if (z92 == null) {
            return;
        }
        z92.A0K(anonymousClass12);
    }

    public static void A0j(NativeAdImageApi nativeAdImageApi, ImageView imageView, C1316Wj c1316Wj) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC1195Ro(imageView, c1316Wj).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0m(InterfaceC1227Sv interfaceC1227Sv) {
        this.A0G = interfaceC1227Sv;
    }

    private final void A0n(String str) {
        this.A0S = str;
    }

    private void A0o(List<View> list, View view) {
        InterfaceC0969Iq interfaceC0969Iq = this.A0d;
        if (interfaceC0969Iq != null && interfaceC0969Iq.AEf(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                String[] strArr = A0m;
                String str = strArr[7];
                String str2 = strArr[5];
                int i11 = str.length();
                if (i11 != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "SQxDsveS3BVeMl0nUnJayKxDlwKiSRwM";
                strArr2[3] = "CPUPH8uU8pe6dd8URnD7AGDEQ4lKFlLs";
                A0o(list, childAt);
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0p() {
        return A18() == EnumC0975Iw.A05 || A18() == EnumC0975Iw.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A0F().A0h();
    }

    public final long A0x() {
        return this.A00;
    }

    @Nullable
    public final Z9 A0y() {
        return this.A0a;
    }

    @Nullable
    public final AnonymousClass18 A0z() {
        return A0F().A0D();
    }

    public final C6G A10() {
        return this.A0b;
    }

    public final C1316Wj A11() {
        return this.A0c;
    }

    @Nullable
    public final ViewOnClickListenerC1230Sy A12() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A13, reason: merged with bridge method [inline-methods] */
    public final C0970Ir getAdCoverImage() {
        return A0F().A0F();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A14, reason: merged with bridge method [inline-methods] */
    public final C0970Ir getAdIcon() {
        return A0F().A0G();
    }

    @Nullable
    public final InterfaceC1227Sv A15() {
        return this.A0G;
    }

    @Nullable
    public final C0972It A16() {
        return this.A0H;
    }

    public final EnumC0973Iu A17() {
        return this.A0I;
    }

    public final EnumC0975Iw A18() {
        return A0F().A0I();
    }

    public final L6 A19() {
        return this.A0f;
    }

    @Nullable
    public final C1137Pi A1A() {
        return this.A0R;
    }

    @Nullable
    public final String A1B() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A63();
    }

    @Nullable
    public final String A1C() {
        return this.A0T;
    }

    @Nullable
    public final String A1D() {
        return A0G(true).A0O();
    }

    @Nullable
    public final String A1E() {
        return A0G(true).A0P();
    }

    @Nullable
    public final String A1F() {
        return A0F().A0c();
    }

    @Nullable
    public final String A1G() {
        Z9 z92 = this.A0a;
        if (z92 == null || TextUtils.isEmpty(z92.A0E().A0d())) {
            return null;
        }
        return this.A0b.A0S(this.A0a.A0E().A0d());
    }

    @Nullable
    public final List<C1228Sw> A1H() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1I() {
        if (!C2E.A00(this.A0c.A00()).A0O(this.A0c, false)) {
            A0a();
            return;
        }
        C1316Wj c1316Wj = this.A0c;
        M9 A01 = MA.A01(c1316Wj, c1316Wj.A08(), A1B(), this.A07);
        if (A01 == null) {
            A0a();
        } else {
            ((XB) this.A07.getNativeAdLayoutApi()).A03(A01);
            A01.A0K();
        }
    }

    public final void A1J(@Nullable Drawable drawable) {
        this.A01 = drawable;
        A1c(drawable != null, true);
        String[] strArr = A0m;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[4] = "Q96JEqttX0oIb74l";
        strArr2[6] = "mqYIcYUMJzEb";
    }

    public final void A1K(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (Build.VERSION.SDK_INT >= 18) {
            boolean A0y = ID.A0y(view.getContext());
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[4] = "GeTsVetQiODT9yUx";
            strArr2[6] = "UPeG8QvAHkrx";
            if (A0y) {
                view.setOnLongClickListener(this.A0F);
            }
        }
    }

    public final void A1L(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, imageView, arrayList, true);
    }

    public final void A1M(View view, ImageView imageView, List<View> clickableViews) {
        A0f(view, imageView, clickableViews, true);
    }

    public final void A1N(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, adNativeComponentView, arrayList, false);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0f(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1P(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1Q(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1R(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0m(new A4(nativeAdListener, nativeAdBase));
    }

    public final void A1S(@Nullable NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1T(Z9 z92) {
        A0h(z92, true);
        if (this.A0G != null) {
            List<C1228Sw> A0H = z92.A0H();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "OfB2JsewzcYgCxMvn97l0AOaUV28WOmd";
            strArr2[2] = "fN7XzjPm8qHCAEGwTiZWrbsVWAwnjwvJ";
            if (A0H != null) {
                T5 t52 = new T5(this);
                Iterator<C1228Sw> it = z92.A0H().iterator();
                while (it.hasNext()) {
                    it.next().A0i(t52);
                }
            }
        }
    }

    public final void A1U(@Nullable XS xs) {
        this.A0U = new WeakReference<>(xs);
    }

    public final void A1V(EnumC0964Il enumC0964Il, @Nullable String str, C6L c6l) {
        if (str == null) {
            this.A0c.A0D().A2d();
        } else {
            this.A0c.A0D().A2c();
        }
        this.A00 = System.currentTimeMillis();
        if (this.A0j) {
            AdSettings.IntegrationErrorMode A00 = C05601r.A00(this.A0c);
            String A0W = A0W(565, 30, 115);
            AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
            if (!integrationErrorMode.equals(A00)) {
                J3 j32 = new J3(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(565, 30, 115));
                A11().A0D().A2a(L5.A01(this.A00), j32.A03().getErrorCode(), j32.A04());
                InterfaceC1227Sv interfaceC1227Sv = this.A0G;
                if (interfaceC1227Sv != null) {
                    interfaceC1227Sv.AAc(j32);
                } else {
                    Log.e(A0W(68, 17, 84), A0W);
                }
                C06987m c06987m = new C06987m(A0W);
                A11().A06().A8u(A0W(542, 3, 15), C06977l.A0c, c06987m);
            } else {
                throw new C05651w(A0W);
            }
        }
        this.A0j = true;
        this.A0E = enumC0964Il;
        if (enumC0964Il.equals(EnumC0964Il.A05)) {
            this.A08 = EnumC05420z.A05;
        }
        this.A0C = c6l;
        C05581p c05581p = new C05581p(this.A0g, this.A0J, A0R(), null, 1);
        c05581p.A05(enumC0964Il);
        c05581p.A06(this.A0S);
        c05581p.A07(this.A0T);
        this.A0A = new EB(this.A0c, c05581p);
        this.A0A.A0M(new T6(this));
        this.A0A.A0P(str);
    }

    public final void A1W(@Nullable C0972It c0972It) {
        this.A0H = c0972It;
    }

    public final void A1X(EnumC0973Iu enumC0973Iu) {
        this.A0I = enumC0973Iu;
    }

    public final void A1Y(J8 j82) {
        if (!A0q()) {
            if (J8.A04.equals(j82)) {
                C1316Wj c1316Wj = this.A0c;
                String[] strArr = A0m;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[7] = "er71GFUENUkH6mVEmd80tsw";
                strArr2[5] = "eRFgtOOg0hnVr16Te1PNaNs";
                c1316Wj.A0D().A2g(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0D().A2g(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = j82;
    }

    public final void A1Z(AbstractC1136Ph abstractC1136Ph) {
        this.A0V = new WeakReference<>(abstractC1136Ph);
    }

    public final void A1a(boolean z10) {
        this.A0W = z10;
    }

    public final void A1b(boolean z10) {
        this.A0X = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r2 = r3.A0G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        r2 = A0W(0, 0, 21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        if (r3 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1c(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1228Sw.A1c(boolean, boolean):void");
    }

    public final boolean A1d() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0978Iz
    public final int A6C() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof C1118Op) {
                return ((C1118Op) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C0976Ix(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        JH.A05(A0W(545, 7, 3), A0W(355, 19, 89), A0W(552, 7, 7));
        if (ID.A1K(this.A0c)) {
            A11().A09().AF4(this.A03);
        }
        if (!A0q()) {
            this.A0c.A0D().A2h();
        }
        EB eb2 = this.A0A;
        if (eb2 != null) {
            eb2.A0R(true);
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(EnumC0964Il.A05)) {
            this.A08 = EnumC05420z.A04;
        }
        this.A0E = EnumC0964Il.A04;
        A0h(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdBodyText() {
        return A0G(true).A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdCallToAction() {
        return A0G(true).A0X();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        C0970Ir adChoicesIcon = getAdChoicesIcon();
        String[] strArr = A0m;
        if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[7] = "MRTmAh7YnfwjJHGdoro5GGF";
        strArr2[5] = "5NAjexdbITBZf7E7VHPXfXw";
        return adChoicesIcon.getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesLinkUrl() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesText() {
        return A0F().A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdHeadline() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdLinkDescription() {
        return A0G(true).A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdSocialContext() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdTranslation() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdvertiserName() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        Z9 z92 = this.A0a;
        if (z92 != null) {
            AnonymousClass11 A0E = z92.A0E();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[1] = "Gk0JtmCCXYpL8dPDyrRdSPBqQO7pSw2M";
            strArr2[3] = "hZFl2ZrFl9W40ZKmdwMt57qcTxbjzHrP";
            C0970Ir nativeAdImage = A0E.A0F();
            if (nativeAdImage != null) {
                int width = nativeAdImage.getWidth();
                int height = nativeAdImage.getHeight();
                return height > 0 ? width / height : gl.Code;
            }
        }
        return gl.Code;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        String str = this.A0h;
        String[] strArr = A0m;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[7] = "iawtn5ImZtHDfKUJHK1ePg9";
        strArr2[5] = "61vZsTsWUXSHOR043CjOsZn";
        return str;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final Drawable getPreloadedIconViewDrawable() {
        C0970Ir A0G;
        Bitmap A0M;
        Z9 adapter = this.A0a;
        if (adapter != null && (A0G = A0F().A0G()) != null && (A0M = this.A0b.A0M(A0G.getUrl())) != null) {
            C1316Wj A11 = A11();
            boolean A1d = A1d();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[4] = "5rXv1LFjMRKkpcU7";
            strArr2[6] = "SFgDKFOuseBk";
            return A05(A11, A0M, A1d, A1C());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getPromotedTranslation() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getSponsoredTranslation() {
        return A0G(true).A0S();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        Z9 z92 = this.A0a;
        return z92 != null && z92.A0S();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z10 = true;
        EB eb2 = this.A0A;
        if (eb2 != null) {
            z10 = eb2.A0S();
        } else {
            YV yv = this.A0B;
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "v5uFzvuQ32LyebguaenlI2Y";
            strArr2[5] = "nsJGpwd0QPZOfVeZMyNRGWR";
            if (yv != null) {
                z10 = yv.A0A();
            }
        }
        this.A0c.A0D().A4Y(z10);
        return z10;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        Z9 z92 = this.A0a;
        return z92 != null && z92.A0T();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        JH.A05(A0W(559, 6, 14), A0W(374, 24, 23), A0W(13, 8, 89));
        A1V(EnumC0964Il.A00(NativeAdBase.MediaCacheFlag.ALL), null, new C6L(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        JH.A05(A0W(559, 6, 14), A0W(374, 24, 23), A0W(5, 8, 76));
        ((C0976Ix) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        View view = this.A05;
        if (view != null) {
            view.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        View view = this.A04;
        if (view != null) {
            view.post(new T7(this));
        }
        String str = A0W(156, 16, 50) + C1023Kw.A03(this.A0c, th);
        A11().A0D().A2a(L5.A01(this.A00), 2001, str);
        InterfaceC1227Sv interfaceC1227Sv = this.A0G;
        if (interfaceC1227Sv != null) {
            interfaceC1227Sv.AAc(new J3(2001, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0n(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (com.facebook.ads.redexgen.X.ID.A1K(r4) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        A11().A09().AF4(r6.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (com.facebook.ads.redexgen.X.C1228Sw.A0o.containsKey(r6.A04) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (com.facebook.ads.redexgen.X.C1228Sw.A0o.get(r6.A04).get() != r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        r4 = r6.A04;
        r5 = r4 instanceof android.view.ViewGroup;
        r3 = com.facebook.ads.redexgen.X.C1228Sw.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (r3[4].length() == r3[6].length()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        r3 = com.facebook.ads.redexgen.X.C1228Sw.A0m;
        r3[0] = "lVWmVGygxw0UbRbggHe19cSptvLLteak";
        r3[2] = "yD1YSLWVotW9RM3Ng5RpEu8J61bKeSm7";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r5 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r0 = r6.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        ((android.view.ViewGroup) r4).removeView(r0);
        r6.A0K = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        r0 = r6.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r0.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 18) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (r6.A0L == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (com.facebook.ads.redexgen.X.ID.A0y(r6.A0c) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r6.A0L.A07();
        r6.A04.getOverlay().remove(r6.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        com.facebook.ads.redexgen.X.C1228Sw.A0o.remove(r6.A04);
        A0Z();
        r6.A04 = null;
        r6.A06 = null;
        r0 = r6.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        r0.A0V();
        r6.A0R = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        A0c();
        r6.A09 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
    
        if (r5 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        throw new java.lang.IllegalStateException(A0W(473, 38, 15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        if (com.facebook.ads.redexgen.X.ID.A1K(r4) != false) goto L22;
     */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unregisterView() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1228Sw.unregisterView():void");
    }
}
