package j7;

import j7.w;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: DenseImmutableTable.java */
/* loaded from: classes2.dex */
public final class x extends b<Map.Entry<Object, Object>> {

    /* renamed from: u, reason: collision with root package name */
    public int f30140u = -1;

    /* renamed from: v, reason: collision with root package name */
    public final int f30141v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w.c f30142w;

    public x(w.c cVar) {
        this.f30142w = cVar;
        this.f30141v = cVar.A().size();
    }

    @Override // j7.b
    @CheckForNull
    public final Map.Entry<Object, Object> a() {
        w.c cVar;
        Object y;
        do {
            int i10 = this.f30140u + 1;
            this.f30140u = i10;
            if (i10 < this.f30141v) {
                cVar = this.f30142w;
                y = cVar.y(i10);
            } else {
                this.f29877s = 3;
                return null;
            }
        } while (y == null);
        return new h0(cVar.A().keySet().p().get(this.f30140u), y);
    }
}
