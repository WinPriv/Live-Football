package com.onesignal;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: TrackGooglePurchase.java */
/* loaded from: classes2.dex */
public final class o4 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n4 f26959s;

    public o4(n4 n4Var) {
        this.f26959s = n4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Method method;
        n4 n4Var = this.f26959s;
        n4Var.f26950h = true;
        try {
            if (n4Var.f26946c == null) {
                Method[] methods = n4.f26943j.getMethods();
                int length = methods.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        method = methods[i10];
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        method = null;
                        break;
                    }
                }
                n4Var.f26946c = method;
                n4Var.f26946c.setAccessible(true);
            }
            Bundle bundle = (Bundle) n4Var.f26946c.invoke(n4Var.f26945b, 3, n4Var.f26948e.getPackageName(), "inapp", null);
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                for (int i11 = 0; i11 < stringArrayList2.size(); i11++) {
                    String str = stringArrayList2.get(i11);
                    String str2 = stringArrayList.get(i11);
                    String string = new JSONObject(str).getString("purchaseToken");
                    if (!n4Var.f.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    n4.a(n4Var, arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    n4Var.f26949g = false;
                    r3.i("GTPlayerPurchases", "ExistingPurchases", false);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        n4Var.f26950h = false;
    }
}
