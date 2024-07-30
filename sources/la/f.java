package la;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.LandingDetailsActivity;

/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LandingDetailsActivity f32570s;

    public f(LandingDetailsActivity landingDetailsActivity) {
        this.f32570s = landingDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f32570s.finish();
    }
}
