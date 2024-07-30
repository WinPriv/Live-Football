package z8;

import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;
import com.huawei.hms.ads.AdListener;

/* compiled from: MatchDetails.java */
/* loaded from: classes2.dex */
public final class e extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MatchDetails f37338a;

    public e(MatchDetails matchDetails) {
        this.f37338a = matchDetails;
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdFailed(int i10) {
        MatchDetails matchDetails = this.f37338a;
        matchDetails.f21452s.f33003i.b();
        matchDetails.f21452s.f33003i.setVisibility(8);
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdLoaded() {
    }
}
