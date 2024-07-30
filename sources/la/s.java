package la;

import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;
import com.huawei.openalliance.ad.ppskit.utils.w1;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.File;
import ka.n7;

/* loaded from: classes2.dex */
public final class s implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSArActivity f32585s;

    public s(PPSArActivity pPSArActivity) {
        this.f32585s = pPSArActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(w1.c(this.f32585s.f22377v.createDeviceProtectedStorageContext()));
        String str = File.separator;
        String q10 = a3.l.q(j10, str, "pps", str, "xrinfo");
        if (n7.d()) {
            n7.c("PPSArActivity", "delete file:%s", q10);
        }
        if (!y1.h(q10)) {
            com.huawei.openalliance.ad.ppskit.utils.x.y(new File(q10));
        }
    }
}
