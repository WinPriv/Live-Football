package z4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.g0;

/* compiled from: PsDurationReader.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public boolean f37271c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37272d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37273e;

    /* renamed from: a, reason: collision with root package name */
    public final d6.d0 f37269a = new d6.d0(0);
    public long f = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: g, reason: collision with root package name */
    public long f37274g = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: h, reason: collision with root package name */
    public long f37275h = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f37270b = new d6.w();

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i10 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i10 + 2] & DefaultClassResolver.NAME) << 8);
    }

    public static long c(d6.w wVar) {
        int i10 = wVar.f27385b;
        if (wVar.f27386c - i10 < 9) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        byte[] bArr = new byte[9];
        boolean z10 = false;
        wVar.b(bArr, 0, 9);
        wVar.E(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z10 = true;
        }
        if (!z10) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        long j10 = b10;
        long j11 = ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j12 = bArr[2];
        return j11 | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final void a(p4.e eVar) {
        byte[] bArr = g0.f;
        d6.w wVar = this.f37270b;
        wVar.getClass();
        wVar.C(bArr.length, bArr);
        this.f37271c = true;
        eVar.f = 0;
    }
}
