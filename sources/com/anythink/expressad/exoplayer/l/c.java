package com.anythink.expressad.exoplayer.l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.anythink.expressad.exoplayer.k.af;

@TargetApi(17)
/* loaded from: classes.dex */
public final class c extends Surface {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9174b = "DummySurface";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9175c = "EGL_EXT_protected_content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9176d = "EGL_KHR_surfaceless_context";

    /* renamed from: e, reason: collision with root package name */
    private static int f9177e;
    private static boolean f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9178a;

    /* renamed from: g, reason: collision with root package name */
    private final a f9179g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9180h;

    public /* synthetic */ c(a aVar, SurfaceTexture surfaceTexture, boolean z10, byte b10) {
        this(aVar, surfaceTexture, z10);
    }

    public static synchronized boolean a(Context context) {
        int i10;
        String eglQueryString;
        int i11;
        synchronized (c.class) {
            if (!f) {
                int i12 = af.f8993a;
                if (i12 >= 24 && ((i12 >= 26 || (!"samsung".equals(af.f8995c) && !"XT1650".equals(af.f8996d))) && ((i12 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(f9175c)))) {
                    i11 = eglQueryString.contains(f9176d) ? 1 : 2;
                    f9177e = i11;
                    f = true;
                }
                i11 = 0;
                f9177e = i11;
                f = true;
            }
            i10 = f9177e;
        }
        return i10 != 0;
    }

    @TargetApi(24)
    private static int b(Context context) {
        String eglQueryString;
        int i10 = af.f8993a;
        if (i10 < 26 && ("samsung".equals(af.f8995c) || "XT1650".equals(af.f8996d))) {
            return 0;
        }
        if ((i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(f9175c)) {
            return 0;
        }
        if (eglQueryString.contains(f9176d)) {
            return 1;
        }
        return 2;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f9179g) {
            if (!this.f9180h) {
                this.f9179g.a();
                this.f9180h = true;
            }
        }
    }

    private c(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f9179g = aVar;
        this.f9178a = z10;
    }

    /* loaded from: classes.dex */
    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private static final int f9181a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f9182b = 2;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.k.g f9183c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f9184d;

        /* renamed from: e, reason: collision with root package name */
        private Error f9185e;
        private RuntimeException f;

        /* renamed from: g, reason: collision with root package name */
        private c f9186g;

        public a() {
            super("dummySurface");
        }

        private void b(int i10) {
            com.anythink.expressad.exoplayer.k.a.a(this.f9183c);
            this.f9183c.a(i10);
            this.f9186g = new c(this, this.f9183c.b(), i10 != 0, (byte) 0);
        }

        public final c a(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f9184d = handler;
            this.f9183c = new com.anythink.expressad.exoplayer.k.g(handler);
            synchronized (this) {
                z10 = false;
                this.f9184d.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f9186g == null && this.f == null && this.f9185e == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f;
            if (runtimeException == null) {
                Error error = this.f9185e;
                if (error == null) {
                    return (c) com.anythink.expressad.exoplayer.k.a.a(this.f9186g);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean z10;
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        com.anythink.expressad.exoplayer.k.a.a(this.f9183c);
                        this.f9183c.a();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    int i11 = message.arg1;
                    com.anythink.expressad.exoplayer.k.a.a(this.f9183c);
                    this.f9183c.a(i11);
                    SurfaceTexture b10 = this.f9183c.b();
                    byte b11 = 0;
                    if (i11 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f9186g = new c(this, b10, z10, b11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    Log.e(c.f9174b, "Failed to initialize dummy surface", e10);
                    this.f9185e = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    Log.e(c.f9174b, "Failed to initialize dummy surface", e11);
                    this.f = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void b() {
            com.anythink.expressad.exoplayer.k.a.a(this.f9183c);
            this.f9183c.a();
        }

        public final void a() {
            com.anythink.expressad.exoplayer.k.a.a(this.f9184d);
            this.f9184d.sendEmptyMessage(2);
        }
    }

    private static void a() {
        if (af.f8993a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public static c a(Context context, boolean z10) {
        if (af.f8993a >= 17) {
            com.anythink.expressad.exoplayer.k.a.b(!z10 || a(context));
            return new a().a(z10 ? f9177e : 0);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }
}
