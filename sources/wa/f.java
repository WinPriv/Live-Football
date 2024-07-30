package wa;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.views.VideoView;

/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.linked.view.d f36191s;

    public f(com.huawei.openalliance.ad.ppskit.linked.view.d dVar) {
        this.f36191s = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.huawei.openalliance.ad.ppskit.linked.view.d dVar = this.f36191s;
        VideoView videoView = dVar.f22692v;
        if (videoView != null) {
            dVar.X.onClick(videoView);
            dVar.H();
            dVar.F();
            dVar.f();
        }
    }
}
