package ya;

import com.huawei.openalliance.ad.ppskit.provider.BaseContentProvider;
import com.huawei.openalliance.ad.ppskit.provider.a;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BaseContentProvider f36872s;

    public a(BaseContentProvider baseContentProvider) {
        this.f36872s = baseContentProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseContentProvider baseContentProvider = this.f36872s;
        baseContentProvider.f22790s = a.b.c(baseContentProvider.getContext(), baseContentProvider.f22791t);
    }
}
