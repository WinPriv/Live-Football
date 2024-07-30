package x8;

import android.app.Dialog;
import android.view.View;
import com.hamkho.livefoot.Activities.FootballScores.AllLeagues.LeagueDetails;
import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;
import com.hamkho.livefoot.Activities.MainActivity;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.LiveMainHolder;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import u8.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f36506s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f36507t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f36506s = i10;
        this.f36507t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f36506s;
        Object obj = this.f36507t;
        switch (i10) {
            case 0:
                int i11 = LeagueDetails.f21435z;
                ((LeagueDetails) obj).onBackPressed();
                return;
            case 1:
                int i12 = MatchDetails.I;
                ((MatchDetails) obj).onBackPressed();
                return;
            case 2:
                MainActivity mainActivity = (MainActivity) obj;
                int i13 = MainActivity.f21463z;
                mainActivity.getClass();
                t8.a.g(mainActivity, new c(mainActivity));
                return;
            case 3:
                int i14 = ChannelDetailActivity.B;
                ((Dialog) obj).dismiss();
                return;
            case 4:
                int i15 = LiveMainHolder.f21490t;
                ((LiveMainHolder) obj).onBackPressed();
                return;
            default:
                WatchActivity.c((WatchActivity) obj);
                return;
        }
    }
}
