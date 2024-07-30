package ka;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import ka.n1;

/* loaded from: classes2.dex */
public final class k1 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31361s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f31362t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31363u;

    public k1(Context context, String str, String str2) {
        this.f31361s = str;
        this.f31362t = context;
        this.f31363u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdSlotParam adSlotParam = l1.f31401c.get(this.f31361s);
        if (adSlotParam != null) {
            l1 l1Var = new l1();
            Context context = this.f31362t;
            String str = this.f31361s;
            String str2 = this.f31363u;
            long currentTimeMillis = System.currentTimeMillis();
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
            synchronized (d10.f22585a) {
                d10.G(str).edit().putLong("last_preload_interstitial_time", currentTimeMillis).commit();
            }
            Pair c02 = androidx.activity.n.c0(context, str);
            if (c02 != null) {
                adSlotParam.C((String) c02.first);
                adSlotParam.D(((Boolean) c02.second).booleanValue());
            }
            ad adVar = new ad(context);
            adVar.f = str2;
            adVar.g(str, adVar.h(str, adSlotParam, false), new n1.a(str2), 12, currentTimeMillis, true);
            l1Var.e(null);
        }
    }
}
