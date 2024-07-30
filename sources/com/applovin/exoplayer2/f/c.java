package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f15002b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f15003c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f15007h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f15008i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f15009j;

    /* renamed from: k, reason: collision with root package name */
    private long f15010k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15011l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f15012m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15001a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final f f15004d = new f();

    /* renamed from: e, reason: collision with root package name */
    private final f f15005e = new f();
    private final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f15006g = new ArrayDeque<>();

    public c(HandlerThread handlerThread) {
        this.f15002b = handlerThread;
    }

    private boolean e() {
        if (this.f15010k <= 0 && !this.f15011l) {
            return false;
        }
        return true;
    }

    private void f() {
        g();
        h();
    }

    private void g() {
        IllegalStateException illegalStateException = this.f15012m;
        if (illegalStateException == null) {
            return;
        }
        this.f15012m = null;
        throw illegalStateException;
    }

    private void h() {
        MediaCodec.CodecException codecException = this.f15009j;
        if (codecException == null) {
            return;
        }
        this.f15009j = null;
        throw codecException;
    }

    public int b() {
        synchronized (this.f15001a) {
            int i10 = -1;
            if (e()) {
                return -1;
            }
            f();
            if (!this.f15004d.b()) {
                i10 = this.f15004d.a();
            }
            return i10;
        }
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f15001a) {
            mediaFormat = this.f15007h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f15001a) {
            this.f15009j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f15001a) {
            this.f15004d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f15001a) {
            MediaFormat mediaFormat = this.f15008i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.f15008i = null;
            }
            this.f15005e.a(i10);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f15001a) {
            a(mediaFormat);
            this.f15008i = null;
        }
    }

    private void d() {
        if (!this.f15006g.isEmpty()) {
            this.f15008i = this.f15006g.getLast();
        }
        this.f15004d.c();
        this.f15005e.c();
        this.f.clear();
        this.f15006g.clear();
        this.f15009j = null;
    }

    public void a(MediaCodec mediaCodec) {
        com.applovin.exoplayer2.l.a.b(this.f15003c == null);
        this.f15002b.start();
        Handler handler = new Handler(this.f15002b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f15003c = handler;
    }

    private void c(Runnable runnable) {
        if (this.f15011l) {
            return;
        }
        long j10 = this.f15010k - 1;
        this.f15010k = j10;
        if (j10 > 0) {
            return;
        }
        if (j10 < 0) {
            a(new IllegalStateException());
            return;
        }
        d();
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            a(e10);
        } catch (Exception e11) {
            a(new IllegalStateException(e11));
        }
    }

    public void a() {
        synchronized (this.f15001a) {
            this.f15011l = true;
            this.f15002b.quit();
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(Runnable runnable) {
        synchronized (this.f15001a) {
            c(runnable);
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f15001a) {
            if (e()) {
                return -1;
            }
            f();
            if (this.f15005e.b()) {
                return -1;
            }
            int a10 = this.f15005e.a();
            if (a10 >= 0) {
                com.applovin.exoplayer2.l.a.a(this.f15007h);
                MediaCodec.BufferInfo remove = this.f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (a10 == -2) {
                this.f15007h = this.f15006g.remove();
            }
            return a10;
        }
    }

    public void a(final Runnable runnable) {
        synchronized (this.f15001a) {
            this.f15010k++;
            ((Handler) ai.a(this.f15003c)).post(new Runnable() { // from class: com.applovin.exoplayer2.f.r
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.d(runnable);
                }
            });
        }
    }

    private void a(MediaFormat mediaFormat) {
        this.f15005e.a(-2);
        this.f15006g.add(mediaFormat);
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f15001a) {
            this.f15012m = illegalStateException;
        }
    }
}
