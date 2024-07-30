package b9;

import android.content.Intent;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;

/* compiled from: EventDetailActivity.java */
/* loaded from: classes2.dex */
public final class n implements h9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EventDetailActivity f3156a;

    public n(EventDetailActivity eventDetailActivity) {
        this.f3156a = eventDetailActivity;
    }

    @Override // h9.b
    public final void a() {
        EventDetailActivity eventDetailActivity = this.f3156a;
        eventDetailActivity.startActivity(new Intent(eventDetailActivity, (Class<?>) WatchActivity.class).putExtra("ChannelLink", eventDetailActivity.f21483u));
    }
}
