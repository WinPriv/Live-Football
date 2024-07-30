package n9;

import android.content.Context;
import com.huawei.android.hms.ppskit.PpsCoreService;
import com.huawei.hag.abilitykit.api.KitSdkManager;
import com.huawei.openalliance.ad.ppskit.handlers.x;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.g;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import com.huawei.openalliance.ad.ppskit.utils.x1;
import ka.n7;
import ka.x9;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PpsCoreService f33475s;

    public a(PpsCoreService ppsCoreService) {
        this.f33475s = ppsCoreService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PpsCoreService ppsCoreService = this.f33475s;
        x9.a(ppsCoreService.getApplicationContext()).c(ppsCoreService.getPackageName());
        x1.a(ppsCoreService);
        q1.m(ppsCoreService).u();
        Context applicationContext = ppsCoreService.getApplicationContext();
        if (!d0.m(applicationContext)) {
            a0.a.r0(applicationContext);
        }
        g.h(ppsCoreService);
        if (x.i()) {
            n7.f("PpsCoreService", "init abilitySDK retCode is %s", Integer.valueOf(KitSdkManager.getInstance().initSync(applicationContext)));
        }
    }
}
