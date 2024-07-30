package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.io.File;

/* loaded from: classes2.dex */
public final class nc implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31508s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oc f31509t;

    public nc(oc ocVar, String str) {
        this.f31509t = ocVar;
        this.f31508s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoInfo h02;
        String str = this.f31508s;
        File file = new File(str);
        if (!com.huawei.openalliance.ad.ppskit.utils.x.i(file)) {
            return;
        }
        oc ocVar = this.f31509t;
        Object obj = ocVar.f32660t;
        if (((ContentRecord) obj) == null) {
            h02 = null;
        } else {
            h02 = ((ContentRecord) obj).h0();
        }
        if (h02 != null && com.huawei.openalliance.ad.ppskit.utils.x.j(h02.u(), file)) {
            return;
        }
        n7.e("RewardAdPresenter", "delete invalid cacheFile.");
        com.huawei.openalliance.ad.ppskit.utils.x.f(ocVar.f31607v, str, "normal");
        com.huawei.openalliance.ad.ppskit.utils.x.f(ocVar.f31607v, str, "insre");
    }
}
