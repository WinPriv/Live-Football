package com.anythink.core.common;

import android.content.Context;
import com.anythink.network.myoffer.MyOfferAPI;
import java.lang.reflect.Method;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6505a = 35;

    /* renamed from: b, reason: collision with root package name */
    public static final String f6506b = "isDefaultOffer";

    /* renamed from: g, reason: collision with root package name */
    private static volatile s f6507g;

    /* renamed from: c, reason: collision with root package name */
    Method f6508c;

    /* renamed from: d, reason: collision with root package name */
    Method f6509d;

    /* renamed from: e, reason: collision with root package name */
    Method f6510e;
    Method f;

    private s() {
        try {
            this.f6508c = MyOfferAPI.class.getDeclaredMethod("preloadTopOnOffer", Context.class, com.anythink.core.common.e.t.class);
            this.f6509d = MyOfferAPI.class.getDeclaredMethod("getOutOfCapOfferIds", Context.class);
            this.f6510e = MyOfferAPI.class.getDeclaredMethod("getDefaultOfferId", Context.class, String.class);
            this.f = MyOfferAPI.class.getDeclaredMethod("checkOffersOutOfCap", Context.class, String.class);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static s a() {
        if (f6507g == null) {
            synchronized (s.class) {
                if (f6507g == null) {
                    f6507g = new s();
                }
            }
        }
        return f6507g;
    }

    public final String b(Context context, String str) {
        try {
            Method method = this.f6510e;
            if (method != null) {
                return method.invoke(null, context, str).toString();
            }
            return "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public final boolean c(Context context, String str) {
        try {
            Method method = this.f;
            if (method != null) {
                return ((Boolean) method.invoke(null, context, str)).booleanValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    public final void a(Context context, String str) {
        try {
            if (this.f6508c != null) {
                com.anythink.core.common.e.t tVar = new com.anythink.core.common.e.t();
                tVar.f5742a = str;
                this.f6508c.invoke(null, context, tVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final JSONArray a(Context context) {
        try {
            Method method = this.f6509d;
            if (method != null) {
                return new JSONArray(method.invoke(null, context).toString());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return new JSONArray();
    }
}
