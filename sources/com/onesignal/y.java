package com.onesignal;

import android.view.animation.Animation;
import androidx.cardview.widget.CardView;
import com.onesignal.w;
import java.util.Set;
import org.json.JSONException;

/* compiled from: InAppMessageView.java */
/* loaded from: classes2.dex */
public final class y implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f27195a;

    public y(w wVar, CardView cardView) {
        this.f27195a = wVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        w.b bVar = this.f27195a.f27174t;
        if (bVar != null) {
            v0 n10 = e3.n();
            b1 b1Var = ((j5) bVar).f26881a.f26809e;
            ((c3) n10.f27108a).r("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
            if (!b1Var.f26676k) {
                Set<String> set = n10.f27115i;
                String str = b1Var.f26667a;
                if (!set.contains(str)) {
                    set.add(str);
                    String K = n10.K(b1Var);
                    if (K != null) {
                        q1 q1Var = n10.f27112e;
                        String str2 = e3.f26752d;
                        String s10 = e3.s();
                        new OSUtils();
                        int b10 = OSUtils.b();
                        x0 x0Var = new x0(n10, b1Var);
                        q1Var.getClass();
                        try {
                            v3.b("in_app_messages/" + str + "/impression", new m1(str2, s10, K, b10), new n1(q1Var, set, x0Var));
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                            ((c3) q1Var.f26985b).d("Unable to execute in-app message impression HTTP request due to invalid JSON");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
