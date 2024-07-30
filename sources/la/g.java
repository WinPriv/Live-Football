package la;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.LandingDetailsActivity;

/* loaded from: classes2.dex */
public final class g implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LandingDetailsActivity f32571s;

    public g(LandingDetailsActivity landingDetailsActivity) {
        this.f32571s = landingDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f32571s.finish();
    }
}
