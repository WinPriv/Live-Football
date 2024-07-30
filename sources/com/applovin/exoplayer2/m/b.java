package com.applovin.exoplayer2.m;

import android.os.Bundle;
import com.applovin.exoplayer2.d.w;
import com.applovin.exoplayer2.g;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements com.applovin.exoplayer2.g {

    /* renamed from: e, reason: collision with root package name */
    public static final g.a<b> f16431e = new w(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f16432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16434c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16435d;
    private int f;

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f16432a = i10;
        this.f16433b = i11;
        this.f16434c = i12;
        this.f16435d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f16432a == bVar.f16432a && this.f16433b == bVar.f16433b && this.f16434c == bVar.f16434c && Arrays.equals(this.f16435d, bVar.f16435d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.f16435d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f16432a) * 31) + this.f16433b) * 31) + this.f16434c) * 31);
        }
        return this.f;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f16432a);
        sb2.append(", ");
        sb2.append(this.f16433b);
        sb2.append(", ");
        sb2.append(this.f16434c);
        sb2.append(", ");
        if (this.f16435d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b a(Bundle bundle) {
        return new b(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }
}
