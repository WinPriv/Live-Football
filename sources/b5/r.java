package b5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import b5.k;
import com.applovin.exoplayer2.f.z;
import d6.g0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes2.dex */
public final class r implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f2993a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f2994b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f2995c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public static class a implements k.b {
        public static MediaCodec b(k.a aVar) throws IOException {
            aVar.f2939a.getClass();
            String str = aVar.f2939a.f2945a;
            a0.a.n0("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            a0.a.F0();
            return createByCodecName;
        }
    }

    public r(MediaCodec mediaCodec) {
        this.f2993a = mediaCodec;
        if (g0.f27302a < 21) {
            this.f2994b = mediaCodec.getInputBuffers();
            this.f2995c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // b5.k
    public final MediaFormat b() {
        return this.f2993a.getOutputFormat();
    }

    @Override // b5.k
    public final void c(Bundle bundle) {
        this.f2993a.setParameters(bundle);
    }

    @Override // b5.k
    public final void d(int i10, long j10) {
        this.f2993a.releaseOutputBuffer(i10, j10);
    }

    @Override // b5.k
    public final int e() {
        return this.f2993a.dequeueInputBuffer(0L);
    }

    @Override // b5.k
    public final void f(k.c cVar, Handler handler) {
        this.f2993a.setOnFrameRenderedListener(new z(2, this, cVar), handler);
    }

    @Override // b5.k
    public final void flush() {
        this.f2993a.flush();
    }

    @Override // b5.k
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f2993a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && g0.f27302a < 21) {
                this.f2995c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // b5.k
    public final void h(int i10, boolean z10) {
        this.f2993a.releaseOutputBuffer(i10, z10);
    }

    @Override // b5.k
    public final void i(int i10) {
        this.f2993a.setVideoScalingMode(i10);
    }

    @Override // b5.k
    public final void j(int i10, n4.c cVar, long j10) {
        this.f2993a.queueSecureInputBuffer(i10, 0, cVar.f33306i, j10, 0);
    }

    @Override // b5.k
    public final ByteBuffer k(int i10) {
        if (g0.f27302a >= 21) {
            return this.f2993a.getInputBuffer(i10);
        }
        return this.f2994b[i10];
    }

    @Override // b5.k
    public final void l(Surface surface) {
        this.f2993a.setOutputSurface(surface);
    }

    @Override // b5.k
    public final ByteBuffer m(int i10) {
        if (g0.f27302a >= 21) {
            return this.f2993a.getOutputBuffer(i10);
        }
        return this.f2995c[i10];
    }

    @Override // b5.k
    public final void n(int i10, int i11, long j10, int i12) {
        this.f2993a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // b5.k
    public final void release() {
        this.f2994b = null;
        this.f2995c = null;
        this.f2993a.release();
    }

    @Override // b5.k
    public final void a() {
    }
}
