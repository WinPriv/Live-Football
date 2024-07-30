package b9;

import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.huawei.hms.ads.AdListener;

/* compiled from: ChannelDetailActivity.java */
/* loaded from: classes2.dex */
public final class i extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChannelDetailActivity f3148a;

    public i(ChannelDetailActivity channelDetailActivity) {
        this.f3148a = channelDetailActivity;
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdFailed(int i10) {
        ChannelDetailActivity channelDetailActivity = this.f3148a;
        channelDetailActivity.f21470s.f32955g.b();
        channelDetailActivity.f21470s.f32955g.setVisibility(8);
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdLoaded() {
    }
}
