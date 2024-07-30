package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.net.http.d;
import java.util.HashMap;
import ka.n7;
import ka.r9;
import ka.s9;
import ka.u9;
import ka.y9;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22545e = new byte[0];
    public static h0 f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22546a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public int f22547b;

    /* renamed from: c, reason: collision with root package name */
    public u9 f22548c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f22549d;

    public h0(Context context) {
        this.f22549d = context.getApplicationContext();
        j7.r.w(context);
    }

    public static h0 a(Context context) {
        h0 h0Var;
        synchronized (f22545e) {
            if (f == null) {
                f = new h0(context);
            }
            h0Var = f;
        }
        return h0Var;
    }

    public final HashMap b(ReqBean reqBean) {
        y9 y9Var = new y9(this.f22549d);
        y9Var.b("X-HW-AD-KitVersion", "3.4.65.300");
        y9Var.b("X-HW-App-Id", reqBean.d());
        y9Var.d(y9Var.f32215c.getPackageName(), reqBean);
        return y9Var.a();
    }

    public final u9 c(String str) {
        u9 u9Var;
        synchronized (this.f22546a) {
            l d10 = l.d(this.f22549d);
            if (this.f22548c == null || this.f22547b != d10.L(str)) {
                this.f22547b = d10.L(str);
                d();
            }
            u9Var = this.f22548c;
        }
        return u9Var;
    }

    public final void d() {
        n7.f("KitNetHandler", "createAdServerRequester lib switch: %d", Integer.valueOf(this.f22547b));
        d.b bVar = new d.b(this.f22549d);
        bVar.f = this.f22547b;
        bVar.f22763d = new r9();
        bVar.f22764e = new s9();
        this.f22548c = (u9) new com.huawei.openalliance.ad.ppskit.net.http.d(bVar).b(u9.class);
    }
}
