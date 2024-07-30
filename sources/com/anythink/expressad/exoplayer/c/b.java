package com.anythink.expressad.exoplayer.c;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import com.anythink.expressad.exoplayer.k.af;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7571a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7572b;

    /* renamed from: c, reason: collision with root package name */
    public int f7573c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7574d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7575e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f7576g;

    /* renamed from: h, reason: collision with root package name */
    public int f7577h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f7578i;

    /* renamed from: j, reason: collision with root package name */
    private final a f7579j;

    @TargetApi(24)
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f7580a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f7581b;

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, byte b10) {
            this(cryptoInfo);
        }

        private void a(int i10, int i11) {
            this.f7581b.set(i10, i11);
            this.f7580a.setPattern(this.f7581b);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f7580a = cryptoInfo;
            this.f7581b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public static /* synthetic */ void a(a aVar, int i10, int i11) {
            aVar.f7581b.set(i10, i11);
            aVar.f7580a.setPattern(aVar.f7581b);
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i10 = af.f8993a;
        if (i10 >= 16) {
            cryptoInfo = new MediaCodec.CryptoInfo();
        } else {
            cryptoInfo = null;
        }
        this.f7578i = cryptoInfo;
        this.f7579j = i10 >= 24 ? new a(cryptoInfo, (byte) 0) : null;
    }

    @TargetApi(16)
    private static MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    @TargetApi(16)
    private void c() {
        MediaCodec.CryptoInfo cryptoInfo = this.f7578i;
        cryptoInfo.numSubSamples = this.f;
        cryptoInfo.numBytesOfClearData = this.f7574d;
        cryptoInfo.numBytesOfEncryptedData = this.f7575e;
        cryptoInfo.key = this.f7572b;
        cryptoInfo.iv = this.f7571a;
        cryptoInfo.mode = this.f7573c;
        if (af.f8993a >= 24) {
            a.a(this.f7579j, this.f7576g, this.f7577h);
        }
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f = i10;
        this.f7574d = iArr;
        this.f7575e = iArr2;
        this.f7572b = bArr;
        this.f7571a = bArr2;
        this.f7573c = i11;
        this.f7576g = i12;
        this.f7577h = i13;
        int i14 = af.f8993a;
        if (i14 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f7578i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i11;
            if (i14 >= 24) {
                a.a(this.f7579j, i12, i13);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return this.f7578i;
    }
}
