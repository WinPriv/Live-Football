package com.applovin.exoplayer2.e.a;

import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.e.d;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: c */
    private static final int[] f14090c;
    private static final int f;

    /* renamed from: g */
    private final byte[] f14093g;

    /* renamed from: h */
    private final int f14094h;

    /* renamed from: i */
    private boolean f14095i;

    /* renamed from: j */
    private long f14096j;

    /* renamed from: k */
    private int f14097k;

    /* renamed from: l */
    private int f14098l;

    /* renamed from: m */
    private boolean f14099m;

    /* renamed from: n */
    private long f14100n;
    private int o;

    /* renamed from: p */
    private int f14101p;

    /* renamed from: q */
    private long f14102q;

    /* renamed from: r */
    private j f14103r;

    /* renamed from: s */
    private x f14104s;

    /* renamed from: t */
    private v f14105t;

    /* renamed from: u */
    private boolean f14106u;

    /* renamed from: a */
    public static final l f14088a = new v2.a(0);

    /* renamed from: b */
    private static final int[] f14089b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: d */
    private static final byte[] f14091d = ai.c("#!AMR\n");

    /* renamed from: e */
    private static final byte[] f14092e = ai.c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f14090c = iArr;
        f = iArr[8];
    }

    public a() {
        this(0);
    }

    private boolean b(i iVar) throws IOException {
        byte[] bArr = f14091d;
        if (a(iVar, bArr)) {
            this.f14095i = false;
            iVar.b(bArr.length);
            return true;
        }
        byte[] bArr2 = f14092e;
        if (!a(iVar, bArr2)) {
            return false;
        }
        this.f14095i = true;
        iVar.b(bArr2.length);
        return true;
    }

    public static /* synthetic */ h[] d() {
        return new h[]{new a()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return b(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    public a(int i10) {
        this.f14094h = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f14093g = new byte[1];
        this.o = -1;
    }

    private int c(i iVar) throws IOException {
        if (this.f14098l == 0) {
            try {
                int d10 = d(iVar);
                this.f14097k = d10;
                this.f14098l = d10;
                if (this.o == -1) {
                    this.f14100n = iVar.c();
                    this.o = this.f14097k;
                }
                if (this.o == this.f14097k) {
                    this.f14101p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a10 = this.f14104s.a((g) iVar, this.f14098l, true);
        if (a10 == -1) {
            return -1;
        }
        int i10 = this.f14098l - a10;
        this.f14098l = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f14104s.a(this.f14102q + this.f14096j, 1, this.f14097k, 0, null);
        this.f14096j += 20000;
        return 0;
    }

    private int d(i iVar) throws IOException {
        iVar.a();
        iVar.d(this.f14093g, 0, 1);
        byte b10 = this.f14093g[0];
        if ((b10 & 131) <= 0) {
            return a((b10 >> 3) & 15);
        }
        throw com.applovin.exoplayer2.ai.b("Invalid padding bits for frame header " + ((int) b10), null);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f14103r = jVar;
        this.f14104s = jVar.a(0, 1);
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        b();
        if (iVar.c() == 0 && !b(iVar)) {
            throw com.applovin.exoplayer2.ai.b("Could not find AMR header.", null);
        }
        a();
        int c10 = c(iVar);
        a(iVar.d(), c10);
        return c10;
    }

    private boolean b(int i10) {
        return i10 >= 0 && i10 <= 15 && (c(i10) || d(i10));
    }

    private boolean d(int i10) {
        return !this.f14095i && (i10 < 12 || i10 > 14);
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.f14104s);
        ai.a(this.f14103r);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f14096j = 0L;
        this.f14097k = 0;
        this.f14098l = 0;
        if (j10 != 0) {
            v vVar = this.f14105t;
            if (vVar instanceof d) {
                this.f14102q = ((d) vVar).b(j10);
                return;
            }
        }
        this.f14102q = 0L;
    }

    private boolean c(int i10) {
        return this.f14095i && (i10 < 10 || i10 > 13);
    }

    private static boolean a(i iVar, byte[] bArr) throws IOException {
        iVar.a();
        byte[] bArr2 = new byte[bArr.length];
        iVar.d(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private void a() {
        if (this.f14106u) {
            return;
        }
        this.f14106u = true;
        boolean z10 = this.f14095i;
        this.f14104s.a(new v.a().f(z10 ? o.J : o.I).f(f).k(1).l(z10 ? 16000 : 8000).a());
    }

    private int a(int i10) throws com.applovin.exoplayer2.ai {
        if (b(i10)) {
            return this.f14095i ? f14090c[i10] : f14089b[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f14095i ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw com.applovin.exoplayer2.ai.b(sb2.toString(), null);
    }

    private void a(long j10, int i10) {
        int i11;
        if (this.f14099m) {
            return;
        }
        int i12 = this.f14094h;
        if ((i12 & 1) != 0 && j10 != -1 && ((i11 = this.o) == -1 || i11 == this.f14097k)) {
            if (this.f14101p >= 20 || i10 == -1) {
                com.applovin.exoplayer2.e.v a10 = a(j10, (i12 & 2) != 0);
                this.f14105t = a10;
                this.f14103r.a(a10);
                this.f14099m = true;
                return;
            }
            return;
        }
        v.b bVar = new v.b(b.f7291b);
        this.f14105t = bVar;
        this.f14103r.a(bVar);
        this.f14099m = true;
    }

    private com.applovin.exoplayer2.e.v a(long j10, boolean z10) {
        return new d(j10, this.f14100n, a(this.o, 20000L), this.o, z10);
    }

    private static int a(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }
}
