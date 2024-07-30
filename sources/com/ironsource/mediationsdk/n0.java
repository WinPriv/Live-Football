package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static n0 f25756b;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f25757a = new JSONObject();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                n0.this.c(n0.b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static synchronized n0 a() {
        n0 n0Var;
        synchronized (n0.class) {
            if (f25756b == null) {
                f25756b = new n0();
            }
            n0Var = f25756b;
        }
        return n0Var;
    }

    public static JSONObject b() {
        String str;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String C = com.ironsource.environment.h.C(applicationContext);
                String D = com.ironsource.environment.h.D(applicationContext);
                if (!TextUtils.isEmpty(C)) {
                    str = IronSourceConstants.TYPE_GAID;
                } else {
                    C = com.ironsource.environment.h.x(applicationContext);
                    if (!TextUtils.isEmpty(C)) {
                        str = IronSourceConstants.TYPE_UUID;
                    } else {
                        str = "";
                    }
                }
                if (!TextUtils.isEmpty(C)) {
                    jSONObject.put("advId", C);
                    jSONObject.put("advType", str);
                }
                if (!TextUtils.isEmpty(D)) {
                    jSONObject.put("isLAT", Boolean.parseBoolean(D));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }

    public final void c(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            synchronized (this) {
                try {
                    this.f25757a.put(next, opt);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
