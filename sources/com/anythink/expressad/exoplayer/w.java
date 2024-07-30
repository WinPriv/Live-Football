package com.anythink.expressad.exoplayer;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.anythink.expressad.exoplayer.h.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface w {

    /* renamed from: h, reason: collision with root package name */
    public static final int f9350h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f9351i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f9352j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f9353k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f9354l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f9355m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f9356n = 2;
    public static final int o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f9357p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f9358q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f9359r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final int f9360s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final int f9361t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f9362u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f9363v = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
        void onLoadingChanged(boolean z10);

        void onPlaybackParametersChanged(v vVar);

        void onPlayerError(com.anythink.expressad.exoplayer.g gVar);

        void onPlayerStateChanged(boolean z10, int i10);

        void onPositionDiscontinuity(int i10);

        void onRepeatModeChanged(int i10);

        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z10);

        void onTimelineChanged(ae aeVar, Object obj, int i10);

        void onTracksChanged(af afVar, com.anythink.expressad.exoplayer.i.g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface f {
    }

    /* loaded from: classes.dex */
    public interface g {
        int H();

        void I();

        void a(Surface surface);

        void a(SurfaceHolder surfaceHolder);

        void a(SurfaceView surfaceView);

        void a(TextureView textureView);

        void a(com.anythink.expressad.exoplayer.l.g gVar);

        void b(Surface surface);

        void b(SurfaceHolder surfaceHolder);

        void b(SurfaceView surfaceView);

        void b(TextureView textureView);

        void b(com.anythink.expressad.exoplayer.l.g gVar);

        void d(int i10);
    }

    int A();

    long B();

    int C();

    af D();

    com.anythink.expressad.exoplayer.i.g E();

    ae F();

    Object G();

    void a(int i10);

    void a(int i10, long j10);

    void a(long j10);

    void a(v vVar);

    void a(c cVar);

    void a(boolean z10);

    g b();

    void b(int i10);

    void b(c cVar);

    void b(boolean z10);

    int c(int i10);

    e c();

    void c(boolean z10);

    int d();

    com.anythink.expressad.exoplayer.g e();

    boolean f();

    int g();

    boolean h();

    boolean i();

    void j();

    v k();

    Object l();

    void m();

    void n();

    int o();

    int p();

    int q();

    int r();

    long s();

    long t();

    long u();

    int v();

    boolean w();

    boolean x();

    boolean y();

    int z();

    /* loaded from: classes.dex */
    public static abstract class a implements c {
        @Deprecated
        private static void a() {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onSeekProcessed() {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onLoadingChanged(boolean z10) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onPlaybackParametersChanged(v vVar) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onPlayerError(com.anythink.expressad.exoplayer.g gVar) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onPositionDiscontinuity(int i10) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onRepeatModeChanged(int i10) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onShuffleModeEnabledChanged(boolean z10) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onTracksChanged(af afVar, com.anythink.expressad.exoplayer.i.g gVar) {
        }

        @Override // com.anythink.expressad.exoplayer.w.c
        public void onTimelineChanged(ae aeVar, Object obj, int i10) {
        }
    }
}
