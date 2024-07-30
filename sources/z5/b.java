package z5;

import java.util.Collections;
import java.util.List;
import r5.g;

/* compiled from: Tx3gSubtitle.java */
/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: t, reason: collision with root package name */
    public static final b f37305t = new b();

    /* renamed from: s, reason: collision with root package name */
    public final List<r5.a> f37306s;

    public b(r5.a aVar) {
        this.f37306s = Collections.singletonList(aVar);
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
            return this.f37306s;
        }
        return Collections.emptyList();
    }

    @Override // r5.g
    public final int d() {
        return 1;
    }

    public b() {
        this.f37306s = Collections.emptyList();
    }
}
