package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class U5 implements FK {
    public final C0884Fh A00;
    public final Map<String, C0890Fn> A01;
    public final Map<String, C0885Fi> A02;
    public final long[] A03;

    public U5(C0884Fh c0884Fh, Map<String, C0890Fn> map, Map<String, C0885Fi> map2) {
        Map<String, C0890Fn> emptyMap;
        this.A00 = c0884Fh;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c0884Fh.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j10) {
        return this.A00.A0D(j10, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i10) {
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j10) {
        int A0A = C0940Hl.A0A(this.A03, j10, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
