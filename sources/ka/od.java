package ka;

import java.util.HashMap;
import ka.f1;
import ka.ud;

/* loaded from: classes2.dex */
public final class od implements ud.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd f31612b;

    public od(qd qdVar, int i10) {
        this.f31612b = qdVar;
        this.f31611a = i10;
    }

    @Override // ka.ud.a
    public final void a(int i10) {
        ((f1.a) this.f31612b.f31680a).a(this.f31611a, i10);
    }

    @Override // ka.ud.a
    public final void a(HashMap hashMap) {
        boolean isEmpty = hashMap.isEmpty();
        int i10 = this.f31611a;
        qd qdVar = this.f31612b;
        if (isEmpty) {
            ((f1.a) qdVar.f31680a).a(i10, 204);
        } else {
            ((f1.a) qdVar.f31680a).b(i10, hashMap);
        }
    }
}
