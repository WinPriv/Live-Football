package ka;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import ka.n1;

/* loaded from: classes2.dex */
public final class m1 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31440s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f31441t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31442u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f31443v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f31444w;

    public m1(Context context, int i10, String str, String str2, String str3) {
        this.f31440s = str;
        this.f31441t = context;
        this.f31442u = str2;
        this.f31443v = str3;
        this.f31444w = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdSlotParam adSlotParam = n1.f31473c.get(this.f31440s);
        if (adSlotParam != null) {
            n1 n1Var = new n1();
            Context context = this.f31441t;
            String str = this.f31440s;
            String str2 = this.f31442u;
            String str3 = this.f31443v;
            int i10 = this.f31444w;
            long currentTimeMillis = System.currentTimeMillis();
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
            synchronized (d10.f22585a) {
                d10.G(str).edit().putLong("last_preload_native_time", currentTimeMillis).commit();
            }
            Pair c02 = androidx.activity.n.c0(context, str);
            if (c02 != null) {
                adSlotParam.C((String) c02.first);
                adSlotParam.D(((Boolean) c02.second).booleanValue());
            }
            ad adVar = new ad(context);
            adVar.f = str2;
            adVar.g(str, adVar.e(str, adSlotParam, str3, i10, null), new n1.a(str2), i10, currentTimeMillis, true);
            n1Var.e(null);
        }
    }
}
