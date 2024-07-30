package la;

import android.content.DialogInterface;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;

/* loaded from: classes2.dex */
public final class m implements DialogInterface.OnCancelListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32577s;

    public m(PPSActivity pPSActivity) {
        this.f32577s = pPSActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        PPSActivity pPSActivity = this.f32577s;
        pPSActivity.Z = false;
        pPSActivity.Y = null;
        pPSActivity.v("130");
    }
}
