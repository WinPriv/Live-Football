package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f19178a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f19179b;

    /* renamed from: c, reason: collision with root package name */
    private final f f19180c;

    /* renamed from: d, reason: collision with root package name */
    private final y f19181d;

    public h(f fVar, p pVar) {
        super("PersistentPostbackQueueSaveTask", pVar);
        this.f19179b = new AtomicLong();
        this.f19181d = pVar.L();
        this.f19180c = fVar;
    }

    public void a() {
        this.f19179b.set(System.currentTimeMillis());
        this.f.M().a(this, o.a.POSTBACKS, f19178a);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f19180c.a() > this.f19179b.get()) {
            a(this.f19180c.b());
        }
        a();
    }

    public ArrayList<j> a(int i10) {
        ArrayList<j> arrayList = new ArrayList<>();
        try {
            v W = this.f.W();
            if (W.b("persistent_postback_cache.json", p.y())) {
                String a10 = W.a(W.a("persistent_postback_cache.json", p.y()));
                if (StringUtils.isValidString(a10)) {
                    JSONArray jSONArray = new JSONObject(a10).getJSONArray(com.anythink.expressad.d.a.b.av);
                    if (y.a()) {
                        this.f19181d.b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int intValue = ((Integer) this.f.a(com.applovin.impl.sdk.c.b.cX)).intValue();
                    for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                        try {
                            j jVar = new j(jSONArray.getJSONObject(i11), this.f);
                            if (jVar.k() < intValue) {
                                arrayList.add(jVar);
                            } else if (y.a()) {
                                this.f19181d.b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + jVar);
                            }
                        } catch (Throwable th) {
                            if (y.a()) {
                                this.f19181d.b("PersistentPostbackQueueSaveTask", "Unable to deserialize postback request from json", th);
                            }
                        }
                    }
                    if (y.a()) {
                        this.f19181d.b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th2) {
            if (y.a()) {
                this.f19181d.b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th2);
            }
        }
        return arrayList;
    }

    private void a(List<j> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<j> it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().n());
            } catch (Throwable th) {
                if (y.a()) {
                    this.f19181d.b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.anythink.expressad.d.a.b.av, jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            v W = this.f.W();
            W.a(byteArrayInputStream, W.a("persistent_postback_cache.json", p.y()));
            if (y.a()) {
                this.f19181d.b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (y.a()) {
                this.f19181d.b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }
}
