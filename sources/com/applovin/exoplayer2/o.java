package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final o f16572a = new o(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final g.a<o> f16573e = new a0(9);

    /* renamed from: b, reason: collision with root package name */
    public final int f16574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16575c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16576d;

    public o(int i10, int i11, int i12) {
        this.f16574b = i10;
        this.f16575c = i11;
        this.f16576d = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f16574b == oVar.f16574b && this.f16575c == oVar.f16575c && this.f16576d == oVar.f16576d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f16574b) * 31) + this.f16575c) * 31) + this.f16576d;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
