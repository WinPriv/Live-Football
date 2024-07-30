package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;

/* loaded from: classes2.dex */
public final class sg implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31850s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f31851t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ tg f31852u;

    public sg(tg tgVar, ContentRecord contentRecord, long j10) {
        this.f31852u = tgVar;
        this.f31850s = contentRecord;
        this.f31851t = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam;
        ContentRecord contentRecord = this.f31850s;
        if (contentRecord != null && contentRecord.c1() != null) {
            tg tgVar = this.f31852u;
            if (tgVar.d()) {
                if ((1 == tgVar.f31907h || tgVar.f) && !androidx.transition.n.M(contentRecord.c1().p())) {
                    for (MotionData motionData : contentRecord.c1().p()) {
                        if (motionData == null) {
                            sourceParam = null;
                        } else {
                            SourceParam sourceParam2 = new SourceParam();
                            sourceParam2.n(motionData.k());
                            sourceParam2.k(motionData.h());
                            sourceParam2.l(true);
                            sourceParam2.o(true);
                            sourceParam2.t("tplate");
                            sourceParam2.g(Long.valueOf(this.f31851t));
                            sourceParam = sourceParam2;
                        }
                        sourceParam.e(contentRecord);
                        tgVar.e(contentRecord, sourceParam);
                    }
                }
            }
        }
    }
}
