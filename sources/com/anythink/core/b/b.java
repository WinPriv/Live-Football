package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.m;
import com.anythink.core.common.e.r;
import com.anythink.core.common.k;
import com.anythink.core.common.k.s;
import com.anythink.core.common.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b extends com.anythink.core.common.k.a implements k.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4573a = "b";

    /* renamed from: b, reason: collision with root package name */
    Map<String, com.anythink.core.common.e.e> f4574b = new ConcurrentHashMap(3);

    /* renamed from: c, reason: collision with root package name */
    Runnable f4575c = new Runnable() { // from class: com.anythink.core.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.b.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private String f4576d;

    /* renamed from: e, reason: collision with root package name */
    private k.a f4577e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private long f4578g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4579h;

    /* renamed from: i, reason: collision with root package name */
    private com.anythink.core.common.e.a f4580i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Integer, d> f4581j;

    /* renamed from: k, reason: collision with root package name */
    private long f4582k;

    /* renamed from: com.anythink.core.b.b$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.e.e f4594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ai f4595b;

        public AnonymousClass5(com.anythink.core.common.e.e eVar, ai aiVar) {
            this.f4594a = eVar;
            this.f4595b = aiVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f4580i.f5388b.f6024e != null) {
                if (this.f4594a != null) {
                    b.this.f4580i.f5388b.f6024e.a(this.f4594a, ErrorCode.getErrorCode(ErrorCode.adSourceBidError, "", this.f4595b.z()));
                }
                b.this.f4574b.remove(this.f4595b.t());
            }
        }
    }

    /* renamed from: com.anythink.core.b.b$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.e.e f4597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ai f4598b;

        public AnonymousClass6(com.anythink.core.common.e.e eVar, ai aiVar) {
            this.f4597a = eVar;
            this.f4598b = aiVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f4580i.f5388b.f6024e != null) {
                com.anythink.core.common.e.e eVar = this.f4597a;
                if (eVar != null) {
                    s.a(eVar, this.f4598b, 0, false);
                    b.this.f4580i.f5388b.f6024e.b(this.f4597a);
                }
                b.this.f4574b.remove(this.f4598b.t());
            }
        }
    }

    public b(com.anythink.core.common.e.a aVar) {
        this.f4580i = aVar;
        this.f4576d = aVar.f5390d;
        this.f = aVar.f5389c;
        this.f4578g = aVar.f;
        List<ai> list = aVar.f5394i;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<ai> list2 = null;
        Boolean bool = null;
        List<ai> list3 = null;
        List<ai> list4 = null;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= size) {
                break;
            }
            ai aiVar = list.get(i10);
            if (aiVar.l() != 1 && aiVar.l() != 3) {
                if (aiVar.l() == 2) {
                    list2 = list2 == null ? new ArrayList<>(size) : list2;
                    list2.add(aiVar);
                } else if (aiVar.l() == 5) {
                    list3 = list3 == null ? new ArrayList<>(size) : list3;
                    list3.add(aiVar);
                } else if (aiVar.l() == 6) {
                    list4 = list4 == null ? new ArrayList<>(size) : list4;
                    list4.add(aiVar);
                } else if (aiVar.l() == 7) {
                    arrayList2.add(aiVar);
                }
            } else {
                arrayList.add(aiVar);
                if (!n.a().v() && bool == null) {
                    if (aiVar.c() != 66 && aiVar.c() != 6) {
                        z10 = false;
                    }
                    if (z10) {
                        bool = Boolean.TRUE;
                    }
                }
            }
            i10++;
        }
        this.f4581j = new HashMap(5);
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            this.f4581j.put(1, new c(aVar.a(arrayList, arrayList2, bool)));
        }
        if (list2 != null && list2.size() > 0) {
            this.f4581j.put(2, new a(aVar.a(list2)));
        }
        if (list3 != null && list3.size() > 0) {
            this.f4581j.put(5, new h(aVar.b(list3)));
        }
        if (list4 != null && list4.size() > 0) {
            this.f4581j.put(6, new g(aVar.c(list4)));
        }
    }

    private void f() {
        this.f4577e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Integer num, List<ai> list, List<ai> list2) {
        a(num, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        try {
            k.a aVar = this.f4577e;
            if (aVar != null) {
                aVar.a(this.f);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void d() {
        long j10 = this.f4580i.f5393h;
        if (j10 <= 0) {
            j10 = 2000;
        }
        n.a().a(this.f4575c, j10);
    }

    private synchronized void e() {
        if (this.f4581j.size() == 0) {
            a();
            n.a().c(this.f4575c);
            k.a aVar = this.f4577e;
            if (aVar != null) {
                aVar.b(this.f);
            }
            this.f4577e = null;
        }
    }

    @Override // com.anythink.core.common.k.b
    public final void a(boolean z10) {
        this.f4579h = z10;
    }

    @Override // com.anythink.core.common.k.a
    public final synchronized void b() {
        Iterator it = new HashMap(this.f4581j).entrySet().iterator();
        while (it.hasNext()) {
            d dVar = (d) ((Map.Entry) it.next()).getValue();
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    @Override // com.anythink.core.common.k.b
    public final void a(k.a aVar) {
        this.f4577e = aVar;
        super.a(this.f4578g);
        long j10 = this.f4580i.f5393h;
        if (j10 <= 0) {
            j10 = 2000;
        }
        n.a().a(this.f4575c, j10);
        this.f4582k = System.currentTimeMillis();
        for (Map.Entry entry : new HashMap(this.f4581j).entrySet()) {
            final Integer num = (Integer) entry.getKey();
            final d dVar = (d) entry.getValue();
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.a(b.this.f4579h);
                        dVar.a(new com.anythink.core.b.b.a() { // from class: com.anythink.core.b.b.2.1
                            @Override // com.anythink.core.b.b.a
                            public final void a(ai aiVar, ATBaseAdAdapter aTBaseAdAdapter) {
                                b.a(b.this, aiVar, aTBaseAdAdapter);
                            }

                            @Override // com.anythink.core.b.b.a
                            public final void a(List<ai> list, List<ai> list2) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                b.this.b(num, list, list2);
                            }
                        });
                    }
                }
            });
        }
    }

    private void b(ai aiVar) {
        com.anythink.core.common.e.e eVar = this.f4574b.get(aiVar.t());
        if (eVar != null) {
            com.anythink.core.common.k.b.a.a().a(new AnonymousClass6(eVar, aiVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Integer num) {
        d dVar = this.f4581j.get(num);
        if (dVar != null && dVar.c()) {
            this.f4581j.remove(num);
            e();
        }
    }

    private synchronized void a(final Integer num, List<ai> list, List<ai> list2) {
        int size;
        if (list != null) {
            try {
                size = list.size();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            size = 0;
        }
        int size2 = list2 != null ? list2.size() : 0;
        if (size > 0 || size2 > 0) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            com.anythink.core.c.d a10 = com.anythink.core.c.e.a(this.f4580i.f5387a).a(this.f4576d);
            boolean z10 = true;
            if (size > 0) {
                int i10 = 0;
                while (i10 < size) {
                    ai aiVar = list.get(i10);
                    a(this.f4576d, aiVar, z10);
                    if (a10.a(aiVar.t()) || this.f4580i.f5405u == 8) {
                        arrayList.add(aiVar);
                        arrayList3.add(aiVar);
                        com.anythink.core.common.e.e eVar = this.f4574b.get(aiVar.t());
                        if (eVar != null) {
                            com.anythink.core.common.k.b.a.a().a(new AnonymousClass6(eVar, aiVar));
                        }
                    }
                    i10++;
                    z10 = true;
                }
                list.clear();
            }
            if (size2 > 0) {
                for (int i11 = 0; i11 < size2; i11++) {
                    ai aiVar2 = list2.get(i11);
                    if (aiVar2 == null) {
                        try {
                            com.anythink.core.common.j.c.a("Bid Fail AdSource Object is null, currentSize:" + list2.size() + "\n" + com.anythink.core.common.k.h.a(new Throwable().getStackTrace()), "Bidding inner error", n.a().r());
                        } catch (Throwable unused) {
                        }
                    }
                    a(this.f4576d, aiVar2, false);
                    if (a10.a(aiVar2.t()) || this.f4580i.f5405u == 8) {
                        if (com.anythink.core.common.k.g.a(aiVar2) > 0.0d && !TextUtils.isEmpty(aiVar2.y())) {
                            arrayList.add(aiVar2);
                        } else {
                            arrayList2.add(aiVar2);
                        }
                        arrayList3.add(aiVar2);
                        com.anythink.core.common.e.e eVar2 = this.f4574b.get(aiVar2.t());
                        if (eVar2 != null) {
                            com.anythink.core.common.k.b.a.a().a(new AnonymousClass5(eVar2, aiVar2));
                        }
                    }
                }
                list2.clear();
            }
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, new Comparator<ai>() { // from class: com.anythink.core.b.b.3
                    private static int a(ai aiVar3, ai aiVar4) {
                        double a11 = com.anythink.core.common.k.g.a(aiVar3);
                        double a12 = com.anythink.core.common.k.g.a(aiVar4);
                        if (a11 > a12) {
                            return -1;
                        }
                        if (a11 == a12) {
                            return 0;
                        }
                        return 1;
                    }

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(ai aiVar3, ai aiVar4) {
                        double a11 = com.anythink.core.common.k.g.a(aiVar3);
                        double a12 = com.anythink.core.common.k.g.a(aiVar4);
                        if (a11 > a12) {
                            return -1;
                        }
                        if (a11 == a12) {
                            return 0;
                        }
                        return 1;
                    }
                });
            }
            com.anythink.core.common.e.a aVar = this.f4580i;
            String str = aVar.f5390d;
            com.anythink.core.c.d dVar = aVar.f5399n;
            String str2 = aVar.f5389c;
            com.anythink.core.common.j jVar = aVar.f5388b;
            com.anythink.core.b.d.a.a(str, dVar, str2, jVar != null ? jVar.f6023d : 0, arrayList3, this.f4582k, aVar.f5403s.S(), this.f4580i.f5405u);
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (b.this) {
                        if (b.this.f4577e != null) {
                            b.this.f4577e.a(b.this.f, arrayList, arrayList2);
                        }
                        b.this.a(num);
                    }
                }
            });
        }
    }

    private void a(String str, ai aiVar, boolean z10) {
        boolean z11;
        if (aiVar.m() == 2) {
            com.anythink.core.common.e.b a10 = com.anythink.core.common.a.a().a(str, aiVar);
            m N = aiVar.N();
            if (a10 != null) {
                try {
                    if (aiVar.aa()) {
                        m N2 = a10.e().getUnitGroupInfo().N();
                        if (N2 != null) {
                            j b10 = f.a().b(N2.f5695g, N2.f5699k);
                            m N3 = aiVar.N();
                            j b11 = N3 != null ? f.a().b(N3.f5695g, N3.f5699k) : null;
                            if (b10 != null && b11 != null) {
                                f.a().c(N2.f5695g, N2.f5699k);
                                z11 = true;
                            }
                        }
                        z11 = false;
                    } else {
                        if (com.anythink.core.common.k.g.a(aiVar) > com.anythink.core.common.k.g.a(a10.e().getUnitGroupInfo())) {
                            z11 = true;
                        }
                        z11 = false;
                    }
                    if (z11) {
                        aiVar.a(aiVar, 2, aiVar.o(), 1);
                        ai unitGroupInfo = a10.e().getUnitGroupInfo();
                        m N4 = unitGroupInfo.N();
                        if (N4 != null) {
                            double a11 = com.anythink.core.common.k.g.a(aiVar);
                            com.anythink.core.common.e.a aVar = this.f4580i;
                            String str2 = aVar.f5389c;
                            String str3 = aVar.f5390d;
                            com.anythink.core.c.d dVar = aVar.f5399n;
                            com.anythink.core.common.j jVar = aVar.f5388b;
                            com.anythink.core.common.e.e a12 = s.a(str2, str3, "", dVar, "", 1, 0, 0, jVar != null ? jVar.f6025g : null);
                            r rVar = new r();
                            rVar.f5731a = 2;
                            rVar.f5732b = a11;
                            rVar.f5735e = a12;
                            rVar.f5733c = aiVar;
                            rVar.f5734d = unitGroupInfo;
                            N4.a(rVar, true);
                        }
                        w a13 = w.a();
                        com.anythink.core.common.e.a aVar2 = this.f4580i;
                        a13.a(aVar2.f5390d, aVar2.f5389c, unitGroupInfo);
                        com.anythink.core.common.a.a().a(str, aiVar.t());
                        return;
                    }
                    try {
                        ai unitGroupInfo2 = a10.e().getUnitGroupInfo();
                        double a14 = com.anythink.core.common.k.g.a(unitGroupInfo2);
                        String str4 = unitGroupInfo2.N() != null ? unitGroupInfo2.N().token : "";
                        if (N != null && !TextUtils.equals(N.token, str4)) {
                            com.anythink.core.common.e.a aVar3 = this.f4580i;
                            String str5 = aVar3.f5389c;
                            String str6 = aVar3.f5390d;
                            com.anythink.core.c.d dVar2 = aVar3.f5399n;
                            com.anythink.core.common.j jVar2 = aVar3.f5388b;
                            com.anythink.core.common.e.e a15 = s.a(str5, str6, "", dVar2, "", 1, 0, 0, jVar2 != null ? jVar2.f6025g : null);
                            r rVar2 = new r();
                            rVar2.f5732b = a14;
                            rVar2.f5735e = a15;
                            rVar2.f5733c = unitGroupInfo2;
                            rVar2.f5734d = aiVar;
                            if (unitGroupInfo2.aa()) {
                                rVar2.f5731a = 3;
                                N.a(rVar2, true);
                            } else {
                                rVar2.f5731a = 2;
                                N.a(rVar2, true);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    aiVar.a(a10.e().getUnitGroupInfo(), 1, aiVar.o(), z10 ? 1 : 0);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void a(ai aiVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aiVar.l() == 7 || aTBaseAdAdapter == null) {
            return;
        }
        try {
            com.anythink.core.common.e.a aVar = this.f4580i;
            if (aVar.f5388b.f6024e != null) {
                com.anythink.core.common.e.e N = aVar.f5403s.N();
                s.a(N, aiVar, 0, false);
                N.g(aTBaseAdAdapter.getNetworkPlacementId());
                this.f4574b.put(aiVar.t(), N);
                N.d(0.0d);
                N.a(0.0d);
                N.b(0.0d);
                this.f4580i.f5388b.f6024e.a(N);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(ai aiVar) {
        com.anythink.core.common.e.e eVar = this.f4574b.get(aiVar.t());
        if (eVar != null) {
            com.anythink.core.common.k.b.a.a().a(new AnonymousClass5(eVar, aiVar));
        }
    }

    public static /* synthetic */ void a(b bVar, ai aiVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aiVar.l() == 7 || aTBaseAdAdapter == null) {
            return;
        }
        try {
            com.anythink.core.common.e.a aVar = bVar.f4580i;
            if (aVar.f5388b.f6024e != null) {
                com.anythink.core.common.e.e N = aVar.f5403s.N();
                s.a(N, aiVar, 0, false);
                N.g(aTBaseAdAdapter.getNetworkPlacementId());
                bVar.f4574b.put(aiVar.t(), N);
                N.d(0.0d);
                N.a(0.0d);
                N.b(0.0d);
                bVar.f4580i.f5388b.f6024e.a(N);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
