package n4;

import android.media.MediaCodec;
import d6.g0;

/* compiled from: CryptoInfo.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f33299a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f33300b;

    /* renamed from: c, reason: collision with root package name */
    public int f33301c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f33302d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f33303e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f33304g;

    /* renamed from: h, reason: collision with root package name */
    public int f33305h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f33306i;

    /* renamed from: j, reason: collision with root package name */
    public final a f33307j;

    /* compiled from: CryptoInfo.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f33308a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f33309b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f33308a = cryptoInfo;
        }
    }

    public c() {
        a aVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f33306i = cryptoInfo;
        if (g0.f27302a >= 24) {
            aVar = new a(cryptoInfo);
        } else {
            aVar = null;
        }
        this.f33307j = aVar;
    }
}
