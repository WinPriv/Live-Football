package ka;

import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class ze implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdContentData f32250s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f32251t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f32252u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f32253v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ af f32254w;

    public ze(af afVar, AdContentData adContentData, long j10, ContentRecord contentRecord, String str) {
        this.f32254w = afVar;
        this.f32250s = adContentData;
        this.f32251t = j10;
        this.f32252u = contentRecord;
        this.f32253v = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoInfo videoInfo;
        List<ImageInfo> list;
        ImageInfo imageInfo;
        AdContentData adContentData = this.f32250s;
        MetaData x10 = adContentData.x();
        af afVar = this.f32254w;
        afVar.getClass();
        if (x10 != null) {
            videoInfo = x10.K();
        } else {
            videoInfo = null;
        }
        if (x10 != null) {
            list = x10.h0();
        } else {
            list = null;
        }
        boolean z10 = false;
        if (!androidx.transition.n.M(list)) {
            imageInfo = list.get(0);
        } else {
            imageInfo = null;
        }
        if (af.d(afVar, videoInfo, imageInfo) && af.c(this.f32254w, x10, this.f32251t, this.f32252u, videoInfo, imageInfo)) {
            String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, x10);
            ContentRecord contentRecord = this.f32252u;
            contentRecord.G1(q10);
            adContentData.u(contentRecord.c());
            afVar.f30958e.r(contentRecord);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList(1);
            afVar.o.getAndIncrement();
            if (afVar.f30966n == afVar.o.intValue()) {
                z10 = true;
            }
            adContentData.w(z10);
            arrayList.add(adContentData);
            afVar.b(this.f32253v, arrayList, hashMap);
            afVar.f30955b.a(hashMap);
        }
    }
}
