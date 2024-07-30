package wa;

import com.huawei.openalliance.ad.ppskit.linked.view.LinkedLandView;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinkedLandView f36190s;

    public c(LinkedLandView linkedLandView) {
        this.f36190s = linkedLandView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedLandView linkedLandView = this.f36190s;
        linkedLandView.y = linkedLandView.f22673x.getHeight();
        int i10 = linkedLandView.y;
        if (i10 > 0) {
            linkedLandView.f22672w.setPaddingRelative(0, i10, 0, 0);
        }
    }
}
