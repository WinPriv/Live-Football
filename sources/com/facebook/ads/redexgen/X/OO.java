package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class OO extends FrameLayout {
    public static final int A08 = (int) (Kd.A02 * 16.0f);
    public C9X A00;

    @Nullable
    public C1112Oj A01;

    @Nullable
    public C06856y A02;
    public JF A03;
    public C6Z A04;
    public C6A A05;
    public final C1316Wj A06;
    public final C0954Ib A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(IT it, String str, Map<String, String> map) {
        A02();
        this.A02 = new C06856y(this.A06, it, this.A00, str, map);
        if (ID.A1L(this.A06)) {
            this.A01 = new C1112Oj(this.A06, it, this.A00, str, map);
        } else {
            this.A01 = null;
        }
    }

    public OO(C1316Wj c1316Wj, C0954Ib c0954Ib) {
        super(c1316Wj);
        this.A07 = c0954Ib;
        this.A06 = c1316Wj;
        setUpView(c1316Wj);
    }

    public final void A01() {
        A0e(true, 10);
    }

    public final void A02() {
        C1112Oj c1112Oj = this.A01;
        if (c1112Oj != null) {
            c1112Oj.A0A();
            this.A01 = null;
        }
        C06856y c06856y = this.A02;
        if (c06856y != null) {
            c06856y.A0g();
            this.A02 = null;
        }
    }

    public final void A03(C8O c8o) {
        getEventBus().A05(c8o);
    }

    public final void A05(EnumC1121Os enumC1121Os) {
        A0b(enumC1121Os, 13);
    }

    public final boolean A06() {
        return A0k();
    }

    public P1 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1316Wj c1316Wj) {
        A0X();
        this.A04 = new C6Z(c1316Wj);
        A0c(this.A04);
        this.A03 = new JF(c1316Wj, this.A07);
        A0c(new C06746h(c1316Wj));
        A0c(this.A03);
        this.A05 = new C6A(c1316Wj, true, this.A07);
        A0c(this.A05);
        A0c(new JG(this.A05, P5.A03, true, true));
        if (!A0g() && !ID.A23(c1316Wj)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i10 = A08;
        layoutParams.setMargins(i10, i10, i10, i10);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.9X] */
    private void setUpVideo(final C1316Wj c1316Wj) {
        this.A00 = new P1(c1316Wj) { // from class: com.facebook.ads.redexgen.X.9X
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                int newWidthSpec = View.MeasureSpec.getMode(i10);
                if (newWidthSpec == 1073741824) {
                    i11 = i10;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i11);
                    if (newWidthSpec2 == 1073741824) {
                        i10 = i11;
                    }
                }
                super.onMeasure(i10, i11);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LE.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ON(this));
    }

    private void setUpView(C1316Wj c1316Wj) {
        setUpVideo(c1316Wj);
        setUpPlugins(c1316Wj);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A03.A09();
    }
}
