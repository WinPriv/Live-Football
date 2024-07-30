package j7;

import j7.p;
import java.util.Map;

/* compiled from: CompactHashMap.java */
/* loaded from: classes2.dex */
public final class n extends p<Object, Object>.b<Map.Entry<Object, Object>> {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f30049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar) {
        super();
        this.f30049w = pVar;
    }

    @Override // j7.p.b
    public final Map.Entry<Object, Object> a(int i10) {
        return new p.d(i10);
    }
}
