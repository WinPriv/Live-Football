package com.huawei.openalliance.ad.ppskit.handlers;

import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq;
import com.huawei.openalliance.ad.ppskit.utils.c1;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import com.huawei.openalliance.ad.ppskit.utils.r2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.HashMap;
import ka.hi;
import ka.n7;

/* loaded from: classes2.dex */
public final class j0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f22573s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdContentReq f22574t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam f22575u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q1 f22576v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f22577w;

    public j0(i0 i0Var, String str, AdContentReq adContentReq, AdSlotParam adSlotParam, q1 q1Var) {
        this.f22577w = i0Var;
        this.f22573s = str;
        this.f22574t = adContentReq;
        this.f22575u = adSlotParam;
        this.f22576v = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Long x10;
        Long B;
        hi hiVar;
        hi hiVar2;
        i0 i0Var = this.f22577w;
        l lVar = i0Var.f22556b;
        String str2 = this.f22573s;
        long v3 = lVar.v(str2);
        Device D = this.f22574t.D();
        HashMap hashMap = new HashMap();
        try {
            Integer H = com.huawei.openalliance.ad.ppskit.utils.m.H(i0Var.f22555a, v3);
            if (H != null) {
                hashMap.put("hw_d005", Integer.toString(H.intValue()));
            }
            Integer J = com.huawei.openalliance.ad.ppskit.utils.m.J(i0Var.f22555a, v3);
            if (J != null) {
                hashMap.put("hw_d006", Integer.toString(J.intValue()));
            }
            hashMap.put("hw_d007", com.huawei.openalliance.ad.ppskit.utils.m.E(i0Var.f22555a, v3));
            if (com.huawei.openalliance.ad.ppskit.utils.m.X(i0Var.f22555a)) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("hw_u002", str);
            hashMap.put("hw_d001", i2.E(i0Var.f22555a));
            hashMap.put("hw_d002", i2.D(i0Var.f22555a));
            if (D != null) {
                x10 = D.f();
                B = D.i();
            } else {
                x10 = com.huawei.openalliance.ad.ppskit.utils.m.x(i0Var.f22555a, v3);
                B = com.huawei.openalliance.ad.ppskit.utils.m.B(i0Var.f22555a, v3);
            }
            if (x10 != null) {
                hashMap.put("hw_d003", Long.toString(x10.longValue()));
            }
            if (B != null) {
                hashMap.put("hw_d004", Long.toString(B.longValue()));
            }
            hashMap.put("hw_u001", q1.m(i0Var.f22555a).y());
            if (com.huawei.openalliance.ad.ppskit.utils.d0.m(i0Var.f22555a.getApplicationContext()) && c1.e(i0Var.f22555a, str2).f() && i0Var.f22556b.t(str2)) {
                String n10 = com.huawei.openalliance.ad.ppskit.utils.m.n(i0Var.f22555a, v3);
                if (!y1.h(n10)) {
                    hashMap.put("hw_d008", r2.a(n10.getBytes("UTF-8")));
                }
                hashMap.put("hw_d009", com.huawei.openalliance.ad.ppskit.utils.m.r(i0Var.f22555a, v3));
            }
            Integer g6 = this.f22575u.g();
            if (g6 != null) {
                hashMap.put("hw_m001", Integer.toString(g6.intValue()));
            }
            if (a0.a.A0 != null) {
                hiVar2 = a0.a.A0;
            } else {
                synchronized (a0.a.B0) {
                    if (a0.a.A0 == null) {
                        a0.a.A0 = new hi();
                    }
                    hiVar = a0.a.A0;
                }
                hiVar2 = hiVar;
            }
            HashMap hashMap2 = hiVar2.f31261a;
            if (!a0.a.e0(hashMap2)) {
                hashMap.putAll(hashMap2);
            }
        } catch (Throwable th) {
            i0 i0Var2 = i0.f22551k;
            n7.h("i0", "config tag error:%s", th.getClass().getSimpleName());
        }
        this.f22576v.s(hashMap);
    }
}
