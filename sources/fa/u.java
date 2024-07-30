package fa;

import com.huawei.hms.ads.cz;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map f28319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f28320t;

    public u(v vVar, HashMap hashMap) {
        this.f28320t = vVar;
        this.f28319s = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f28320t;
        ga.m mVar = vVar.f28324d;
        vVar.f28332m = System.currentTimeMillis();
        if (mVar != null) {
            mVar.Code(this.f28319s);
        }
        cz.Code(vVar.f28321a, 200, vVar.f28330k, 7, this.f28319s, vVar.f28331l, vVar.f28332m, vVar.f28333n);
    }
}
