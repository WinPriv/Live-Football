package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07278p extends FrameLayout implements InterfaceC1030Ld, RH {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public AnonymousClass57 A00;

    @Nullable
    public AnonymousClass59 A01;

    @Nullable
    public O6 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass18 A06;
    public final C1316Wj A07;
    public final IT A08;
    public final C0954Ib A09;
    public final L1 A0A;
    public final L6 A0B;
    public final InterfaceC1029Lc A0C;
    public final M4 A0D;

    @Nullable
    public final C1092No A0E;
    public final C1099Nw A0F;

    @DoNotStrip
    public final AbstractC1136Ph A0G;
    public final C1137Pi A0H;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, Ascii.VT, 4, Ascii.FF, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98};
    }

    static {
        A0D();
    }

    public C07278p(C1316Wj c1316Wj, IT it, InterfaceC1029Lc interfaceC1029Lc, AnonymousClass18 anonymousClass18, M4 m42, @DynamicWebViewController$AdFormatType int i10) {
        super(c1316Wj);
        this.A00 = new RU(this);
        this.A0G = new RT(this);
        this.A03 = true;
        this.A07 = c1316Wj;
        this.A08 = it;
        this.A0C = interfaceC1029Lc;
        this.A06 = anonymousClass18;
        this.A0D = m42;
        C1099Nw A02 = C1100Nx.A02(anonymousClass18.A0Z());
        if (A02 == null) {
            this.A0F = new C1099Nw(this.A07, anonymousClass18, it, i10);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new RS(this));
        LE.A0G(1003, this.A0F.A0O());
        if (this.A06.A0o()) {
            C1316Wj c1316Wj2 = this.A07;
            this.A0E = new C1092No(c1316Wj2, this.A08, this.A06, new C6G(c1316Wj2), this.A09, this.A0C, this.A0D, new RR(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC1088Nk(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C1137Pi(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0H());
        this.A0H.A0X(this.A06.A0I());
        this.A0F.A0e(this.A0H);
        this.A0A = new L1(this);
        this.A0A.A05(L0.A03);
        setBackgroundColor(0);
        if (ID.A1K(c1316Wj)) {
            c1316Wj.A09().AFF(mediaView, anonymousClass18.A0U(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A0q = anonymousClass18.A0q();
            String A0B = A0B(68, 18, 1);
            String A0B2 = A0B(36, 16, 21);
            String A0B3 = A0B(52, 16, 9);
            String A0B4 = A0B(26, 10, 122);
            if (!A0q) {
                if (KN.A05(anonymousClass18.A0X())) {
                    jSONObject.put(A0B4, true);
                    jSONObject.put(A0B3, 2);
                    jSONObject.put(A0B2, 1);
                    jSONObject.put(A0B, this.A06.A0L());
                }
            } else {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0L());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C06977l.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        OD A0B = new OB(this.A07, this.A06.A0O().A0E(), this.A06.A0R()).A08(this.A06.A0N().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new RP(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0D().A4v();
            this.A0F.A0X();
        } else {
            this.A07.A0D().A4w();
            if (this.A0F.A0k()) {
                AEt();
                C1316Wj c1316Wj = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[5] = "8j5uXfZ95rl8UwGJAIvPTgfy7qu4v9pG";
                if (ID.A1K(c1316Wj)) {
                    this.A07.A09().AAN();
                }
            }
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0p()) {
            this.A0A.A05(L0.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new N9(this.A07, this.A0D.A62(), this.A0H, this.A0B, this.A08, this.A0C).A08(this.A06.A0U(), str, new HashMap());
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7u() {
        A0F(this.A06.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7v(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7z() {
        this.A0C.A3s(this.A0D.A5Y());
        C1106Od serverSideRewardHandler = new C1106Od(this.A07, this.A0D, this.A06.A0a(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A8e() {
        new Handler(Looper.getMainLooper()).post(new RQ(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void A8k(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        C1099Nw.A0B().incrementAndGet();
        anonymousClass59.A0K(this.A00);
        this.A01 = anonymousClass59;
        A0E();
        if (this.A06.A0O().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AAl() {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AAp() {
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ABT(boolean z10) {
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0R(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void ABd(boolean z10) {
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0S(z10);
        }
        if (z10) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AC2(boolean z10) {
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0T(z10);
        }
        boolean z11 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z11) {
            this.A03 = false;
        } else if (z10) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACE() {
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACh(boolean z10) {
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0U(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACj(boolean z10) {
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0V(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACw(String str) {
        String urlString = this.A06.A0b(str);
        if (urlString == null) {
            return;
        }
        KL.A0E(new KL(), this.A07, KM.A00(urlString), this.A06.A0U());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AEt() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void close() {
        AnonymousClass59 anonymousClass59 = this.A01;
        if (anonymousClass59 == null) {
            return;
        }
        anonymousClass59.finish(4);
    }

    private ViewGroup getMediaView() {
        C1092No c1092No = this.A0E;
        return c1092No != null ? c1092No : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void onDestroy() {
        if (ID.A1K(this.A07)) {
            this.A07.A09().AF4(getMediaView());
        }
        C1092No c1092No = this.A0E;
        if (c1092No != null) {
            c1092No.A0O();
        }
        this.A0A.A03();
        this.A08.A8r(this.A06.A0U(), new N2().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        C1100Nx.A04(this.A06.A0Z());
        C1099Nw.A0B().decrementAndGet();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1029Lc interfaceC1029Lc) {
    }

    public void setRtfActionsJavascriptListener(O6 o6) {
        this.A02 = o6;
    }
}
