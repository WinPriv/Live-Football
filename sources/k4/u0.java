package k4;

import android.util.Pair;
import j5.u;
import k4.y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30810s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y0.a f30811t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Pair f30812u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j5.o f30813v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j5.r f30814w;

    public /* synthetic */ u0(y0.a aVar, Pair pair, j5.o oVar, j5.r rVar, int i10) {
        this.f30810s = i10;
        this.f30811t = aVar;
        this.f30812u = pair;
        this.f30813v = oVar;
        this.f30814w = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30810s;
        j5.r rVar = this.f30814w;
        j5.o oVar = this.f30813v;
        Pair pair = this.f30812u;
        y0.a aVar = this.f30811t;
        switch (i10) {
            case 0:
                aVar.f30846t.f30840h.z(((Integer) pair.first).intValue(), (u.b) pair.second, oVar, rVar);
                return;
            default:
                aVar.f30846t.f30840h.V(((Integer) pair.first).intValue(), (u.b) pair.second, oVar, rVar);
                return;
        }
    }
}
