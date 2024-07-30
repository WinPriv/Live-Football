package com.applovin.exoplayer2.m;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

/* loaded from: classes.dex */
public final class o implements com.applovin.exoplayer2.g {

    /* renamed from: a, reason: collision with root package name */
    public static final o f16538a = new o(0, 0);
    public static final g.a<o> f = new com.applovin.exoplayer2.a.l(8);

    /* renamed from: b, reason: collision with root package name */
    public final int f16539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16540c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16541d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16542e;

    public o(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f16539b == oVar.f16539b && this.f16540c == oVar.f16540c && this.f16541d == oVar.f16541d && this.f16542e == oVar.f16542e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f16542e) + ((((((217 + this.f16539b) * 31) + this.f16540c) * 31) + this.f16541d) * 31);
    }

    public o(int i10, int i11, int i12, float f10) {
        this.f16539b = i10;
        this.f16540c = i11;
        this.f16541d = i12;
        this.f16542e = f10;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
