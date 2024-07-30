package k4;

import android.util.Pair;
import j5.u;
import k4.y0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30829s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y0.a f30830t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Pair f30831u;

    public /* synthetic */ x0(y0.a aVar, Pair pair, int i10) {
        this.f30829s = i10;
        this.f30830t = aVar;
        this.f30831u = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30829s;
        Pair pair = this.f30831u;
        y0.a aVar = this.f30830t;
        switch (i10) {
            case 0:
                aVar.f30846t.f30840h.P(((Integer) pair.first).intValue(), (u.b) pair.second);
                return;
            default:
                aVar.f30846t.f30840h.A(((Integer) pair.first).intValue(), (u.b) pair.second);
                return;
        }
    }
}
