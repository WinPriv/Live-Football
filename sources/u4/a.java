package u4;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.huawei.openalliance.ad.constant.be;
import d6.w;
import java.io.IOException;
import k4.i0;
import p4.h;
import p4.i;
import p4.j;
import p4.u;
import x4.g;

/* compiled from: JpegExtractor.java */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public j f35758b;

    /* renamed from: c, reason: collision with root package name */
    public int f35759c;

    /* renamed from: d, reason: collision with root package name */
    public int f35760d;

    /* renamed from: e, reason: collision with root package name */
    public int f35761e;

    /* renamed from: g, reason: collision with root package name */
    public MotionPhotoMetadata f35762g;

    /* renamed from: h, reason: collision with root package name */
    public i f35763h;

    /* renamed from: i, reason: collision with root package name */
    public c f35764i;

    /* renamed from: j, reason: collision with root package name */
    public g f35765j;

    /* renamed from: a, reason: collision with root package name */
    public final w f35757a = new w(6);
    public long f = -1;

    public final void a() {
        b(new Metadata.Entry[0]);
        j jVar = this.f35758b;
        jVar.getClass();
        jVar.m();
        this.f35758b.i(new u.b(com.anythink.expressad.exoplayer.b.f7291b));
        this.f35759c = 6;
    }

    public final void b(Metadata.Entry... entryArr) {
        j jVar = this.f35758b;
        jVar.getClass();
        p4.w s10 = jVar.s(1024, 4);
        i0.a aVar = new i0.a();
        aVar.f30533j = be.V;
        aVar.f30532i = new Metadata(entryArr);
        s10.b(new i0(aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r25, p4.t r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.a.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        p4.e eVar = (p4.e) iVar;
        if (e(eVar) != 65496) {
            return false;
        }
        int e10 = e(eVar);
        this.f35760d = e10;
        w wVar = this.f35757a;
        if (e10 == 65504) {
            wVar.B(2);
            eVar.c(wVar.f27384a, 0, 2, false);
            eVar.k(wVar.y() - 2, false);
            this.f35760d = e(eVar);
        }
        if (this.f35760d != 65505) {
            return false;
        }
        eVar.k(2, false);
        wVar.B(6);
        eVar.c(wVar.f27384a, 0, 6, false);
        if (wVar.u() != 1165519206 || wVar.y() != 0) {
            return false;
        }
        return true;
    }

    public final int e(p4.e eVar) throws IOException {
        w wVar = this.f35757a;
        wVar.B(2);
        eVar.c(wVar.f27384a, 0, 2, false);
        return wVar.y();
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f35758b = jVar;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f35759c = 0;
            this.f35765j = null;
        } else if (this.f35759c == 5) {
            g gVar = this.f35765j;
            gVar.getClass();
            gVar.g(j10, j11);
        }
    }

    @Override // p4.h
    public final void release() {
        g gVar = this.f35765j;
        if (gVar != null) {
            gVar.getClass();
        }
    }
}
