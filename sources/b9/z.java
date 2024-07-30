package b9;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputLayout;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import com.hamkho.livefoot.R;
import d0.a;
import m.i;

/* compiled from: WatchActivity.java */
/* loaded from: classes2.dex */
public final class z implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f3179s;

    public z(a0 a0Var) {
        this.f3179s = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WatchActivity watchActivity = this.f3179s.f3134s;
        if (watchActivity.f21497x && !watchActivity.H) {
            watchActivity.onPause();
            View inflate = watchActivity.getLayoutInflater().inflate(R.layout.unlockcpa, (ViewGroup) null, false);
            int i10 = R.id.GetStreamCode;
            Button button = (Button) a0.a.H0(R.id.GetStreamCode, inflate);
            if (button != null) {
                i10 = R.id.Lottie;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) a0.a.H0(R.id.Lottie, inflate);
                if (lottieAnimationView != null) {
                    i10 = R.id.StreamLinkCode;
                    TextInputLayout textInputLayout = (TextInputLayout) a0.a.H0(R.id.StreamLinkCode, inflate);
                    if (textInputLayout != null) {
                        i10 = R.id.VerifyStreamCode;
                        Button button2 = (Button) a0.a.H0(R.id.VerifyStreamCode, inflate);
                        if (button2 != null) {
                            i10 = R.id.t1;
                            TextView textView = (TextView) a0.a.H0(R.id.t1, inflate);
                            if (textView != null) {
                                i10 = R.id.t2;
                                TextView textView2 = (TextView) a0.a.H0(R.id.t2, inflate);
                                if (textView2 != null) {
                                    watchActivity.B = new m9.d((CardView) inflate, button, lottieAnimationView, textInputLayout, button2, textView, textView2);
                                    Dialog dialog = new Dialog(watchActivity);
                                    watchActivity.C = dialog;
                                    dialog.setContentView((CardView) watchActivity.B.f32983b);
                                    watchActivity.C.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                    watchActivity.C.getWindow().setLayout(-1, -2);
                                    watchActivity.C.setCancelable(false);
                                    i.b bVar = new i.b();
                                    Object obj = d0.a.f27248a;
                                    bVar.f32623b.f32606a = Integer.valueOf(a.d.a(watchActivity, R.color.colorPrimary) | (-16777216));
                                    int i11 = 1;
                                    ((Button) watchActivity.B.f32984c).setOnClickListener(new m(watchActivity, bVar, i11));
                                    ((Button) watchActivity.B.f).setOnClickListener(new v(watchActivity, i11));
                                    watchActivity.C.show();
                                    if (watchActivity.getResources().getConfiguration().orientation == 2) {
                                        watchActivity.setRequestedOrientation(1);
                                        watchActivity.f21494u.V(5, watchActivity.f21494u.getCurrentPosition());
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
        }
    }
}
