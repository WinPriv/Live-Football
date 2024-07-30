package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.f.m;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final i f15023a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f15024b;

        /* renamed from: c, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f15025c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f15026d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f15027e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f15028g;

        private a(i iVar, MediaFormat mediaFormat, com.applovin.exoplayer2.v vVar, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
            this.f15023a = iVar;
            this.f15024b = mediaFormat;
            this.f15025c = vVar;
            this.f15026d = surface;
            this.f15027e = mediaCrypto;
            this.f = i10;
            this.f15028g = z10;
        }

        public static a a(i iVar, MediaFormat mediaFormat, com.applovin.exoplayer2.v vVar, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, null, mediaCrypto, 0, false);
        }

        public static a a(i iVar, MediaFormat mediaFormat, com.applovin.exoplayer2.v vVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, surface, mediaCrypto, 0, false);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15029a = new m.b();

        g b(a aVar) throws IOException;
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(g gVar, long j10, long j11);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i10);

    void a(int i10, int i11, int i12, long j10, int i13);

    void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12);

    void a(int i10, long j10);

    void a(int i10, boolean z10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    boolean a();

    int b();

    ByteBuffer b(int i10);

    MediaFormat c();

    void c(int i10);

    void d();

    void e();
}
