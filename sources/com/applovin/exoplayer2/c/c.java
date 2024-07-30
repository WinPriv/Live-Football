package com.applovin.exoplayer2.c;

import android.media.MediaCodec;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13623a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13624b;

    /* renamed from: c, reason: collision with root package name */
    public int f13625c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f13626d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f13627e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f13628g;

    /* renamed from: h, reason: collision with root package name */
    public int f13629h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f13630i;

    /* renamed from: j, reason: collision with root package name */
    private final a f13631j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f13632a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f13633b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f13632a = cryptoInfo;
            this.f13633b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10, int i11) {
            this.f13633b.set(i10, i11);
            this.f13632a.setPattern(this.f13633b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f13630i = cryptoInfo;
        this.f13631j = ai.f16274a >= 24 ? new a(cryptoInfo) : null;
    }

    public void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f = i10;
        this.f13626d = iArr;
        this.f13627e = iArr2;
        this.f13624b = bArr;
        this.f13623a = bArr2;
        this.f13625c = i11;
        this.f13628g = i12;
        this.f13629h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f13630i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (ai.f16274a >= 24) {
            ((a) com.applovin.exoplayer2.l.a.b(this.f13631j)).a(i12, i13);
        }
    }

    public MediaCodec.CryptoInfo a() {
        return this.f13630i;
    }

    public void a(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f13626d == null) {
            int[] iArr = new int[1];
            this.f13626d = iArr;
            this.f13630i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f13626d;
        iArr2[0] = iArr2[0] + i10;
    }
}
