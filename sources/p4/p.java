package p4;

import com.google.android.exoplayer2.metadata.Metadata;
import d6.g0;
import java.util.Arrays;
import java.util.Collections;
import k4.i0;

/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f34328a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34329b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34330c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34331d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34332e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34333g;

    /* renamed from: h, reason: collision with root package name */
    public final int f34334h;

    /* renamed from: i, reason: collision with root package name */
    public final int f34335i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34336j;

    /* renamed from: k, reason: collision with root package name */
    public final a f34337k;

    /* renamed from: l, reason: collision with root package name */
    public final Metadata f34338l;

    /* compiled from: FlacStreamMetadata.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f34339a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f34340b;

        public a(long[] jArr, long[] jArr2) {
            this.f34339a = jArr;
            this.f34340b = jArr2;
        }
    }

    public p(byte[] bArr, int i10) {
        d6.v vVar = new d6.v(bArr, bArr.length);
        vVar.k(i10 * 8);
        this.f34328a = vVar.g(16);
        this.f34329b = vVar.g(16);
        this.f34330c = vVar.g(24);
        this.f34331d = vVar.g(24);
        int g6 = vVar.g(20);
        this.f34332e = g6;
        this.f = d(g6);
        this.f34333g = vVar.g(3) + 1;
        int g10 = vVar.g(5) + 1;
        this.f34334h = g10;
        this.f34335i = a(g10);
        int g11 = vVar.g(4);
        int g12 = vVar.g(32);
        int i11 = g0.f27302a;
        this.f34336j = ((g11 & 4294967295L) << 32) | (g12 & 4294967295L);
        this.f34337k = null;
        this.f34338l = null;
    }

    public static int a(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        if (i10 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.f34336j;
        if (j10 == 0) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return (j10 * 1000000) / this.f34332e;
    }

    public final i0 c(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f34331d;
        if (i10 <= 0) {
            i10 = -1;
        }
        Metadata metadata2 = this.f34338l;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f19997s;
                if (entryArr.length != 0) {
                    int i11 = g0.f27302a;
                    Metadata.Entry[] entryArr2 = metadata2.f19997s;
                    Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata(metadata2.f19998t, (Metadata.Entry[]) copyOf);
                }
            }
            metadata = metadata2;
        }
        i0.a aVar = new i0.a();
        aVar.f30534k = com.anythink.expressad.exoplayer.k.o.K;
        aVar.f30535l = i10;
        aVar.f30546x = this.f34333g;
        aVar.y = this.f34332e;
        aVar.f30536m = Collections.singletonList(bArr);
        aVar.f30532i = metadata;
        return new i0(aVar);
    }

    public p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, Metadata metadata) {
        this.f34328a = i10;
        this.f34329b = i11;
        this.f34330c = i12;
        this.f34331d = i13;
        this.f34332e = i14;
        this.f = d(i14);
        this.f34333g = i15;
        this.f34334h = i16;
        this.f34335i = a(i16);
        this.f34336j = j10;
        this.f34337k = aVar;
        this.f34338l = metadata;
    }
}
