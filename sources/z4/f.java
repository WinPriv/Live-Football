package z4;

import java.util.Arrays;
import k4.i0;
import z4.d0;

/* compiled from: AdtsReader.java */
/* loaded from: classes2.dex */
public final class f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f37065v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37066a;

    /* renamed from: d, reason: collision with root package name */
    public final String f37069d;

    /* renamed from: e, reason: collision with root package name */
    public String f37070e;
    public p4.w f;

    /* renamed from: g, reason: collision with root package name */
    public p4.w f37071g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37075k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37076l;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37079p;

    /* renamed from: r, reason: collision with root package name */
    public int f37081r;

    /* renamed from: t, reason: collision with root package name */
    public p4.w f37083t;

    /* renamed from: u, reason: collision with root package name */
    public long f37084u;

    /* renamed from: b, reason: collision with root package name */
    public final d6.v f37067b = new d6.v(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final d6.w f37068c = new d6.w(Arrays.copyOf(f37065v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f37072h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f37073i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f37074j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f37077m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f37078n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f37080q = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: s, reason: collision with root package name */
    public long f37082s = com.anythink.expressad.exoplayer.b.f7291b;

    public f(boolean z10, String str) {
        this.f37066a = z10;
        this.f37069d = str;
    }

    @Override // z4.j
    public final void a() {
        this.f37082s = com.anythink.expressad.exoplayer.b.f7291b;
        this.f37076l = false;
        this.f37072h = 0;
        this.f37073i = 0;
        this.f37074j = 256;
    }

    public final boolean b(int i10, d6.w wVar, byte[] bArr) {
        int min = Math.min(wVar.f27386c - wVar.f27385b, i10 - this.f37073i);
        wVar.b(bArr, this.f37073i, min);
        int i11 = this.f37073i + min;
        this.f37073i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0265, code lost:
    
        if (r5[r7] != 51) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026c, code lost:
    
        r24.o = (r3 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0274, code lost:
    
        if ((r3 & 1) != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0276, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0279, code lost:
    
        r24.f37075k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027d, code lost:
    
        if (r24.f37076l != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027f, code lost:
    
        r24.f37072h = 1;
        r24.f37073i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028b, code lost:
    
        r25.E(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0285, code lost:
    
        r24.f37072h = 3;
        r24.f37073i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0278, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0248, code lost:
    
        if (((r5 & 8) >> 3) == r9) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026c A[EDGE_INSN: B:59:0x026c->B:60:0x026c BREAK  A[LOOP:1: B:8:0x017d->B:48:0x02de], SYNTHETIC] */
    @Override // z4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(d6.w r25) throws k4.z0 {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.f.c(d6.w):void");
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f37082s = j10;
        }
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f37070e = dVar.f37051e;
        dVar.b();
        p4.w s10 = jVar.s(dVar.f37050d, 1);
        this.f = s10;
        this.f37083t = s10;
        if (this.f37066a) {
            dVar.a();
            dVar.b();
            p4.w s11 = jVar.s(dVar.f37050d, 5);
            this.f37071g = s11;
            i0.a aVar = new i0.a();
            dVar.b();
            aVar.f30525a = dVar.f37051e;
            aVar.f30534k = com.anythink.expressad.exoplayer.k.o.V;
            s11.b(new i0(aVar));
            return;
        }
        this.f37071g = new p4.g();
    }

    @Override // z4.j
    public final void d() {
    }
}
