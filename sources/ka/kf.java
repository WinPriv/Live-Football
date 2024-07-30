package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;

/* loaded from: classes2.dex */
public final class kf implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TemplateData f31389s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f31390t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31391u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f31392v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f31393w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ lf f31394x;

    public kf(lf lfVar, TemplateData templateData, long j10, ContentRecord contentRecord, int i10, int i11) {
        this.f31394x = lfVar;
        this.f31389s = templateData;
        this.f31390t = j10;
        this.f31391u = contentRecord;
        this.f31392v = i10;
        this.f31393w = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam;
        TemplateData templateData = this.f31389s;
        if (templateData != null && !androidx.transition.n.M(templateData.p())) {
            for (MotionData motionData : templateData.p()) {
                lf lfVar = this.f31394x;
                lfVar.getClass();
                if (motionData == null) {
                    sourceParam = null;
                } else {
                    sourceParam = new SourceParam();
                    sourceParam.n(motionData.k());
                    sourceParam.k(motionData.h());
                    sourceParam.l(true);
                    sourceParam.o(true);
                    sourceParam.t("tplate");
                    sourceParam.g(Long.valueOf(this.f31390t));
                }
                ContentRecord contentRecord = this.f31391u;
                sourceParam.e(contentRecord);
                if (motionData != null) {
                    contentRecord.getClass();
                    if (lfVar.x(null, null, motionData.k(), sourceParam)) {
                        return;
                    }
                }
                if (lfVar.n(this.f31392v, contentRecord.h1())) {
                    sourceParam.s();
                    sourceParam.f(Integer.valueOf(com.huawei.openalliance.ad.ppskit.utils.i2.d(this.f31393w)));
                    lfVar.t(contentRecord, sourceParam);
                }
            }
        }
    }
}
