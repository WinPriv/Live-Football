package com.anythink.basead.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.material.textfield.m;
import com.hamkho.livefoot.Activities.CricketScores.CricketMainActivity;
import com.hamkho.livefoot.Activities.FootballScores.AllLeagues.LeaguesListActivity;
import com.hamkho.livefoot.Activities.MainActivity;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelsListActivity;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import com.hamkho.livefoot.Activities.UpdateActivity;
import t8.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4496s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4497t;

    public /* synthetic */ e(Object obj, int i10) {
        this.f4496s = i10;
        this.f4497t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f4496s;
        Object obj = this.f4497t;
        switch (i10) {
            case 0:
                ((PlayerView) obj).a(view);
                return;
            case 1:
                ((m) obj).u();
                return;
            case 2:
                int i11 = CricketMainActivity.f21433t;
                ((CricketMainActivity) obj).onBackPressed();
                return;
            case 3:
                int i12 = LeaguesListActivity.f21443x;
                ((LeaguesListActivity) obj).onBackPressed();
                return;
            case 4:
                int i13 = MainActivity.f21463z;
                ((MainActivity) obj).c();
                return;
            case 5:
                int i14 = ChannelsListActivity.f21477v;
                ((ChannelsListActivity) obj).onBackPressed();
                return;
            case 6:
                WatchActivity watchActivity = (WatchActivity) obj;
                int i15 = WatchActivity.I;
                if (watchActivity.getResources().getConfiguration().orientation == 1) {
                    watchActivity.setRequestedOrientation(0);
                    watchActivity.f21494u.V(5, watchActivity.f21494u.getCurrentPosition());
                    return;
                } else {
                    watchActivity.setRequestedOrientation(1);
                    watchActivity.f21494u.V(5, watchActivity.f21494u.getCurrentPosition());
                    return;
                }
            default:
                UpdateActivity updateActivity = (UpdateActivity) obj;
                int i16 = UpdateActivity.f21502t;
                updateActivity.getClass();
                updateActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(l.f35592c.c())));
                return;
        }
    }
}
