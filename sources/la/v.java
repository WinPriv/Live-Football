package la;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.PPSFullScreenNotifyActivity;
import com.huawei.openalliance.ad.ppskit.utils.y1;

/* loaded from: classes2.dex */
public final class v implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyActivity f32588s;

    public v(PPSFullScreenNotifyActivity pPSFullScreenNotifyActivity) {
        this.f32588s = pPSFullScreenNotifyActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSFullScreenNotifyActivity pPSFullScreenNotifyActivity = this.f32588s;
        if (1 == pPSFullScreenNotifyActivity.I) {
            ka.w wVar = new ka.w();
            wVar.f32042e = y1.d(1);
            pPSFullScreenNotifyActivity.c("2", wVar);
            pPSFullScreenNotifyActivity.d();
        }
    }
}
