package a6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Mp4WebvttSubtitle.java */
/* loaded from: classes2.dex */
public final class b implements r5.g {

    /* renamed from: s, reason: collision with root package name */
    public final List<r5.a> f300s;

    public b(ArrayList arrayList) {
        this.f300s = Collections.unmodifiableList(arrayList);
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
            return this.f300s;
        }
        return Collections.emptyList();
    }

    @Override // r5.g
    public final int d() {
        return 1;
    }
}
