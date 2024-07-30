package com.ironsource.mediationsdk.bidding;

import a3.k;
import com.ironsource.environment.e.c;
import com.ironsource.environment.g.a;
import com.ironsource.environment.g.b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.a.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s.f;

/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);

        void a(List<e> list, long j10, List<String> list2);
    }

    public final void a(List<com.ironsource.mediationsdk.bidding.a> list, a aVar, long j10, TimeUnit timeUnit) {
        if (list.isEmpty()) {
            IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
            return;
        }
        com.ironsource.environment.g.a aVar2 = new com.ironsource.environment.g.a(c.a());
        Iterator<com.ironsource.mediationsdk.bidding.a> it = list.iterator();
        while (it.hasNext()) {
            aVar2.a(it.next());
        }
        IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j10 + " millis");
        aVar2.a(new C0331b(this, aVar), j10, timeUnit);
    }

    /* renamed from: com.ironsource.mediationsdk.bidding.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0331b implements a.InterfaceC0323a<e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f25362a;

        public C0331b(b bVar, a aVar) {
            this.f25362a = aVar;
        }

        @Override // com.ironsource.environment.g.a.InterfaceC0323a
        public final void a(String str) {
            String b10 = f.b("failed to collect bidding data, error= ", str);
            IronLog.INTERNAL.verbose(b10);
            this.f25362a.a(b10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.g.a.InterfaceC0323a
        public final void a(List<com.ironsource.environment.g.b<e>> list, long j10) {
            IronLog ironLog;
            StringBuilder sb2;
            String e10;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (com.ironsource.environment.g.b<e> bVar : list) {
                if (bVar instanceof b.C0324b) {
                    arrayList2.add((e) ((b.C0324b) bVar).f24684a);
                } else if (bVar instanceof b.a) {
                    arrayList.add(((com.ironsource.mediationsdk.bidding.a) ((b.a) bVar).f24683a).f25356b);
                } else if (bVar instanceof b.c) {
                    b.c cVar = (b.c) bVar;
                    com.ironsource.mediationsdk.bidding.a aVar = (com.ironsource.mediationsdk.bidding.a) cVar.f24685a;
                    arrayList2.add(new e(aVar.f25355a, aVar.f25356b, null, 0L, cVar.f24686b.getMessage()));
                }
            }
            IronLog.INTERNAL.verbose("tokens received=" + arrayList2.size() + ", reached timeout=" + arrayList.size() + ", total duration=" + j10 + " millis");
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.c() != null) {
                    ironLog = IronLog.INTERNAL;
                    sb2 = new StringBuilder();
                    sb2.append(eVar.b());
                    sb2.append(" - success (");
                    sb2.append(eVar.d());
                    e10 = " millis)";
                } else {
                    ironLog = IronLog.INTERNAL;
                    sb2 = new StringBuilder();
                    sb2.append(eVar.b());
                    sb2.append(" - failed (");
                    sb2.append(eVar.d());
                    sb2.append(" millis) error: ");
                    e10 = eVar.e();
                }
                k.v(sb2, e10, ironLog);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                IronLog.INTERNAL.verbose(str + " reached timeout");
            }
            this.f25362a.a(arrayList2, j10, arrayList);
        }
    }
}
