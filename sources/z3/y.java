package z3;

import java.util.concurrent.Executor;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes.dex */
public final class y implements b4.b {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f36972s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f36973t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f36974u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f36975v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f36976w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f36977x;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f36972s = i10;
        this.f36973t = obj;
        this.f36974u = obj2;
        this.f36975v = obj3;
        this.f36976w = obj4;
        this.f36977x = obj5;
    }

    @Override // tc.a
    public final Object get() {
        int i10 = this.f36972s;
        Object obj = this.f36977x;
        Object obj2 = this.f36976w;
        Object obj3 = this.f36975v;
        Object obj4 = this.f36974u;
        Object obj5 = this.f36973t;
        switch (i10) {
            case 0:
                return new w((i4.a) ((tc.a) obj5).get(), (i4.a) ((tc.a) obj4).get(), (e4.b) ((tc.a) obj3).get(), (f4.h) ((tc.a) obj2).get(), (f4.j) ((tc.a) obj).get());
            default:
                return new e4.a((Executor) ((tc.a) obj5).get(), (a4.e) ((tc.a) obj4).get(), (f4.k) ((tc.a) obj3).get(), (g4.d) ((tc.a) obj2).get(), (h4.b) ((tc.a) obj).get());
        }
    }
}
