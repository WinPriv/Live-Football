package ka;

import android.content.Context;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import ka.f1;

/* loaded from: classes2.dex */
public final class md implements og {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd f31464b;

    public md(qd qdVar, int i10) {
        this.f31464b = qdVar;
        this.f31463a = i10;
    }

    @Override // ka.og
    public final void a(int i10) {
        ((f1.a) this.f31464b.f31680a).a(this.f31463a, i10);
    }

    @Override // ka.og
    public final void a(HashMap hashMap, HashMap hashMap2) {
        f1.a aVar = (f1.a) this.f31464b.f31680a;
        aVar.getClass();
        ConcurrentHashMap concurrentHashMap = d0.f31074c;
        concurrentHashMap.clear();
        if (hashMap != null) {
            concurrentHashMap.putAll(hashMap);
        }
        ConcurrentHashMap concurrentHashMap2 = d0.f31075d;
        concurrentHashMap2.clear();
        concurrentHashMap2.putAll(hashMap2);
        y.d(aVar.f31153c, aVar.f31154d, 200, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, new Pair(60, hashMap)));
        if (aVar.f31155e || d0.f31076e) {
            Context context = aVar.f31152b;
            String str = aVar.f31151a;
            Integer num = p5.j(context).f;
            d0.i(context, str, num != null ? num.intValue() : 0, hashMap, hashMap2);
            d0.f31076e = false;
        }
    }
}
