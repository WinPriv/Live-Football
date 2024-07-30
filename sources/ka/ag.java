package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ag implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EventRecord f30967s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f30968t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zf f30969u;

    public ag(zf zfVar, EventRecord eventRecord, ContentRecord contentRecord) {
        this.f30969u = zfVar;
        this.f30967s = eventRecord;
        this.f30968t = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zf zfVar = this.f30969u;
        hg hgVar = new hg(zfVar.f32255a, zfVar.f32257c);
        ArrayList arrayList = new ArrayList();
        EventRecord eventRecord = this.f30967s;
        arrayList.add(new wh(eventRecord));
        arrayList.add(new yh(eventRecord));
        hgVar.f = new ArrayList(arrayList);
        String i10 = eventRecord.i();
        Context context = hgVar.f31256a;
        ContentRecord contentRecord = this.f30968t;
        ArrayList a10 = hg.a(context, contentRecord, i10);
        if (!androidx.transition.n.M(a10)) {
            if (n7.d()) {
                n7.c("ThirdMonitorReporter", "reportThirdMonitor, eventType: %s, monitors: %s", i10, com.huawei.openalliance.ad.ppskit.utils.y1.j(com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a10)));
            }
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new fg(hgVar, a10, i10, contentRecord), 1);
        }
    }
}
