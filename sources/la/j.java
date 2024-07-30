package la;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32574s;

    public j(PPSActivity pPSActivity) {
        this.f32574s = pPSActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PPSActivity pPSActivity = this.f32574s;
        pPSActivity.getClass();
        n7.e("PPSActivity", "onClose");
        pPSActivity.finishAndRemoveTask();
    }
}
