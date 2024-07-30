package b5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import b5.e;
import b5.k;
import com.applovin.exoplayer2.f.z;
import d6.g0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: classes2.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2900b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2901c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2903e;
    public int f = 0;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public static final class a implements k.b {

        /* renamed from: a, reason: collision with root package name */
        public final i7.m<HandlerThread> f2904a;

        /* renamed from: b, reason: collision with root package name */
        public final i7.m<HandlerThread> f2905b;

        public a(final int i10) {
            i7.m<HandlerThread> mVar = new i7.m() { // from class: b5.a
                @Override // i7.m
                public final Object get() {
                    return new HandlerThread(c.p(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
                }
            };
            i7.m<HandlerThread> mVar2 = new i7.m() { // from class: b5.b
                @Override // i7.m
                public final Object get() {
                    return new HandlerThread(c.p(i10, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            };
            this.f2904a = mVar;
            this.f2905b = mVar2;
        }

        @Override // b5.k.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c a(k.a aVar) throws IOException {
            MediaCodec mediaCodec;
            c cVar;
            String str = aVar.f2939a.f2945a;
            c cVar2 = null;
            try {
                a0.a.n0("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    cVar = new c(mediaCodec, this.f2904a.get(), this.f2905b.get(), false);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    a0.a.F0();
                    c.o(cVar, aVar.f2940b, aVar.f2942d, aVar.f2943e);
                    return cVar;
                } catch (Exception e11) {
                    e = e11;
                    cVar2 = cVar;
                    if (cVar2 == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar2.release();
                    }
                    throw e;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodec = null;
            }
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f2899a = mediaCodec;
        this.f2900b = new f(handlerThread);
        this.f2901c = new e(mediaCodec, handlerThread2);
        this.f2902d = z10;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z10;
        f fVar = cVar.f2900b;
        if (fVar.f2921c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        HandlerThread handlerThread = fVar.f2920b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = cVar.f2899a;
        mediaCodec.setCallback(fVar, handler);
        fVar.f2921c = handler;
        a0.a.n0("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        a0.a.F0();
        e eVar = cVar.f2901c;
        if (!eVar.f) {
            HandlerThread handlerThread2 = eVar.f2910b;
            handlerThread2.start();
            eVar.f2911c = new d(eVar, handlerThread2.getLooper());
            eVar.f = true;
        }
        a0.a.n0("startCodec");
        mediaCodec.start();
        a0.a.F0();
        cVar.f = 1;
    }

    public static String p(int i10, String str) {
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

    @Override // b5.k
    public final MediaFormat b() {
        MediaFormat mediaFormat;
        f fVar = this.f2900b;
        synchronized (fVar.f2919a) {
            mediaFormat = fVar.f2925h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // b5.k
    public final void c(Bundle bundle) {
        q();
        this.f2899a.setParameters(bundle);
    }

    @Override // b5.k
    public final void d(int i10, long j10) {
        this.f2899a.releaseOutputBuffer(i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: all -> 0x0056, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:25:0x0046, B:27:0x0036, B:28:0x0048, B:29:0x004d, B:30:0x004e, B:31:0x0050, B:32:0x0051, B:33:0x0053), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:25:0x0046, B:27:0x0036, B:28:0x0048, B:29:0x004d, B:30:0x004e, B:31:0x0050, B:32:0x0051, B:33:0x0053), top: B:3:0x000a }] */
    @Override // b5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() {
        /*
            r7 = this;
            b5.e r0 = r7.f2901c
            r0.b()
            b5.f r0 = r7.f2900b
            java.lang.Object r1 = r0.f2919a
            monitor-enter(r1)
            long r2 = r0.f2928k     // Catch: java.lang.Throwable -> L56
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1b
            boolean r2 = r0.f2929l     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            r5 = -1
            if (r2 == 0) goto L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            goto L47
        L21:
            java.lang.IllegalStateException r2 = r0.f2930m     // Catch: java.lang.Throwable -> L56
            r6 = 0
            if (r2 != 0) goto L51
            android.media.MediaCodec$CodecException r2 = r0.f2927j     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L4e
            b5.j r0 = r0.f2922d     // Catch: java.lang.Throwable -> L56
            int r2 = r0.f2936c     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L31
            r3 = r4
        L31:
            if (r3 == 0) goto L34
            goto L46
        L34:
            if (r2 == 0) goto L48
            int[] r3 = r0.f2937d     // Catch: java.lang.Throwable -> L56
            int r6 = r0.f2934a     // Catch: java.lang.Throwable -> L56
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r4
            int r4 = r0.f2938e     // Catch: java.lang.Throwable -> L56
            r4 = r4 & r6
            r0.f2934a = r4     // Catch: java.lang.Throwable -> L56
            int r2 = r2 + r5
            r0.f2936c = r2     // Catch: java.lang.Throwable -> L56
            r5 = r3
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
        L47:
            return r5
        L48:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L4e:
            r0.f2927j = r6     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L51:
            r0.f2930m = r6     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r0
        L56:
            r0 = move-exception
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.c.e():int");
    }

    @Override // b5.k
    public final void f(k.c cVar, Handler handler) {
        q();
        this.f2899a.setOnFrameRenderedListener(new z(1, this, cVar), handler);
    }

    @Override // b5.k
    public final void flush() {
        this.f2901c.a();
        this.f2899a.flush();
        f fVar = this.f2900b;
        synchronized (fVar.f2919a) {
            fVar.f2928k++;
            Handler handler = fVar.f2921c;
            int i10 = g0.f27302a;
            handler.post(new androidx.activity.b(fVar, 8));
        }
        this.f2899a.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: all -> 0x0080, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:24:0x0033, B:28:0x0037, B:30:0x0048, B:31:0x006f, B:36:0x0065, B:37:0x0072, B:38:0x0077, B:39:0x0078, B:40:0x007a, B:41:0x007b, B:42:0x007d), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:24:0x0033, B:28:0x0037, B:30:0x0048, B:31:0x006f, B:36:0x0065, B:37:0x0072, B:38:0x0077, B:39:0x0078, B:40:0x007a, B:41:0x007b, B:42:0x007d), top: B:3:0x000a }] */
    @Override // b5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            b5.e r0 = r10.f2901c
            r0.b()
            b5.f r0 = r10.f2900b
            java.lang.Object r1 = r0.f2919a
            monitor-enter(r1)
            long r2 = r0.f2928k     // Catch: java.lang.Throwable -> L80
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1b
            boolean r2 = r0.f2929l     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            r5 = -1
            if (r2 == 0) goto L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            goto L71
        L21:
            java.lang.IllegalStateException r2 = r0.f2930m     // Catch: java.lang.Throwable -> L80
            r6 = 0
            if (r2 != 0) goto L7b
            android.media.MediaCodec$CodecException r2 = r0.f2927j     // Catch: java.lang.Throwable -> L80
            if (r2 != 0) goto L78
            b5.j r2 = r0.f2923e     // Catch: java.lang.Throwable -> L80
            int r6 = r2.f2936c     // Catch: java.lang.Throwable -> L80
            if (r6 != 0) goto L31
            r3 = r4
        L31:
            if (r3 == 0) goto L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            goto L71
        L35:
            if (r6 == 0) goto L72
            int[] r3 = r2.f2937d     // Catch: java.lang.Throwable -> L80
            int r7 = r2.f2934a     // Catch: java.lang.Throwable -> L80
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L80
            int r7 = r7 + r4
            int r4 = r2.f2938e     // Catch: java.lang.Throwable -> L80
            r4 = r4 & r7
            r2.f2934a = r4     // Catch: java.lang.Throwable -> L80
            int r6 = r6 + r5
            r2.f2936c = r6     // Catch: java.lang.Throwable -> L80
            if (r3 < 0) goto L62
            android.media.MediaFormat r2 = r0.f2925h     // Catch: java.lang.Throwable -> L80
            d6.a.e(r2)     // Catch: java.lang.Throwable -> L80
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L80
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L80
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L80
            int r6 = r0.size     // Catch: java.lang.Throwable -> L80
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L80
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L80
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L80
            goto L6f
        L62:
            r11 = -2
            if (r3 != r11) goto L6f
            java.util.ArrayDeque<android.media.MediaFormat> r11 = r0.f2924g     // Catch: java.lang.Throwable -> L80
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L80
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L80
            r0.f2925h = r11     // Catch: java.lang.Throwable -> L80
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            r5 = r3
        L71:
            return r5
        L72:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L80
            r11.<init>()     // Catch: java.lang.Throwable -> L80
            throw r11     // Catch: java.lang.Throwable -> L80
        L78:
            r0.f2927j = r6     // Catch: java.lang.Throwable -> L80
            throw r2     // Catch: java.lang.Throwable -> L80
        L7b:
            r0.f2930m = r6     // Catch: java.lang.Throwable -> L80
            throw r2     // Catch: java.lang.Throwable -> L80
        L7e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            throw r11
        L80:
            r11 = move-exception
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.c.g(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // b5.k
    public final void h(int i10, boolean z10) {
        this.f2899a.releaseOutputBuffer(i10, z10);
    }

    @Override // b5.k
    public final void i(int i10) {
        q();
        this.f2899a.setVideoScalingMode(i10);
    }

    @Override // b5.k
    public final void j(int i10, n4.c cVar, long j10) {
        e.a removeFirst;
        e eVar = this.f2901c;
        eVar.b();
        ArrayDeque<e.a> arrayDeque = e.f2907g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                removeFirst = new e.a();
            } else {
                removeFirst = arrayDeque.removeFirst();
            }
        }
        removeFirst.f2914a = i10;
        removeFirst.f2915b = 0;
        removeFirst.f2916c = 0;
        removeFirst.f2918e = j10;
        removeFirst.f = 0;
        int i11 = cVar.f;
        MediaCodec.CryptoInfo cryptoInfo = removeFirst.f2917d;
        cryptoInfo.numSubSamples = i11;
        int[] iArr = cVar.f33302d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = cVar.f33303e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cVar.f33300b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = cVar.f33299a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = cVar.f33301c;
        if (g0.f27302a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f33304g, cVar.f33305h));
        }
        eVar.f2911c.obtainMessage(1, removeFirst).sendToTarget();
    }

    @Override // b5.k
    public final ByteBuffer k(int i10) {
        return this.f2899a.getInputBuffer(i10);
    }

    @Override // b5.k
    public final void l(Surface surface) {
        q();
        this.f2899a.setOutputSurface(surface);
    }

    @Override // b5.k
    public final ByteBuffer m(int i10) {
        return this.f2899a.getOutputBuffer(i10);
    }

    @Override // b5.k
    public final void n(int i10, int i11, long j10, int i12) {
        e.a removeFirst;
        e eVar = this.f2901c;
        eVar.b();
        ArrayDeque<e.a> arrayDeque = e.f2907g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                removeFirst = new e.a();
            } else {
                removeFirst = arrayDeque.removeFirst();
            }
        }
        removeFirst.f2914a = i10;
        removeFirst.f2915b = 0;
        removeFirst.f2916c = i11;
        removeFirst.f2918e = j10;
        removeFirst.f = i12;
        d dVar = eVar.f2911c;
        int i13 = g0.f27302a;
        dVar.obtainMessage(0, removeFirst).sendToTarget();
    }

    public final void q() {
        if (this.f2902d) {
            try {
                e eVar = this.f2901c;
                d6.e eVar2 = eVar.f2913e;
                synchronized (eVar2) {
                    eVar2.f27296a = false;
                }
                d dVar = eVar.f2911c;
                dVar.getClass();
                dVar.obtainMessage(2).sendToTarget();
                synchronized (eVar2) {
                    while (!eVar2.f27296a) {
                        eVar2.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // b5.k
    public final void release() {
        try {
            if (this.f == 1) {
                e eVar = this.f2901c;
                if (eVar.f) {
                    eVar.a();
                    eVar.f2910b.quit();
                }
                eVar.f = false;
                f fVar = this.f2900b;
                synchronized (fVar.f2919a) {
                    fVar.f2929l = true;
                    fVar.f2920b.quit();
                    fVar.a();
                }
            }
            this.f = 2;
        } finally {
            if (!this.f2903e) {
                this.f2899a.release();
                this.f2903e = true;
            }
        }
    }

    @Override // b5.k
    public final void a() {
    }
}
