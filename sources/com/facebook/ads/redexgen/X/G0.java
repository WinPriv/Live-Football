package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class G0 implements Comparator<Format> {
    public G0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Format format, Format format2) {
        return format2.A04 - format.A04;
    }
}
