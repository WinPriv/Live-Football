package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16076a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<aa> f16077b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f16078c;

    /* renamed from: d, reason: collision with root package name */
    private l f16079d;

    public e(boolean z10) {
        this.f16076a = z10;
    }

    @Override // com.applovin.exoplayer2.k.i
    public final void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        if (this.f16077b.contains(aaVar)) {
            return;
        }
        this.f16077b.add(aaVar);
        this.f16078c++;
    }

    public final void b(l lVar) {
        for (int i10 = 0; i10 < this.f16078c; i10++) {
            this.f16077b.get(i10).a(this, lVar, this.f16076a);
        }
    }

    public final void c(l lVar) {
        this.f16079d = lVar;
        for (int i10 = 0; i10 < this.f16078c; i10++) {
            this.f16077b.get(i10).b(this, lVar, this.f16076a);
        }
    }

    public final void d() {
        l lVar = (l) ai.a(this.f16079d);
        for (int i10 = 0; i10 < this.f16078c; i10++) {
            this.f16077b.get(i10).c(this, lVar, this.f16076a);
        }
        this.f16079d = null;
    }

    public final void a(int i10) {
        l lVar = (l) ai.a(this.f16079d);
        for (int i11 = 0; i11 < this.f16078c; i11++) {
            this.f16077b.get(i11).a(this, lVar, this.f16076a, i10);
        }
    }
}
