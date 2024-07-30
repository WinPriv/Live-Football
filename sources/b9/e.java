package b9;

import android.content.Intent;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;

/* compiled from: ChannelDetailActivity.java */
/* loaded from: classes2.dex */
public final class e implements h9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChannelDetailActivity f3140a;

    public e(ChannelDetailActivity channelDetailActivity) {
        this.f3140a = channelDetailActivity;
    }

    @Override // h9.b
    public final void a() {
        ChannelDetailActivity channelDetailActivity = this.f3140a;
        channelDetailActivity.startActivity(new Intent(channelDetailActivity, (Class<?>) WatchActivity.class).putExtra("ChannelLink", channelDetailActivity.f21472u));
    }
}
