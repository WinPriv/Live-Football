package ja;

import android.content.Intent;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.msgnotify.NotifyCallback;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NotifyCallback f30186s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f30187t = bi.B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Intent f30188u;

    public a(NotifyCallback notifyCallback, Intent intent) {
        this.f30186s = notifyCallback;
        this.f30188u = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30186s.onMessageNotify(this.f30187t, this.f30188u);
    }
}
