package x9;

import android.view.View;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.activity.FeedbackActivity;

/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FeedbackActivity f36511s;

    public d(FeedbackActivity feedbackActivity) {
        this.f36511s = feedbackActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FeedbackActivity feedbackActivity = this.f36511s;
        try {
            cz.Code(feedbackActivity, feedbackActivity.y, "3");
        } catch (Throwable th) {
            ex.I("FeedbackActivity", "onClick error: %s", th.getClass().getSimpleName());
        }
        feedbackActivity.finish();
    }
}
