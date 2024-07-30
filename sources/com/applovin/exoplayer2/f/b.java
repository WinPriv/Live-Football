package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayDeque<a> f14987a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f14988b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final MediaCodec f14989c;

    /* renamed from: d, reason: collision with root package name */
    private final HandlerThread f14990d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f14991e;
    private final AtomicReference<RuntimeException> f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.g f14992g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f14993h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14994i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f14996a;

        /* renamed from: b, reason: collision with root package name */
        public int f14997b;

        /* renamed from: c, reason: collision with root package name */
        public int f14998c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f14999d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f15000e;
        public int f;

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f14996a = i10;
            this.f14997b = i11;
            this.f14998c = i12;
            this.f15000e = j10;
            this.f = i13;
        }
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10) {
        this(mediaCodec, handlerThread, z10, new com.applovin.exoplayer2.l.g());
    }

    private void e() {
        RuntimeException andSet = this.f.getAndSet(null);
        if (andSet == null) {
        } else {
            throw andSet;
        }
    }

    private void f() throws InterruptedException {
        ((Handler) ai.a(this.f14991e)).removeCallbacksAndMessages(null);
        g();
        e();
    }

    private void g() throws InterruptedException {
        this.f14992g.b();
        ((Handler) ai.a(this.f14991e)).obtainMessage(2).sendToTarget();
        this.f14992g.c();
    }

    private static a h() {
        ArrayDeque<a> arrayDeque = f14987a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new a();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static boolean i() {
        String lowerCase = Ascii.toLowerCase(ai.f16276c);
        if (!lowerCase.contains("samsung") && !lowerCase.contains("motorola")) {
            return false;
        }
        return true;
    }

    public void b() {
        if (this.f14994i) {
            try {
                f();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void c() {
        if (this.f14994i) {
            b();
            this.f14990d.quit();
        }
        this.f14994i = false;
    }

    public void d() throws InterruptedException {
        g();
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10, com.applovin.exoplayer2.l.g gVar) {
        this.f14989c = mediaCodec;
        this.f14990d = handlerThread;
        this.f14992g = gVar;
        this.f = new AtomicReference<>();
        this.f14993h = z10 || i();
    }

    public void a() {
        if (this.f14994i) {
            return;
        }
        this.f14990d.start();
        this.f14991e = new Handler(this.f14990d.getLooper()) { // from class: com.applovin.exoplayer2.f.b.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b.this.a(message);
            }
        };
        this.f14994i = true;
    }

    private void b(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f14989c.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            a(e10);
        }
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        e();
        a h10 = h();
        h10.a(i10, i11, i12, j10, i13);
        ((Handler) ai.a(this.f14991e)).obtainMessage(0, h10).sendToTarget();
    }

    public void a(int i10, int i11, com.applovin.exoplayer2.c.c cVar, long j10, int i12) {
        e();
        a h10 = h();
        h10.a(i10, i11, 0, j10, i12);
        a(cVar, h10.f14999d);
        ((Handler) ai.a(this.f14991e)).obtainMessage(1, h10).sendToTarget();
    }

    public void a(RuntimeException runtimeException) {
        this.f.set(runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        a aVar;
        int i10 = message.what;
        if (i10 == 0) {
            aVar = (a) message.obj;
            b(aVar.f14996a, aVar.f14997b, aVar.f14998c, aVar.f15000e, aVar.f);
        } else if (i10 != 1) {
            if (i10 != 2) {
                a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f14992g.a();
            }
            aVar = null;
        } else {
            aVar = (a) message.obj;
            a(aVar.f14996a, aVar.f14997b, aVar.f14999d, aVar.f15000e, aVar.f);
        }
        if (aVar != null) {
            a(aVar);
        }
    }

    private void a(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            if (this.f14993h) {
                synchronized (f14988b) {
                    this.f14989c.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
                }
                return;
            }
            this.f14989c.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
        } catch (RuntimeException e10) {
            a(e10);
        }
    }

    private static void a(a aVar) {
        ArrayDeque<a> arrayDeque = f14987a;
        synchronized (arrayDeque) {
            arrayDeque.add(aVar);
        }
    }

    private static void a(com.applovin.exoplayer2.c.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f;
        cryptoInfo.numBytesOfClearData = a(cVar.f13626d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(cVar.f13627e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.f13624b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.f13623a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f13625c;
        if (ai.f16274a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f13628g, cVar.f13629h));
        }
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
