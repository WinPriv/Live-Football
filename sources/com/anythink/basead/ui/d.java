package com.anythink.basead.ui;

import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import com.hamkho.livefoot.Activities.FootballScores.AllLeagues.LeaguesListActivity;
import com.hamkho.livefoot.Activities.FootballScores.MainFootballScores;
import com.hamkho.livefoot.Activities.MainActivity;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4494s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f4495t;

    public /* synthetic */ d(KeyEvent.Callback callback, int i10) {
        this.f4494s = i10;
        this.f4495t = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f4494s;
        KeyEvent.Callback callback = this.f4495t;
        switch (i10) {
            case 0:
                ((PlayerView) callback).a(view);
                return;
            case 1:
                int i11 = LeaguesListActivity.f21443x;
                ((LeaguesListActivity) callback).onBackPressed();
                return;
            case 2:
                int i12 = MainFootballScores.f21461t;
                ((MainFootballScores) callback).onBackPressed();
                return;
            case 3:
                MainActivity mainActivity = (MainActivity) callback;
                int i13 = MainActivity.f21463z;
                mainActivity.getClass();
                t8.a.g(mainActivity, new u8.c(mainActivity));
                return;
            case 4:
                int i14 = ChannelDetailActivity.B;
                ((ChannelDetailActivity) callback).onBackPressed();
                return;
            default:
                int i15 = EventDetailActivity.B;
                ((Dialog) callback).dismiss();
                return;
        }
    }
}
