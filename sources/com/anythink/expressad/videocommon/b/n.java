package com.anythink.expressad.videocommon.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.videocommon.b.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static final String f12397c = "UnitCacheCtroller";
    private com.anythink.expressad.videocommon.d.b f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, com.anythink.expressad.videocommon.d.b> f12402g;

    /* renamed from: k, reason: collision with root package name */
    private ExecutorService f12406k;

    /* renamed from: m, reason: collision with root package name */
    private String f12408m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.d f12409n;

    /* renamed from: p, reason: collision with root package name */
    private int f12410p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.d.c f12411q;

    /* renamed from: d, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.c> f12400d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f12401e = true;

    /* renamed from: h, reason: collision with root package name */
    private f f12403h = new f() { // from class: com.anythink.expressad.videocommon.b.n.1
        @Override // com.anythink.expressad.videocommon.b.f
        public final void a(long j10, int i10) {
            if (i10 == 5 || i10 == 4) {
                n.a(n.this);
                n.this.a();
            }
            if (i10 == 2) {
                n.a(n.this);
            }
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, c>> f12404i = new CopyOnWriteArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private long f12407l = com.anythink.expressad.d.a.b.P;
    private int o = 2;

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.d.c f12398a = null;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.d.c f12399b = null;

    /* renamed from: j, reason: collision with root package name */
    private Context f12405j = com.anythink.core.common.b.n.a().g();

    public n(List<com.anythink.expressad.foundation.d.c> list, ExecutorService executorService, String str, int i10) {
        this.f12410p = 1;
        List<com.anythink.expressad.foundation.d.c> list2 = this.f12400d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f12406k = executorService;
        this.f12408m = str;
        this.f12410p = i10;
        b(this.f12400d);
    }

    public static /* synthetic */ boolean a(n nVar) {
        nVar.f12401e = true;
        return true;
    }

    private void e() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f12404i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i10 = 0;
                    while (i10 < this.f12404i.size()) {
                        Map<String, c> map = this.f12404i.get(i10);
                        Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            c value = it.next().getValue();
                            if (value != null) {
                                if (currentTimeMillis - value.c() > this.f12407l * 1000 && value.k() == 1) {
                                    value.j();
                                    value.a(this.o);
                                    this.f12404i.remove(map);
                                    i10--;
                                }
                                if (value.k() != 1 && value.k() != 5 && value.k() != 0) {
                                    this.f12404i.remove(map);
                                    i10--;
                                }
                            }
                        }
                        i10++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void f() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f12404i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f12404i.size()) {
                        Map<String, c> map = this.f12404i.get(i10);
                        Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            c value = it.next().getValue();
                            if (value != null && value.n() != null && value.b() && value.d()) {
                                value.o();
                                this.f12404i.remove(map);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
                com.anythink.expressad.foundation.h.o.d(f12397c, "cleanDisplayTask ERROR");
            }
        }
    }

    private static boolean g() {
        return true;
    }

    private int h() {
        try {
            com.anythink.expressad.d.c cVar = this.f12398a;
            if (cVar == null) {
                return 100;
            }
            return cVar.f();
        } catch (Exception unused) {
            return 100;
        }
    }

    public final void d() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f12404i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, c>> it = this.f12404i.iterator();
                    while (it.hasNext()) {
                        Map<String, c> next = it.next();
                        if (next == null) {
                            return;
                        }
                        Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                        while (it2.hasNext()) {
                            c value = it2.next().getValue();
                            if (value != null) {
                                value.o();
                            }
                        }
                    }
                    this.f12404i.clear();
                }
            } catch (Throwable unused) {
                com.anythink.expressad.foundation.h.o.d(f12397c, "campaignDownLoadTaskList clean failed");
            }
        }
        List<com.anythink.expressad.foundation.d.c> list = this.f12400d;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f12400d.clear();
    }

    private void b(List<com.anythink.expressad.foundation.d.c> list) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList;
        boolean z10;
        if (list == null || list.size() == 0) {
            return;
        }
        f();
        e();
        int i10 = this.f12410p;
        if (i10 != 1) {
            if (i10 != 287) {
                if (i10 == 298) {
                    com.anythink.expressad.d.b.a();
                    com.anythink.expressad.d.c d10 = com.anythink.expressad.d.b.d(com.anythink.expressad.foundation.b.a.b().e(), this.f12408m);
                    this.f12399b = d10;
                    if (d10 == null) {
                        com.anythink.expressad.d.b.a();
                        this.f12399b = com.anythink.expressad.d.b.b(com.anythink.expressad.foundation.b.a.b().e(), this.f12408m);
                    }
                    com.anythink.expressad.d.c cVar = this.f12399b;
                    if (cVar != null) {
                        this.f12407l = cVar.i();
                        this.o = this.f12399b.m();
                    }
                } else if (i10 != 94) {
                    if (i10 == 95) {
                        try {
                            if (!TextUtils.isEmpty(this.f12408m)) {
                                com.anythink.expressad.d.b.a();
                                com.anythink.expressad.d.c c10 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), this.f12408m);
                                if (c10 == null) {
                                    c10 = com.anythink.expressad.d.c.d(this.f12408m);
                                }
                                if (c10 != null) {
                                    this.f12407l = c10.i();
                                    this.o = c10.m();
                                }
                            }
                        } catch (Exception unused) {
                            com.anythink.expressad.foundation.h.o.d(f12397c, "make sure your had put feeds jar into your project");
                            return;
                        }
                    }
                }
            }
            try {
                com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
                if (b10 == null) {
                    com.anythink.expressad.videocommon.e.c.a();
                    com.anythink.expressad.videocommon.e.c.c();
                }
                if (b10 != null) {
                    this.f12407l = b10.e();
                }
                if (!TextUtils.isEmpty(this.f12408m)) {
                    this.f12409n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f12408m);
                }
                com.anythink.expressad.videocommon.e.d dVar = this.f12409n;
                if (dVar != null) {
                    this.o = dVar.F();
                }
            } catch (Exception unused2) {
                com.anythink.expressad.foundation.h.o.d(f12397c, "make sure your had put reward jar into your project");
                return;
            }
        } else {
            try {
                if (!TextUtils.isEmpty(this.f12408m)) {
                    com.anythink.expressad.d.b.a();
                    com.anythink.expressad.d.c c11 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), this.f12408m);
                    this.f12398a = c11;
                    if (c11 == null) {
                        this.f12398a = com.anythink.expressad.d.c.c(this.f12408m);
                    }
                    com.anythink.expressad.d.c cVar2 = this.f12398a;
                    if (cVar2 != null) {
                        this.f12407l = cVar2.i();
                        this.o = this.f12398a.m();
                    }
                }
            } catch (Exception unused3) {
                com.anythink.expressad.foundation.h.o.d(f12397c, "make sure your had put feeds jar into your project");
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.anythink.expressad.foundation.d.c cVar3 = list.get(i11);
            if (cVar3 != null) {
                int i12 = this.f12410p;
                String str = (i12 != 94 && i12 != 287) ? cVar3.aZ() + cVar3.S() + cVar3.B() : cVar3.Z() + cVar3.aZ() + cVar3.S();
                if ((c(cVar3) || !TextUtils.isEmpty(cVar3.S())) && (copyOnWriteArrayList = this.f12404i) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i13 = 0;
                        while (true) {
                            try {
                                if (i13 >= this.f12404i.size()) {
                                    z10 = false;
                                    break;
                                }
                                Map<String, c> map = this.f12404i.get(i13);
                                if (map != null && map.containsKey(str)) {
                                    c cVar4 = map.get(str);
                                    cVar4.a(cVar3);
                                    cVar4.a(this.o);
                                    cVar4.a(false);
                                    map.remove(str);
                                    map.put(str, cVar4);
                                    this.f12404i.set(i13, map);
                                    z10 = true;
                                    break;
                                }
                                i13++;
                            } catch (Throwable unused4) {
                            }
                        }
                        if (!z10) {
                            c cVar5 = new c(this.f12405j, cVar3, this.f12406k, this.f12408m);
                            cVar5.a(this.o);
                            cVar5.e(this.f12410p);
                            HashMap hashMap = new HashMap();
                            hashMap.put(str, cVar5);
                            this.f12404i.add(hashMap);
                        }
                    }
                }
            }
        }
        List<com.anythink.expressad.foundation.d.c> list2 = this.f12400d;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f12400d.clear();
    }

    private static synchronized String c(c cVar) {
        synchronized (n.class) {
            if (cVar == null) {
                return "";
            }
            String S = cVar.n().S();
            try {
                if (cVar.k() == 5) {
                    String e10 = cVar.e();
                    if (!w.a(e10)) {
                        if (new File(e10).exists()) {
                            S = e10;
                        }
                    }
                }
            } catch (Throwable th) {
                com.anythink.expressad.foundation.h.o.b(f12397c, th.getMessage(), th);
            }
            return S;
        }
    }

    public final void a(com.anythink.expressad.videocommon.d.b bVar) {
        this.f = bVar;
    }

    public final void a(String str, com.anythink.expressad.videocommon.d.b bVar) {
        if (this.f12402g == null) {
            this.f12402g = new ConcurrentHashMap<>();
        }
        this.f12402g.put(str, bVar);
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        List<com.anythink.expressad.foundation.d.c> list2 = this.f12400d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        b(this.f12400d);
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        List<com.anythink.expressad.foundation.d.c> list = this.f12400d;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        b(this.f12400d);
    }

    public final void c() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f12404i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, c>> it = this.f12404i.iterator();
                    while (it.hasNext()) {
                        Map<String, c> next = it.next();
                        if (next != null) {
                            Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                c value = it2.next().getValue();
                                if (value != null && value.k() == 1) {
                                    com.anythink.expressad.foundation.h.o.b(f12397c, "暂停所有下载");
                                    value.j();
                                    this.f12404i.remove(next);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final List<c> a(boolean z10, List<com.anythink.expressad.foundation.d.c> list) {
        long j10;
        boolean z11 = z10;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f12404i;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i10 = 0;
                    while (i10 < this.f12404i.size()) {
                        Map<String, c> map = this.f12404i.get(i10);
                        Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            c value = it.next().getValue();
                            if (value != null && value.n() != null) {
                                com.anythink.expressad.foundation.d.c n10 = value.n();
                                boolean z12 = false;
                                for (com.anythink.expressad.foundation.d.c cVar : list) {
                                    if (n10 != null && cVar != null && !TextUtils.isEmpty(n10.Z()) && !TextUtils.isEmpty(cVar.Z()) && n10.aZ().equals(cVar.aZ()) && n10.Z().equals(cVar.Z())) {
                                        z12 = true;
                                    }
                                }
                                if (!z12) {
                                    com.anythink.expressad.foundation.h.o.b(f12397c, "UnitCache isReady ==== Campaign isAvailable = ".concat(String.valueOf(z12)));
                                } else if ((z11 && !n10.A()) || (!z11 && n10.A())) {
                                    com.anythink.expressad.foundation.h.o.b(f12397c, "UnitCache isReady ==== isBidCampaign = " + z11 + " campaign.isBidCampaign() = " + n10.A());
                                } else {
                                    String I = n10.I();
                                    String S = n10.S();
                                    String e10 = n10.M() != null ? n10.M().e() : "";
                                    n10.M();
                                    if (!TextUtils.isEmpty(e10) && !e10.contains(com.anythink.expressad.foundation.d.c.f9463d) && !b(n10, e10)) {
                                        com.anythink.expressad.foundation.h.o.b(f12397c, "UnitCache isReady ====  templateZipDownload check false continue");
                                    } else {
                                        if (b(I, n10)) {
                                            if (value.b()) {
                                                value.o();
                                                com.anythink.expressad.foundation.h.o.b(f12397c, "isready endcard下载完 但是offer展示过 continue");
                                            } else if (w.a(S)) {
                                                com.anythink.expressad.foundation.h.o.b(f12397c, "endcard为基准 endcard和图片下载完成 videourl为空不用下载 return task");
                                                arrayList.add(value);
                                            } else if (a(value, b(n10))) {
                                                com.anythink.expressad.foundation.h.o.b(f12397c, "endcard为基准 endcard 图片 和 videourl 下载完成 return task");
                                                arrayList.add(value);
                                            }
                                        }
                                        boolean isEmpty = TextUtils.isEmpty(value.m());
                                        int k10 = value.k();
                                        com.anythink.expressad.foundation.h.o.a(f12397c, "isready unit state:".concat(String.valueOf(k10)));
                                        if (k10 == 5) {
                                            if (value.b()) {
                                                value.o();
                                                this.f12404i.remove(map);
                                                i10--;
                                                com.anythink.expressad.foundation.h.o.b(f12397c, "isready state == DownLoadConstant.DOWNLOAD_DONE 但是offer展示过 continue");
                                                z11 = z10;
                                            } else if (!isEmpty) {
                                                value.l();
                                                com.anythink.expressad.foundation.h.o.b(f12397c, "isready !isEffectivePath continue");
                                            } else if (a(I, n10)) {
                                                com.anythink.expressad.foundation.h.o.b(f12397c, "isready videourl为基准 state＝done endcard 图片 和 videourl 下载完成 return task");
                                                arrayList.add(value);
                                            } else {
                                                com.anythink.expressad.foundation.h.o.b(f12397c, "isready done but continue");
                                                return null;
                                            }
                                        } else {
                                            long c10 = value.c();
                                            if (value.k() == 1) {
                                                j10 = currentTimeMillis;
                                                if (currentTimeMillis - c10 > this.f12407l * 1000) {
                                                    value.j();
                                                    this.f12404i.remove(map);
                                                    i10--;
                                                    com.anythink.expressad.foundation.h.o.b(f12397c, "isready download !timeout continue");
                                                    z11 = z10;
                                                    currentTimeMillis = j10;
                                                }
                                            } else {
                                                j10 = currentTimeMillis;
                                            }
                                            if (k10 != 4 && k10 != 2) {
                                                if (k10 == 1) {
                                                    if (value.b()) {
                                                        com.anythink.expressad.foundation.h.o.b(f12397c, "isready run 已经被展示过 continue");
                                                    } else if (!com.anythink.expressad.a.f6569p && a(value, b(n10)) && a(I, n10)) {
                                                        com.anythink.expressad.foundation.h.o.b(f12397c, "isready  IS_DOWANLOAD_FINSH_PLAY is :" + com.anythink.expressad.a.f6569p);
                                                        arrayList.add(value);
                                                    }
                                                    z11 = z10;
                                                    currentTimeMillis = j10;
                                                }
                                                if (a(value, b(n10)) && a(I, n10)) {
                                                    arrayList.add(value);
                                                }
                                                z11 = z10;
                                                currentTimeMillis = j10;
                                            }
                                            this.f12404i.remove(map);
                                            i10--;
                                            com.anythink.expressad.foundation.h.o.b(f12397c, "isready stop continue");
                                            z11 = z10;
                                            currentTimeMillis = j10;
                                        }
                                    }
                                }
                                j10 = currentTimeMillis;
                                z11 = z10;
                                currentTimeMillis = j10;
                            }
                            j10 = currentTimeMillis;
                            com.anythink.expressad.foundation.h.o.b(f12397c, "UnitCache isReady ==== task 或者 campaign为空 continue");
                            z11 = z10;
                            currentTimeMillis = j10;
                        }
                        i10++;
                        z11 = z10;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private int d(com.anythink.expressad.foundation.d.c cVar) {
        try {
            if (cVar.w() == 298) {
                if (this.f12399b == null) {
                    com.anythink.expressad.d.b.a();
                    this.f12399b = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e(), this.f12408m);
                }
                return this.f12399b.f();
            }
            if (cVar.w() == 42) {
                return h();
            }
            if (this.f12409n == null) {
                this.f12409n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f12408m, false);
            }
            return this.f12409n.v();
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f12397c, th.getMessage(), th);
            return 100;
        }
    }

    public n(com.anythink.expressad.foundation.d.c cVar, ExecutorService executorService, String str, int i10) {
        this.f12410p = 1;
        List<com.anythink.expressad.foundation.d.c> list = this.f12400d;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        this.f12406k = executorService;
        this.f12408m = str;
        this.f12410p = i10;
        b(this.f12400d);
    }

    private static boolean c(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null) {
            return false;
        }
        try {
            return cVar.J() == 2;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f6552a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private int b(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null) {
            return -1;
        }
        if (cVar.ao() != -1) {
            int ao = cVar.ao();
            a3.l.u(ao, "ready_rate(campaign): ", f12397c);
            return ao;
        }
        int d10 = d(cVar);
        a3.l.u(d10, "ready_rate(reward_unit_setting): ", f12397c);
        return d10;
    }

    private static boolean b(c cVar, int i10) {
        return a(cVar, i10);
    }

    private static boolean b(String str, com.anythink.expressad.foundation.d.c cVar) {
        if (!cVar.H() && !TextUtils.isEmpty(str)) {
            if (cVar.av() == 1 && !c(cVar)) {
                return true;
            }
            if (cVar.aB() != null && cVar.aB().size() > 0 && cVar.aB().contains(2)) {
                com.anythink.expressad.foundation.h.o.b(f12397c, "Is not check endCard download status : ".concat(String.valueOf(str)));
                return true;
            }
            if (w.b(i.a().c(str))) {
                com.anythink.expressad.foundation.h.o.b(f12397c, "endcard zip 下载完成 return true endcardUrl:".concat(String.valueOf(str)));
                return true;
            }
            if (w.b(j.a.f12383a.b(str))) {
                com.anythink.expressad.foundation.h.o.b(f12397c, "endcard url 源码 下载完成 return true endcardUrl:".concat(String.valueOf(str)));
                return true;
            }
            com.anythink.expressad.foundation.h.o.b(f12397c, "checkEndcardZipOrSourceDownLoad endcardUrl return false endcardUrl:".concat(String.valueOf(str)));
            return false;
        }
        com.anythink.expressad.foundation.h.o.b(f12397c, "Campaign is Mraid, do not need download endcardurl or Campaign load timeout");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x014b A[Catch: all -> 0x029d, Exception -> 0x029f, TRY_ENTER, TryCatch #0 {Exception -> 0x029f, blocks: (B:6:0x0028, B:7:0x002d, B:9:0x0035, B:10:0x0045, B:12:0x004b, B:14:0x0059, B:16:0x0061, B:18:0x0067, B:21:0x0075, B:27:0x006f, B:30:0x009a, B:32:0x00aa, B:33:0x00b2, B:38:0x00c4, B:40:0x00ca, B:42:0x00d2, B:45:0x00d8, B:46:0x00e0, B:48:0x00e6, B:64:0x00ec, B:50:0x00f7, B:60:0x00fd, B:52:0x0106, B:55:0x0110, B:65:0x0119, B:67:0x013a, B:74:0x014b, B:77:0x0151, B:81:0x0168, B:85:0x016f, B:83:0x018e, B:89:0x0197, B:91:0x019d, B:94:0x01a6, B:98:0x01b0, B:100:0x01bb, B:102:0x01c9, B:106:0x01db, B:107:0x01e6, B:109:0x01ec, B:111:0x01f2, B:113:0x01fe, B:121:0x021e, B:123:0x0224, B:124:0x022c, B:126:0x0230, B:128:0x023a, B:131:0x0240, B:134:0x0257, B:138:0x0261, B:140:0x026b, B:145:0x0273, B:150:0x0282), top: B:5:0x0028, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.videocommon.b.c a(int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.b.n.a(int, boolean):com.anythink.expressad.videocommon.b.c");
    }

    private static boolean b(com.anythink.expressad.foundation.d.c cVar, String str) {
        com.anythink.expressad.foundation.h.o.a(f12397c, "check template ".concat(String.valueOf(str)));
        if (cVar.j()) {
            return true;
        }
        if (cVar.aB() != null && cVar.aB().size() > 0 && cVar.aB().contains(1)) {
            com.anythink.expressad.foundation.h.o.b(f12397c, "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && cVar.av() == 0) {
            com.anythink.expressad.foundation.h.o.a(f12397c, "check template 下载情况：" + i.a().c(str));
            if (i.a().c(str) == null) {
                return false;
            }
        }
        return true;
    }

    public final c b(int i10, boolean z10) {
        try {
            return a(i10, z10);
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f12397c, th.getMessage(), th);
            return null;
        }
    }

    private static synchronized String b(c cVar) {
        String c10;
        synchronized (n.class) {
            c10 = c(cVar);
        }
        return c10;
    }

    public final void b() {
        int k10;
        try {
            CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f12404i;
            if (copyOnWriteArrayList != null) {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, c>> it = this.f12404i.iterator();
                    while (it.hasNext()) {
                        Map<String, c> next = it.next();
                        if (next != null) {
                            Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                c value = it2.next().getValue();
                                if (value != null && (k10 = value.k()) != 1 && k10 != 5) {
                                    if (com.anythink.expressad.foundation.h.k.a() != 9 && this.o == 2) {
                                        return;
                                    }
                                    if (k10 == 2 || k10 == 0) {
                                        value.h();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList;
        try {
            synchronized (this.f12404i) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f12404i) != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<Map<String, c>> it = this.f12404i.iterator();
                    while (it.hasNext()) {
                        Map<String, c> next = it.next();
                        if (next != null) {
                            for (Map.Entry<String, c> entry : next.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.f12404i.remove(next);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static boolean a(c cVar, int i10) {
        long p10 = cVar.p();
        long f = cVar.f();
        if (TextUtils.isEmpty(cVar.a())) {
            com.anythink.expressad.foundation.h.o.a(f12397c, "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (cVar.n() == null || TextUtils.isEmpty(cVar.n().S())) {
                return false;
            }
            a(cVar);
            return true;
        }
        if (f <= 0 || p10 * 100 < f * i10) {
            return false;
        }
        a(cVar);
        return true;
    }

    private static synchronized void a(c cVar) {
        synchronized (n.class) {
            com.anythink.expressad.foundation.d.c n10 = cVar != null ? cVar.n() : null;
            if (n10 == null) {
                return;
            }
            if (n10.w() == 94 || n10.w() == 287) {
                cVar.a(c(cVar));
            }
        }
    }

    private static boolean a(String str, com.anythink.expressad.foundation.d.c cVar) {
        try {
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f12397c, th.getMessage(), th);
        }
        if (cVar.aB() != null && cVar.aB().size() > 0 && cVar.aB().contains(2)) {
            com.anythink.expressad.foundation.h.o.b(f12397c, "Is not check endCard download status : ".concat(String.valueOf(str)));
            return true;
        }
        if (cVar.j() && !t.f(str)) {
            return true;
        }
        if (w.a(str)) {
            com.anythink.expressad.foundation.h.o.b(f12397c, "checkEndcardDownload endcardUrl is null return true");
            return true;
        }
        if (b(str, cVar)) {
            com.anythink.expressad.foundation.h.o.b(f12397c, "checkEndcardDownload endcardUrl done return true");
            return true;
        }
        com.anythink.expressad.foundation.h.o.b(f12397c, "checkEndcardDownload endcardUrl return false");
        return false;
    }

    private boolean a(com.anythink.expressad.foundation.d.c cVar, String str) {
        if (!TextUtils.isEmpty(cVar.ar())) {
            return true;
        }
        com.anythink.expressad.foundation.h.o.a(f12397c, "check template pre load ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        boolean d10 = l.a().d(this.f12408m + "_" + cVar.Z() + "_" + str);
        com.anythink.expressad.foundation.h.o.a(f12397c, "check template 预加载情况：".concat(String.valueOf(d10)));
        return d10;
    }

    public final c a(String str) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f12404i;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<Map<String, c>> it = this.f12404i.iterator();
                while (it.hasNext()) {
                    Map<String, c> next = it.next();
                    if (next != null && next.containsKey(str)) {
                        return next.get(str);
                    }
                }
            } catch (Throwable unused) {
                com.anythink.expressad.foundation.h.o.d(f12397c, "failed to get campaignTast by cid");
            }
            return null;
        }
    }

    private static boolean a(CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, c>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, c> next = it.next();
                if (next != null) {
                    Iterator<Map.Entry<String, c>> it2 = next.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().k() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f6552a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0031 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: all -> 0x01a5, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0015, B:9:0x001b, B:11:0x0021, B:14:0x0029, B:15:0x0031, B:17:0x0037, B:20:0x0045, B:23:0x004b, B:25:0x0051, B:26:0x0053, B:28:0x006b, B:30:0x006f, B:31:0x0077, B:32:0x007b, B:38:0x008f, B:40:0x0093, B:41:0x00a6, B:43:0x00aa, B:44:0x00b0, B:46:0x00b4, B:48:0x00b8, B:49:0x00cb, B:51:0x00cf, B:52:0x00fd, B:54:0x0102, B:55:0x0108, B:57:0x0138, B:59:0x013c, B:62:0x0144, B:63:0x014b, B:65:0x014f, B:67:0x0155, B:69:0x0163, B:80:0x0175, B:83:0x0179, B:96:0x0184, B:101:0x018c, B:86:0x0191, B:91:0x019e, B:94:0x019b, B:112:0x00d4, B:114:0x00d8, B:117:0x00ed, B:119:0x00f3, B:121:0x00f7, B:129:0x01a3), top: B:4:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102 A[Catch: all -> 0x01a5, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0015, B:9:0x001b, B:11:0x0021, B:14:0x0029, B:15:0x0031, B:17:0x0037, B:20:0x0045, B:23:0x004b, B:25:0x0051, B:26:0x0053, B:28:0x006b, B:30:0x006f, B:31:0x0077, B:32:0x007b, B:38:0x008f, B:40:0x0093, B:41:0x00a6, B:43:0x00aa, B:44:0x00b0, B:46:0x00b4, B:48:0x00b8, B:49:0x00cb, B:51:0x00cf, B:52:0x00fd, B:54:0x0102, B:55:0x0108, B:57:0x0138, B:59:0x013c, B:62:0x0144, B:63:0x014b, B:65:0x014f, B:67:0x0155, B:69:0x0163, B:80:0x0175, B:83:0x0179, B:96:0x0184, B:101:0x018c, B:86:0x0191, B:91:0x019e, B:94:0x019b, B:112:0x00d4, B:114:0x00d8, B:117:0x00ed, B:119:0x00f3, B:121:0x00f7, B:129:0x01a3), top: B:4:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[Catch: all -> 0x01a5, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0015, B:9:0x001b, B:11:0x0021, B:14:0x0029, B:15:0x0031, B:17:0x0037, B:20:0x0045, B:23:0x004b, B:25:0x0051, B:26:0x0053, B:28:0x006b, B:30:0x006f, B:31:0x0077, B:32:0x007b, B:38:0x008f, B:40:0x0093, B:41:0x00a6, B:43:0x00aa, B:44:0x00b0, B:46:0x00b4, B:48:0x00b8, B:49:0x00cb, B:51:0x00cf, B:52:0x00fd, B:54:0x0102, B:55:0x0108, B:57:0x0138, B:59:0x013c, B:62:0x0144, B:63:0x014b, B:65:0x014f, B:67:0x0155, B:69:0x0163, B:80:0x0175, B:83:0x0179, B:96:0x0184, B:101:0x018c, B:86:0x0191, B:91:0x019e, B:94:0x019b, B:112:0x00d4, B:114:0x00d8, B:117:0x00ed, B:119:0x00f3, B:121:0x00f7, B:129:0x01a3), top: B:4:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.b.n.a():void");
    }
}
