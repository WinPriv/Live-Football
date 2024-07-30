package b5;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque<a> f2907g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2908h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f2909a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f2910b;

    /* renamed from: c, reason: collision with root package name */
    public d f2911c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f2912d;

    /* renamed from: e, reason: collision with root package name */
    public final d6.e f2913e;
    public boolean f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2914a;

        /* renamed from: b, reason: collision with root package name */
        public int f2915b;

        /* renamed from: c, reason: collision with root package name */
        public int f2916c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f2917d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f2918e;
        public int f;
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        d6.e eVar = new d6.e();
        this.f2909a = mediaCodec;
        this.f2910b = handlerThread;
        this.f2913e = eVar;
        this.f2912d = new AtomicReference<>();
    }

    public final void a() {
        if (this.f) {
            try {
                d dVar = this.f2911c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                d6.e eVar = this.f2913e;
                synchronized (eVar) {
                    eVar.f27296a = false;
                }
                d dVar2 = this.f2911c;
                dVar2.getClass();
                dVar2.obtainMessage(2).sendToTarget();
                synchronized (eVar) {
                    while (!eVar.f27296a) {
                        eVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void b() {
        RuntimeException andSet = this.f2912d.getAndSet(null);
        if (andSet == null) {
        } else {
            throw andSet;
        }
    }
}
