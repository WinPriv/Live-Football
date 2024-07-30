package com.ironsource.environment;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24693a = new a();

    /* loaded from: classes2.dex */
    public static class a extends ArrayList<String> {
        public a() {
            add("com.google.market");
            add("com.android.vending");
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends JSONObject {
        public b(boolean z10) {
            put("isInstalled", z10);
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        EF12(new String[]{"com.android.vending"}, 2),
        /* JADX INFO: Fake field, exist only in values array */
        EF27(new String[]{"com.google.market"}, 4),
        /* JADX INFO: Fake field, exist only in values array */
        EF41(new String[]{"com.sec.android.app.samsungapps"}, 5),
        /* JADX INFO: Fake field, exist only in values array */
        EF56(new String[]{"com.amazon.venezia"}, 6),
        /* JADX INFO: Fake field, exist only in values array */
        EF70(new String[]{w.W}, 7);


        /* renamed from: u, reason: collision with root package name */
        public static final HashMap f24694u = new HashMap();

        /* renamed from: s, reason: collision with root package name */
        public final int f24696s;

        /* renamed from: t, reason: collision with root package name */
        public final String[] f24697t;

        static {
            for (c cVar : values()) {
                for (String str : cVar.f24697t) {
                    f24694u.put(str, cVar);
                }
            }
        }

        c(String[] strArr, int i10) {
            this.f24696s = i10;
            this.f24697t = strArr;
        }
    }

    public static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            List<ApplicationInfo> p10 = h.p(context);
            ArrayList arrayList2 = new ArrayList();
            for (ApplicationInfo applicationInfo : p10) {
                if (applicationInfo != null) {
                    arrayList2.add(applicationInfo.packageName.toLowerCase());
                }
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, new b(arrayList2.contains(next.trim().toLowerCase())));
            }
        } catch (Exception unused) {
            Log.d("k", "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    public static Integer b(Context context) {
        HashMap hashMap = c.f24694u;
        JSONObject a10 = a(context, new ArrayList(c.f24694u.keySet()));
        int i10 = 0;
        for (c cVar : c.values()) {
            String[] strArr = cVar.f24697t;
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                JSONObject optJSONObject = a10.optJSONObject(strArr[i11]);
                if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                    i10 = (int) (Math.pow(2.0d, r5.f24696s - 1) + i10);
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static boolean a(Context context) {
        JSONObject a10 = a(context, f24693a);
        Iterator<String> keys = a10.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a10.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }
}
