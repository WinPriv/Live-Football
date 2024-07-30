package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private final p f18240b;

    /* renamed from: c, reason: collision with root package name */
    private final y f18241c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, g> f18239a = Collections.synchronizedMap(CollectionUtils.map(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f18242d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Class<? extends MaxAdapter>> f18243e = CollectionUtils.map();
    private final Set<String> f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f18244g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set<a> f18245h = new HashSet();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f18246a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18247b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f18248c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f18249d;

        public a(String str, String str2, com.applovin.impl.mediation.a.a aVar, p pVar) {
            this.f18246a = str;
            this.f18247b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f18249d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (aVar != null) {
                this.f18248c = aVar.getFormat();
                JsonUtils.putString(jSONObject, "format", aVar.getFormat().getLabel());
            } else {
                this.f18248c = null;
            }
        }

        public JSONObject a() {
            return this.f18249d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f18246a.equals(aVar.f18246a) || !this.f18247b.equals(aVar.f18247b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f18248c;
            MaxAdFormat maxAdFormat2 = aVar.f18248c;
            if (maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int b10 = e0.i.b(this.f18247b, this.f18246a.hashCode() * 31, 31);
            MaxAdFormat maxAdFormat = this.f18248c;
            if (maxAdFormat != null) {
                i10 = maxAdFormat.hashCode();
            } else {
                i10 = 0;
            }
            return b10 + i10;
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f18246a + "', operationTag='" + this.f18247b + "', format=" + this.f18248c + '}';
        }
    }

    public f(p pVar) {
        if (pVar != null) {
            this.f18240b = pVar;
            this.f18241c = pVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public Collection<String> a() {
        Set unmodifiableSet;
        synchronized (this.f18242d) {
            HashSet hashSet = new HashSet(this.f18243e.size());
            Iterator<Class<? extends MaxAdapter>> it = this.f18243e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    public Collection<String> b() {
        Set unmodifiableSet;
        synchronized (this.f18242d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f);
        }
        return unmodifiableSet;
    }

    public Collection<JSONObject> c() {
        ArrayList arrayList;
        synchronized (this.f18244g) {
            arrayList = new ArrayList(this.f18245h.size());
            Iterator<a> it = this.f18245h.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
        }
        return arrayList;
    }

    public g a(com.applovin.impl.mediation.a.f fVar) {
        return a(fVar, false);
    }

    public g a(com.applovin.impl.mediation.a.f fVar, boolean z10) {
        Class<? extends MaxAdapter> a10;
        g gVar;
        if (fVar != null) {
            String X = fVar.X();
            String W = fVar.W();
            if (TextUtils.isEmpty(X)) {
                if (y.a()) {
                    this.f18241c.e("MediationAdapterManager", "No adapter name provided for " + W + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(W)) {
                if (y.a()) {
                    this.f18241c.e("MediationAdapterManager", "Unable to find default className for '" + X + "'");
                }
                return null;
            }
            if (z10 && (gVar = this.f18239a.get(W)) != null) {
                return gVar;
            }
            synchronized (this.f18242d) {
                if (!this.f.contains(W)) {
                    if (this.f18243e.containsKey(W)) {
                        a10 = this.f18243e.get(W);
                    } else {
                        a10 = a(W);
                        if (a10 == null) {
                            this.f.add(W);
                            return null;
                        }
                    }
                    g a11 = a(fVar, a10, z10);
                    if (a11 != null) {
                        if (y.a()) {
                            this.f18241c.b("MediationAdapterManager", "Loaded " + X);
                        }
                        this.f18243e.put(W, a10);
                        if (z10) {
                            this.f18239a.put(fVar.W(), a11);
                        }
                        return a11;
                    }
                    if (y.a()) {
                        this.f18241c.e("MediationAdapterManager", "Failed to load " + X);
                    }
                    this.f.add(W);
                    return null;
                }
                if (y.a()) {
                    this.f18241c.b("MediationAdapterManager", "Not attempting to load " + X + " due to prior errors");
                }
                return null;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f18244g) {
            this.f18240b.L();
            if (y.a()) {
                this.f18240b.L().e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f18245h.add(new a(str, str2, aVar, this.f18240b));
        }
    }

    private g a(com.applovin.impl.mediation.a.f fVar, Class<? extends MaxAdapter> cls, boolean z10) {
        try {
            return new g(fVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f18240b.K()), z10, this.f18240b);
        } catch (Throwable th) {
            y.c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            y.i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
