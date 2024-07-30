package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import com.anythink.expressad.exoplayer.k.o;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends a {
    public c(Context context, boolean z10) {
        this.f21848e = z10;
        if (a("grs_sdk_global_route_config.json", context) == 0) {
            this.f21847d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int a(String str) {
        this.f21844a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(o.f9071d);
            String string = jSONObject.getString("name");
            long j10 = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f21844a.b(string);
            this.f21844a.a(j10);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int b(String str) {
        JSONObject jSONObject;
        this.f21845b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() != 0) {
                this.f21845b.addAll(a(jSONObject));
            }
            return 0;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[Catch: JSONException -> 0x0120, TryCatch #0 {JSONException -> 0x0120, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0023, B:9:0x0039, B:12:0x0042, B:13:0x0056, B:15:0x005c, B:17:0x006d, B:19:0x0086, B:20:0x009c, B:22:0x00a2, B:24:0x00b6, B:31:0x00bc, B:35:0x00cd, B:36:0x0072, B:38:0x0078, B:39:0x007f, B:42:0x00e1, B:44:0x00ec, B:45:0x00fb, B:46:0x0105, B:48:0x010c, B:49:0x0113, B:53:0x00f1, B:55:0x00f7, B:56:0x0100), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c A[Catch: JSONException -> 0x0120, TryCatch #0 {JSONException -> 0x0120, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0023, B:9:0x0039, B:12:0x0042, B:13:0x0056, B:15:0x005c, B:17:0x006d, B:19:0x0086, B:20:0x009c, B:22:0x00a2, B:24:0x00b6, B:31:0x00bc, B:35:0x00cd, B:36:0x0072, B:38:0x0078, B:39:0x007f, B:42:0x00e1, B:44:0x00ec, B:45:0x00fb, B:46:0x0105, B:48:0x010c, B:49:0x0113, B:53:0x00f1, B:55:0x00f7, B:56:0x0100), top: B:2:0x000c }] */
    @Override // com.huawei.hms.framework.network.grs.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.c.e(java.lang.String):int");
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : a(jSONObject);
    }

    private List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.c(jSONObject2.getString("name"));
                bVar.a(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        hashSet.add((String) jSONArray.get(i10));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return new ArrayList();
        }
    }
}
