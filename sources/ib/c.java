package ib;

import com.huawei.openalliance.ad.ppskit.views.web.NetworkLoadStatusView;
import com.huawei.opendevice.open.BaseWebActivity;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BaseWebActivity f29471s;

    public c(BaseWebActivity baseWebActivity) {
        this.f29471s = baseWebActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        BaseWebActivity baseWebActivity = this.f29471s;
        if (baseWebActivity.f24184t != null) {
            boolean z10 = com.huawei.openalliance.ad.ppskit.utils.m.z(baseWebActivity);
            NetworkLoadStatusView networkLoadStatusView = baseWebActivity.f24184t;
            if (!z10) {
                i10 = -2;
            } else {
                i10 = -1;
            }
            networkLoadStatusView.setState(i10);
        }
    }
}
