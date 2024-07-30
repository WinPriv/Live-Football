package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IX extends RelativeLayout implements InterfaceC1122Ot {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public C8O A03;
    public C8O A04;
    public C8O A05;
    public C8O A06;

    @Nullable
    public P1 A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (Kd.A02 * 6.0f);
    }

    public IX(C1316Wj c1316Wj) {
        this(c1316Wj, A09, -12549889, 0);
    }

    public IX(C1316Wj c1316Wj, int i10, int i11, int i12) {
        super(c1316Wj);
        this.A00 = -1;
        this.A06 = new AbstractC0993Jq() { // from class: com.facebook.ads.redexgen.X.64
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06826r c06826r) {
                P1 p12;
                p12 = IX.this.A07;
                if (p12 != null) {
                    IX ix = IX.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    ix.A07(true);
                }
            }
        };
        this.A04 = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.4p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                IX.this.A02();
            }
        };
        this.A05 = new K6() { // from class: com.facebook.ads.redexgen.X.4h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KV kv) {
                P1 p12;
                p12 = IX.this.A07;
                if (p12 != null) {
                    IX.this.A07(true);
                }
            }
        };
        this.A03 = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.4V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                P1 p12;
                p12 = IX.this.A07;
                if (p12 != null) {
                    IX.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1316Wj, null, R.attr.progressBarStyleHorizontal);
        A06(i11, i12);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i10, int i11) {
        ColorDrawable colorDrawable = new ColorDrawable(i11);
        ColorDrawable colorDrawable2 = new ColorDrawable(i11);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i10), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z10) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int progress = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int duration2 = this.A00;
        if (duration2 >= progress || duration <= currentPositionInMillis) {
            return;
        }
        if (z10) {
            this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), duration2, progress);
            ObjectAnimator objectAnimator = this.A01;
            int position = Math.min(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, duration - currentPositionInMillis);
            objectAnimator.setDuration(position);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(progress);
        }
        this.A00 = progress;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void A8l(P1 p12) {
        this.A07 = p12;
        p12.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void AF5(P1 p12) {
        p12.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
