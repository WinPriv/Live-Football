package la;

import android.content.DialogInterface;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import com.huawei.openalliance.ad.ppskit.utils.p0;

/* loaded from: classes2.dex */
public final class p implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32580s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32581t;

    public p(PPSActivity pPSActivity, int i10) {
        this.f32581t = pPSActivity;
        this.f32580s = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        p0 p0Var = this.f32581t.M;
        if (p0Var != null) {
            if (this.f32580s == 11) {
                p0Var.d(false, true);
            } else {
                p0Var.i(false, true);
            }
        }
    }
}
