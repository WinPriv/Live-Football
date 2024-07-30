package com.anythink.core.common.k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.SparseBooleanArray;
import com.anythink.core.common.k.o;
import com.huawei.openalliance.ad.constant.al;
import java.util.List;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6225a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6226b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6227c = 3;

    /* renamed from: e, reason: collision with root package name */
    private static volatile q f6228e;

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f6229d = new SparseBooleanArray(3);

    public static q a() {
        if (f6228e == null) {
            synchronized (q.class) {
                if (f6228e == null) {
                    f6228e = new q();
                }
            }
        }
        return f6228e;
    }

    public final synchronized boolean b(Context context) {
        if (this.f6229d.indexOfKey(2) >= 0) {
            return this.f6229d.get(2);
        }
        boolean z10 = false;
        try {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null) {
                if (queryIntentServices.size() > 0) {
                    z10 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f6229d.put(2, z10);
        return z10;
    }

    public final synchronized boolean a(Context context) {
        if (this.f6229d.indexOfKey(1) >= 0) {
            return this.f6229d.get(1);
        }
        boolean z10 = false;
        try {
            o oVar = new o(context);
            o.a a10 = oVar.a(al.Code);
            String b10 = oVar.b(al.Code);
            if (a10 == o.a.ENABLED) {
                if ("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(b10)) {
                    z10 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f6229d.put(1, z10);
        return z10;
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f6229d.indexOfKey(3) >= 0) {
            return this.f6229d.get(3);
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        }
        this.f6229d.put(3, z10);
        return z10;
    }
}
