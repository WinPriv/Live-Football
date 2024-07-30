package ib;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29502a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29503b;

    /* renamed from: c, reason: collision with root package name */
    public final x f29504c;

    public m(Context context, boolean z10) {
        Context createDeviceProtectedStorageContext = context.getApplicationContext().createDeviceProtectedStorageContext();
        this.f29502a = createDeviceProtectedStorageContext;
        this.f29503b = z10;
        this.f29504c = new x(context);
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("pps_ats", 4);
        if (!sharedPreferences.contains("app_track")) {
            sharedPreferences.edit().putBoolean("app_track", z10).apply();
        }
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("app_track", str)) {
            d().edit().remove(str).apply();
        }
    }

    public final void b(boolean z10) {
        SharedPreferences d10 = d();
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = d10.getAll();
        if (!a0.a.e0(all)) {
            arrayList.addAll(all.keySet());
        }
        if (androidx.transition.n.M(arrayList) || !arrayList.contains("app_track")) {
            arrayList.add("app_track");
        }
        SharedPreferences.Editor edit = d10.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.putBoolean((String) it.next(), z10);
        }
        edit.apply();
    }

    public final boolean c() {
        boolean z10;
        boolean z11;
        SharedPreferences d10 = d();
        Map<String, ?> all = d10.getAll();
        if (!d10.getBoolean("app_track", false)) {
            return false;
        }
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry<String, ?> next = it.next();
                if (next != null && (next.getValue() instanceof Boolean)) {
                    String key = next.getKey();
                    if (!TextUtils.isEmpty(key) && !TextUtils.equals(key, "app_track") && !TextUtils.equals(key, "UNKNOWN")) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11 && !((Boolean) next.getValue()).booleanValue()) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final SharedPreferences d() {
        return this.f29502a.getSharedPreferences("pps_ats", 4);
    }
}
