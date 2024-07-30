package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.applovin.sdk.AppLovinEventParameters;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TrackGooglePurchase.java */
/* loaded from: classes2.dex */
public final class n4 {

    /* renamed from: i, reason: collision with root package name */
    public static int f26942i = -99;

    /* renamed from: j, reason: collision with root package name */
    public static Class<?> f26943j;

    /* renamed from: a, reason: collision with root package name */
    public a f26944a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26945b;

    /* renamed from: c, reason: collision with root package name */
    public Method f26946c;

    /* renamed from: d, reason: collision with root package name */
    public Method f26947d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f26948e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26949g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26950h = false;
    public final ArrayList<String> f = new ArrayList<>();

    /* compiled from: TrackGooglePurchase.java */
    /* loaded from: classes2.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Method method;
            n4 n4Var = n4.this;
            try {
                Method[] methods = Class.forName("com.android.vending.billing.IInAppBillingService$Stub").getMethods();
                int length = methods.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        method = methods[i10];
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        method = null;
                        break;
                    }
                }
                method.setAccessible(true);
                n4Var.f26945b = method.invoke(null, iBinder);
                if (!n4Var.f26950h) {
                    new Thread(new o4(n4Var)).start();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            n4.f26942i = -99;
            n4.this.f26945b = null;
        }
    }

    public n4(Context context) {
        this.f26949g = true;
        this.f26948e = context;
        try {
            JSONArray jSONArray = new JSONArray(r3.f("GTPlayerPurchases", "purchaseTokens", ContentRecord.XRINFOLIST_NULL));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f.add(jSONArray.get(i10).toString());
            }
            boolean z10 = jSONArray.length() == 0;
            this.f26949g = z10;
            if (z10) {
                this.f26949g = r3.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        b();
    }

    public static void a(n4 n4Var, ArrayList arrayList, ArrayList arrayList2) {
        Method method;
        n4Var.getClass();
        try {
            if (n4Var.f26947d == null) {
                Method[] methods = f26943j.getMethods();
                int length = methods.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        method = methods[i10];
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        Class<?> returnType = method.getReturnType();
                        if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        method = null;
                        break;
                    }
                }
                n4Var.f26947d = method;
                method.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) n4Var.f26947d.invoke(n4Var.f26945b, 3, n4Var.f26948e.getPackageName(), "inapp", bundle);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(AppLovinEventParameters.PRODUCT_IDENTIFIER, string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (hashMap.containsKey(str)) {
                        jSONArray.put(hashMap.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    e3.N(jSONArray, n4Var.f26949g, new p4(n4Var, arrayList2));
                }
            }
        } catch (Throwable th) {
            e3.b(4, "Failed to track IAP purchases", th);
        }
    }

    public final void b() {
        if (this.f26944a == null) {
            this.f26944a = new a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f26948e.bindService(intent, this.f26944a, 1);
            return;
        }
        if (this.f26945b != null && !this.f26950h) {
            new Thread(new o4(this)).start();
        }
    }
}
