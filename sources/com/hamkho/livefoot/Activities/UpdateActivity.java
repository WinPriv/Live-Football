package com.hamkho.livefoot.Activities;

import a0.a;
import a4.j;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.anythink.basead.ui.e;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public class UpdateActivity extends AppCompatActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21502t = 0;

    /* renamed from: s, reason: collision with root package name */
    public j f21503s;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_update, (ViewGroup) null, false);
        int i10 = R.id.Lottie;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) a.H0(R.id.Lottie, inflate);
        if (lottieAnimationView != null) {
            i10 = R.id.Update;
            Button button = (Button) a.H0(R.id.Update, inflate);
            if (button != null) {
                j jVar = new j((LinearLayout) inflate, lottieAnimationView, button);
                this.f21503s = jVar;
                setContentView((LinearLayout) jVar.f250s);
                ((Button) this.f21503s.f252u).setOnClickListener(new e(this, 7));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
