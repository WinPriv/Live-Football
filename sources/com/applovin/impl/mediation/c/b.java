package com.applovin.impl.mediation.c;

import android.content.Context;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static JSONObject f17778a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f17779b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Set<String>> f17780c = Collections.synchronizedMap(CollectionUtils.map());

    /* renamed from: d, reason: collision with root package name */
    private final String f17781d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxAdFormat f17782e;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, Object> f17783i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f17784j;

    /* renamed from: k, reason: collision with root package name */
    private final a f17785k;

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONArray jSONArray);
    }

    /* renamed from: com.applovin.impl.mediation.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0205b implements g.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final a f17789a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f17790b;

        /* renamed from: c, reason: collision with root package name */
        private int f17791c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f17792d;

        /* renamed from: e, reason: collision with root package name */
        private final Collection<com.applovin.impl.mediation.a.g> f17793e;
        private final p f;

        /* renamed from: g, reason: collision with root package name */
        private final y f17794g;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17792d.compareAndSet(false, true)) {
                a();
            }
        }

        private RunnableC0205b(int i10, a aVar, p pVar) {
            this.f17791c = i10;
            this.f17789a = aVar;
            this.f = pVar;
            this.f17794g = pVar.L();
            this.f17790b = new Object();
            this.f17793e = new ArrayList(i10);
            this.f17792d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.mediation.a.g.a
        public void a(com.applovin.impl.mediation.a.g gVar) {
            boolean z10;
            synchronized (this.f17790b) {
                this.f17793e.add(gVar);
                int i10 = this.f17791c - 1;
                this.f17791c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f17792d.compareAndSet(false, true)) {
                if (Utils.isMainThread() && ((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fN)).booleanValue()) {
                    this.f.M().a(new z(this.f, new Runnable() { // from class: com.applovin.impl.mediation.c.b.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RunnableC0205b.this.a();
                        }
                    }), o.a.MEDIATION_MAIN);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList arrayList;
            synchronized (this.f17790b) {
                arrayList = new ArrayList(this.f17793e);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.applovin.impl.mediation.a.g gVar = (com.applovin.impl.mediation.a.g) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.applovin.impl.mediation.a.h a10 = gVar.a();
                    jSONObject.put("name", a10.X());
                    jSONObject.put("class", a10.W());
                    jSONObject.put("adapter_version", gVar.c());
                    jSONObject.put("sdk_version", gVar.b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.e())) {
                        jSONObject2.put("error_message", gVar.e());
                    } else {
                        jSONObject2.put("signal", gVar.d());
                    }
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (y.a()) {
                        this.f17794g.b("TaskCollectSignals", "Collected signal from " + a10);
                    }
                } catch (JSONException e10) {
                    if (y.a()) {
                        this.f17794g.b("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            a aVar = this.f17789a;
            if (aVar != null) {
                aVar.a(jSONArray);
            }
        }
    }

    public b(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, p pVar, a aVar) {
        super("TaskCollectSignals", pVar);
        this.f17781d = str;
        this.f17782e = maxAdFormat;
        this.f17783i = map;
        this.f17784j = context;
        this.f17785k = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fE)).booleanValue()) {
                synchronized (f17779b) {
                    jSONArray = JsonUtils.getJSONArray(f17778a, "signal_providers", null);
                }
                if (jSONArray != null && jSONArray.length() > 0) {
                    if (f17780c.size() > 0) {
                        b(jSONArray, f17778a);
                        return;
                    } else {
                        a(jSONArray, f17778a);
                        return;
                    }
                }
                if (y.a()) {
                    this.f18839h.d(this.f18838g, "Unable to find cached signal providers, falling back to old logic.");
                }
            }
            JSONObject jSONObject = new JSONObject((String) this.f.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.F, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f17780c.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            a("Failed to wait for signals", e10);
        } catch (JSONException e11) {
            a("Failed to parse signals JSON", e11);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        RunnableC0205b runnableC0205b = new RunnableC0205b(jSONArray.length(), this.f17785k, this.f);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new com.applovin.impl.mediation.a.h(this.f17783i, jSONArray.getJSONObject(i10), jSONObject, this.f), runnableC0205b);
        }
        this.f.M().a(new z(this.f, runnableC0205b), o.a.MAIN, ((Long) this.f.a(com.applovin.impl.sdk.c.a.f18689j)).longValue());
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        Set<String> set = f17780c.get(this.f17781d);
        if (set != null && !set.isEmpty()) {
            RunnableC0205b runnableC0205b = new RunnableC0205b(set.size(), this.f17785k, this.f);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                    a(new com.applovin.impl.mediation.a.h(this.f17783i, jSONObject2, jSONObject, this.f), runnableC0205b);
                }
            }
            this.f.M().a(new z(this.f, runnableC0205b), o.a.MAIN, ((Long) this.f.a(com.applovin.impl.sdk.c.a.f18689j)).longValue());
            return;
        }
        a("No signal providers found for ad unit: " + this.f17781d, (Throwable) null);
    }

    private void a(final com.applovin.impl.mediation.a.h hVar, final g.a aVar) {
        if (hVar.ae()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    ((com.applovin.impl.sdk.e.a) b.this).f.ap().collectSignal(b.this.f17781d, b.this.f17782e, hVar, b.this.f17784j, aVar);
                }
            });
        } else {
            this.f.ap().collectSignal(this.f17781d, this.f17782e, hVar, this.f17784j, aVar);
        }
    }

    private void a(String str, Throwable th) {
        if (y.a()) {
            this.f18839h.b(this.f18838g, "No signals collected: " + str, th);
        }
        a aVar = this.f17785k;
        if (aVar != null) {
            aVar.a(new JSONArray());
        }
    }

    public static void b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f17780c.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            y.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f17779b) {
            f17778a = jSONObject;
        }
    }
}
