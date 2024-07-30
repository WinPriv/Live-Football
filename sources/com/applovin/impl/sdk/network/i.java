package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f19182a;

    /* renamed from: b, reason: collision with root package name */
    private final y f19183b;

    public i(g gVar, p pVar) {
        super("PersistentPostbackQueueSaveTaskV2", pVar);
        this.f19182a = gVar;
        this.f19183b = pVar.L();
    }

    public List<j> a(int i10) {
        ArrayList arrayList = new ArrayList();
        v W = this.f.W();
        if (!W.b("persistent_postback_cache.json", p.y())) {
            y.i("PersistentPostbackQueueSaveTaskV2", "Postbacks queue file does not exist.");
            return arrayList;
        }
        String a10 = W.a(W.a("persistent_postback_cache.json", p.y()));
        if (TextUtils.isEmpty(a10)) {
            y.i("PersistentPostbackQueueSaveTaskV2", "Postbacks queue file has no content.");
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONObject(a10).getJSONArray(com.anythink.expressad.d.a.b.av);
            if (y.a()) {
                this.f19183b.b("PersistentPostbackQueueSaveTaskV2", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f.a(com.applovin.impl.sdk.c.b.cX);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                try {
                    j jVar = new j(jSONArray.getJSONObject(i11), this.f);
                    if (jVar.k() < num.intValue()) {
                        arrayList.add(jVar);
                    } else {
                        y.i("PersistentPostbackQueueSaveTaskV2", "Skipping deserialization because maximum attempt count exceeded for postback: " + jVar);
                    }
                } catch (Throwable th) {
                    y.c("PersistentPostbackQueueSaveTaskV2", "Unable to deserialize postback from json", th);
                }
            }
            if (y.a()) {
                this.f19183b.b("PersistentPostbackQueueSaveTaskV2", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            y.c("PersistentPostbackQueueSaveTaskV2", "Failed to load postback queue", th2);
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f19182a.a());
    }

    private void a(List<j> list) {
        JSONArray jSONArray = new JSONArray();
        for (j jVar : list) {
            try {
                jSONArray.put(jVar.n());
            } catch (Throwable th) {
                y.c("PersistentPostbackQueueSaveTaskV2", "Unable to serialize postback to JSON: " + jVar, th);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.anythink.expressad.d.a.b.av, jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            v W = this.f.W();
            W.a(byteArrayInputStream, W.a("persistent_postback_cache.json", p.y()));
            if (y.a()) {
                this.f19183b.b("PersistentPostbackQueueSaveTaskV2", "Exported postback queue to disk.");
            }
        } catch (Throwable th2) {
            y.c("PersistentPostbackQueueSaveTaskV2", "Unable to export postbacks to disk: " + jSONArray, th2);
        }
    }
}
