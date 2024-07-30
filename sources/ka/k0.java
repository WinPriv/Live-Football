package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k0 implements Callable<ContentRecord> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f31358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdContentData f31360c;

    public k0(Context context, String str, AdContentData adContentData) {
        this.f31358a = context;
        this.f31359b = str;
        this.f31360c = adContentData;
    }

    @Override // java.util.concurrent.Callable
    public final ContentRecord call() {
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = new com.huawei.openalliance.ad.ppskit.handlers.e0(this.f31358a);
        AdContentData adContentData = this.f31360c;
        return e0Var.n(this.f31359b, adContentData.B(), adContentData.A());
    }
}
