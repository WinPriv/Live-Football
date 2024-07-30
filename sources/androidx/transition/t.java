package androidx.transition;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: ViewOverlayApi18.java */
/* loaded from: classes.dex */
public final class t implements m3.c, m5.c {

    /* renamed from: s, reason: collision with root package name */
    public final Object f2495s;

    public t(int i10) {
        if (i10 == 4) {
            this.f2495s = new SparseArray();
            return;
        }
        if (i10 == 5) {
            this.f2495s = new ConcurrentLinkedQueue();
        } else if (i10 != 6) {
            this.f2495s = new ArrayList();
        } else {
            this.f2495s = new Bundle();
        }
    }

    @Override // m5.c
    public final long a(long j10) {
        return 0L;
    }

    @Override // m5.c
    public final long c(long j10, long j11) {
        return 0L;
    }

    @Override // m5.c
    public final long d(long j10, long j11) {
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // m5.c
    public final n5.i e(long j10) {
        return (n5.i) this.f2495s;
    }

    @Override // m3.c
    public final a3.x f(a3.x xVar, y2.g gVar) {
        Resources resources = (Resources) this.f2495s;
        if (xVar == null) {
            return null;
        }
        return new h3.e(resources, xVar);
    }

    @Override // m5.c
    public final long g(long j10, long j11) {
        return 0L;
    }

    @Override // m5.c
    public final boolean h() {
        return true;
    }

    @Override // m5.c
    public final long i() {
        return 0L;
    }

    @Override // m5.c
    public final long j(long j10) {
        return 1L;
    }

    @Override // m5.c
    public final long k(long j10, long j11) {
        return 1L;
    }

    public /* synthetic */ t(n5.i iVar) {
        this.f2495s = iVar;
    }

    @Override // m5.c
    public final long b(long j10, long j11) {
        return j11;
    }
}
