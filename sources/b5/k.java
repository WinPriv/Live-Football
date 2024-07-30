package b5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import k4.i0;

/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes2.dex */
public interface k {

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final m f2939a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f2940b;

        /* renamed from: c, reason: collision with root package name */
        public final i0 f2941c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f2942d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f2943e;

        public a(m mVar, MediaFormat mediaFormat, i0 i0Var, Surface surface, MediaCrypto mediaCrypto) {
            this.f2939a = mVar;
            this.f2940b = mediaFormat;
            this.f2941c = i0Var;
            this.f2942d = surface;
            this.f2943e = mediaCrypto;
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public interface b {
        k a(a aVar) throws IOException;
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public interface c {
    }

    void a();

    MediaFormat b();

    void c(Bundle bundle);

    void d(int i10, long j10);

    int e();

    void f(c cVar, Handler handler);

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(int i10, boolean z10);

    void i(int i10);

    void j(int i10, n4.c cVar, long j10);

    ByteBuffer k(int i10);

    void l(Surface surface);

    ByteBuffer m(int i10);

    void n(int i10, int i11, long j10, int i12);

    void release();
}
