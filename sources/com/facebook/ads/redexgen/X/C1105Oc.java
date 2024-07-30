package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1105Oc {
    public final AnonymousClass19 A00;
    public final C1I A01;
    public final C1M A02;
    public final C1U A03;
    public final C1316Wj A04;
    public final C0954Ib A05;
    public static String[] A06 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A09 = (int) (Kd.A02 * 4.0f);
    public static final int A07 = (int) (Kd.A02 * 72.0f);
    public static final int A08 = (int) (Kd.A02 * 8.0f);

    public C1105Oc(C1316Wj c1316Wj, IT it, AnonymousClass18 anonymousClass18) {
        this.A04 = c1316Wj;
        this.A05 = new C0954Ib(anonymousClass18.A0U(), it);
        this.A00 = anonymousClass18.A0N();
        this.A01 = anonymousClass18.A0O().A0E();
        this.A03 = anonymousClass18.A0R();
        this.A02 = anonymousClass18.A0O().A0G();
    }

    private View A00() {
        C0849Dw c0849Dw = new C0849Dw(this.A04);
        c0849Dw.setLayoutManager(new C1343Xk(this.A04, 0, false));
        c0849Dw.setAdapter(new C1161Qg(this.A04, this.A02.A00(), A09));
        return c0849Dw;
    }

    private View A01(@Nullable ViewOnClickListenerC1193Rm viewOnClickListenerC1193Rm) {
        NO no = new NO(this.A04, this.A00.A01(), true, false, false);
        no.A01(this.A01.A06(), this.A01.A01(), null, false, true);
        no.setAlignment(17);
        NI ni = new NI(this.A04);
        LE.A0M(ni, 0);
        ni.setRadius(50);
        new AsyncTaskC1195Ro(ni, this.A04).A04().A07(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i10 = A07;
        linearLayout.addView(ni, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = A08;
        imageParams.setMargins(0, i11, 0, i11);
        linearLayout.addView(no, imageParams);
        if (viewOnClickListenerC1193Rm != null) {
            LE.A0J(viewOnClickListenerC1193Rm);
            linearLayout.addView(viewOnClickListenerC1193Rm, imageParams);
            if (TextUtils.isEmpty(viewOnClickListenerC1193Rm.getText())) {
                LE.A0H(viewOnClickListenerC1193Rm);
            }
        }
        return linearLayout;
    }

    private final EnumC1104Ob A02() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC1104Ob.A04;
        }
        EnumC1104Ob enumC1104Ob = EnumC1104Ob.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A06[4] = "qwlEjiYhEcV8j1J";
        return enumC1104Ob;
    }

    public final Pair<EnumC1104Ob, View> A03(@Nullable ViewOnClickListenerC1193Rm viewOnClickListenerC1193Rm) {
        View A00;
        EnumC1104Ob A02 = A02();
        if (C1103Oa.A00[A02.ordinal()] != 1) {
            A00 = A01(viewOnClickListenerC1193Rm);
        } else {
            A00 = A00();
        }
        C0956Id.A04(A00, this.A05, EnumC0953Ia.A0S);
        return new Pair<>(A02, A00);
    }
}
