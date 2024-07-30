package b0;

import b0.f;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f.a f2701s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2702t;

    public c(f.a aVar, Object obj) {
        this.f2701s = aVar;
        this.f2702t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2701s.f2713s = this.f2702t;
    }
}
