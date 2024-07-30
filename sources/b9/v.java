package b9;

import android.app.Dialog;
import android.view.View;
import android.widget.Toast;
import cn.iwgang.countdownview.CountdownView;
import com.google.android.material.textfield.TextInputLayout;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import io.paperdb.Paper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3171s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WatchActivity f3172t;

    public /* synthetic */ v(WatchActivity watchActivity, int i10) {
        this.f3171s = i10;
        this.f3172t = watchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f3171s;
        WatchActivity watchActivity = this.f3172t;
        switch (i10) {
            case 0:
                Dialog dialog = watchActivity.C;
                if (dialog != null && dialog.isShowing()) {
                    watchActivity.C.dismiss();
                }
                watchActivity.D.removeCallbacksAndMessages(null);
                watchActivity.finishAndRemoveTask();
                return;
            default:
                if (((TextInputLayout) watchActivity.B.f32986e).getEditText().getText().toString().trim().equals(watchActivity.f21498z)) {
                    watchActivity.C.dismiss();
                    if (!watchActivity.E) {
                        ((CountdownView) watchActivity.f21492s.f36545u).b(86400000L);
                        Paper.book().write("IS_START", Boolean.TRUE);
                        ((CountdownView) watchActivity.f21492s.f36545u).setVisibility(0);
                        watchActivity.G.putBoolean("MyTime", true);
                        watchActivity.G.apply();
                        Toast.makeText(watchActivity, "Stream Code Verified Successfully ", 0).show();
                    }
                    watchActivity.onResume();
                    return;
                }
                ((TextInputLayout) watchActivity.B.f32986e).setError("Invalid Code");
                return;
        }
    }
}
