package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.sdk.controller.u;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* loaded from: classes2.dex */
public class ControllerActivity extends Activity implements w, com.ironsource.sdk.j.g {
    public com.ironsource.sdk.g.b B;
    public boolean C;
    public boolean D;

    /* renamed from: s, reason: collision with root package name */
    public String f26069s;

    /* renamed from: t, reason: collision with root package name */
    public x f26070t;

    /* renamed from: u, reason: collision with root package name */
    public RelativeLayout f26071u;

    /* renamed from: v, reason: collision with root package name */
    public FrameLayout f26072v;

    /* renamed from: x, reason: collision with root package name */
    public String f26074x;
    public int currentRequestedRotation = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26073w = false;
    public final Handler y = new Handler();

    /* renamed from: z, reason: collision with root package name */
    public final a f26075z = new a();
    public final RelativeLayout.LayoutParams A = new RelativeLayout.LayoutParams(-1, -1);

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity controllerActivity = ControllerActivity.this;
            controllerActivity.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(controllerActivity.f26073w));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                Handler handler = controllerActivity.y;
                a aVar = controllerActivity.f26075z;
                handler.removeCallbacks(aVar);
                controllerActivity.y.postDelayed(aVar, 500L);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    public final void a() {
        Logger.i("ControllerActivity", "clearWebviewController");
        x xVar = this.f26070t;
        if (xVar == null) {
            Logger.i("ControllerActivity", "clearWebviewController, null");
            return;
        }
        xVar.M = x.g.Gone;
        xVar.V = null;
        xVar.f26264q0 = null;
        xVar.a(this.f26074x, "onDestroy");
    }

    public final void b(String str) {
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                int k10 = com.ironsource.environment.h.k(this);
                Logger.i("ControllerActivity", "setInitiateLandscapeOrientation");
                if (k10 == 0) {
                    Logger.i("ControllerActivity", "ROTATION_0");
                } else {
                    if (k10 == 2) {
                        Logger.i("ControllerActivity", "ROTATION_180");
                    } else if (k10 == 3) {
                        Logger.i("ControllerActivity", "ROTATION_270 Right Landscape");
                    } else if (k10 == 1) {
                        Logger.i("ControllerActivity", "ROTATION_90 Left Landscape");
                    } else {
                        Logger.i("ControllerActivity", "No Rotation");
                        return;
                    }
                    setRequestedOrientation(8);
                    return;
                }
                setRequestedOrientation(0);
                return;
            }
            if ("portrait".equalsIgnoreCase(str)) {
                int k11 = com.ironsource.environment.h.k(this);
                Logger.i("ControllerActivity", "setInitiatePortraitOrientation");
                if (k11 == 0) {
                    Logger.i("ControllerActivity", "ROTATION_0");
                } else if (k11 == 2) {
                    Logger.i("ControllerActivity", "ROTATION_180");
                    setRequestedOrientation(9);
                    return;
                } else if (k11 == 1) {
                    Logger.i("ControllerActivity", "ROTATION_270 Right Landscape");
                } else if (k11 == 3) {
                    Logger.i("ControllerActivity", "ROTATION_90 Left Landscape");
                } else {
                    Logger.i("ControllerActivity", "No Rotation");
                    return;
                }
                setRequestedOrientation(1);
                return;
            }
            if ("device".equalsIgnoreCase(str)) {
                if (com.ironsource.environment.h.q(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    @Override // com.ironsource.sdk.j.g
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i("ControllerActivity", "onBackPressed");
        new com.ironsource.sdk.i.a();
        if (!com.ironsource.sdk.i.a.a(this)) {
            super.onBackPressed();
        }
    }

    @Override // com.ironsource.sdk.j.g
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        FrameLayout a10;
        super.onCreate(bundle);
        try {
            Logger.i("ControllerActivity", "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            x xVar = (x) com.ironsource.sdk.d.b.a((Context) this).f26402a.f26120a;
            this.f26070t = xVar;
            xVar.L.setId(1);
            x xVar2 = this.f26070t;
            xVar2.f26264q0 = this;
            xVar2.V = this;
            Intent intent = getIntent();
            this.f26074x = intent.getStringExtra("productType");
            this.f26073w = intent.getBooleanExtra("immersive", false);
            this.f26069s = intent.getStringExtra("adViewId");
            this.C = false;
            this.D = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f26073w) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f26075z);
            }
            if (!TextUtils.isEmpty(this.f26074x) && d.e.OfferWall.toString().equalsIgnoreCase(this.f26074x)) {
                if (bundle != null) {
                    com.ironsource.sdk.g.b bVar = (com.ironsource.sdk.g.b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.B = bVar;
                        this.f26070t.a(bVar);
                    }
                    finish();
                } else {
                    this.B = this.f26070t.W;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f26071u = relativeLayout;
            ViewGroup.LayoutParams layoutParams = this.A;
            setContentView(relativeLayout, layoutParams);
            String str = this.f26069s;
            if (!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                a10 = this.f26070t.L;
            } else {
                a10 = com.ironsource.sdk.utils.d.a(getApplicationContext(), com.ironsource.sdk.c.d.a().a(str).a());
            }
            this.f26072v = a10;
            if (this.f26071u.findViewById(1) == null && this.f26072v.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            b(stringExtra);
            this.f26071u.addView(this.f26072v, layoutParams);
        } catch (Exception e10) {
            e10.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        boolean z10;
        View a10;
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.i("ControllerActivity", "onDestroy");
        try {
        } catch (Exception e10) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26012r, new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f25984a);
            Logger.i("ControllerActivity", "removeWebViewContainerView fail " + e10.getMessage());
        }
        if (this.f26071u != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f26072v.getParent();
            if (this.f26069s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a10 = viewGroup2.findViewById(1);
            } else {
                a10 = com.ironsource.sdk.c.d.a().a(this.f26069s).a();
            }
            if (a10 != null) {
                if (isFinishing() && (viewGroup = (ViewGroup) a10.getParent()) != null) {
                    viewGroup.removeView(a10);
                }
                viewGroup2.removeView(this.f26072v);
                if (!this.C) {
                    Logger.i("ControllerActivity", "onDestroy | destroyedFromBackground");
                    a();
                    return;
                }
                return;
            }
            throw new Exception("removeWebViewContainerView | view is null");
        }
        throw new Exception("removeWebViewContainerView | mContainer is null");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        if (i10 == 4) {
            x xVar = this.f26070t;
            if (xVar.I != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                xVar.H.onHideCustomView();
                return true;
            }
        }
        if (this.f26073w && (i10 == 25 || i10 == 24)) {
            Handler handler = this.y;
            a aVar = this.f26075z;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.sdk.j.g
    public void onOrientationChanged(String str, int i10) {
        b(str);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i("ControllerActivity", "onPause, isFinishing=" + isFinishing());
        com.ironsource.environment.e.a.f24660a.b(new u.a((AudioManager) getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b)));
        x xVar = this.f26070t;
        if (xVar != null) {
            xVar.b(this);
            if (!this.D) {
                this.f26070t.j();
            }
            this.f26070t.a(false, "main");
            this.f26070t.a(this.f26074x, "onPause");
        }
        if (isFinishing()) {
            this.C = true;
            a();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i("ControllerActivity", "onResume");
        x xVar = this.f26070t;
        if (xVar != null) {
            xVar.a(this);
            if (!this.D) {
                this.f26070t.k();
            }
            this.f26070t.a(true, "main");
            this.f26070t.a(this.f26074x, "onResume");
        }
        com.ironsource.environment.e.a.f24660a.b(new u.b((AudioManager) getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b)));
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f26074x) && d.e.OfferWall.toString().equalsIgnoreCase(this.f26074x)) {
            com.ironsource.sdk.g.b bVar = this.B;
            bVar.f26474d = true;
            bundle.putParcelable("state", bVar);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        Logger.i("ControllerActivity", "onStart");
        x xVar = this.f26070t;
        if (xVar != null) {
            xVar.a(this.f26074x, "onStart");
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        Logger.i("ControllerActivity", "onStop");
        x xVar = this.f26070t;
        if (xVar != null) {
            xVar.a(this.f26074x, "onStop");
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i("ControllerActivity", "onUserLeaveHint");
        x xVar = this.f26070t;
        if (xVar != null) {
            xVar.a(this.f26074x, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f26073w && z10) {
            runOnUiThread(this.f26075z);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            StringBuilder n10 = a3.k.n("Rotation: Req = ", i10, " Curr = ");
            n10.append(this.currentRequestedRotation);
            Logger.i("ControllerActivity", n10.toString());
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        Runnable dVar;
        if (z10) {
            dVar = new c();
        } else {
            dVar = new d();
        }
        runOnUiThread(dVar);
    }
}
