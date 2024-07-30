package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.AnalysisEventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ClickEventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventMonitorRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ImpEventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ThirdPartyEventRecord;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class xh implements gi {

    /* renamed from: a, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.s f32201a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f32202b;

    public xh(Context context) {
        this.f32202b = context.getApplicationContext();
        this.f32201a = new com.huawei.openalliance.ad.ppskit.handlers.s(context);
    }

    @Override // ka.gi
    public final void d(String str) {
        long a10 = a(str);
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis() - a10;
        int a11 = a();
        com.huawei.openalliance.ad.ppskit.handlers.s sVar = this.f32201a;
        sVar.getClass();
        sVar.j(EventRecord.class, 3, new String[]{String.valueOf(currentTimeMillis), String.valueOf(a11)});
        sVar.j(ImpEventRecord.class, 3, new String[]{String.valueOf(currentTimeMillis), String.valueOf(a11)});
        sVar.j(ClickEventRecord.class, 3, new String[]{String.valueOf(currentTimeMillis), String.valueOf(a11)});
        sVar.j(AnalysisEventRecord.class, 3, new String[]{String.valueOf(currentTimeMillis), String.valueOf(a11)});
        sVar.j(ThirdPartyEventRecord.class, 4, new String[]{String.valueOf(currentTimeMillis), String.valueOf(a11)});
        sVar.j(EventMonitorRecord.class, 44, new String[]{String.valueOf(currentTimeMillis), String.valueOf(a11)});
    }

    @Override // ka.gi
    public void b(String str) {
    }

    @Override // ka.gi
    public void c(String str) {
    }
}
