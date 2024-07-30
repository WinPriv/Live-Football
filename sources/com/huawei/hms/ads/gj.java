package com.huawei.hms.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class gj {
    private static final String B = "NotificationActionManager";
    public static final String Code = "com.huawei.ads.notification.action.CLICK";
    public static final int I = 1;
    private static gj S = null;
    public static final String V = "com.huawei.ads.notification.action.DELETE";
    public static final String Z = "type";
    private Context D;
    private ec L;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Class<? extends gi>> f21694a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f21695b = new BroadcastReceiver() { // from class: com.huawei.hms.ads.gj.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                ex.Code(gj.B, " action name:%s", intent.getAction());
                gj.this.Code(context, intent);
            } else {
                ex.Code(gj.B, "intent or action maybe empty.");
            }
        }
    };
    private static final byte[] C = new byte[0];
    private static final byte[] F = new byte[0];

    private gj(Context context) {
        this.D = context.getApplicationContext();
        this.L = ec.Code(context);
    }

    public static gj Code(Context context) {
        synchronized (C) {
            if (S == null) {
                S = new gj(context);
            }
        }
        return S;
    }

    private void V() {
        this.f21694a.put("com.huawei.ads.notification.action.CLICK1", gd.class);
        this.f21694a.put("com.huawei.ads.notification.action.DELETE1", gf.class);
    }

    public boolean I(String str) {
        if (TextUtils.isEmpty(str)) {
            ex.V(B, "isPackageExist packageName is Empty.");
            return false;
        }
        synchronized (F) {
            Set<String> ai = this.L.ai();
            if (ai == null) {
                return false;
            }
            return ai.contains(str);
        }
    }

    public void Code() {
        String str;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(V);
            this.D.registerReceiver(this.f21695b, intentFilter);
        } catch (IllegalStateException unused) {
            str = "init IllegalStateException";
            ex.I(B, str);
            V();
        } catch (Exception unused2) {
            str = "init Exception";
            ex.I(B, str);
            V();
        }
        V();
    }

    public void V(String str) {
        if (TextUtils.isEmpty(str)) {
            ex.V(B, "remove packageName is Empty.");
            return;
        }
        synchronized (F) {
            try {
                Set<String> ai = this.L.ai();
                if (ai != null) {
                    ai.remove(str);
                    ec.Code(this.D).Code(ai);
                }
            } finally {
            }
        }
    }

    public void Code(Context context, Intent intent) {
        String simpleName;
        String str;
        String str2;
        try {
            int intExtra = intent.getIntExtra("type", 1);
            String str3 = intent.getAction() + intExtra;
            Class<? extends gi> cls = this.f21694a.get(str3);
            if (cls != null) {
                try {
                    cls.newInstance().Code(this.D, intent);
                } catch (InstantiationException unused) {
                    str2 = "InstantiationException can not instantiation notification Action";
                    ex.I(B, str2);
                } catch (Throwable unused2) {
                    str2 = "Throwable can not instantiation notification Action";
                    ex.I(B, str2);
                }
            } else {
                ex.V(B, "can not find action key:" + str3);
            }
        } catch (IllegalStateException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "actionReceiver.onReceive IllegalStateException:";
            ex.I(B, str.concat(simpleName));
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str = "actionReceiver.onReceive Exception:";
            ex.I(B, str.concat(simpleName));
        }
    }

    public void Code(String str) {
        if (TextUtils.isEmpty(str)) {
            ex.V(B, "add packageName is Empty.");
            return;
        }
        synchronized (F) {
            try {
                Set<String> ai = this.L.ai();
                if (ai != null) {
                    ai.add(str);
                    ec.Code(this.D).Code(ai);
                }
            } finally {
            }
        }
    }
}
