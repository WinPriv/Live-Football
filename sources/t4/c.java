package t4;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import d6.w;
import java.io.IOException;
import p4.h;
import p4.i;
import p4.j;

/* compiled from: FlvExtractor.java */
/* loaded from: classes2.dex */
public final class c implements h {
    public j f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35443h;

    /* renamed from: i, reason: collision with root package name */
    public long f35444i;

    /* renamed from: j, reason: collision with root package name */
    public int f35445j;

    /* renamed from: k, reason: collision with root package name */
    public int f35446k;

    /* renamed from: l, reason: collision with root package name */
    public int f35447l;

    /* renamed from: m, reason: collision with root package name */
    public long f35448m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35449n;
    public a o;

    /* renamed from: p, reason: collision with root package name */
    public f f35450p;

    /* renamed from: a, reason: collision with root package name */
    public final w f35437a = new w(4);

    /* renamed from: b, reason: collision with root package name */
    public final w f35438b = new w(9);

    /* renamed from: c, reason: collision with root package name */
    public final w f35439c = new w(11);

    /* renamed from: d, reason: collision with root package name */
    public final w f35440d = new w();

    /* renamed from: e, reason: collision with root package name */
    public final d f35441e = new d();

    /* renamed from: g, reason: collision with root package name */
    public int f35442g = 1;

    public final w a(p4.e eVar) throws IOException {
        int i10 = this.f35447l;
        w wVar = this.f35440d;
        byte[] bArr = wVar.f27384a;
        if (i10 > bArr.length) {
            wVar.C(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.E(0);
        }
        wVar.D(this.f35447l);
        eVar.a(wVar.f27384a, 0, this.f35447l, false);
        return wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x005f, code lost:
    
        if (r1.b(r13, r6) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0061, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x008d, code lost:
    
        if (r1.b(r13, r6) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0006 A[SYNTHETIC] */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r16, p4.t r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.c.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        w wVar = this.f35437a;
        p4.e eVar = (p4.e) iVar;
        eVar.c(wVar.f27384a, 0, 3, false);
        wVar.E(0);
        if (wVar.v() != 4607062) {
            return false;
        }
        eVar.c(wVar.f27384a, 0, 2, false);
        wVar.E(0);
        if ((wVar.y() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        eVar.c(wVar.f27384a, 0, 4, false);
        wVar.E(0);
        int d10 = wVar.d();
        eVar.f = 0;
        eVar.k(d10, false);
        eVar.c(wVar.f27384a, 0, 4, false);
        wVar.E(0);
        if (wVar.d() != 0) {
            return false;
        }
        return true;
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f = jVar;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f35442g = 1;
            this.f35443h = false;
        } else {
            this.f35442g = 3;
        }
        this.f35445j = 0;
    }

    @Override // p4.h
    public final void release() {
    }
}
