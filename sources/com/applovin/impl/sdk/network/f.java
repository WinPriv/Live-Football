package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements k {

    /* renamed from: a, reason: collision with root package name */
    private final p f19149a;

    /* renamed from: b, reason: collision with root package name */
    private final y f19150b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19151c;

    /* renamed from: d, reason: collision with root package name */
    private final h f19152d;
    private final ArrayList<j> f;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19153e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<j> f19154g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private long f19155h = 0;

    /* renamed from: i, reason: collision with root package name */
    private final Set<j> f19156i = new HashSet();

    public f(p pVar) {
        if (pVar != null) {
            this.f19149a = pVar;
            this.f19150b = pVar.L();
            int intValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cZ)).intValue();
            this.f19151c = intValue;
            h hVar = new h(this, pVar);
            this.f19152d = hVar;
            this.f = hVar.a(intValue);
            hVar.a();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(j jVar) {
        synchronized (this.f19153e) {
            this.f19156i.remove(jVar);
            this.f19154g.add(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(j jVar) {
        synchronized (this.f19153e) {
            while (this.f.size() > this.f19151c) {
                this.f.remove(0);
            }
            this.f.add(jVar);
            d();
            if (y.a()) {
                this.f19150b.b("PersistentPostbackManager", "Enqueued postback: " + jVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(j jVar) {
        a(jVar, (AppLovinPostbackListener) null);
    }

    private void d() {
        this.f19155h = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(j jVar) {
        synchronized (this.f19153e) {
            this.f19156i.remove(jVar);
            this.f.remove(jVar);
            d();
        }
        if (y.a()) {
            this.f19150b.b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + jVar);
        }
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar) {
        a(jVar, true);
    }

    @Override // com.applovin.impl.sdk.network.k
    public void c() {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (f.this.f19153e) {
                    if (f.this.f != null) {
                        Iterator it = new ArrayList(f.this.f).iterator();
                        while (it.hasNext()) {
                            f.this.c((j) it.next());
                        }
                    }
                }
            }
        };
        if (((Boolean) this.f19149a.a(com.applovin.impl.sdk.c.b.cY)).booleanValue()) {
            this.f19149a.M().a(new z(this.f19149a, runnable), o.a.POSTBACKS);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (this.f19153e) {
            Iterator<j> it = this.f19154g.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.f19154g.clear();
        }
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar, boolean z10) {
        a(jVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final j jVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(jVar.b())) {
            if (z10) {
                jVar.m();
            }
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (f.this.f19153e) {
                        f.this.b(jVar);
                        f.this.a(jVar, appLovinPostbackListener);
                    }
                }
            };
            if (Utils.isMainThread()) {
                this.f19149a.M().a(new z(this.f19149a, jVar.p(), runnable), o.a.POSTBACKS);
            } else {
                runnable.run();
            }
        }
    }

    public List<j> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f19153e) {
            arrayList.ensureCapacity(this.f.size());
            arrayList.addAll(this.f);
        }
        return arrayList;
    }

    public long a() {
        return this.f19155h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final j jVar, final AppLovinPostbackListener appLovinPostbackListener) {
        if (y.a()) {
            this.f19150b.b("PersistentPostbackManager", "Preparing to submit postback..." + jVar);
        }
        if (this.f19149a.c() && !jVar.p()) {
            if (y.a()) {
                this.f19150b.b("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        synchronized (this.f19153e) {
            if (this.f19156i.contains(jVar)) {
                if (y.a()) {
                    this.f19150b.b("PersistentPostbackManager", "Skip pending postback: " + jVar.b());
                }
                return;
            }
            jVar.l();
            d();
            int intValue = ((Integer) this.f19149a.a(com.applovin.impl.sdk.c.b.cX)).intValue();
            if (jVar.k() > intValue) {
                if (y.a()) {
                    this.f19150b.d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + intValue + ". Dequeuing postback: " + jVar);
                }
                d(jVar);
                return;
            }
            synchronized (this.f19153e) {
                this.f19156i.add(jVar);
            }
            this.f19149a.ak().dispatchPostbackRequest(l.b(this.f19149a).a(jVar.b()).c(jVar.c()).c(jVar.d()).b(jVar.a()).d(jVar.e()).a(jVar.f() != null ? new JSONObject(jVar.f()) : null).d(jVar.h()).c(jVar.g()).g(jVar.i()).g(jVar.j()).a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.f.2
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i10) {
                    y unused = f.this.f19150b;
                    if (y.a()) {
                        y yVar = f.this.f19150b;
                        StringBuilder n10 = a3.k.n("Failed to submit postback with errorCode ", i10, ". Will retry later...  Postback: ");
                        n10.append(jVar);
                        yVar.c("PersistentPostbackManager", n10.toString());
                    }
                    f.this.e(jVar);
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str, i10);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    f.this.d(jVar);
                    y unused = f.this.f19150b;
                    if (y.a()) {
                        f.this.f19150b.b("PersistentPostbackManager", "Successfully submitted postback: " + jVar);
                    }
                    f.this.e();
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str);
                }
            });
        }
    }
}
