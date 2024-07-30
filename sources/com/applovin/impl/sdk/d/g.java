package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final p f18828a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f18829b = CollectionUtils.map();

    public g(p pVar) {
        if (pVar != null) {
            this.f18828a = pVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private void e() {
        this.f18828a.M().a(new Runnable() { // from class: com.applovin.impl.sdk.d.g.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    g.this.f18828a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.y, (com.applovin.impl.sdk.c.d<String>) g.this.c().toString());
                } catch (Throwable th) {
                    g.this.f18828a.L();
                    if (y.a()) {
                        g.this.f18828a.L().b("GlobalStatsManager", "Unable to save stats", th);
                    }
                }
            }
        });
    }

    public long b(f fVar) {
        long longValue;
        synchronized (this.f18829b) {
            Long l10 = this.f18829b.get(fVar.a());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue();
        }
        return longValue;
    }

    public void c(f fVar) {
        synchronized (this.f18829b) {
            this.f18829b.remove(fVar.a());
        }
        e();
    }

    public void d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f18828a.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.y, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON));
            synchronized (this.f18829b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f18829b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f18828a.L();
            if (y.a()) {
                this.f18828a.L().b("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }

    public long a(f fVar) {
        return a(fVar, 1L);
    }

    public long a(f fVar, long j10) {
        long longValue;
        synchronized (this.f18829b) {
            Long l10 = this.f18829b.get(fVar.a());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue() + j10;
            this.f18829b.put(fVar.a(), Long.valueOf(longValue));
        }
        e();
        return longValue;
    }

    public void b(f fVar, long j10) {
        synchronized (this.f18829b) {
            this.f18829b.put(fVar.a(), Long.valueOf(j10));
        }
        e();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.f18829b) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Long> entry : this.f18829b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public void a() {
        synchronized (this.f18829b) {
            this.f18829b.clear();
        }
        e();
    }

    public void b() {
        synchronized (this.f18829b) {
            Iterator<f> it = f.b().iterator();
            while (it.hasNext()) {
                this.f18829b.remove(it.next().a());
            }
            e();
        }
    }
}
