package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdTimeStatistics;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.List;

/* loaded from: classes2.dex */
public final class gd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam f31215s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31216t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31217u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f31218v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ad f31219w;

    public gd(ad adVar, AdSlotParam adSlotParam, String str, String str2, int i10) {
        this.f31219w = adVar;
        this.f31215s = adSlotParam;
        this.f31216t = str;
        this.f31217u = str2;
        this.f31218v = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size;
        Integer num;
        int i10;
        o c10;
        ad adVar = this.f31219w;
        u uVar = new u(adVar.f30934a);
        uVar.f31723b = adVar.f;
        AdSlotParam adSlotParam = this.f31215s;
        List<String> v3 = adSlotParam.v();
        if (androidx.transition.n.M(v3)) {
            size = 0;
        } else {
            size = v3.size();
        }
        if (adSlotParam.W() > 0) {
            num = Integer.valueOf(adSlotParam.W());
        } else {
            num = null;
        }
        boolean R = adSlotParam.R();
        AdTimeStatistics adTimeStatistics = new AdTimeStatistics();
        DelayInfo delayInfo = adVar.f30939g;
        adTimeStatistics.b(delayInfo.E().a());
        adTimeStatistics.m(delayInfo.E().l());
        adTimeStatistics.o(delayInfo.E().n());
        adTimeStatistics.f(delayInfo.E().e());
        adTimeStatistics.d(delayInfo.E().c());
        String str = this.f31216t;
        String str2 = this.f31217u;
        Context context = uVar.f31722a;
        try {
            if (ConfigSpHandler.b(context).m() && (i10 = this.f31218v) != 16 && (c10 = uVar.c(str, true)) != null) {
                c10.f31525a = "113";
                c10.f31567t = str2;
                c10.b(i10);
                c10.T = Integer.valueOf(!R ? 1 : 0);
                c10.N0 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, adTimeStatistics);
                c10.E = String.valueOf(size);
                if (num != null) {
                    c10.F = String.valueOf(num);
                }
                new ke(context, zh.a(i10, context), null).t(str, c10, false, false);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onAdCounting:", "AnalysisReport");
        }
    }
}
