package la;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import com.huawei.openalliance.ad.ppskit.utils.p0;

/* loaded from: classes2.dex */
public final class q implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32582s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32583t;

    public q(PPSActivity pPSActivity, int i10) {
        this.f32583t = pPSActivity;
        this.f32582s = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = PPSActivity.f22351i0;
        PPSActivity pPSActivity = this.f32583t;
        pPSActivity.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(WiseOpenHianalyticsData.UNION_PACKAGE, pPSActivity.getPackageName(), null));
        pPSActivity.startActivity(intent);
        dialogInterface.dismiss();
        p0 p0Var = pPSActivity.M;
        if (p0Var != null) {
            if (this.f32582s == 11) {
                p0Var.d(false, false);
            } else {
                p0Var.i(false, false);
            }
        }
    }
}
