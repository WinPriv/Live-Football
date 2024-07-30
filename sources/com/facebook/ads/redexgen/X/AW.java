package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class AW extends AbstractC1257Tz {
    public final int A00;

    @Nullable
    public final Object A01;

    public AW(TrackGroup trackGroup, int i10) {
        this(trackGroup, i10, 0, null);
    }

    public AW(TrackGroup trackGroup, int i10, int i11, @Nullable Object obj) {
        super(trackGroup, i10);
        this.A00 = i11;
        this.A01 = obj;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final int A7O() {
        return 0;
    }
}
