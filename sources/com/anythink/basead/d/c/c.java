package com.anythink.basead.d.c;

import android.content.Context;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f3908b;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, ArrayList<String>> f3909a = new ConcurrentHashMap<>();

    private c() {
    }

    public static String a(String str, String str2) {
        return com.ironsource.adapters.facebook.a.h(str, str2);
    }

    public static c a() {
        if (f3908b == null) {
            synchronized (c.class) {
                if (f3908b == null) {
                    f3908b = new c();
                }
            }
        }
        return f3908b;
    }

    public final synchronized void a(Context context, String str, i iVar, k kVar) {
        if (iVar.d() == 3 && (kVar instanceof ab)) {
            if (((ab) kVar).X() <= 0) {
                return;
            }
            ab abVar = (ab) kVar;
            ArrayList<String> arrayList = this.f3909a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                try {
                    JSONArray jSONArray = new JSONArray(p.b(context, g.f5017z, str, ""));
                    if (jSONArray.length() > 0) {
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            arrayList.add(jSONArray.optString(i10));
                        }
                    }
                } catch (Exception unused) {
                }
                this.f3909a.put(str, arrayList);
            }
            if (arrayList.size() >= abVar.X()) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(0, iVar.p());
            p.a(context, g.f5017z, str, new JSONArray((Collection) arrayList).toString());
        }
    }

    public final String[] a(Context context, String str) {
        ArrayList<String> arrayList = this.f3909a.get(str);
        if (arrayList == null) {
            try {
                JSONArray jSONArray = new JSONArray(p.b(context, g.f5017z, str, ""));
                if (jSONArray.length() > 0) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            arrayList2.add(jSONArray.optString(i10));
                        } catch (Exception unused) {
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (Exception unused2) {
            }
        }
        if (arrayList == null) {
            return null;
        }
        this.f3909a.put(str, arrayList);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}
