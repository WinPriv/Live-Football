package com.anythink.expressad.exoplayer.i;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f8683a;

    /* renamed from: b, reason: collision with root package name */
    private final f[] f8684b;

    /* renamed from: c, reason: collision with root package name */
    private int f8685c;

    public g(f... fVarArr) {
        this.f8684b = fVarArr;
        this.f8683a = fVarArr.length;
    }

    public final f a(int i10) {
        return this.f8684b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            return Arrays.equals(this.f8684b, ((g) obj).f8684b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8685c == 0) {
            this.f8685c = Arrays.hashCode(this.f8684b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f8685c;
    }

    public final f[] a() {
        return (f[]) this.f8684b.clone();
    }
}
