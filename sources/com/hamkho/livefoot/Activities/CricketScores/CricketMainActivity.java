package com.hamkho.livefoot.Activities.CricketScores;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.anythink.basead.ui.e;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.f;
import com.hamkho.livefoot.R;
import q2.j;
import t8.l;

/* loaded from: classes2.dex */
public class CricketMainActivity extends AppCompatActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21433t = 0;

    /* renamed from: s, reason: collision with root package name */
    public j f21434s;

    /* loaded from: classes2.dex */
    public class a implements f.b {
        @Override // com.google.android.material.tabs.f.b
        public final void a(TabLayout.f fVar, int i10) {
            if (i10 == 0) {
                fVar.a("Live Matches");
            } else if (i10 == 1) {
                fVar.a("Recent Matches");
            } else if (i10 == 2) {
                fVar.a("Upcoming Matches");
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_cricket_main, (ViewGroup) null, false);
        int i10 = R.id.Back;
        ImageView imageView = (ImageView) a0.a.H0(R.id.Back, inflate);
        if (imageView != null) {
            i10 = R.id.Banner;
            LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Banner, inflate);
            if (linearLayout != null) {
                i10 = R.id.Tab;
                TabLayout tabLayout = (TabLayout) a0.a.H0(R.id.Tab, inflate);
                if (tabLayout != null) {
                    i10 = R.id.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) a0.a.H0(R.id.viewPager, inflate);
                    if (viewPager2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) inflate;
                        this.f21434s = new j(relativeLayout, imageView, linearLayout, tabLayout, viewPager2);
                        setContentView(relativeLayout);
                        ((ImageView) this.f21434s.f34587t).setOnClickListener(new e(this, 2));
                        t8.a.e(this, (LinearLayout) this.f21434s.f34588u);
                        if (l.f35592c.e()) {
                            Dialog dialog = new Dialog(this);
                            dialog.setContentView(R.layout.warning);
                            dialog.setCancelable(false);
                            dialog.getWindow().setLayout(-1, -2);
                            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                            ((Button) dialog.findViewById(R.id.Ok)).setOnClickListener(new v8.a(this, dialog, 0));
                            dialog.show();
                            return;
                        }
                        ((ViewPager2) this.f21434s.f34590w).setAdapter(new d9.a(this));
                        ((ViewPager2) this.f21434s.f34590w).b(0, false);
                        j jVar = this.f21434s;
                        new f((TabLayout) jVar.f34589v, (ViewPager2) jVar.f34590w, new a()).a();
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
