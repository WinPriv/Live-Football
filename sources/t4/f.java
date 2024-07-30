package t4;

import a3.l;
import com.anythink.expressad.exoplayer.k.o;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.s;
import d6.w;
import k4.i0;
import k4.z0;
import t4.e;

/* compiled from: VideoTagPayloadReader.java */
/* loaded from: classes2.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final w f35455b;

    /* renamed from: c, reason: collision with root package name */
    public final w f35456c;

    /* renamed from: d, reason: collision with root package name */
    public int f35457d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35458e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f35459g;

    public f(p4.w wVar) {
        super(wVar);
        this.f35455b = new w(s.f27347a);
        this.f35456c = new w(4);
    }

    public final boolean a(w wVar) throws e.a {
        int t10 = wVar.t();
        int i10 = (t10 >> 4) & 15;
        int i11 = t10 & 15;
        if (i11 == 7) {
            this.f35459g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new e.a(l.i("Video format not supported: ", i11));
    }

    public final boolean b(long j10, w wVar) throws z0 {
        int i10;
        int t10 = wVar.t();
        byte[] bArr = wVar.f27384a;
        int i11 = wVar.f27385b;
        int i12 = i11 + 1;
        int i13 = (((bArr[i11] & DefaultClassResolver.NAME) << 24) >> 8) | ((bArr[i12] & DefaultClassResolver.NAME) << 8);
        wVar.f27385b = i12 + 1 + 1;
        long j11 = (((bArr[r4] & DefaultClassResolver.NAME) | i13) * 1000) + j10;
        p4.w wVar2 = this.f35454a;
        if (t10 == 0 && !this.f35458e) {
            w wVar3 = new w(new byte[wVar.f27386c - wVar.f27385b]);
            wVar.b(wVar3.f27384a, 0, wVar.f27386c - wVar.f27385b);
            e6.a a10 = e6.a.a(wVar3);
            this.f35457d = a10.f27753b;
            i0.a aVar = new i0.a();
            aVar.f30534k = o.f9074h;
            aVar.f30531h = a10.f;
            aVar.f30538p = a10.f27754c;
            aVar.f30539q = a10.f27755d;
            aVar.f30542t = a10.f27756e;
            aVar.f30536m = a10.f27752a;
            wVar2.b(new i0(aVar));
            this.f35458e = true;
            return false;
        }
        if (t10 != 1 || !this.f35458e) {
            return false;
        }
        if (this.f35459g == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.f && i10 == 0) {
            return false;
        }
        w wVar4 = this.f35456c;
        byte[] bArr2 = wVar4.f27384a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i14 = 4 - this.f35457d;
        int i15 = 0;
        while (wVar.f27386c - wVar.f27385b > 0) {
            wVar.b(wVar4.f27384a, i14, this.f35457d);
            wVar4.E(0);
            int w10 = wVar4.w();
            w wVar5 = this.f35455b;
            wVar5.E(0);
            wVar2.f(4, wVar5);
            wVar2.f(w10, wVar);
            i15 = i15 + 4 + w10;
        }
        this.f35454a.c(j11, i10, i15, 0, null);
        this.f = true;
        return true;
    }
}
