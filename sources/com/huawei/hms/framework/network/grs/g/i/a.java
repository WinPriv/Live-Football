package com.huawei.hms.framework.network.grs.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.g.j.d;
import com.huawei.hms.framework.network.grs.h.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21905a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static d f21906b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f21907c = new Object();

    public static synchronized d a(Context context) {
        synchronized (a.class) {
            synchronized (f21907c) {
                d dVar = f21906b;
                if (dVar != null) {
                    return dVar;
                }
                String a10 = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
                ArrayList arrayList = null;
                if (TextUtils.isEmpty(a10)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(a10).getJSONObject("grs_server");
                    JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            arrayList.add(jSONArray.get(i10).toString());
                        }
                    }
                    d dVar2 = new d();
                    f21906b = dVar2;
                    dVar2.a(arrayList);
                    f21906b.a(jSONObject.getString("grs_query_endpoint_2.0"));
                    f21906b.a(jSONObject.getInt("grs_query_timeout"));
                } catch (JSONException e10) {
                    Logger.w(f21905a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
                }
                return f21906b;
            }
        }
    }
}
