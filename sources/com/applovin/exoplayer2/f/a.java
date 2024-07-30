package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.f.a;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.l.ah;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f14977a;

    /* renamed from: b, reason: collision with root package name */
    private final c f14978b;

    /* renamed from: c, reason: collision with root package name */
    private final b f14979c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14980d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14981e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private Surface f14982g;

    /* renamed from: com.applovin.exoplayer2.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0171a implements g.b {

        /* renamed from: b, reason: collision with root package name */
        private final Supplier<HandlerThread> f14983b;

        /* renamed from: c, reason: collision with root package name */
        private final Supplier<HandlerThread> f14984c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f14985d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f14986e;

        public C0171a(final int i10, boolean z10, boolean z11) {
            this(new Supplier() { // from class: com.applovin.exoplayer2.f.p
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    HandlerThread b10;
                    b10 = a.C0171a.b(i10);
                    return b10;
                }
            }, new Supplier() { // from class: com.applovin.exoplayer2.f.q
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    HandlerThread a10;
                    a10 = a.C0171a.a(i10);
                    return a10;
                }
            }, z10, z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(a.g(i10));
        }

        public C0171a(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z10, boolean z11) {
            this.f14983b = supplier;
            this.f14984c = supplier2;
            this.f14985d = z10;
            this.f14986e = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(a.f(i10));
        }

        @Override // com.applovin.exoplayer2.f.g.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(g.a aVar) throws IOException {
            MediaCodec mediaCodec;
            a aVar2;
            String str = aVar.f15023a.f15032a;
            a aVar3 = null;
            try {
                ah.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    aVar2 = new a(mediaCodec, this.f14983b.get(), this.f14984c.get(), this.f14985d, this.f14986e);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodec = null;
            }
            try {
                ah.a();
                aVar2.a(aVar.f15024b, aVar.f15026d, aVar.f15027e, aVar.f, aVar.f15028g);
                return aVar2;
            } catch (Exception e12) {
                e = e12;
                aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.e();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    private void f() {
        if (this.f14980d) {
            try {
                this.f14979c.d();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(int i10) {
        return a(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // com.applovin.exoplayer2.f.g
    public int b() {
        return this.f14978b.b();
    }

    @Override // com.applovin.exoplayer2.f.g
    public MediaFormat c() {
        return this.f14978b.c();
    }

    private a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f14977a = mediaCodec;
        this.f14978b = new c(handlerThread);
        this.f14979c = new b(mediaCodec, handlerThread2, z10);
        this.f14980d = z11;
        this.f = 0;
    }

    @Override // com.applovin.exoplayer2.f.g
    public boolean a() {
        return false;
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer b(int i10) {
        return this.f14977a.getOutputBuffer(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void c(int i10) {
        f();
        this.f14977a.setVideoScalingMode(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void d() {
        this.f14979c.b();
        this.f14977a.flush();
        c cVar = this.f14978b;
        final MediaCodec mediaCodec = this.f14977a;
        Objects.requireNonNull(mediaCodec);
        cVar.a(new Runnable() { // from class: com.applovin.exoplayer2.f.o
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.applovin.exoplayer2.f.g
    public void e() {
        try {
            if (this.f == 1) {
                this.f14979c.c();
                this.f14978b.a();
            }
            this.f = 2;
        } finally {
            Surface surface = this.f14982g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f14981e) {
                this.f14977a.release();
                this.f14981e = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
        this.f14978b.a(this.f14977a);
        ah.a("configureCodec");
        this.f14977a.configure(mediaFormat, surface, mediaCrypto, i10);
        ah.a();
        if (z10) {
            this.f14982g = this.f14977a.createInputSurface();
        }
        this.f14979c.a();
        ah.a("startCodec");
        this.f14977a.start();
        ah.a();
        this.f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(int i10) {
        return a(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f14979c.a(i10, i11, i12, j10, i13);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12) {
        this.f14979c.a(i10, i11, cVar, j10, i12);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, boolean z10) {
        this.f14977a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, long j10) {
        this.f14977a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f14978b.a(bufferInfo);
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer a(int i10) {
        return this.f14977a.getInputBuffer(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(final g.c cVar, Handler handler) {
        f();
        this.f14977a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.exoplayer2.f.n
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                a.this.a(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Surface surface) {
        f();
        this.f14977a.setOutputSurface(surface);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Bundle bundle) {
        f();
        this.f14977a.setParameters(bundle);
    }

    private static String a(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }
}
