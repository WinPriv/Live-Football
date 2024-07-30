package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1428r {

    /* renamed from: com.ironsource.mediationsdk.r$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str);
    }

    public static JSONObject a(Context context, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a10 = a.C0321a.f24648a.a(context);
        for (String str : strArr) {
            if (a10.has(str)) {
                jSONObject.put(str, a10.opt(str));
            }
        }
        return jSONObject;
    }

    public JSONObject a(ArrayList<String> arrayList) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject a10 = a.C0321a.f24648a.a(applicationContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (a10.has(next)) {
                jSONObject.put(next, a10.opt(next));
            }
        }
        return jSONObject;
    }

    public static JSONObject a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a10 = a.C0321a.f24648a.a(ContextProvider.getInstance().getApplicationContext());
        for (String str : strArr) {
            if (a10.has(str)) {
                jSONObject.put(str, a10.opt(str));
            }
        }
        return jSONObject;
    }

    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        char c10;
        int i10;
        try {
            String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                i10 = 1;
            } else if (c10 == 1) {
                i10 = 2;
            } else if (c10 == 2) {
                i10 = 3;
            } else {
                if (c10 != 3) {
                    if (c10 != 4) {
                        return;
                    }
                    map.put("bannerAdSize", 6);
                    map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                    return;
                }
                i10 = 5;
            }
            map.put("bannerAdSize", i10);
        } catch (Exception e10) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
    }
}
