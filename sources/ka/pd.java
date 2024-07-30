package ka;

import java.util.HashMap;
import java.util.List;
import ka.af;
import ka.f1;

/* loaded from: classes2.dex */
public final class pd implements af.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd f31653b;

    public pd(qd qdVar, int i10) {
        this.f31653b = qdVar;
        this.f31652a = i10;
    }

    @Override // ka.af.a
    public final void a(int i10, boolean z10) {
        ((f1.a) this.f31653b.f31680a).a(this.f31652a, i10);
    }

    @Override // ka.af.a
    public final void a(HashMap hashMap) {
        ((f1.a) this.f31653b.f31680a).b(this.f31652a, hashMap);
    }

    @Override // ka.af.a
    public final void a(List<String> list) {
    }
}
