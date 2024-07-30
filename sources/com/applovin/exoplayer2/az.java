package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* loaded from: classes.dex */
public final class az extends aq {

    /* renamed from: a */
    public static final g.a<az> f13318a = new k0(4);

    /* renamed from: c */
    private final boolean f13319c;

    /* renamed from: d */
    private final boolean f13320d;

    public az() {
        this.f13319c = false;
        this.f13320d = false;
    }

    public static az a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 3);
        if (bundle.getBoolean(a(1), false)) {
            return new az(bundle.getBoolean(a(2), false));
        }
        return new az();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        if (this.f13320d != azVar.f13320d || this.f13319c != azVar.f13319c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f13319c), Boolean.valueOf(this.f13320d));
    }

    public az(boolean z10) {
        this.f13319c = true;
        this.f13320d = z10;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
