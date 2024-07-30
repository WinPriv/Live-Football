package fa;

import com.huawei.hms.ads.cz;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map f28292s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f28293t;

    public r(s sVar, HashMap hashMap) {
        this.f28293t = sVar;
        this.f28292s = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f28293t;
        ga.l lVar = sVar.f28297d;
        sVar.f28305m = System.currentTimeMillis();
        if (lVar != null) {
            lVar.Code(this.f28292s);
        }
        cz.Code(sVar.f28295b, 200, sVar.f28303k, 60, this.f28292s, sVar.f28304l, sVar.f28305m, sVar.f28306n);
    }
}
