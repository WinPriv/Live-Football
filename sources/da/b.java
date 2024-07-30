package da;

import ca.a;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppInfo f27528s;

    public b(AppInfo appInfo) {
        this.f27528s = appInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ca.a aVar = a.C0042a.f3471a;
        if (aVar != null) {
            aVar.Code(this.f27528s);
        }
    }
}
