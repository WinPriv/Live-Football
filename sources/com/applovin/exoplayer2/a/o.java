package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.l.p;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d6.o;
import h4.b;
import k4.b1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements p.a, b.a, o.a, Continuation {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12982s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12983t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12984u;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.f12982s = i10;
        this.f12983t = obj;
        this.f12984u = obj2;
    }

    @Override // h4.b.a
    public final Object execute() {
        f4.h hVar = (f4.h) this.f12983t;
        return Boolean.valueOf(hVar.f28091c.E((z3.s) this.f12984u));
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12982s;
        Object obj2 = this.f12984u;
        Object obj3 = this.f12983t;
        switch (i10) {
            case 0:
                a.E((b.a) obj3, (String) obj2, (b) obj);
                return;
            case 1:
                a.v((b.a) obj3, (com.applovin.exoplayer2.m.o) obj2, (b) obj);
                return;
            case 2:
            default:
                ((l4.b) obj).getClass();
                return;
            case 3:
                ((l4.b) obj).g((b1) obj2);
                return;
            case 4:
                ((l4.b) obj).getClass();
                return;
            case 5:
                ((l4.b) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        i8.v vVar = (i8.v) this.f12983t;
        String str = (String) this.f12984u;
        synchronized (vVar) {
            vVar.f29304b.remove(str);
        }
        return task;
    }
}
