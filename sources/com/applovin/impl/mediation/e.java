package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final p f18233a;

    /* renamed from: b, reason: collision with root package name */
    private final y f18234b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18235c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final JSONArray f18236d = new JSONArray();

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap<String, Integer> f18237e = new LinkedHashMap<>();
    private final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private List<com.applovin.impl.mediation.a.f> f18238g;

    public e(p pVar) {
        this.f18233a = pVar;
        this.f18234b = pVar.L();
    }

    public boolean a() {
        return this.f18235c.get();
    }

    public LinkedHashMap<String, Integer> b() {
        LinkedHashMap<String, Integer> linkedHashMap;
        synchronized (this.f) {
            linkedHashMap = this.f18237e;
        }
        return linkedHashMap;
    }

    public JSONArray c() {
        JSONArray jSONArray;
        synchronized (this.f) {
            jSONArray = this.f18236d;
        }
        return jSONArray;
    }

    public void a(Activity activity) {
        if (this.f18235c.compareAndSet(false, true)) {
            String str = (String) this.f18233a.a(com.applovin.impl.sdk.c.d.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<com.applovin.impl.mediation.a.f> a10 = a(JsonUtils.getJSONArray(jSONObject, this.f18233a.av().a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f18238g = a10;
                    this.f18233a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.c.a(a10, activity, this.f18233a));
                } catch (JSONException e10) {
                    if (y.a()) {
                        this.f18234b.b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                }
            }
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity) {
        a(fVar, activity, null);
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity, Runnable runnable) {
        List<com.applovin.impl.mediation.a.f> list;
        if (this.f18233a.av().a() && (list = this.f18238g) != null) {
            Iterator<com.applovin.impl.mediation.a.f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                com.applovin.impl.mediation.a.f next = it.next();
                if (next.W().equals(fVar.W())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        g a10 = this.f18233a.an().a(fVar);
        if (a10 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (y.a()) {
                this.f18234b.c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
            }
            a10.a(MaxAdapterParametersImpl.a(fVar), activity, runnable);
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f) {
            z10 = !a(fVar);
            if (z10) {
                this.f18237e.put(fVar.W(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", fVar.W());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f18236d.put(jSONObject);
            }
        }
        if (z10) {
            this.f18233a.a(fVar);
            this.f18233a.ap().processAdapterInitializationPostback(fVar, j10, initializationStatus, str);
            this.f18233a.ab().a(initializationStatus, fVar.W());
        }
    }

    public boolean a(com.applovin.impl.mediation.a.f fVar) {
        boolean containsKey;
        synchronized (this.f) {
            containsKey = this.f18237e.containsKey(fVar.W());
        }
        return containsKey;
    }

    private List<com.applovin.impl.mediation.a.f> a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new com.applovin.impl.mediation.a.f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f18233a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f) {
            this.f18237e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f18233a.ab().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
