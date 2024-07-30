package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.anythink.core.api.ATAdConst;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.c.c;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements b.c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference<MaxDebuggerActivity> f17909a;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f17910b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final p f17911c;

    /* renamed from: d, reason: collision with root package name */
    private final y f17912d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f17913e;
    private final com.applovin.impl.mediation.debugger.ui.b.b f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17916i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17918k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, List<?>> f17919l;

    /* renamed from: m, reason: collision with root package name */
    private final a f17920m;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.debugger.b.c.b> f17914g = CollectionUtils.map();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f17915h = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private int f17917j = 2;

    public b(p pVar) {
        this.f17911c = pVar;
        this.f17912d = pVar.L();
        Context y = p.y();
        this.f17913e = y;
        com.applovin.impl.mediation.debugger.ui.b.b bVar = new com.applovin.impl.mediation.debugger.ui.b.b(y);
        this.f = bVar;
        this.f17920m = new a(pVar, bVar);
    }

    private void f() {
        this.f17911c.w().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.mediation.debugger.b.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    y.f("AppLovinSdk", "Started mediation debugger");
                    if (!b.this.g() || b.f17909a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = b.f17909a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(b.this.f, b.this.f17911c.w());
                    }
                    b.f17910b.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    y.f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = b.f17909a = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        WeakReference<MaxDebuggerActivity> weakReference = f17909a;
        if (weakReference != null && weakReference.get() != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f + "}";
    }

    public boolean b() {
        return this.f17916i;
    }

    public void c() {
        a((Map<String, List<?>>) null);
    }

    public void a() {
        if (this.f17915h.compareAndSet(false, true)) {
            this.f17911c.M().a(new c(this, this.f17911c), o.a.MEDIATION_MAIN);
        }
    }

    public void a(boolean z10, int i10) {
        this.f17916i = z10;
        this.f17917j = i10;
    }

    public void a(Map<String, List<?>> map) {
        this.f17919l = map;
        a();
        if (!g() && f17910b.compareAndSet(false, true)) {
            if (!this.f17918k) {
                f();
                this.f17918k = true;
            }
            Intent intent = new Intent(this.f17913e, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            y.f("AppLovinSdk", "Starting mediation debugger...");
            this.f17913e.startActivity(intent);
            return;
        }
        y.i("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List<?> a(String str) {
        Map<String, List<?>> map = this.f17919l;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.f17919l.get(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        boolean z10;
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            com.applovin.impl.mediation.debugger.b.c.b next = it.next();
            if (next.e() && next.a() == b.a.INVALID_INTEGRATION) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.b.2
                @Override // java.lang.Runnable
                public void run() {
                    Activity x10 = b.this.f17911c.x();
                    if (x10 != null && !x10.isFinishing()) {
                        new AlertDialog.Builder(x10).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.b.2.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                b.this.c();
                            }
                        }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                    } else {
                        y.i("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
                    }
                }
            }, TimeUnit.SECONDS.toMillis(2L));
        }
    }

    private List<com.applovin.impl.mediation.debugger.b.c.b> a(JSONObject jSONObject, p pVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.mediation.debugger.b.c.b bVar = new com.applovin.impl.mediation.debugger.b.c.b(jSONObject2, pVar);
                arrayList.add(bVar);
                this.f17914g.put(bVar.m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.a.a> a(JSONObject jSONObject, List<com.applovin.impl.mediation.debugger.b.c.b> list, p pVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.a.a(jSONObject2, this.f17914g, pVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.a.a> a(List<com.applovin.impl.mediation.debugger.b.a.a> list, p pVar) {
        List<String> initializationAdUnitIds = pVar.C().getInitializationAdUnitIds();
        if (initializationAdUnitIds != null && !initializationAdUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(initializationAdUnitIds.size());
            for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
                if (initializationAdUnitIds.contains(aVar.a())) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private com.applovin.impl.mediation.debugger.b.b.b a(JSONObject jSONObject) {
        return new com.applovin.impl.mediation.debugger.b.b.b(JsonUtils.getString(jSONObject, "required_app_ads_txt_entry", ""));
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(JSONObject jSONObject, int i10) {
        List<com.applovin.impl.mediation.debugger.b.c.b> a10 = a(jSONObject, this.f17911c);
        List<com.applovin.impl.mediation.debugger.b.a.a> a11 = a(jSONObject, a10, this.f17911c);
        List<com.applovin.impl.mediation.debugger.b.a.a> a12 = a(a11, this.f17911c);
        com.applovin.impl.mediation.debugger.b.b.b a13 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f.a(a10, a11, a12, a13, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, CrashHianalyticsData.MESSAGE, null), JsonUtils.getString(jSONObject, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.ACCOUNT_ID, null), this.f17911c);
        if (a13.g()) {
            this.f17920m.a();
        }
        if (b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.this.c();
                }
            }, TimeUnit.SECONDS.toMillis(this.f17917j));
        } else {
            a(a10);
        }
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(int i10, String str, JSONObject jSONObject) {
        if (y.a()) {
            this.f17912d.e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        y.i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f.a(null, null, null, null, null, null, null, this.f17911c);
        this.f17915h.set(false);
    }
}
