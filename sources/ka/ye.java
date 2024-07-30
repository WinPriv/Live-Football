package ka;

import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.List;

/* loaded from: classes2.dex */
public final class ye implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdContentData f32226s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f32227t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f32228u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ af f32229v;

    public ye(af afVar, AdContentData adContentData, long j10, ContentRecord contentRecord) {
        this.f32229v = afVar;
        this.f32226s = adContentData;
        this.f32227t = j10;
        this.f32228u = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoInfo videoInfo;
        List<ImageInfo> list;
        MetaData x10 = this.f32226s.x();
        af afVar = this.f32229v;
        afVar.getClass();
        ImageInfo imageInfo = null;
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
        if (!androidx.transition.n.M(list)) {
            imageInfo = list.get(0);
        }
        ImageInfo imageInfo2 = imageInfo;
        if (af.d(afVar, videoInfo, imageInfo2) && af.c(this.f32229v, x10, this.f32227t, this.f32228u, videoInfo, imageInfo2)) {
            afVar.f30958e.r(this.f32228u);
            n7.b("NativeAdProcessor", "directCacheVideo success");
        }
    }
}
