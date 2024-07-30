package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.e;
import java.util.UUID;

/* compiled from: ErrorStateDrmSession.java */
/* loaded from: classes2.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d.a f19984a;

    public h(d.a aVar) {
        this.f19984a = aVar;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final UUID d() {
        return k4.g.f30463a;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final boolean f(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final n4.b g() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final d.a getError() {
        return this.f19984a;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void a(e.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void b(e.a aVar) {
    }
}
