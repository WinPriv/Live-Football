package j5;

import android.media.MediaCodec;
import com.applovin.exoplayer2.common.base.Ascii;
import j5.e0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import n4.c;
import p4.w;

/* compiled from: SampleDataQueue.java */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final c6.b f29699a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29700b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.w f29701c;

    /* renamed from: d, reason: collision with root package name */
    public a f29702d;

    /* renamed from: e, reason: collision with root package name */
    public a f29703e;
    public a f;

    /* renamed from: g, reason: collision with root package name */
    public long f29704g;

    /* compiled from: SampleDataQueue.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f29705a;

        /* renamed from: b, reason: collision with root package name */
        public long f29706b;

        /* renamed from: c, reason: collision with root package name */
        public c6.a f29707c;

        /* renamed from: d, reason: collision with root package name */
        public a f29708d;

        public a(long j10, int i10) {
            boolean z10;
            if (this.f29707c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z10);
            this.f29705a = j10;
            this.f29706b = j10 + i10;
        }
    }

    public d0(c6.b bVar) {
        this.f29699a = bVar;
        int i10 = ((c6.n) bVar).f3387b;
        this.f29700b = i10;
        this.f29701c = new d6.w(32);
        a aVar = new a(0L, i10);
        this.f29702d = aVar;
        this.f29703e = aVar;
        this.f = aVar;
    }

    public static a d(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= aVar.f29706b) {
            aVar = aVar.f29708d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (aVar.f29706b - j10));
            c6.a aVar2 = aVar.f29707c;
            byteBuffer.put(aVar2.f3286a, ((int) (j10 - aVar.f29705a)) + aVar2.f3287b, min);
            i10 -= min;
            j10 += min;
            if (j10 == aVar.f29706b) {
                aVar = aVar.f29708d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, long j10, byte[] bArr, int i10) {
        while (j10 >= aVar.f29706b) {
            aVar = aVar.f29708d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (aVar.f29706b - j10));
            c6.a aVar2 = aVar.f29707c;
            System.arraycopy(aVar2.f3286a, ((int) (j10 - aVar.f29705a)) + aVar2.f3287b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == aVar.f29706b) {
                aVar = aVar.f29708d;
            }
        }
        return aVar;
    }

    public static a f(a aVar, n4.g gVar, e0.a aVar2, d6.w wVar) {
        boolean z10;
        if (gVar.f(1073741824)) {
            long j10 = aVar2.f29737b;
            int i10 = 1;
            wVar.B(1);
            a e10 = e(aVar, j10, wVar.f27384a, 1);
            long j11 = j10 + 1;
            byte b10 = wVar.f27384a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Ascii.DEL;
            n4.c cVar = gVar.f33321t;
            byte[] bArr = cVar.f33299a;
            if (bArr == null) {
                cVar.f33299a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = e(e10, j11, cVar.f33299a, i11);
            long j12 = j11 + i11;
            if (z10) {
                wVar.B(2);
                aVar = e(aVar, j12, wVar.f27384a, 2);
                j12 += 2;
                i10 = wVar.y();
            }
            int[] iArr = cVar.f33302d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = cVar.f33303e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                wVar.B(i12);
                aVar = e(aVar, j12, wVar.f27384a, i12);
                j12 += i12;
                wVar.E(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = wVar.y();
                    iArr2[i13] = wVar.w();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.f29736a - ((int) (j12 - aVar2.f29737b));
            }
            w.a aVar3 = aVar2.f29738c;
            int i14 = d6.g0.f27302a;
            byte[] bArr2 = aVar3.f34358b;
            byte[] bArr3 = cVar.f33299a;
            cVar.f = i10;
            cVar.f33302d = iArr;
            cVar.f33303e = iArr2;
            cVar.f33300b = bArr2;
            cVar.f33299a = bArr3;
            int i15 = aVar3.f34357a;
            cVar.f33301c = i15;
            int i16 = aVar3.f34359c;
            cVar.f33304g = i16;
            int i17 = aVar3.f34360d;
            cVar.f33305h = i17;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f33306i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (d6.g0.f27302a >= 24) {
                c.a aVar4 = cVar.f33307j;
                aVar4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = aVar4.f33309b;
                pattern.set(i16, i17);
                aVar4.f33308a.setPattern(pattern);
            }
            long j13 = aVar2.f29737b;
            int i18 = (int) (j12 - j13);
            aVar2.f29737b = j13 + i18;
            aVar2.f29736a -= i18;
        }
        if (gVar.f(268435456)) {
            wVar.B(4);
            a e11 = e(aVar, aVar2.f29737b, wVar.f27384a, 4);
            int w10 = wVar.w();
            aVar2.f29737b += 4;
            aVar2.f29736a -= 4;
            gVar.j(w10);
            a d10 = d(e11, aVar2.f29737b, gVar.f33322u, w10);
            aVar2.f29737b += w10;
            int i19 = aVar2.f29736a - w10;
            aVar2.f29736a = i19;
            ByteBuffer byteBuffer = gVar.f33325x;
            if (byteBuffer != null && byteBuffer.capacity() >= i19) {
                gVar.f33325x.clear();
            } else {
                gVar.f33325x = ByteBuffer.allocate(i19);
            }
            return d(d10, aVar2.f29737b, gVar.f33325x, aVar2.f29736a);
        }
        gVar.j(aVar2.f29736a);
        return d(aVar, aVar2.f29737b, gVar.f33322u, aVar2.f29736a);
    }

    public final void a(a aVar) {
        if (aVar.f29707c == null) {
            return;
        }
        c6.n nVar = (c6.n) this.f29699a;
        synchronized (nVar) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                c6.a[] aVarArr = nVar.f;
                int i10 = nVar.f3390e;
                nVar.f3390e = i10 + 1;
                c6.a aVar3 = aVar2.f29707c;
                aVar3.getClass();
                aVarArr[i10] = aVar3;
                nVar.f3389d--;
                aVar2 = aVar2.f29708d;
                if (aVar2 == null || aVar2.f29707c == null) {
                    aVar2 = null;
                }
            }
            nVar.notifyAll();
        }
        aVar.f29707c = null;
        aVar.f29708d = null;
    }

    public final void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f29702d;
            if (j10 < aVar.f29706b) {
                break;
            }
            c6.b bVar = this.f29699a;
            c6.a aVar2 = aVar.f29707c;
            c6.n nVar = (c6.n) bVar;
            synchronized (nVar) {
                c6.a[] aVarArr = nVar.f;
                int i10 = nVar.f3390e;
                nVar.f3390e = i10 + 1;
                aVarArr[i10] = aVar2;
                nVar.f3389d--;
                nVar.notifyAll();
            }
            a aVar3 = this.f29702d;
            aVar3.f29707c = null;
            a aVar4 = aVar3.f29708d;
            aVar3.f29708d = null;
            this.f29702d = aVar4;
        }
        if (this.f29703e.f29705a < aVar.f29705a) {
            this.f29703e = aVar;
        }
    }

    public final int c(int i10) {
        c6.a aVar;
        a aVar2 = this.f;
        if (aVar2.f29707c == null) {
            c6.n nVar = (c6.n) this.f29699a;
            synchronized (nVar) {
                int i11 = nVar.f3389d + 1;
                nVar.f3389d = i11;
                int i12 = nVar.f3390e;
                if (i12 > 0) {
                    c6.a[] aVarArr = nVar.f;
                    int i13 = i12 - 1;
                    nVar.f3390e = i13;
                    aVar = aVarArr[i13];
                    aVar.getClass();
                    nVar.f[nVar.f3390e] = null;
                } else {
                    c6.a aVar3 = new c6.a(new byte[nVar.f3387b], 0);
                    c6.a[] aVarArr2 = nVar.f;
                    if (i11 > aVarArr2.length) {
                        nVar.f = (c6.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                    }
                    aVar = aVar3;
                }
            }
            a aVar4 = new a(this.f.f29706b, this.f29700b);
            aVar2.f29707c = aVar;
            aVar2.f29708d = aVar4;
        }
        return Math.min(i10, (int) (this.f.f29706b - this.f29704g));
    }
}
