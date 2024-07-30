package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6R extends M1 implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final AbstractC1044Lr A00;
    public final AbstractC1011Kk A01;
    public final K6 A02;
    public final K2 A03;
    public final PD A04;

    public C6R(C1316Wj c1316Wj) {
        this(c1316Wj, null);
    }

    public C6R(C1316Wj c1316Wj, AttributeSet attributeSet) {
        this(c1316Wj, attributeSet, 0);
    }

    public C6R(C1316Wj c1316Wj, AttributeSet attributeSet, int i10) {
        super(c1316Wj, attributeSet, i10);
        this.A03 = new K2() { // from class: com.facebook.ads.redexgen.X.6Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(K5 k52) {
                C6R.this.setVisibility(0);
            }
        };
        this.A01 = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.6X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                PD pd;
                pd = C6R.this.A04;
                pd.setChecked(true);
            }
        };
        this.A02 = new K6() { // from class: com.facebook.ads.redexgen.X.6W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KV kv) {
                PD pd;
                pd = C6R.this.A04;
                pd.setChecked(false);
            }
        };
        this.A00 = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.6S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                PD pd;
                pd = C6R.this.A04;
                pd.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new PD(c1316Wj);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            P1 videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC1134Pf.A07 || videoView.getState() == EnumC1134Pf.A05 || videoView.getState() == EnumC1134Pf.A06) {
                videoView.A0b(EnumC1121Os.A04, 11);
            } else if (videoView.getState() == EnumC1134Pf.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            C0990Jm.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
