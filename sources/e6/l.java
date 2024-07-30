package e6;

import android.view.Surface;
import d6.g0;
import e6.m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m.a f27837s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f27838t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f27839u;

    public /* synthetic */ l(m.a aVar, Surface surface, long j10) {
        this.f27837s = aVar;
        this.f27838t = surface;
        this.f27839u = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a aVar = this.f27837s;
        aVar.getClass();
        int i10 = g0.f27302a;
        aVar.f27841b.s(this.f27839u, this.f27838t);
    }
}
