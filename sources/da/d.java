package da;

import android.util.Pair;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.download.app.PPSAppDownloadManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSAppDownloadManager f27530s;

    public d(PPSAppDownloadManager pPSAppDownloadManager) {
        this.f27530s = pPSAppDownloadManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = this.f27530s.f22188b;
        if (!a0.a.r(hashMap)) {
            ex.Code("PPSAppDownloadManager", "clean invalid uniqueId");
            try {
                Set<Map.Entry> entrySet = hashMap.entrySet();
                if (entrySet != null) {
                    for (Map.Entry entry : entrySet) {
                        if (entry != null && entry.getValue() != null && ((Pair) entry.getValue()).second != null && System.currentTimeMillis() - ((Long) ((Pair) entry.getValue()).second).longValue() > 86400000) {
                            hashMap.remove(entry.getKey());
                        }
                    }
                }
            } catch (Throwable th) {
                ex.I("PPSAppDownloadManager", "clear uniqueIdMap ex: %s", th.getClass().getSimpleName());
            }
        }
    }
}
