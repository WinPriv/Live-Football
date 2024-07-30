package w4;

import com.applovin.exoplayer2.b0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import d6.g0;
import d6.w;
import java.io.EOFException;
import java.io.IOException;
import m4.x;
import p4.h;
import p4.i;
import p4.j;
import p4.q;
import p4.r;

/* compiled from: Mp3Extractor.java */
/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: u, reason: collision with root package name */
    public static final b0 f36083u = new b0(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f36084a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36085b;

    /* renamed from: c, reason: collision with root package name */
    public final w f36086c;

    /* renamed from: d, reason: collision with root package name */
    public final x.a f36087d;

    /* renamed from: e, reason: collision with root package name */
    public final q f36088e;
    public final r f;

    /* renamed from: g, reason: collision with root package name */
    public final p4.g f36089g;

    /* renamed from: h, reason: collision with root package name */
    public j f36090h;

    /* renamed from: i, reason: collision with root package name */
    public p4.w f36091i;

    /* renamed from: j, reason: collision with root package name */
    public p4.w f36092j;

    /* renamed from: k, reason: collision with root package name */
    public int f36093k;

    /* renamed from: l, reason: collision with root package name */
    public Metadata f36094l;

    /* renamed from: m, reason: collision with root package name */
    public long f36095m;

    /* renamed from: n, reason: collision with root package name */
    public long f36096n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public int f36097p;

    /* renamed from: q, reason: collision with root package name */
    public e f36098q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f36099r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f36100s;

    /* renamed from: t, reason: collision with root package name */
    public long f36101t;

    public d() {
        this(0);
    }

    public static long b(Metadata metadata) {
        if (metadata != null) {
            for (Metadata.Entry entry : metadata.f19997s) {
                if (entry instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                    if (textInformationFrame.f20048s.equals("TLEN")) {
                        return g0.J(Long.parseLong(textInformationFrame.f20060u.get(0)));
                    }
                }
            }
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    public final a a(p4.e eVar, boolean z10) throws IOException {
        w wVar = this.f36086c;
        eVar.c(wVar.f27384a, 0, 4, false);
        wVar.E(0);
        this.f36087d.a(wVar.d());
        return new a(eVar.f34313c, eVar.f34314d, this.f36087d, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r5 != 1231971951) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d1  */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [w4.c] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [p4.u] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v38, types: [w4.c] */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r34, p4.t r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.d.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        return h((p4.e) iVar, true);
    }

    public final boolean e(p4.e eVar) throws IOException {
        e eVar2 = this.f36098q;
        if (eVar2 != null) {
            long b10 = eVar2.b();
            if (b10 != -1 && eVar.d() > b10 - 4) {
                return true;
            }
        }
        try {
            return !eVar.c(this.f36086c.f27384a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f36090h = jVar;
        p4.w s10 = jVar.s(0, 1);
        this.f36091i = s10;
        this.f36092j = s10;
        this.f36090h.m();
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.f36093k = 0;
        this.f36095m = com.anythink.expressad.exoplayer.b.f7291b;
        this.f36096n = 0L;
        this.f36097p = 0;
        this.f36101t = j11;
        e eVar = this.f36098q;
        if ((eVar instanceof b) && !((b) eVar).c(j11)) {
            this.f36100s = true;
            this.f36092j = this.f36089g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
    
        if (r19 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        r18.i(r4 + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
    
        r17.f36093k = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        r18.f = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(p4.e r18, boolean r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f = r3
            long r4 = r1.f34314d
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L42
            int r4 = r0.f36084a
            r4 = r4 & 8
            if (r4 != 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 == 0) goto L26
            r4 = r6
            goto L28
        L26:
            com.applovin.exoplayer2.b0 r4 = w4.d.f36083u
        L28:
            p4.r r7 = r0.f
            com.google.android.exoplayer2.metadata.Metadata r4 = r7.a(r1, r4)
            r0.f36094l = r4
            if (r4 == 0) goto L37
            p4.q r7 = r0.f36088e
            r7.b(r4)
        L37:
            long r7 = r18.d()
            int r4 = (int) r7
            if (r19 != 0) goto L43
            r1.i(r4)
            goto L43
        L42:
            r4 = r3
        L43:
            r7 = r3
            r8 = r7
            r9 = r8
        L46:
            boolean r10 = r17.e(r18)
            if (r10 == 0) goto L55
            if (r8 <= 0) goto L4f
            goto La7
        L4f:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L55:
            d6.w r10 = r0.f36086c
            r10.E(r3)
            int r10 = r10.d()
            if (r7 == 0) goto L73
            long r11 = (long) r7
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r10
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L70
            r11 = r5
            goto L71
        L70:
            r11 = r3
        L71:
            if (r11 == 0) goto L7a
        L73:
            int r11 = m4.x.a(r10)
            r12 = -1
            if (r11 != r12) goto L99
        L7a:
            int r7 = r9 + 1
            if (r9 != r2) goto L88
            if (r19 == 0) goto L81
            return r3
        L81:
            java.lang.String r1 = "Searched too many bytes."
            k4.z0 r1 = k4.z0.a(r1, r6)
            throw r1
        L88:
            if (r19 == 0) goto L92
            r1.f = r3
            int r8 = r4 + r7
            r1.k(r8, r3)
            goto L95
        L92:
            r1.i(r5)
        L95:
            r8 = r3
            r9 = r7
            r7 = r8
            goto L46
        L99:
            int r8 = r8 + 1
            if (r8 != r5) goto La4
            m4.x$a r7 = r0.f36087d
            r7.a(r10)
            r7 = r10
            goto Lb3
        La4:
            r10 = 4
            if (r8 != r10) goto Lb3
        La7:
            if (r19 == 0) goto Lae
            int r4 = r4 + r9
            r1.i(r4)
            goto Lb0
        Lae:
            r1.f = r3
        Lb0:
            r0.f36093k = r7
            return r5
        Lb3:
            int r11 = r11 + (-4)
            r1.k(r11, r3)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.d.h(p4.e, boolean):boolean");
    }

    public d(int i10) {
        this(com.anythink.expressad.exoplayer.b.f7291b);
    }

    public d(long j10) {
        this.f36084a = 0;
        this.f36085b = j10;
        this.f36086c = new w(10);
        this.f36087d = new x.a();
        this.f36088e = new q();
        this.f36095m = com.anythink.expressad.exoplayer.b.f7291b;
        this.f = new r();
        p4.g gVar = new p4.g();
        this.f36089g = gVar;
        this.f36092j = gVar;
    }

    @Override // p4.h
    public final void release() {
    }
}
