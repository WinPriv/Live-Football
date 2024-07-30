package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements AppLovinBroadcastManager.Receiver, k {

    /* renamed from: a, reason: collision with root package name */
    private final p f19164a;

    /* renamed from: b, reason: collision with root package name */
    private final y f19165b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19166c;

    /* renamed from: d, reason: collision with root package name */
    private final i f19167d;
    private final List<j> f;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19168e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Set<j> f19169g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final List<j> f19170h = new ArrayList();

    public g(p pVar) {
        if (pVar != null) {
            this.f19164a = pVar;
            this.f19165b = pVar.L();
            int intValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cZ)).intValue();
            this.f19166c = intValue;
            i iVar = new i(this, pVar);
            this.f19167d = iVar;
            this.f = iVar.a(intValue);
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(j jVar) {
        synchronized (this.f19168e) {
            this.f19169g.remove(jVar);
            this.f19170h.add(jVar);
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        this.f19164a.M().a((com.applovin.impl.sdk.e.a) this.f19167d);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(j jVar) {
        a(jVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(j jVar) {
        synchronized (this.f19168e) {
            this.f19169g.remove(jVar);
            this.f.remove(jVar);
        }
        if (y.a()) {
            this.f19165b.b("PersistentPostbackManagerV2", "Dequeued postback: " + jVar);
        }
    }

    @Override // com.applovin.impl.sdk.network.k
    public void c() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (g.this.f19168e) {
                    Iterator it = new ArrayList(g.this.f).iterator();
                    while (it.hasNext()) {
                        g.this.b((j) it.next());
                    }
                }
            }
        }, ((Boolean) this.f19164a.a(com.applovin.impl.sdk.c.b.cY)).booleanValue(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this.f19168e) {
            Iterator<j> it = this.f19170h.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            this.f19170h.clear();
        }
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar) {
        a(jVar, true);
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar, boolean z10) {
        a(jVar, z10, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(j jVar) {
        synchronized (this.f19168e) {
            while (this.f.size() > this.f19166c) {
                this.f.remove(0);
            }
            this.f.add(jVar);
        }
        if (y.a()) {
            this.f19165b.b("PersistentPostbackManagerV2", "Enqueued postback: " + jVar);
        }
    }

    public void a(final j jVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(jVar.b())) {
            if (y.a()) {
                this.f19165b.e("PersistentPostbackManagerV2", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                jVar.m();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.g.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (g.this.f19168e) {
                        g.this.c(jVar);
                        g.this.a(jVar, appLovinPostbackListener);
                    }
                }
            }, Utils.isMainThread(), jVar.p());
        }
    }

    public List<j> a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f19168e) {
            arrayList.ensureCapacity(this.f.size());
            arrayList.addAll(this.f);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final j jVar, final AppLovinPostbackListener appLovinPostbackListener) {
        if (y.a()) {
            this.f19165b.b("PersistentPostbackManagerV2", "Preparing to submit postback: " + jVar);
        }
        if (this.f19164a.c() && !jVar.p()) {
            if (y.a()) {
                this.f19165b.b("PersistentPostbackManagerV2", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(jVar.b())) {
            if (y.a()) {
                this.f19165b.e("PersistentPostbackManagerV2", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f19168e) {
            if (this.f19169g.contains(jVar)) {
                if (y.a()) {
                    this.f19165b.b("PersistentPostbackManagerV2", "Skipping in progress postback: " + jVar.b());
                }
                return;
            }
            jVar.l();
            Integer num = (Integer) this.f19164a.a(com.applovin.impl.sdk.c.b.cX);
            if (jVar.k() > num.intValue()) {
                if (y.a()) {
                    this.f19165b.d("PersistentPostbackManagerV2", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + jVar);
                }
                d(jVar);
                return;
            }
            synchronized (this.f19168e) {
                this.f19169g.add(jVar);
            }
            l a10 = l.b(this.f19164a).a(jVar.b()).c(jVar.c()).c(jVar.d()).b(jVar.a()).d(jVar.e()).a(jVar.f() != null ? new JSONObject(jVar.f()) : null).d(jVar.h()).c(jVar.g()).g(jVar.i()).g(jVar.j()).a();
            if (y.a()) {
                this.f19165b.b("PersistentPostbackManagerV2", "Submitting postback: " + jVar);
            }
            this.f19164a.ak().dispatchPostbackRequest(a10, new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.g.3
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i10) {
                    y unused = g.this.f19165b;
                    if (y.a()) {
                        g.this.f19165b.c("PersistentPostbackManagerV2", "Failed to submit postback: " + jVar + " with error code: " + i10 + "; will retry later...");
                    }
                    g.this.e(jVar);
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str, i10);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    g.this.d(jVar);
                    y unused = g.this.f19165b;
                    if (y.a()) {
                        g.this.f19165b.b("PersistentPostbackManagerV2", "Successfully submit postback: " + jVar);
                    }
                    g.this.b();
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str);
                }
            });
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f19164a.M().a(new z(this.f19164a, z11, runnable), o.a.POSTBACKS);
        } else {
            runnable.run();
        }
    }
}
