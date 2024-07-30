package la;

import com.huawei.openalliance.ad.ppskit.activity.PPSFullScreenNotifyActivity;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyActivity f32589s;

    public w(PPSFullScreenNotifyActivity pPSFullScreenNotifyActivity) {
        this.f32589s = pPSFullScreenNotifyActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32589s.finish();
    }
}
