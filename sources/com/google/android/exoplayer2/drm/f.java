package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.applovin.exoplayer2.a0;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.e;
import k4.i0;
import l4.w;

/* compiled from: DrmSessionManager.java */
/* loaded from: classes2.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19982a = new a();

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes2.dex */
    public interface b {

        /* renamed from: a0, reason: collision with root package name */
        public static final a0 f19983a0 = new a0(24);

        void release();
    }

    default b c(e.a aVar, i0 i0Var) {
        return b.f19983a0;
    }

    void d(Looper looper, w wVar);

    d e(e.a aVar, i0 i0Var);

    int f(i0 i0Var);

    default void b() {
    }

    default void release() {
    }

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes2.dex */
    public class a implements f {
        @Override // com.google.android.exoplayer2.drm.f
        public final d e(e.a aVar, i0 i0Var) {
            if (i0Var.G == null) {
                return null;
            }
            return new h(new d.a(new o4.k(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.google.android.exoplayer2.drm.f
        public final int f(i0 i0Var) {
            if (i0Var.G != null) {
                return 1;
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.drm.f
        public final void d(Looper looper, w wVar) {
        }
    }
}
