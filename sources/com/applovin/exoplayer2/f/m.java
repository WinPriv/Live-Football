package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class m implements g {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f15083a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f15084b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f15085c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer[] f15086d;

    /* loaded from: classes.dex */
    public static final class a {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements g.b {
        public MediaCodec a(g.a aVar) throws IOException {
            com.applovin.exoplayer2.l.a.b(aVar.f15023a);
            String str = aVar.f15023a.f15032a;
            ah.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            ah.a();
            return createByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.exoplayer2.f.m$1] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.applovin.exoplayer2.f.g.b
        public g b(g.a aVar) throws IOException {
            MediaCodec mediaCodec;
            Surface surface;
            ?? r02 = 0;
            r02 = 0;
            r02 = 0;
            try {
                mediaCodec = a(aVar);
                try {
                    ah.a("configureCodec");
                    mediaCodec.configure(aVar.f15024b, aVar.f15026d, aVar.f15027e, aVar.f);
                    ah.a();
                    if (aVar.f15028g) {
                        if (ai.f16274a >= 18) {
                            surface = a.a(mediaCodec);
                        } else {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                    } else {
                        surface = null;
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (RuntimeException e11) {
                    e = e11;
                }
                try {
                    ah.a("startCodec");
                    mediaCodec.start();
                    ah.a();
                    return new m(mediaCodec, surface);
                } catch (IOException | RuntimeException e12) {
                    r02 = surface;
                    e = e12;
                    if (r02 != 0) {
                        r02.release();
                    }
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e13) {
                e = e13;
                mediaCodec = null;
            }
        }
    }

    @Override // com.applovin.exoplayer2.f.g
    public int b() {
        return this.f15083a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.exoplayer2.f.g
    public MediaFormat c() {
        return this.f15083a.getOutputFormat();
    }

    @Override // com.applovin.exoplayer2.f.g
    public void d() {
        this.f15083a.flush();
    }

    @Override // com.applovin.exoplayer2.f.g
    public void e() {
        this.f15085c = null;
        this.f15086d = null;
        Surface surface = this.f15084b;
        if (surface != null) {
            surface.release();
        }
        this.f15083a.release();
    }

    private m(MediaCodec mediaCodec, Surface surface) {
        this.f15083a = mediaCodec;
        this.f15084b = surface;
        if (ai.f16274a < 21) {
            this.f15085c = mediaCodec.getInputBuffers();
            this.f15086d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.exoplayer2.f.g
    public boolean a() {
        return false;
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer b(int i10) {
        if (ai.f16274a >= 21) {
            return this.f15083a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) ai.a(this.f15086d))[i10];
    }

    @Override // com.applovin.exoplayer2.f.g
    public void c(int i10) {
        this.f15083a.setVideoScalingMode(i10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f15083a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && ai.f16274a < 21) {
                this.f15086d = this.f15083a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer a(int i10) {
        if (ai.f16274a >= 21) {
            return this.f15083a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) ai.a(this.f15085c))[i10];
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f15083a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12) {
        this.f15083a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, boolean z10) {
        this.f15083a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i10, long j10) {
        this.f15083a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(g.c cVar, Handler handler) {
        this.f15083a.setOnFrameRenderedListener(new z(0, this, cVar), handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Surface surface) {
        this.f15083a.setOutputSurface(surface);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Bundle bundle) {
        this.f15083a.setParameters(bundle);
    }
}
