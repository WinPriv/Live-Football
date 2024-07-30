package p5;

import c6.d0;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;

/* compiled from: FilteringHlsPlaylistParserFactory.java */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f34395a;

    /* renamed from: b, reason: collision with root package name */
    public final List<StreamKey> f34396b;

    public c(a aVar, List list) {
        this.f34395a = aVar;
        this.f34396b = list;
    }

    @Override // p5.i
    public final d0.a<g> a(f fVar, e eVar) {
        return new i5.c(this.f34395a.a(fVar, eVar), this.f34396b);
    }

    @Override // p5.i
    public final d0.a<g> b() {
        return new i5.c(this.f34395a.b(), this.f34396b);
    }
}
