package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* loaded from: classes.dex */
public final class x extends aq {

    /* renamed from: a */
    public static final g.a<x> f16877a = new a0(10);

    /* renamed from: c */
    private final boolean f16878c;

    /* renamed from: d */
    private final boolean f16879d;

    public x() {
        this.f16878c = false;
        this.f16879d = false;
    }

    public static x a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 0);
        if (bundle.getBoolean(a(1), false)) {
            return new x(bundle.getBoolean(a(2), false));
        }
        return new x();
    }

    public static /* synthetic */ x c(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f16879d != xVar.f16879d || this.f16878c != xVar.f16878c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f16878c), Boolean.valueOf(this.f16879d));
    }

    public x(boolean z10) {
        this.f16878c = true;
        this.f16879d = z10;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
