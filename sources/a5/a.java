package a5;

import com.anythink.expressad.exoplayer.k.o;
import com.huawei.openalliance.ad.constant.ag;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.io.IOException;
import k4.i0;
import k4.z0;
import okhttp3.internal.http.StatusLine;
import p4.e;
import p4.h;
import p4.i;
import p4.j;
import p4.w;

/* compiled from: WavExtractor.java */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public j f261a;

    /* renamed from: b, reason: collision with root package name */
    public w f262b;

    /* renamed from: e, reason: collision with root package name */
    public b f265e;

    /* renamed from: c, reason: collision with root package name */
    public int f263c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f264d = -1;
    public int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f266g = -1;

    /* compiled from: WavExtractor.java */
    /* renamed from: a5.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0006a implements b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f267m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f268n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, com.anythink.expressad.foundation.g.a.aT, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, ag.f22003n, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final j f269a;

        /* renamed from: b, reason: collision with root package name */
        public final w f270b;

        /* renamed from: c, reason: collision with root package name */
        public final a5.b f271c;

        /* renamed from: d, reason: collision with root package name */
        public final int f272d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f273e;
        public final d6.w f;

        /* renamed from: g, reason: collision with root package name */
        public final int f274g;

        /* renamed from: h, reason: collision with root package name */
        public final i0 f275h;

        /* renamed from: i, reason: collision with root package name */
        public int f276i;

        /* renamed from: j, reason: collision with root package name */
        public long f277j;

        /* renamed from: k, reason: collision with root package name */
        public int f278k;

        /* renamed from: l, reason: collision with root package name */
        public long f279l;

        public C0006a(j jVar, w wVar, a5.b bVar) throws z0 {
            this.f269a = jVar;
            this.f270b = wVar;
            this.f271c = bVar;
            int i10 = bVar.f288b;
            int max = Math.max(1, i10 / 10);
            this.f274g = max;
            d6.w wVar2 = new d6.w(bVar.f291e);
            wVar2.l();
            int l10 = wVar2.l();
            this.f272d = l10;
            int i11 = bVar.f287a;
            int i12 = bVar.f289c;
            int i13 = (((i12 - (i11 * 4)) * 8) / (bVar.f290d * i11)) + 1;
            if (l10 == i13) {
                int i14 = g0.f27302a;
                int i15 = ((max + l10) - 1) / l10;
                this.f273e = new byte[i15 * i12];
                this.f = new d6.w(l10 * 2 * i11 * i15);
                int i16 = ((i12 * i10) * 8) / l10;
                i0.a aVar = new i0.a();
                aVar.f30534k = o.f9088w;
                aVar.f = i16;
                aVar.f30530g = i16;
                aVar.f30535l = max * 2 * i11;
                aVar.f30546x = i11;
                aVar.y = i10;
                aVar.f30547z = 2;
                this.f275h = new i0(aVar);
                return;
            }
            throw z0.a("Expected frames per block: " + i13 + "; got: " + l10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:4:0x004b). Please report as a decompilation issue!!! */
        @Override // a5.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(p4.e r25, long r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a5.a.C0006a.a(p4.e, long):boolean");
        }

        @Override // a5.a.b
        public final void b(long j10) {
            this.f276i = 0;
            this.f277j = j10;
            this.f278k = 0;
            this.f279l = 0L;
        }

        @Override // a5.a.b
        public final void c(int i10, long j10) {
            this.f269a.i(new d(this.f271c, this.f272d, i10, j10));
            this.f270b.b(this.f275h);
        }

        public final void d(int i10) {
            long j10 = this.f277j;
            long j11 = this.f279l;
            a5.b bVar = this.f271c;
            long P = j10 + g0.P(j11, 1000000L, bVar.f288b);
            int i11 = i10 * 2 * bVar.f287a;
            this.f270b.c(P, 1, i11, this.f278k - i11, null);
            this.f279l += i10;
            this.f278k -= i11;
        }
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(e eVar, long j10) throws IOException;

        void b(long j10);

        void c(int i10, long j10) throws z0;
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final j f280a;

        /* renamed from: b, reason: collision with root package name */
        public final w f281b;

        /* renamed from: c, reason: collision with root package name */
        public final a5.b f282c;

        /* renamed from: d, reason: collision with root package name */
        public final i0 f283d;

        /* renamed from: e, reason: collision with root package name */
        public final int f284e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public int f285g;

        /* renamed from: h, reason: collision with root package name */
        public long f286h;

        public c(j jVar, w wVar, a5.b bVar, String str, int i10) throws z0 {
            this.f280a = jVar;
            this.f281b = wVar;
            this.f282c = bVar;
            int i11 = bVar.f290d;
            int i12 = bVar.f287a;
            int i13 = (i11 * i12) / 8;
            int i14 = bVar.f289c;
            if (i14 == i13) {
                int i15 = bVar.f288b;
                int i16 = i15 * i13;
                int i17 = i16 * 8;
                int max = Math.max(i13, i16 / 10);
                this.f284e = max;
                i0.a aVar = new i0.a();
                aVar.f30534k = str;
                aVar.f = i17;
                aVar.f30530g = i17;
                aVar.f30535l = max;
                aVar.f30546x = i12;
                aVar.y = i15;
                aVar.f30547z = i10;
                this.f283d = new i0(aVar);
                return;
            }
            throw z0.a("Expected block size: " + i13 + "; got: " + i14, null);
        }

        @Override // a5.a.b
        public final boolean a(e eVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f285g) < (i11 = this.f284e)) {
                int a10 = this.f281b.a(eVar, (int) Math.min(i11 - i10, j11), true);
                if (a10 == -1) {
                    j11 = 0;
                } else {
                    this.f285g += a10;
                    j11 -= a10;
                }
            }
            int i12 = this.f282c.f289c;
            int i13 = this.f285g / i12;
            if (i13 > 0) {
                long P = this.f + g0.P(this.f286h, 1000000L, r1.f288b);
                int i14 = i13 * i12;
                int i15 = this.f285g - i14;
                this.f281b.c(P, 1, i14, i15, null);
                this.f286h += i13;
                this.f285g = i15;
            }
            if (j11 <= 0) {
                return true;
            }
            return false;
        }

        @Override // a5.a.b
        public final void b(long j10) {
            this.f = j10;
            this.f285g = 0;
            this.f286h = 0L;
        }

        @Override // a5.a.b
        public final void c(int i10, long j10) {
            this.f280a.i(new d(this.f282c, 1, i10, j10));
            this.f281b.b(this.f283d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x017b, code lost:
    
        if (r9 != 65534) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0180, code lost:
    
        if (r1 == 32) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r25, p4.t r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.a.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        return a5.c.a((e) iVar);
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f261a = jVar;
        this.f262b = jVar.s(0, 1);
        jVar.m();
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f263c = i10;
        b bVar = this.f265e;
        if (bVar != null) {
            bVar.b(j11);
        }
    }

    @Override // p4.h
    public final void release() {
    }
}
