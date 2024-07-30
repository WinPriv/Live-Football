package ka;

import android.content.SharedPreferences;
import com.huawei.openalliance.ad.ppskit.beans.server.KitConfigRsp;
import com.huawei.openalliance.ad.ppskit.utils.u1;

/* loaded from: classes2.dex */
public final class we implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ KitConfigRsp f32140s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ jc.a f32141t;

    public we(jc.a aVar, KitConfigRsp kitConfigRsp) {
        this.f32141t = aVar;
        this.f32140s = kitConfigRsp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7.b("KitConfigProcessor", "save dpch");
        String M = this.f32140s.M();
        if (com.huawei.openalliance.ad.ppskit.utils.y1.h(M)) {
            return;
        }
        u1.a a10 = u1.a.a(this.f32141t.f30200a);
        synchronized (a10.f23036a) {
            SharedPreferences.Editor edit = a10.b().edit();
            byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(a10.f23039d);
            n7.b("SecretUtil", "put dpch");
            edit.putString("worklifebalance", com.huawei.openalliance.ad.ppskit.utils.m2.a(M, h10)).apply();
        }
    }
}
