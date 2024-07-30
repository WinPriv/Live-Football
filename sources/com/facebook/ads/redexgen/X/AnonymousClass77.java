package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass77 extends SH {
    public static byte[] A0E;
    public static String[] A0F = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;

    @Nullable
    public LinearLayout A02;
    public C1375Ys A03;
    public C6G A04;

    @Nullable
    public C2M A05;

    @Nullable
    public NH A06;
    public C1176Qv A07;

    @DoNotStrip
    public AbstractC1136Ph A08;
    public C1137Pi A09;
    public String A0A;
    public List<OM> A0B;
    public final C1316Wj A0C;
    public final L6 A0D;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    public static void A09() {
        A0E = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114};
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x011f, code lost:
    
        if (r5 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0121, code lost:
    
        r4.A0C.A09().AFD(r4.A05, ((com.facebook.ads.redexgen.X.SH) r4).A08.A0U(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0132, code lost:
    
        r4.A0U(r4.A02, false, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0137, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013f, code lost:
    
        if (r5 != false) goto L21;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0B(int r18, @androidx.annotation.Nullable android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass77.A0B(int, android.os.Bundle):void");
    }

    static {
        A09();
        A0G = (int) (Kd.A02 * 48.0f);
        A0H = (int) (Kd.A02 * 8.0f);
        A0I = (int) (Kd.A02 * 8.0f);
        A0K = (int) (Kd.A02 * 56.0f);
        A0J = (int) (Kd.A02 * 12.0f);
    }

    public AnonymousClass77(C1316Wj c1316Wj, IT it, C6G c6g, InterfaceC1029Lc interfaceC1029Lc, C1375Ys c1375Ys) {
        super(c1316Wj, it, interfaceC1029Lc, c1375Ys);
        this.A0D = new L6();
        this.A04 = c6g;
        this.A0C = c1316Wj;
    }

    private final void A0A() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2M c2m = this.A05;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A05 = null;
        }
        NH nh = this.A06;
        if (nh != null) {
            nh.removeAllViews();
            this.A06 = null;
        }
    }

    private void A0C(C1375Ys c1375Ys) {
        this.A03 = c1375Ys;
        this.A0A = this.A03.A0U();
        this.A00 = this.A03.A0H();
        this.A01 = this.A03.A0I();
        List<C1B> A0c = this.A03.A0c();
        List<AdInfo> adInfoList = new ArrayList<>(A0c.size());
        this.A0B = adInfoList;
        for (int i10 = 0; i10 < A0c.size(); i10++) {
            C1B c1b = A0c.get(i10);
            List<OM> list = this.A0B;
            int i11 = A0c.size();
            list.add(new OM(i10, i11, c1b));
        }
    }

    private void A0D(C1176Qv c1176Qv) {
        new C0850Dx().A0G(this.A05);
        c1176Qv.A0Z(new C1166Ql(this));
        this.A06 = new NH(this.A0C, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void A8k(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        C1375Ys dataBundle = (C1375Ys) intent.getSerializableExtra(A07(0, 14, 93));
        A0V(anonymousClass59);
        A0C(dataBundle);
        A0B(anonymousClass59.A0H().getResources().getConfiguration().orientation, bundle);
        anonymousClass59.A0K(new C1165Qk(this, anonymousClass59));
        C1375Ys dataBundle2 = super.A08;
        int A03 = dataBundle2.A0O().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void ABd(boolean z10) {
        super.ABd(z10);
        C1176Qv c1176Qv = this.A07;
        if (c1176Qv != null) {
            c1176Qv.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AC2(boolean z10) {
        super.AC2(z10);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AEA(Bundle bundle) {
        C1176Qv c1176Qv = this.A07;
        if (c1176Qv != null) {
            c1176Qv.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEA(bundle);
        A0A();
        A0B(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void onDestroy() {
        super.onDestroy();
        if (ID.A1K(this.A0C)) {
            this.A0C.A09().AF4(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0A.A8r(this.A0A, new N2().A03(this.A09).A02(this.A0D).A05());
        }
        A0A();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A06(this.A0C, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
