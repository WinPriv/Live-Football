package com.hamkho.livefoot.Activities.SoccerLive;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import c9.f;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hamkho.livefoot.R;
import m2.g;
import q0.d;
import x8.b;

/* loaded from: classes2.dex */
public class LiveMainHolder extends AppCompatActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21490t = 0;

    /* renamed from: s, reason: collision with root package name */
    public g f21491s;

    public final void c(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.c(R.id.Container, fragment, null, 2);
        aVar.e(false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_live_main_holder, (ViewGroup) null, false);
        int i10 = R.id.Back;
        ImageView imageView = (ImageView) a0.a.H0(R.id.Back, inflate);
        if (imageView != null) {
            i10 = R.id.Container;
            FrameLayout frameLayout = (FrameLayout) a0.a.H0(R.id.Container, inflate);
            if (frameLayout != null) {
                i10 = R.id.bottom;
                BottomNavigationView bottomNavigationView = (BottomNavigationView) a0.a.H0(R.id.bottom, inflate);
                if (bottomNavigationView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    this.f21491s = new g(relativeLayout, imageView, frameLayout, bottomNavigationView);
                    setContentView(relativeLayout);
                    ((ImageView) this.f21491s.f32646t).setOnClickListener(new b(this, 4));
                    c(new f());
                    ((BottomNavigationView) this.f21491s.f32648v).setOnItemSelectedListener(new d(this, 13));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
