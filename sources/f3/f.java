package f3;

import e3.n;
import e3.o;
import e3.r;
import java.io.InputStream;
import java.net.URL;
import y2.g;

/* compiled from: UrlLoader.java */
/* loaded from: classes.dex */
public final class f implements n<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final n<e3.f, InputStream> f28062a;

    /* compiled from: UrlLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // e3.o
        public final n<URL, InputStream> a(r rVar) {
            return new f(rVar.b(e3.f.class, InputStream.class));
        }
    }

    public f(n<e3.f, InputStream> nVar) {
        this.f28062a = nVar;
    }

    @Override // e3.n
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // e3.n
    public final n.a<InputStream> b(URL url, int i10, int i11, g gVar) {
        return this.f28062a.b(new e3.f(url), i10, i11, gVar);
    }
}
