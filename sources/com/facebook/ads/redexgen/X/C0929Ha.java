package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0929Ha implements PF {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public PE A02 = PE.A05;

    public C0929Ha(View view, int i10, Drawable drawable, Drawable drawable2) {
        this.A03 = i10;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        LE.A0S(this.A07, this.A01);
    }

    private void A04(boolean z10) {
        this.A06.removeCallbacksAndMessages(null);
        if (z10) {
            this.A02 = PE.A06;
            LE.A0S(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C0930Hb(this), this.A03);
            return;
        }
        LE.A0S(this.A07, this.A05);
        this.A02 = PE.A05;
    }

    private void A05(boolean z10) {
        this.A06.removeCallbacksAndMessages(null);
        if (z10) {
            this.A02 = PE.A04;
            LE.A0S(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new C0938Hj(this), this.A03);
            return;
        }
        LE.A0S(this.A07, this.A04);
        this.A02 = PE.A03;
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final void A3M(boolean z10, boolean z11) {
        if (z11) {
            A04(z10);
        } else {
            A05(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final PE A7V() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final void cancel() {
        PE pe;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == PE.A04) {
            pe = PE.A05;
        } else {
            pe = PE.A03;
        }
        this.A02 = pe;
    }
}
