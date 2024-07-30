package b5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: AsynchronousMediaCodecCallback.java */
/* loaded from: classes2.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f2920b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f2921c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f2925h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f2926i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f2927j;

    /* renamed from: k, reason: collision with root package name */
    public long f2928k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2929l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f2930m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2919a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final j f2922d = new j();

    /* renamed from: e, reason: collision with root package name */
    public final j f2923e = new j();
    public final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f2924g = new ArrayDeque<>();

    public f(HandlerThread handlerThread) {
        this.f2920b = handlerThread;
    }

    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f2924g;
        if (!arrayDeque.isEmpty()) {
            this.f2926i = arrayDeque.getLast();
        }
        j jVar = this.f2922d;
        jVar.f2934a = 0;
        jVar.f2935b = -1;
        jVar.f2936c = 0;
        j jVar2 = this.f2923e;
        jVar2.f2934a = 0;
        jVar2.f2935b = -1;
        jVar2.f2936c = 0;
        this.f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f2919a) {
            this.f2927j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f2919a) {
            this.f2922d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f2919a) {
            MediaFormat mediaFormat = this.f2926i;
            if (mediaFormat != null) {
                this.f2923e.a(-2);
                this.f2924g.add(mediaFormat);
                this.f2926i = null;
            }
            this.f2923e.a(i10);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f2919a) {
            this.f2923e.a(-2);
            this.f2924g.add(mediaFormat);
            this.f2926i = null;
        }
    }
}
