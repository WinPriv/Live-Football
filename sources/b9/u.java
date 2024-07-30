package b9;

import android.app.ProgressDialog;
import android.content.Intent;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import com.huawei.hms.ads.reward.Reward;
import com.huawei.hms.ads.reward.RewardAdStatusListener;

/* compiled from: EventDetailActivity.java */
/* loaded from: classes2.dex */
public final class u extends RewardAdStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProgressDialog f3168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventDetailActivity f3169b;

    /* compiled from: EventDetailActivity.java */
    /* loaded from: classes2.dex */
    public class a implements h9.b {
        public a() {
        }

        @Override // h9.b
        public final void a() {
            u uVar = u.this;
            uVar.f3169b.startActivity(new Intent(uVar.f3169b, (Class<?>) WatchActivity.class).putExtra("ChannelLink", uVar.f3169b.f21483u));
        }
    }

    public u(EventDetailActivity eventDetailActivity, ProgressDialog progressDialog) {
        this.f3169b = eventDetailActivity;
        this.f3168a = progressDialog;
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewardAdClosed() {
        EventDetailActivity eventDetailActivity = this.f3169b;
        eventDetailActivity.startActivity(new Intent(eventDetailActivity, (Class<?>) WatchActivity.class).putExtra("ChannelLink", eventDetailActivity.f21483u));
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewardAdFailedToShow(int i10) {
        this.f3168a.dismiss();
        t8.a.g(this.f3169b, new a());
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewardAdOpened() {
        this.f3168a.dismiss();
    }

    @Override // com.huawei.hms.ads.reward.RewardAdStatusListener
    public final void onRewarded(Reward reward) {
    }
}
