package f3;

import com.bumptech.glide.load.data.j;
import e3.l;
import e3.m;
import e3.n;
import e3.o;
import e3.r;
import java.io.InputStream;
import java.util.ArrayDeque;
import y2.g;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes.dex */
public final class a implements n<e3.f, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final y2.f<Integer> f28042b = y2.f.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final m<e3.f, e3.f> f28043a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: f3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0375a implements o<e3.f, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final m<e3.f, e3.f> f28044a = new m<>();

        @Override // e3.o
        public final n<e3.f, InputStream> a(r rVar) {
            return new a(this.f28044a);
        }
    }

    public a(m<e3.f, e3.f> mVar) {
        this.f28043a = mVar;
    }

    @Override // e3.n
    public final /* bridge */ /* synthetic */ boolean a(e3.f fVar) {
        return true;
    }

    @Override // e3.n
    public final n.a<InputStream> b(e3.f fVar, int i10, int i11, g gVar) {
        e3.f fVar2 = fVar;
        m<e3.f, e3.f> mVar = this.f28043a;
        if (mVar != null) {
            m.a a10 = m.a.a(fVar2);
            l lVar = mVar.f27698a;
            Object a11 = lVar.a(a10);
            ArrayDeque arrayDeque = m.a.f27699d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            e3.f fVar3 = (e3.f) a11;
            if (fVar3 == null) {
                lVar.d(m.a.a(fVar2), fVar2);
            } else {
                fVar2 = fVar3;
            }
        }
        return new n.a<>(fVar2, new j(fVar2, ((Integer) gVar.c(f28042b)).intValue()));
    }
}
