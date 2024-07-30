package b9;

import android.app.ProgressDialog;
import android.content.Intent;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import com.huawei.hms.ads.reward.Reward;
import com.huawei.hms.ads.reward.RewardAdStatusListener;

/* compiled from: ChannelDetailActivity.java */
/* loaded from: classes2.dex */
public final class d extends RewardAdStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProgressDialog f3137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelDetailActivity f3138b;

    /* compiled from: ChannelDetailActivity.java */
    /* loaded from: classes2.dex */
    public class a implements h9.b {
        public a() {
        }

        @Override // h9.b
        public final void a() {
            d dVar = d.this;
            dVar.f3138b.startActivity(new Intent(dVar.f3138b, (Class<?>) WatchActivity.class).putExtra("ChannelLink", dVar.f3138b.f21472u));
        }
    }

    public d(ChannelDetailActivity channelDetailActivity, ProgressDialog progressDialog) {
        this.f3138b = channelDetailActivity;
        this.f3137a = progressDialog;
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewardAdClosed() {
        ChannelDetailActivity channelDetailActivity = this.f3138b;
        channelDetailActivity.startActivity(new Intent(channelDetailActivity, (Class<?>) WatchActivity.class).putExtra("ChannelLink", channelDetailActivity.f21472u));
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewardAdFailedToShow(int i10) {
        this.f3137a.dismiss();
        t8.a.g(this.f3138b, new a());
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewardAdOpened() {
        this.f3137a.dismiss();
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewarded(Reward reward) {
    }
}
