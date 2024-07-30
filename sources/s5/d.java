package s5;

import java.util.Collections;
import java.util.List;
import r5.g;

/* compiled from: CeaSubtitle.java */
/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: s, reason: collision with root package name */
    public final List<r5.a> f35210s;

    public d(List<r5.a> list) {
        this.f35210s = list;
    }

    @Override // r5.g
    public final int a(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override // r5.g
    public final long b(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        return 0L;
    }

    @Override // r5.g
    public final List<r5.a> c(long j10) {
        if (j10 >= 0) {
            return this.f35210s;
        }
        return Collections.emptyList();
    }

    @Override // r5.g
    public final int d() {
        return 1;
    }
}
