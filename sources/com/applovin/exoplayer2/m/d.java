package com.applovin.exoplayer2.m;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: classes.dex */
public final class d extends Surface {

    /* renamed from: b, reason: collision with root package name */
    private static int f16439b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f16440c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16441a;

    /* renamed from: d, reason: collision with root package name */
    private final a f16442d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16443e;

    public static synchronized boolean a(Context context) {
        boolean z10;
        synchronized (d.class) {
            if (!f16440c) {
                f16439b = b(context);
                f16440c = true;
            }
            z10 = f16439b != 0;
        }
        return z10;
    }

    private static int b(Context context) {
        if (com.applovin.exoplayer2.l.n.a(context)) {
            if (com.applovin.exoplayer2.l.n.a()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f16442d) {
            if (!this.f16443e) {
                this.f16442d.a();
                this.f16443e = true;
            }
        }
    }

    private d(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f16442d = aVar;
        this.f16441a = z10;
    }

    /* loaded from: classes.dex */
    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private com.applovin.exoplayer2.l.j f16444a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f16445b;

        /* renamed from: c, reason: collision with root package name */
        private Error f16446c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f16447d;

        /* renamed from: e, reason: collision with root package name */
        private d f16448e;

        public a() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i10) {
            com.applovin.exoplayer2.l.a.b(this.f16444a);
            this.f16444a.a(i10);
            this.f16448e = new d(this, this.f16444a.b(), i10 != 0);
        }

        public d a(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f16445b = handler;
            this.f16444a = new com.applovin.exoplayer2.l.j(handler);
            synchronized (this) {
                z10 = false;
                this.f16445b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f16448e == null && this.f16447d == null && this.f16446c == null) {
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
            RuntimeException runtimeException = this.f16447d;
            if (runtimeException == null) {
                Error error = this.f16446c;
                if (error == null) {
                    return (d) com.applovin.exoplayer2.l.a.b(this.f16448e);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    com.applovin.exoplayer2.l.q.c("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f16446c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    com.applovin.exoplayer2.l.q.c("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f16447d = e11;
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
            com.applovin.exoplayer2.l.a.b(this.f16444a);
            this.f16444a.a();
        }

        public void a() {
            com.applovin.exoplayer2.l.a.b(this.f16445b);
            this.f16445b.sendEmptyMessage(2);
        }
    }

    public static d a(Context context, boolean z10) {
        com.applovin.exoplayer2.l.a.b(!z10 || a(context));
        return new a().a(z10 ? f16439b : 0);
    }
}
