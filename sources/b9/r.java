package b9;

import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;
import com.huawei.hms.ads.AdListener;

/* compiled from: EventDetailActivity.java */
/* loaded from: classes2.dex */
public final class r extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EventDetailActivity f3164a;

    public r(EventDetailActivity eventDetailActivity) {
        this.f3164a = eventDetailActivity;
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdFailed(int i10) {
        EventDetailActivity eventDetailActivity = this.f3164a;
        eventDetailActivity.f21481s.f32964e.b();
        eventDetailActivity.f21481s.f32964e.setVisibility(8);
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdLoaded() {
    }
}
