package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import ka.n7;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: LayoutIncludeDetector.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f682a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f683b;

    public r(Context context) {
        this.f682a = 5;
        File cacheDir = context.createDeviceProtectedStorageContext().getCacheDir();
        StringBuilder sb2 = new StringBuilder();
        String str = File.separator;
        File file = new File(cacheDir, a3.l.q(sb2, str, "pps", str, "diskcache"));
        this.f683b = file;
        if (file.exists() || file.mkdirs()) {
            return;
        }
        n7.i("CacheConfig", "Create cache dir failed");
    }

    public static boolean f(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String h(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public final boolean a(String str) {
        String e10 = e(str);
        if (!"1".equals(e10) && !Boolean.parseBoolean(e10)) {
            return false;
        }
        return true;
    }

    public final Integer b(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return Integer.valueOf(Integer.parseInt(e10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + h(str) + "(" + e10 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public final JSONArray c(String str) {
        String e10 = e(str);
        if (!TextUtils.isEmpty(e10)) {
            try {
                return new JSONArray(e10);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + h(str) + ": " + e10 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final String d(String str, Resources resources, String str2) {
        String[] strArr;
        String e10 = e(str2);
        if (!TextUtils.isEmpty(e10)) {
            return e10;
        }
        String e11 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e11)) {
            return null;
        }
        int identifier = resources.getIdentifier(e11, com.anythink.expressad.foundation.h.i.f10128g, str);
        if (identifier == 0) {
            Log.w("NotificationParams", h(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray c10 = c(str2.concat("_loc_args"));
        if (c10 == null) {
            strArr = null;
        } else {
            int length = c10.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = c10.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e12) {
            Log.w("NotificationParams", "Missing format argument for " + h(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e12);
            return null;
        }
    }

    public final String e(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f683b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle g() {
        boolean z10;
        Object obj = this.f683b;
        Bundle bundle = new Bundle((Bundle) obj);
        for (String str : ((Bundle) obj).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final String toString() {
        switch (this.f682a) {
            case 4:
                return ((Field) this.f683b).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r(Object obj, int i10) {
        this.f682a = i10;
        this.f683b = obj;
    }

    public r(Bundle bundle) {
        this.f682a = 3;
        this.f683b = new Bundle(bundle);
    }
}
