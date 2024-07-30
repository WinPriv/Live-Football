package com.applovin.exoplayer2.b;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.l.w;
import com.applovin.exoplayer2.m.n;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import d6.g0;
import d6.u;
import e6.m;
import java.util.Iterator;
import java.util.Map;
import m4.k;
import t7.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13369s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13370t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13371u;

    public /* synthetic */ d0(int i10, Object obj, Object obj2) {
        this.f13369s = i10;
        this.f13370t = obj;
        this.f13371u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.f13369s) {
            case 0:
                ((g.a) this.f13370t).c((com.applovin.exoplayer2.c.e) this.f13371u);
                return;
            case 1:
                ((g.a) this.f13370t).c((Exception) this.f13371u);
                return;
            case 2:
                ((com.applovin.exoplayer2.l.w) this.f13370t).b((w.b) this.f13371u);
                return;
            case 3:
                ((n.a) this.f13370t).b((Exception) this.f13371u);
                return;
            case 4:
                k.a aVar = (k.a) this.f13370t;
                Exception exc = (Exception) this.f13371u;
                aVar.getClass();
                int i11 = g0.f27302a;
                aVar.f32748b.q(exc);
                return;
            case 5:
                e.a aVar2 = (e.a) this.f13370t;
                ((com.google.android.exoplayer2.drm.e) this.f13371u).I(aVar2.f19977a, aVar2.f19978b);
                return;
            case 6:
            default:
                Runnable runnable = (Runnable) this.f13370t;
                h.b bVar = (h.b) this.f13371u;
                try {
                    runnable.run();
                    t7.h hVar = t7.h.this;
                    hVar.getClass();
                    if (r.a.f34756x.b(hVar, null, r.a.y)) {
                        r.a.d(hVar);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ((h.a) bVar).a(e10);
                    return;
                }
            case 7:
                d6.u uVar = (d6.u) this.f13370t;
                u.a aVar3 = (u.a) this.f13371u;
                synchronized (uVar.f27375c) {
                    i10 = uVar.f27376d;
                }
                aVar3.onNetworkTypeChanged(i10);
                return;
            case 8:
                m.a aVar4 = (m.a) this.f13370t;
                String str = (String) this.f13371u;
                aVar4.getClass();
                int i12 = g0.f27302a;
                aVar4.f27841b.c(str);
                return;
            case 9:
                m.a aVar5 = (m.a) this.f13370t;
                Exception exc2 = (Exception) this.f13371u;
                aVar5.getClass();
                int i13 = g0.f27302a;
                aVar5.f27841b.r(exc2);
                return;
            case 10:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f13370t;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f13371u;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.y;
                Surface surface = sphericalGLSurfaceView.f20402z;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.y = surfaceTexture;
                sphericalGLSurfaceView.f20402z = surface2;
                Iterator<SphericalGLSurfaceView.b> it = sphericalGLSurfaceView.f20396s.iterator();
                while (it.hasNext()) {
                    it.next().y(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 11:
                s7.q qVar = (s7.q) this.f13370t;
                c8.a aVar6 = (c8.a) this.f13371u;
                synchronized (qVar) {
                    if (qVar.f35252b == null) {
                        qVar.f35251a.add(aVar6);
                    } else {
                        qVar.f35252b.add(aVar6.get());
                    }
                }
                return;
            case 12:
                Map.Entry entry = (Map.Entry) this.f13370t;
                ((z7.b) entry.getKey()).a((z7.a) this.f13371u);
                return;
        }
    }
}
