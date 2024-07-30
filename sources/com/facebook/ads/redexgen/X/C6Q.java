package com.facebook.ads.redexgen.X;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Q extends M1 {
    public static String[] A01 = {"4h8fvEACfo1aNbNL", "KiY64Fil", "L", "TPcthrsJz3ToBiwYAQ4xewU", "cWfSExW1cmjdZd3Ek8eXqqhjC3VFU", "NINEnIjXlG8iO8hrf55I2V2lHb1VufX", "CO", "8GF4DU4RrtKBXlYvExHV9F2Nh74lSozH"};
    public final C8O<K5> A00;

    public C6Q(C1316Wj c1316Wj) {
        this(c1316Wj, null);
    }

    public C6Q(C1316Wj c1316Wj, AttributeSet attributeSet) {
        this(c1316Wj, attributeSet, 0);
    }

    public C6Q(C1316Wj c1316Wj, AttributeSet attributeSet, int i10) {
        super(c1316Wj, attributeSet, i10);
        this.A00 = new IZ(this);
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams spinnerParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            P1 videoView = getVideoView();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[7] = "LLc1CvKTLQ71W60sfu5S1t2gX7MmeGtJ";
            videoView.getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void A08() {
        if (getVideoView() != null) {
            C8N<C8O, C8M> eventBus = getVideoView().getEventBus();
            C8O<K5> c8o = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "4Zu3PRCBzV1MZjgNBq7KORh";
            strArr2[1] = "VnRIjxfO";
            eventBus.A06(c8o);
        }
        setVisibility(8);
        super.A08();
    }
}
