package ka;

import android.content.Context;
import android.util.LruCache;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o1 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final LruCache<String, AdSlotParam> f31582c = new LruCache<>(5);

    /* renamed from: d, reason: collision with root package name */
    public static final LruCache<String, Long> f31583d = new LruCache<>(5);

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31584s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f31585t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31586u;

        public a(Context context, String str, String str2) {
            this.f31584s = str;
            this.f31585t = context;
            this.f31586u = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdSlotParam adSlotParam = o1.f31582c.get(this.f31584s);
            if (adSlotParam != null) {
                new o1().j(this.f31585t, this.f31584s, this.f31586u, adSlotParam, null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements ng {

        /* renamed from: a, reason: collision with root package name */
        public final String f31587a;

        public b(String str) {
            this.f31587a = str;
        }

        @Override // ka.ng
        public final ArrayList a(String str, AdContentRsp adContentRsp, int i10) {
            return androidx.transition.n.T(str, this.f31587a, adContentRsp, i10);
        }

        @Override // ka.ng
        public final ArrayList b(String str, AdContentRsp adContentRsp, int i10) {
            return androidx.transition.n.y(str, this.f31587a, adContentRsp, i10);
        }
    }

    public o1() {
        super("reqPreSplashAd");
    }

    public static void i(Context context, String str, String str2) {
        long j10;
        long j11;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        synchronized (d10.f22585a) {
            j10 = d10.G(str).getLong("preload_splash_req_time_interval", 600000L);
        }
        Long l10 = f31583d.get(str);
        if (l10 != null) {
            j11 = l10.longValue();
        } else {
            j11 = 0;
        }
        if (System.currentTimeMillis() - j11 < j10) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("request time limit, timeInter=", j10, ", lastTime=");
            k10.append(j11);
            k10.append(" callerPkg: ");
            k10.append(str);
            n7.e("CmdReqPreSplashAd", k10.toString());
            return;
        }
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(context, str, str2), 1);
    }

    @Override // ka.c0
    public final void h(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4 = null;
        AdSlotParam adSlotParam = (AdSlotParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdSlotParam.class, new Class[0]);
        if (adSlotParam == null) {
            return;
        }
        if (adSlotParam.T() != 1 && adSlotParam.T() != 18) {
            adSlotParam.J(1);
        }
        if (adSlotParam.c0() != null) {
            str4 = String.valueOf(adSlotParam.c0());
        }
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        synchronized (d10.f22585a) {
            d10.G(str).edit().putString("allow_mobile_traffic", str4).commit();
        }
        f31582c.put(str, adSlotParam.u());
        j(context, str, str2, adSlotParam, aVar);
    }

    public final void j(Context context, String str, String str2, AdSlotParam adSlotParam, com.huawei.android.hms.ppskit.a aVar) {
        n7.b("CmdReqPreSplashAd", "do preload from sdk");
        long currentTimeMillis = System.currentTimeMillis();
        f31583d.put(str, Long.valueOf(currentTimeMillis));
        Pair c02 = androidx.activity.n.c0(context, str);
        if (c02 != null) {
            adSlotParam.C((String) c02.first);
            adSlotParam.D(((Boolean) c02.second).booleanValue());
        }
        ad adVar = new ad(context);
        adVar.f = str2;
        int A = com.huawei.openalliance.ad.ppskit.utils.z1.A(str2);
        if (A == 0) {
            n7.i("CmdReqPreSplashAd", "doRreAdRequest, callerSdkVersion is wrong, please check it!");
            return;
        }
        if (A < 33) {
            adSlotParam.w();
        }
        if (n7.d()) {
            n7.c("CmdReqPreSplashAd", "doRreAdRequest, orientation %s", Integer.valueOf(adSlotParam.B()));
        }
        adVar.f(str, adVar.b(adSlotParam.T(), adSlotParam, str), adSlotParam, new b(str2), null, currentTimeMillis, 1);
        e(aVar);
    }
}
