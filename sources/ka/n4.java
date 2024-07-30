package ka;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class n4 extends b3.c {

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.l f31481b;

    public n4(Context context) {
        super(1);
        this.f31481b = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
    }

    @Override // b3.c
    public final boolean c(String str) {
        long j10;
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis();
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = this.f31481b;
        synchronized (lVar.f22585a) {
            j10 = lVar.G(str).getLong("no_show_ad_time", 0L);
        }
        if (j10 >= currentTimeMillis) {
            n7.e("AppDayFcRule", "disturb is triggered");
            return true;
        }
        return e(str);
    }
}
