package com.applovin.exoplayer2.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.b.h;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class q extends com.applovin.exoplayer2.f.j implements com.applovin.exoplayer2.l.s {

    /* renamed from: b, reason: collision with root package name */
    private final Context f13496b;

    /* renamed from: c, reason: collision with root package name */
    private final g.a f13497c;

    /* renamed from: d, reason: collision with root package name */
    private final h f13498d;

    /* renamed from: e, reason: collision with root package name */
    private int f13499e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private com.applovin.exoplayer2.v f13500g;

    /* renamed from: h, reason: collision with root package name */
    private long f13501h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13502i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13503j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13504k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13505l;

    /* renamed from: m, reason: collision with root package name */
    private ar.a f13506m;

    /* loaded from: classes.dex */
    public final class a implements h.c {
        private a() {
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a() {
            q.this.B();
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void b() {
            if (q.this.f13506m != null) {
                q.this.f13506m.a();
            }
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(long j10) {
            q.this.f13497c.a(j10);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(int i10, long j10, long j11) {
            q.this.f13497c.a(i10, j10, j11);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void b(long j10) {
            if (q.this.f13506m != null) {
                q.this.f13506m.a(j10);
            }
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(boolean z10) {
            q.this.f13497c.a(z10);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(Exception exc) {
            com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio sink error", exc);
            q.this.f13497c.a(exc);
        }
    }

    public q(Context context, com.applovin.exoplayer2.f.k kVar, boolean z10, Handler handler, g gVar, h hVar) {
        this(context, g.b.f15029a, kVar, z10, handler, gVar, hVar);
    }

    private void R() {
        long a10 = this.f13498d.a(A());
        if (a10 != Long.MIN_VALUE) {
            if (!this.f13503j) {
                a10 = Math.max(this.f13501h, a10);
            }
            this.f13501h = a10;
            this.f13503j = false;
        }
    }

    private static boolean S() {
        if (ai.f16274a == 23) {
            String str = ai.f16277d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean A() {
        if (super.A() && this.f13498d.d()) {
            return true;
        }
        return false;
    }

    public void B() {
        this.f13503j = true;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void C() {
        super.C();
        this.f13498d.b();
    }

    @Override // com.applovin.exoplayer2.f.j
    public void D() throws com.applovin.exoplayer2.p {
        try {
            this.f13498d.c();
        } catch (h.e e10) {
            throw a(e10, e10.f13398c, e10.f13397b, 5002);
        }
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        if (d_() == 2) {
            R();
        }
        return this.f13501h;
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        return this.f13498d.f();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void p() {
        super.p();
        this.f13498d.a();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void q() {
        R();
        this.f13498d.i();
        super.q();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void r() {
        this.f13504k = true;
        try {
            this.f13498d.j();
            try {
                super.r();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.r();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void s() {
        try {
            super.s();
        } finally {
            if (this.f13504k) {
                this.f13504k = false;
                this.f13498d.l();
            }
        }
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean z() {
        if (!this.f13498d.e() && !super.z()) {
            return false;
        }
        return true;
    }

    public q(Context context, g.b bVar, com.applovin.exoplayer2.f.k kVar, boolean z10, Handler handler, g gVar, h hVar) {
        super(1, bVar, kVar, z10, 44100.0f);
        this.f13496b = context.getApplicationContext();
        this.f13498d = hVar;
        this.f13497c = new g.a(handler, gVar);
        hVar.a(new a());
    }

    @Override // com.applovin.exoplayer2.f.j
    public int a(com.applovin.exoplayer2.f.k kVar, com.applovin.exoplayer2.v vVar) throws l.b {
        if (!com.applovin.exoplayer2.l.u.a(vVar.f16838l)) {
            return as.b(0);
        }
        int i10 = ai.f16274a >= 21 ? 32 : 0;
        boolean z10 = vVar.E != 0;
        boolean c10 = com.applovin.exoplayer2.f.j.c(vVar);
        int i11 = 8;
        if (c10 && this.f13498d.a(vVar) && (!z10 || com.applovin.exoplayer2.f.l.a() != null)) {
            return as.a(4, 8, i10);
        }
        if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(vVar.f16838l) && !this.f13498d.a(vVar)) {
            return as.b(1);
        }
        if (!this.f13498d.a(ai.b(2, vVar.y, vVar.f16850z))) {
            return as.b(1);
        }
        List<com.applovin.exoplayer2.f.i> a10 = a(kVar, vVar, false);
        if (a10.isEmpty()) {
            return as.b(1);
        }
        if (!c10) {
            return as.b(2);
        }
        com.applovin.exoplayer2.f.i iVar = a10.get(0);
        boolean a11 = iVar.a(vVar);
        if (a11 && iVar.c(vVar)) {
            i11 = 16;
        }
        return as.a(a11 ? 4 : 3, i11, i10);
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean b(com.applovin.exoplayer2.v vVar) {
        return this.f13498d.a(vVar);
    }

    private static boolean b(String str) {
        if (ai.f16274a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(ai.f16276c)) {
            String str2 = ai.f16275b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ar
    public com.applovin.exoplayer2.l.s c() {
        return this;
    }

    @Override // com.applovin.exoplayer2.f.j
    public List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, com.applovin.exoplayer2.v vVar, boolean z10) throws l.b {
        com.applovin.exoplayer2.f.i a10;
        String str = vVar.f16838l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f13498d.a(vVar) && (a10 = com.applovin.exoplayer2.f.l.a()) != null) {
            return Collections.singletonList(a10);
        }
        List<com.applovin.exoplayer2.f.i> a11 = com.applovin.exoplayer2.f.l.a(kVar.getDecoderInfos(str, z10, false), vVar);
        if (com.anythink.expressad.exoplayer.k.o.B.equals(str)) {
            ArrayList arrayList = new ArrayList(a11);
            arrayList.addAll(kVar.getDecoderInfos(com.anythink.expressad.exoplayer.k.o.A, z10, false));
            a11 = arrayList;
        }
        return Collections.unmodifiableList(a11);
    }

    @Override // com.applovin.exoplayer2.f.j
    public g.a a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, MediaCrypto mediaCrypto, float f) {
        this.f13499e = a(iVar, vVar, u());
        this.f = b(iVar.f15032a);
        MediaFormat a10 = a(vVar, iVar.f15034c, this.f13499e, f);
        this.f13500g = com.anythink.expressad.exoplayer.k.o.f9088w.equals(iVar.f15033b) && !com.anythink.expressad.exoplayer.k.o.f9088w.equals(vVar.f16838l) ? vVar : null;
        return g.a.a(iVar, a10, vVar, mediaCrypto);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v vVar2) {
        com.applovin.exoplayer2.c.h a10 = iVar.a(vVar, vVar2);
        int i10 = a10.f13656e;
        if (a(iVar, vVar2) > this.f13499e) {
            i10 |= 64;
        }
        int i11 = i10;
        return new com.applovin.exoplayer2.c.h(iVar.f15032a, vVar, vVar2, i11 != 0 ? 0 : a10.f13655d, i11);
    }

    @Override // com.applovin.exoplayer2.f.j
    public float a(float f, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v[] vVarArr) {
        int i10 = -1;
        for (com.applovin.exoplayer2.v vVar2 : vVarArr) {
            int i11 = vVar2.f16850z;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f * i10;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str, long j10, long j11) {
        this.f13497c.a(str, j10, j11);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str) {
        this.f13497c.a(str);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(Exception exc) {
        com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f13497c.b(exc);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.w wVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.c.h a10 = super.a(wVar);
        this.f13497c.a(wVar.f16876b, a10);
        return a10;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(com.applovin.exoplayer2.v vVar, MediaFormat mediaFormat) throws com.applovin.exoplayer2.p {
        int i10;
        int i11;
        com.applovin.exoplayer2.v vVar2 = this.f13500g;
        int[] iArr = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (G() != null) {
            if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(vVar.f16838l)) {
                i10 = vVar.A;
            } else if (ai.f16274a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = ai.c(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = com.anythink.expressad.exoplayer.k.o.f9088w.equals(vVar.f16838l) ? vVar.A : 2;
            }
            com.applovin.exoplayer2.v a10 = new v.a().f(com.anythink.expressad.exoplayer.k.o.f9088w).m(i10).n(vVar.B).o(vVar.C).k(mediaFormat.getInteger("channel-count")).l(mediaFormat.getInteger("sample-rate")).a();
            if (this.f && a10.y == 6 && (i11 = vVar.y) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < vVar.y; i12++) {
                    iArr[i12] = i12;
                }
            }
            vVar = a10;
        }
        try {
            this.f13498d.a(vVar, 0, iArr);
        } catch (h.a e10) {
            throw a(e10, e10.f13390a, 5001);
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(boolean z10, boolean z11) throws com.applovin.exoplayer2.p {
        super.a(z10, z11);
        this.f13497c.a(((com.applovin.exoplayer2.f.j) this).f15043a);
        if (v().f13250b) {
            this.f13498d.g();
        } else {
            this.f13498d.h();
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        super.a(j10, z10);
        if (this.f13505l) {
            this.f13498d.k();
        } else {
            this.f13498d.j();
        }
        this.f13501h = j10;
        this.f13502i = true;
        this.f13503j = true;
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        this.f13498d.a(amVar);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(com.applovin.exoplayer2.c.g gVar) {
        if (!this.f13502i || gVar.b()) {
            return;
        }
        if (Math.abs(gVar.f13647d - this.f13501h) > 500000) {
            this.f13501h = gVar.f13647d;
        }
        this.f13502i = false;
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean a(long j10, long j11, com.applovin.exoplayer2.f.g gVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, com.applovin.exoplayer2.v vVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.l.a.b(byteBuffer);
        if (this.f13500g != null && (i11 & 2) != 0) {
            ((com.applovin.exoplayer2.f.g) com.applovin.exoplayer2.l.a.b(gVar)).a(i10, false);
            return true;
        }
        if (z10) {
            if (gVar != null) {
                gVar.a(i10, false);
            }
            ((com.applovin.exoplayer2.f.j) this).f15043a.f += i12;
            this.f13498d.b();
            return true;
        }
        try {
            if (!this.f13498d.a(byteBuffer, j12, i12)) {
                return false;
            }
            if (gVar != null) {
                gVar.a(i10, false);
            }
            ((com.applovin.exoplayer2.f.j) this).f15043a.f13638e += i12;
            return true;
        } catch (h.b e10) {
            throw a(e10, e10.f13393c, e10.f13392b, 5001);
        } catch (h.e e11) {
            throw a(e11, vVar, e11.f13397b, 5002);
        }
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws com.applovin.exoplayer2.p {
        if (i10 == 2) {
            this.f13498d.a(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f13498d.a((d) obj);
            return;
        }
        if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.f13498d.b(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f13498d.a(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f13506m = (ar.a) obj;
                    return;
                default:
                    super.a(i10, obj);
                    return;
            }
        }
        this.f13498d.a((k) obj);
    }

    public int a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v[] vVarArr) {
        int a10 = a(iVar, vVar);
        if (vVarArr.length == 1) {
            return a10;
        }
        for (com.applovin.exoplayer2.v vVar2 : vVarArr) {
            if (iVar.a(vVar, vVar2).f13655d != 0) {
                a10 = Math.max(a10, a(iVar, vVar2));
            }
        }
        return a10;
    }

    private int a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(iVar.f15032a) || (i10 = ai.f16274a) >= 24 || (i10 == 23 && ai.c(this.f13496b))) {
            return vVar.f16839m;
        }
        return -1;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat a(com.applovin.exoplayer2.v vVar, String str, int i10, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", vVar.y);
        mediaFormat.setInteger("sample-rate", vVar.f16850z);
        com.applovin.exoplayer2.l.t.a(mediaFormat, vVar.f16840n);
        com.applovin.exoplayer2.l.t.a(mediaFormat, "max-input-size", i10);
        int i11 = ai.f16274a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !S()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(vVar.f16838l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f13498d.b(ai.b(4, vVar.y, vVar.f16850z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
