package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

/* loaded from: classes.dex */
public abstract class aq implements g {

    /* renamed from: b */
    public static final g.a<aq> f13248b = new k0(3);

    public static aq a(Bundle bundle) {
        int i10 = bundle.getInt(a(0), -1);
        if (i10 == 0) {
            return x.f16877a.fromBundle(bundle);
        }
        if (i10 == 1) {
            return aj.f13186a.fromBundle(bundle);
        }
        if (i10 == 2) {
            return ax.f13307a.fromBundle(bundle);
        }
        if (i10 == 3) {
            return az.f13318a.fromBundle(bundle);
        }
        throw new IllegalArgumentException(a3.l.i("Encountered unknown rating type: ", i10));
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
