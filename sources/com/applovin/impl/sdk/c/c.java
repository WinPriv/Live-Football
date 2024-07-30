package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected final p f18732a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f18733b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f18734c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f18735d = CollectionUtils.map();

    /* renamed from: e, reason: collision with root package name */
    private final Object f18736e = new Object();

    public c(p pVar) {
        this.f18732a = pVar;
        Context y = p.y();
        this.f18733b = y;
        this.f18734c = y.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(b.class.getName());
            Class.forName(a.class.getName());
        } catch (Throwable unused) {
        }
        b();
    }

    private String e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f18732a.B()) + ".";
    }

    public <T> T a(b<T> bVar) {
        if (bVar != null) {
            synchronized (this.f18736e) {
                Object obj = this.f18735d.get(bVar.a());
                if (obj == null) {
                    return bVar.b();
                }
                return bVar.a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    public List<String> b(b<String> bVar) {
        return CollectionUtils.explode((String) a(bVar));
    }

    public List<MaxAdFormat> c(b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        Iterator<String> it = b(bVar).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString(it.next()));
        }
        return arrayList;
    }

    public boolean d() {
        if (!this.f18732a.C().isVerboseLoggingEnabled() && !((Boolean) a(b.ah)).booleanValue()) {
            return false;
        }
        return true;
    }

    public void b() {
        String e10 = e();
        synchronized (this.f18736e) {
            for (b<?> bVar : b.c()) {
                try {
                    Object a10 = this.f18732a.a(e10 + bVar.a(), null, bVar.b().getClass(), this.f18734c);
                    if (a10 != null) {
                        this.f18735d.put(bVar.a(), a10);
                    }
                } catch (Exception e11) {
                    y.c("SettingsManager", "Unable to load \"" + bVar.a() + "\"", e11);
                }
            }
        }
    }

    public void c() {
        synchronized (this.f18736e) {
            this.f18735d.clear();
        }
        this.f18732a.a(this.f18734c);
    }

    public <T> void a(b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f18736e) {
                this.f18735d.put(bVar.a(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a() {
        String e10 = e();
        synchronized (this.f18736e) {
            SharedPreferences.Editor edit = this.f18734c.edit();
            for (b<?> bVar : b.c()) {
                Object obj = this.f18735d.get(bVar.a());
                if (obj != null) {
                    this.f18732a.a(e10 + bVar.a(), (String) obj, edit);
                }
            }
            edit.apply();
        }
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f18736e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Long> a10 = a(next, (b) null);
                        if (a10 != null) {
                            Object a11 = a(next, jSONObject, a10.b());
                            this.f18735d.put(a10.a(), a11);
                            if (a10 == b.f18728fc) {
                                this.f18735d.put(b.f18729fd.a(), Long.valueOf(System.currentTimeMillis()));
                            } else {
                                b<Boolean> bVar = b.aw;
                                if (a10 == bVar) {
                                    try {
                                        CollectionUtils.setShouldUseArrayMap(bVar.a(a11).booleanValue());
                                    } catch (Throwable unused) {
                                        y.i("SettingsManager", "Failed to update \"uam\" setting for static contexts");
                                    }
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        y.c("SettingsManager", "Unable to parse JSON settingsValues array", e10);
                    } catch (Throwable th) {
                        y.c("SettingsManager", "Unable to convert setting object ", th);
                    }
                }
            }
        }
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    public <T> b<T> a(String str, b<T> bVar) {
        synchronized (this.f18736e) {
            Iterator<b<?>> it = b.c().iterator();
            while (it.hasNext()) {
                b<T> bVar2 = (b) it.next();
                if (bVar2.a().equals(str)) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }
}
