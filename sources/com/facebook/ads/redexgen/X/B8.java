package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.B9;

@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public interface B8<T extends B9> {
    B7<T> A2P(Looper looper, DrmInitData drmInitData);

    boolean A3x(DrmInitData drmInitData);

    void ADl(B7<T> b72);
}
