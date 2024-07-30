package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;

/* loaded from: classes2.dex */
public final class ei implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MotionData f31147s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o6 f31148t;

    public ei(MotionData motionData, com.huawei.openalliance.ad.ppskit.handlers.i0 i0Var) {
        this.f31147s = motionData;
        this.f31148t = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam;
        MotionData motionData = this.f31147s;
        if (motionData == null) {
            sourceParam = null;
        } else {
            SourceParam sourceParam2 = new SourceParam();
            sourceParam2.n(motionData.k());
            sourceParam2.k(motionData.h());
            sourceParam2.l(true);
            sourceParam2.o(true);
            sourceParam2.t("tplate");
            sourceParam = sourceParam2;
        }
        e6.c f = ((com.huawei.openalliance.ad.ppskit.handlers.i0) this.f31148t).f(sourceParam);
        if (f == null || TextUtils.isEmpty(f.f27764a)) {
            n7.f("TDownloadUtil", "down motion failed %s", f);
        }
    }
}
