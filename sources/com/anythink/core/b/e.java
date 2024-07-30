package com.anythink.core.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.b.i;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e extends d {

    /* renamed from: g, reason: collision with root package name */
    public static final double f4617g = 10000.0d;

    /* renamed from: h, reason: collision with root package name */
    final String f4618h;

    /* renamed from: i, reason: collision with root package name */
    protected final List<JSONObject> f4619i;

    /* renamed from: j, reason: collision with root package name */
    List<ai> f4620j;

    /* renamed from: k, reason: collision with root package name */
    List<ai> f4621k;

    /* renamed from: l, reason: collision with root package name */
    String f4622l;

    /* renamed from: m, reason: collision with root package name */
    String f4623m;

    /* renamed from: n, reason: collision with root package name */
    String f4624n;
    com.anythink.core.b.b.a o;

    /* renamed from: p, reason: collision with root package name */
    long f4625p;

    /* renamed from: q, reason: collision with root package name */
    protected m f4626q;

    /* renamed from: r, reason: collision with root package name */
    protected String f4627r;

    /* renamed from: s, reason: collision with root package name */
    protected AtomicBoolean f4628s;

    /* renamed from: t, reason: collision with root package name */
    protected AtomicBoolean f4629t;

    /* renamed from: u, reason: collision with root package name */
    ConcurrentHashMap<String, ai> f4630u;

    /* renamed from: v, reason: collision with root package name */
    ConcurrentHashMap<String, ai> f4631v;

    /* renamed from: w, reason: collision with root package name */
    ConcurrentHashMap<String, ai> f4632w;

    /* renamed from: x, reason: collision with root package name */
    ConcurrentHashMap<String, ai> f4633x;
    Runnable y;

    public e(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.f4618h = getClass().getSimpleName().concat(w.bE);
        this.f4619i = new ArrayList();
        this.f4620j = new ArrayList();
        this.f4621k = new ArrayList();
        this.f4628s = new AtomicBoolean(false);
        this.f4629t = new AtomicBoolean(false);
        this.f4630u = new ConcurrentHashMap<>();
        this.f4631v = new ConcurrentHashMap<>();
        this.f4632w = new ConcurrentHashMap<>();
        this.f4633x = new ConcurrentHashMap<>();
        this.y = new Runnable() { // from class: com.anythink.core.b.e.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.e.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.g();
                    }
                });
            }
        };
        List<ai> list = aVar.f5394i;
        if (list != null && list.size() > 0) {
            for (ai aiVar : aVar.f5394i) {
                if (aiVar != null) {
                    this.f4630u.put(aiVar.t(), aiVar);
                    this.f4632w.put(aiVar.t(), aiVar);
                }
            }
        }
        List<ai> list2 = aVar.f5396k;
        if (list2 != null && list2.size() > 0) {
            for (ai aiVar2 : aVar.f5396k) {
                this.f4631v.put(aiVar2.t(), aiVar2);
            }
        }
        JSONObject jSONObject = aVar.f5402r;
        if (jSONObject != null) {
            this.f4619i.add(jSONObject);
        }
        ai aiVar3 = aVar.f5404t;
        if (aiVar3 != null) {
            this.f4626q = aiVar3.N();
            this.f4627r = aVar.f5404t.t();
            if (this.f4626q == null) {
                com.anythink.core.common.e.b a10 = com.anythink.core.common.a.a().a(aVar.f5390d, aVar.f5404t);
                if (a10 != null) {
                    this.f4626q = a10.e().getUnitGroupInfo().N();
                } else {
                    this.f4626q = f.a().a(aVar.f5404t);
                }
            }
        }
        this.f4622l = aVar.f5389c;
        this.f4623m = aVar.f5390d;
        this.f4624n = b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(final long j10) {
        ArrayList arrayList = new ArrayList();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a(arrayList, concurrentHashMap);
        this.f4629t.set(true);
        a(arrayList, new com.anythink.core.common.g.i() { // from class: com.anythink.core.b.e.3
            @Override // com.anythink.core.common.g.i
            public final void onLoadCanceled(int i10) {
                synchronized (e.class) {
                    e.this.f4629t.set(false);
                    e.this.d();
                    e.this.a((List<m>) null, SystemClock.elapsedRealtime() - j10, "onLoadCanceled.", (Map<String, ai>) concurrentHashMap);
                }
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadError(int i10, String str, AdError adError) {
                String str2;
                synchronized (e.class) {
                    e.this.f4629t.set(false);
                    e.this.d();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
                    e eVar = e.this;
                    if (adError != null) {
                        str2 = adError.getPlatformMSG();
                    } else {
                        str2 = "";
                    }
                    eVar.a((List<m>) null, elapsedRealtime, str2, (Map<String, ai>) concurrentHashMap);
                }
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadFinish(int i10, Object obj) {
                synchronized (e.class) {
                    e.this.f4629t.set(false);
                    long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
                    List a10 = e.a(e.this, obj);
                    e.a(e.this, obj, a10);
                    e.this.a((List<m>) a10, elapsedRealtime, (String) null, (Map<String, ai>) concurrentHashMap);
                    e.this.d();
                }
            }

            @Override // com.anythink.core.common.g.i
            public final void onLoadStart(int i10) {
            }
        });
    }

    private void e() {
        n.a().c(this.y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() {
        /*
            r7 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.anythink.core.common.e.ai> r0 = r7.f4632w
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            r7.e()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f4629t
            boolean r0 = r0.get()
            if (r0 != 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            int r3 = r7.h()
            if (r3 <= 0) goto L36
            if (r0 != 0) goto L37
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f4628s
            boolean r0 = r0.get()
            if (r0 == 0) goto L32
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f4629t
            boolean r0 = r0.get()
            if (r0 != 0) goto L32
            r0 = r1
            goto L33
        L32:
            r0 = r2
        L33:
            if (r0 == 0) goto L36
            goto L37
        L36:
            r1 = r2
        L37:
            if (r1 == 0) goto L3f
            long r0 = r7.f4625p
            r7.b(r0)
            return
        L3f:
            java.util.List<com.anythink.core.common.e.ai> r0 = r7.f4620j
            int r0 = r0.size()
            if (r0 <= 0) goto L57
            boolean r0 = r7.o()
            if (r0 == 0) goto L57
            r2 = 0
            r3 = 0
            java.lang.String r5 = ""
            r6 = 0
            r1 = r7
            r1.a(r2, r3, r5, r6)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.b.e.f():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        if (this.f.get()) {
            return;
        }
        this.f4628s.set(true);
        if (h() > 0) {
            b(SystemClock.elapsedRealtime());
        }
    }

    private synchronized int h() {
        return this.f4619i.size();
    }

    private boolean i() {
        if (!this.f4629t.get() && this.f4619i.size() > 0) {
            return true;
        }
        return false;
    }

    private boolean j() {
        if (this.f4628s.get() && !this.f4629t.get()) {
            return true;
        }
        return false;
    }

    private synchronized void k() {
        if (!this.f.get()) {
            this.f.set(true);
            e();
            this.f4632w.clear();
            a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f4630u);
            a(0L, -3, ATBidRequestInfo.BIDDING_REQUEST_TIMEOUT_TYPE, this.f4631v);
            n();
            m();
            l();
        }
    }

    private void l() {
        com.anythink.core.b.b.a aVar;
        if ((this.f4621k.size() > 0 || this.f4620j.size() > 0) && (aVar = this.o) != null) {
            aVar.a(this.f4621k, this.f4620j);
        }
        this.f4621k.clear();
        this.f4620j.clear();
    }

    private synchronized void m() {
        if (o()) {
            this.f.set(true);
        }
    }

    private void n() {
        if (this.f4608e) {
            if (this.f4621k.size() > 0 || this.f4620j.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("S2S HeadBidding Success List", d.a(this.f4621k));
                    jSONObject.put("S2S HeadBidding Fail List", d.a(this.f4620j));
                } catch (Exception unused) {
                }
                com.anythink.core.common.k.n.a(com.anythink.core.common.k.n.f6219a, jSONObject.toString(), false);
            }
        }
    }

    private boolean o() {
        if (this.f4630u.size() == 0 && this.f4631v.size() == 0 && this.f4632w.size() == 0) {
            return true;
        }
        return false;
    }

    public abstract void a(List<JSONObject> list, com.anythink.core.common.g.i iVar);

    public abstract String b();

    public final synchronized void d() {
        boolean z10;
        if (!this.f4629t.get() && this.f4619i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.b(SystemClock.elapsedRealtime());
                }
            });
        }
    }

    @Override // com.anythink.core.b.d
    public final void a(boolean z10) {
        this.f4608e = z10;
    }

    @Override // com.anythink.core.b.d
    public final void a(com.anythink.core.b.b.a aVar) {
        List<ai> list;
        this.f4625p = SystemClock.elapsedRealtime();
        this.o = aVar;
        if (this.f4608e) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("S2S Start HeadBidding List", d.a(this.f4607d.f5394i));
                jSONObject.put("S2S Start HeadBidding List(Directly)", d.b(this.f4619i));
            } catch (Exception unused) {
            }
            com.anythink.core.common.k.n.a(com.anythink.core.common.k.n.f6219a, jSONObject.toString(), false);
        }
        if (this.f4607d.f5394i.size() == 0 && (list = this.f4607d.f5396k) != null && list.size() > 0) {
            b(this.f4625p);
            return;
        }
        long t10 = this.f4607d.f5399n.t();
        if (t10 <= 0) {
            t10 = 500;
        }
        n.a().a(this.y, t10);
        Iterator<Map.Entry<String, ai>> it = this.f4630u.entrySet().iterator();
        while (it.hasNext()) {
            ai value = it.next().getValue();
            i iVar = new i(this.f4607d);
            i.a aVar2 = new i.a() { // from class: com.anythink.core.b.e.2
                @Override // com.anythink.core.b.i.a
                public final void a(ai aiVar, ATBaseAdAdapter aTBaseAdAdapter) {
                    com.anythink.core.b.b.a aVar3 = e.this.o;
                    if (aVar3 != null) {
                        aVar3.a(aiVar, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.b.i.a
                public final void a(ai aiVar, JSONObject jSONObject2) {
                    if (e.this.f.get()) {
                        return;
                    }
                    e.this.f4632w.remove(aiVar.t());
                    e.a(e.this, aiVar);
                    e.this.a(jSONObject2, aiVar);
                    e.b(e.this);
                }

                @Override // com.anythink.core.b.i.a
                public final void a(String str, ai aiVar) {
                    if (e.this.f.get()) {
                        return;
                    }
                    if (str == null) {
                        str = "";
                    }
                    e.this.f4632w.remove(aiVar.t());
                    e.this.f4630u.remove(aiVar.t());
                    e.a(e.this, str, aiVar);
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1295842379:
                            if (str.equals(ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -49992206:
                            if (str.equals(ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE)) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 56988620:
                            if (str.equals(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE)) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 204511524:
                            if (str.equals(ATBidRequestInfo.INIT_ERROR_TYPE)) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 1316982070:
                            if (str.equals(ATBidRequestInfo.RETURN_PARAMS_ERROR_TYPE)) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 1956498070:
                            if (str.equals(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE)) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 3:
                        case 4:
                        case 5:
                            e.this.b(aiVar, str, 0L, -9);
                            break;
                        case 1:
                        case 2:
                            e.this.b(aiVar, str, 0L, -2);
                            break;
                        default:
                            e.this.b(aiVar, "Unknown error: ".concat(str), 0L, -9);
                            break;
                    }
                    e.b(e.this);
                }
            };
            iVar.f4657d = aVar2;
            ATBaseAdAdapter a10 = com.anythink.core.common.k.i.a(value);
            if (a10 == null) {
                aVar2.a(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE, value);
            } else {
                com.anythink.core.common.k.b.a.a().a(new i.AnonymousClass1(a10, value));
            }
        }
    }

    private void b(ai aiVar) {
        int c10 = aiVar.c();
        com.anythink.core.common.j.c.a(aiVar, this.f4607d, SystemClock.elapsedRealtime() - this.f4625p, true, f.a().b(c10));
        f.a().a(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ai aiVar, String str, long j10, int i10) {
        d.a(aiVar, str, j10, i10);
        this.f4620j.add(aiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r7.f4628s.get() && !r7.f4629t.get()) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(com.anythink.core.b.e r7) {
        /*
            java.lang.String r0 = r7.f4618h
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.anythink.core.common.e.ai> r0 = r7.f4632w
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            r7.e()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f4629t
            boolean r0 = r0.get()
            if (r0 != 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            int r3 = r7.h()
            if (r3 <= 0) goto L38
            if (r0 != 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f4628s
            boolean r0 = r0.get()
            if (r0 == 0) goto L34
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f4629t
            boolean r0 = r0.get()
            if (r0 != 0) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 == 0) goto L38
            goto L39
        L38:
            r1 = r2
        L39:
            if (r1 == 0) goto L41
            long r0 = r7.f4625p
            r7.b(r0)
            return
        L41:
            java.util.List<com.anythink.core.common.e.ai> r0 = r7.f4620j
            int r0 = r0.size()
            if (r0 <= 0) goto L59
            boolean r0 = r7.o()
            if (r0 == 0) goto L59
            r2 = 0
            r3 = 0
            java.lang.String r5 = ""
            r6 = 0
            r1 = r7
            r1.a(r2, r3, r5, r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.b.e.b(com.anythink.core.b.e):void");
    }

    private void a(long j10) {
        n.a().a(this.y, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(JSONObject jSONObject, ai aiVar) {
        this.f4619i.add(jSONObject);
        this.f4633x.put(aiVar.t(), aiVar);
    }

    private synchronized void a(List<JSONObject> list, Map<String, ai> map) {
        list.addAll(this.f4619i);
        this.f4619i.clear();
        map.putAll(this.f4633x);
        this.f4633x.clear();
    }

    private void a(m mVar) {
        if (TextUtils.isEmpty(mVar.f5697i)) {
            return;
        }
        try {
            com.anythink.core.common.e.g a10 = com.anythink.core.common.a.c.a(mVar.token, new JSONObject(mVar.f5697i), mVar.f5693d);
            if (a10 == null) {
                return;
            }
            if (mVar.f5693d == 67) {
                com.anythink.core.common.d.c.a(this.f4607d.f5387a).a(a10.p(), a10.P());
                com.anythink.core.common.d.b.a(this.f4607d.f5387a).a(a10.q(), a10.P());
            }
            com.anythink.core.common.a.a.a().a(this.f4607d.f5387a, mVar.f5693d, mVar.f5699k, mVar.token, mVar.f5697i);
        } catch (Throwable unused) {
        }
    }

    private void a(long j10, int i10, String str, Map<String, ai> map) {
        for (ai aiVar : map.values()) {
            if (a(aiVar, str, i10)) {
                this.f4621k.add(aiVar);
            } else {
                b(aiVar, str, j10, i10);
            }
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<m> list, long j10, String str, Map<String, ai> map) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        m mVar = list.get(i10);
                        this.f4630u.remove(mVar.f5699k);
                        ai remove = map.remove(mVar.f5699k);
                        if (remove == null && this.f4631v.containsKey(mVar.f5699k)) {
                            remove = this.f4631v.remove(mVar.f5699k);
                            this.f4631v.clear();
                        }
                        if (remove != null) {
                            if (mVar.isSuccessWithUseType()) {
                                int i11 = i10 + 1;
                                double d10 = 0.0d;
                                if (i11 < list.size()) {
                                    m mVar2 = list.get(i11);
                                    double sortPrice = mVar2.getSortPrice();
                                    d10 = sortPrice == 0.0d ? f.a().a(mVar2.f5695g, remove.t()) : sortPrice;
                                }
                                a(remove.c(), mVar, d10);
                            }
                            a(remove, mVar, j10);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (str2 != null) {
                    this.f4630u.remove(str2);
                }
                if (this.f4631v.containsKey(str2)) {
                    this.f4631v.clear();
                }
            }
        }
        if (map != null) {
            a(j10, -4, TextUtils.isEmpty(str) ? "No Response error." : "No Response error." + str, map);
        }
        if (this.f4621k.size() >= 2) {
            Collections.sort(this.f4621k);
        }
        n();
        m();
        l();
    }

    private List<m> a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                m a10 = m.a(optJSONArray.optString(i10));
                if (a10 != null) {
                    a10.b(this.f4622l);
                }
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    private void a(Object obj, List<m> list) {
        JSONArray optJSONArray;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("wf") && (optJSONArray = jSONObject.optJSONArray("wf")) != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    arrayList.add(j.a(optJSONArray.optString(i11)));
                }
                Collections.sort(arrayList);
                int size = arrayList.size();
                double d10 = 10000.0d;
                if (size == 1) {
                    j jVar = (j) arrayList.get(0);
                    if (jVar.f4668c == 0.0d && TextUtils.equals(this.f4627r, jVar.f4667b)) {
                        jVar.f4668c = 10000.0d;
                        Iterator<m> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            m next = it.next();
                            if (TextUtils.equals(jVar.f4667b, next.f5699k) && next.isSuccessWithUseType()) {
                                m mVar = this.f4626q;
                                if (mVar == null || !TextUtils.equals(mVar.f5695g, jVar.f4669d)) {
                                    this.f4626q = next;
                                }
                                jVar.f4668c = Math.max(jVar.f4668c, next.o);
                            }
                        }
                        f.a().a(jVar.f4669d, jVar.f4667b, jVar);
                        return;
                    }
                    return;
                }
                int i12 = size - 1;
                while (i10 < size) {
                    j jVar2 = (j) arrayList.get(i10);
                    if (jVar2.f4668c == 0.0d && TextUtils.equals(this.f4627r, jVar2.f4667b)) {
                        if (i10 == 0) {
                            int i13 = i10 + 1;
                            if (((j) arrayList.get(i13)).f4668c == 0.0d) {
                                jVar2.f4668c = d10;
                            } else {
                                jVar2.f4668c = ((j) arrayList.get(i13)).f4668c + 0.1d;
                            }
                        } else if (i10 == i12) {
                            int i14 = i10 - 1;
                            if (((j) arrayList.get(i14)).f4668c - 0.1d <= 0.0d) {
                                jVar2.f4668c = ((j) arrayList.get(i14)).f4668c / 2.0d;
                            } else {
                                jVar2.f4668c = ((j) arrayList.get(i14)).f4668c - 0.1d;
                            }
                        } else {
                            double d11 = ((j) arrayList.get(i10 - 1)).f4668c;
                            double d12 = d11 - 0.1d;
                            double d13 = d11 - ((j) arrayList.get(i10 + 1)).f4668c;
                            if (Math.abs(d13) <= 0.1d) {
                                d12 = d11 - (d13 / 2.0d);
                            }
                            jVar2.f4668c = d12;
                        }
                        Iterator<m> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            m next2 = it2.next();
                            if (TextUtils.equals(jVar2.f4667b, next2.f5699k) && next2.isSuccessWithUseType()) {
                                m mVar2 = this.f4626q;
                                if (mVar2 == null || !TextUtils.equals(mVar2.f5695g, jVar2.f4669d)) {
                                    this.f4626q = next2;
                                }
                                jVar2.f4668c = Math.max(jVar2.f4668c, next2.o);
                            }
                        }
                        f.a().a(jVar2.f4669d, jVar2.f4667b, jVar2);
                    }
                    i10++;
                    d10 = 10000.0d;
                }
            }
        }
    }

    private void a(String str, ai aiVar) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int c10 = aiVar.c();
        com.anythink.core.common.j.c.a(aiVar, this.f4607d, SystemClock.elapsedRealtime() - this.f4625p, false, f.a().b(c10));
        f.a().a(c10);
    }

    @Override // com.anythink.core.b.d
    public void a(ai aiVar, l lVar, long j10) {
        String p10;
        int i10;
        boolean z10 = lVar instanceof m;
        if (z10) {
            m mVar = (m) lVar;
            if (mVar.isSuccessWithUseType()) {
                if (z10 && !TextUtils.isEmpty(mVar.f5697i)) {
                    try {
                        com.anythink.core.common.e.g a10 = com.anythink.core.common.a.c.a(mVar.token, new JSONObject(mVar.f5697i), mVar.f5693d);
                        if (a10 != null) {
                            if (mVar.f5693d == 67) {
                                com.anythink.core.common.d.c.a(this.f4607d.f5387a).a(a10.p(), a10.P());
                                com.anythink.core.common.d.b.a(this.f4607d.f5387a).a(a10.q(), a10.P());
                            }
                            com.anythink.core.common.a.a.a().a(this.f4607d.f5387a, mVar.f5693d, mVar.f5699k, mVar.token, mVar.f5697i);
                        }
                    } catch (Throwable unused) {
                    }
                }
                aiVar.a(j10);
                this.f4621k.add(aiVar);
                if (aiVar.l() != 3 && aiVar.l() != 7) {
                    mVar.f = System.currentTimeMillis() + aiVar.n();
                } else {
                    mVar.f = System.currentTimeMillis() + mVar.f5694e;
                }
                a(aiVar, mVar);
                return;
            }
            int i11 = 0;
            if (mVar.useType == 2) {
                aiVar.Q();
                p10 = "filter by s2s bid max count";
                i10 = 0;
                i11 = 1;
            } else {
                StringBuilder sb2 = new StringBuilder("errorCode:[");
                sb2.append(mVar.f5690a);
                sb2.append("],errorMsg:[");
                p10 = a3.l.p(sb2, mVar.errorMsg, "]");
                i10 = -1;
            }
            if (a(aiVar, p10, i10, i11)) {
                this.f4621k.add(aiVar);
            } else {
                b(aiVar, p10, j10, i10);
            }
        }
    }

    @Override // com.anythink.core.b.d
    public final void a() {
        k();
    }

    public static /* synthetic */ void a(e eVar, ai aiVar) {
        int c10 = aiVar.c();
        com.anythink.core.common.j.c.a(aiVar, eVar.f4607d, SystemClock.elapsedRealtime() - eVar.f4625p, true, f.a().b(c10));
        f.a().a(c10);
    }

    public static /* synthetic */ void a(e eVar, String str, ai aiVar) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int c10 = aiVar.c();
        com.anythink.core.common.j.c.a(aiVar, eVar.f4607d, SystemClock.elapsedRealtime() - eVar.f4625p, false, f.a().b(c10));
        f.a().a(c10);
    }

    public static /* synthetic */ List a(e eVar, Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                m a10 = m.a(optJSONArray.optString(i10));
                if (a10 != null) {
                    a10.b(eVar.f4622l);
                }
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void a(e eVar, Object obj, List list) {
        JSONArray optJSONArray;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (!jSONObject.has("wf") || (optJSONArray = jSONObject.optJSONArray("wf")) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                arrayList.add(j.a(optJSONArray.optString(i11)));
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            double d10 = 10000.0d;
            if (size == 1) {
                j jVar = (j) arrayList.get(0);
                if (jVar.f4668c == 0.0d && TextUtils.equals(eVar.f4627r, jVar.f4667b)) {
                    jVar.f4668c = 10000.0d;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        m mVar = (m) it.next();
                        if (TextUtils.equals(jVar.f4667b, mVar.f5699k) && mVar.isSuccessWithUseType()) {
                            m mVar2 = eVar.f4626q;
                            if (mVar2 == null || !TextUtils.equals(mVar2.f5695g, jVar.f4669d)) {
                                eVar.f4626q = mVar;
                            }
                            jVar.f4668c = Math.max(jVar.f4668c, mVar.o);
                        }
                    }
                    f.a().a(jVar.f4669d, jVar.f4667b, jVar);
                    return;
                }
                return;
            }
            int i12 = size - 1;
            while (i10 < size) {
                j jVar2 = (j) arrayList.get(i10);
                if (jVar2.f4668c == 0.0d && TextUtils.equals(eVar.f4627r, jVar2.f4667b)) {
                    if (i10 == 0) {
                        int i13 = i10 + 1;
                        if (((j) arrayList.get(i13)).f4668c == 0.0d) {
                            jVar2.f4668c = d10;
                        } else {
                            jVar2.f4668c = ((j) arrayList.get(i13)).f4668c + 0.1d;
                        }
                    } else if (i10 == i12) {
                        int i14 = i10 - 1;
                        if (((j) arrayList.get(i14)).f4668c - 0.1d <= 0.0d) {
                            jVar2.f4668c = ((j) arrayList.get(i14)).f4668c / 2.0d;
                        } else {
                            jVar2.f4668c = ((j) arrayList.get(i14)).f4668c - 0.1d;
                        }
                    } else {
                        double d11 = ((j) arrayList.get(i10 - 1)).f4668c;
                        double d12 = d11 - 0.1d;
                        double d13 = d11 - ((j) arrayList.get(i10 + 1)).f4668c;
                        if (Math.abs(d13) <= 0.1d) {
                            d12 = d11 - (d13 / 2.0d);
                        }
                        jVar2.f4668c = d12;
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        m mVar3 = (m) it2.next();
                        if (TextUtils.equals(jVar2.f4667b, mVar3.f5699k) && mVar3.isSuccessWithUseType()) {
                            m mVar4 = eVar.f4626q;
                            if (mVar4 == null || !TextUtils.equals(mVar4.f5695g, jVar2.f4669d)) {
                                eVar.f4626q = mVar3;
                            }
                            jVar2.f4668c = Math.max(jVar2.f4668c, mVar3.o);
                        }
                    }
                    f.a().a(jVar2.f4669d, jVar2.f4667b, jVar2);
                }
                i10++;
                d10 = 10000.0d;
            }
        }
    }
}
