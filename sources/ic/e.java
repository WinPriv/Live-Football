package ic;

import android.content.Context;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Set f29544s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Set f29545t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f29546u;

    public e(f fVar, HashSet hashSet, HashSet hashSet2) {
        this.f29546u = fVar;
        this.f29544s = hashSet;
        this.f29545t = hashSet2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        f fVar = this.f29546u;
        if (fVar.f29548a != null) {
            Iterator it = this.f29544s.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                context = fVar.f29548a;
                if (!hasNext) {
                    break;
                }
                lc.c cVar = (lc.c) it.next();
                cVar.f32603u = System.currentTimeMillis();
                kc.d.j(kc.c.a(context)).i(cVar);
                fVar.f29549b.put(cVar.f32601s, cVar);
            }
            for (lc.c cVar2 : this.f29545t) {
                kc.d.j(kc.c.a(context)).k(cVar2);
                fVar.f29549b.remove(cVar2.f32601s);
            }
            int size = fVar.f29549b.size() + AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
            if (size > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = fVar.f29549b.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add((lc.c) ((Map.Entry) it2.next()).getValue());
                }
                Collections.sort(arrayList);
                for (int i10 = 0; i10 < size; i10++) {
                    lc.c cVar3 = (lc.c) arrayList.get(i10);
                    kc.d.j(kc.c.a(context)).k(cVar3);
                    fVar.f29549b.remove(cVar3.f32601s);
                }
            }
        }
    }
}
