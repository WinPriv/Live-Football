package ka;

import java.util.HashMap;
import ka.f1;
import ka.te;

/* loaded from: classes2.dex */
public final class nd implements te.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd f31511b;

    public nd(qd qdVar, int i10) {
        this.f31511b = qdVar;
        this.f31510a = i10;
    }

    @Override // ka.te.a
    public final void a(int i10) {
        ((f1.a) this.f31511b.f31680a).a(this.f31510a, i10);
    }

    @Override // ka.te.a
    public final void a(HashMap hashMap) {
        ((f1.a) this.f31511b.f31680a).b(this.f31510a, hashMap);
    }
}
