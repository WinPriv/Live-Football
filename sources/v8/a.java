package v8;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import b9.d;
import b9.e;
import b9.n;
import b9.u;
import com.hamkho.livefoot.Activities.CricketScores.CricketMainActivity;
import com.hamkho.livefoot.Activities.FootballScores.MainFootballScores;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f35994s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Dialog f35995t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f35996u;

    public /* synthetic */ a(AppCompatActivity appCompatActivity, Dialog dialog, int i10) {
        this.f35994s = i10;
        this.f35996u = appCompatActivity;
        this.f35995t = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f35994s;
        Dialog dialog = this.f35995t;
        AppCompatActivity appCompatActivity = this.f35996u;
        switch (i10) {
            case 0:
                CricketMainActivity cricketMainActivity = (CricketMainActivity) appCompatActivity;
                int i11 = CricketMainActivity.f21433t;
                cricketMainActivity.getClass();
                dialog.dismiss();
                cricketMainActivity.onBackPressed();
                return;
            case 1:
                MainFootballScores mainFootballScores = (MainFootballScores) appCompatActivity;
                int i12 = MainFootballScores.f21461t;
                mainFootballScores.getClass();
                dialog.dismiss();
                mainFootballScores.onBackPressed();
                return;
            case 2:
                ChannelDetailActivity channelDetailActivity = (ChannelDetailActivity) appCompatActivity;
                int i13 = ChannelDetailActivity.B;
                channelDetailActivity.getClass();
                ProgressDialog progressDialog = new ProgressDialog(channelDetailActivity);
                progressDialog.setMessage("Loading Video Ad .");
                progressDialog.show();
                if (channelDetailActivity.f21471t.isLoaded()) {
                    channelDetailActivity.f21471t.show(channelDetailActivity, new d(channelDetailActivity, progressDialog));
                } else {
                    progressDialog.dismiss();
                    t8.a.g(channelDetailActivity, new e(channelDetailActivity));
                }
                dialog.dismiss();
                return;
            default:
                EventDetailActivity eventDetailActivity = (EventDetailActivity) appCompatActivity;
                int i14 = EventDetailActivity.B;
                eventDetailActivity.getClass();
                ProgressDialog progressDialog2 = new ProgressDialog(eventDetailActivity);
                progressDialog2.setMessage("Loading Video Ad .");
                progressDialog2.show();
                if (eventDetailActivity.f21482t.isLoaded()) {
                    eventDetailActivity.f21482t.show(eventDetailActivity, new u(eventDetailActivity, progressDialog2));
                } else {
                    progressDialog2.dismiss();
                    t8.a.g(eventDetailActivity, new n(eventDetailActivity));
                }
                dialog.dismiss();
                return;
        }
    }
}
