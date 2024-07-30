package com.huawei.openalliance.ad.activity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.cm;
import com.huawei.hms.ads.cx;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.g;
import com.huawei.hms.ads.jk;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.IRemoteViewDelegate;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.utils.SafeIntent;
import e0.i;
import gb.s;
import gb.u;
import gb.w;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class TemplateStubActivity extends c {

    /* renamed from: v, reason: collision with root package name */
    public static AdContentData f21942v;

    /* renamed from: s, reason: collision with root package name */
    public IRemoteViewDelegate f21943s;

    /* renamed from: t, reason: collision with root package name */
    public View f21944t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21945u = false;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String concat;
            AdContentData adContentData = TemplateStubActivity.f21942v;
            TemplateStubActivity templateStubActivity = TemplateStubActivity.this;
            templateStubActivity.a();
            templateStubActivity.getClass();
            try {
                IRemoteViewDelegate iRemoteViewDelegate = templateStubActivity.f21943s;
                if (iRemoteViewDelegate != null) {
                    iRemoteViewDelegate.sendCommand("start", null);
                }
            } catch (Throwable th) {
                ex.I("TemplateStubActivity", "%s failed: %s ", "start", th.getClass().getSimpleName());
            }
            View view = templateStubActivity.f21944t;
            int i10 = u.f28631a;
            if (templateStubActivity == null) {
                concat = "has no activity";
            } else if (!cl.B(templateStubActivity)) {
                concat = "not huawei phone";
            } else if (view == null) {
                concat = "has no rootview";
            } else {
                Window window = templateStubActivity.getWindow();
                if (window == null) {
                    concat = "has no window";
                } else {
                    try {
                        cx Code = cm.Code(templateStubActivity);
                        Code.Code(window.getAttributes());
                        window.getDecorView().setOnApplyWindowInsetsListener(new s(Code, view));
                    } catch (NoSuchMethodError unused) {
                        concat = "adaptRingScreen NoSuchMethodError setDisplaySideMode";
                    } catch (Throwable th2) {
                        concat = "adaptRingScreen error:".concat(th2.getClass().getSimpleName());
                    }
                    templateStubActivity.f21944t.startAnimation(AnimationUtils.loadAnimation(templateStubActivity.getApplicationContext(), R.anim.hiad_anim_fade_in));
                }
            }
            ex.I("u", concat);
            templateStubActivity.f21944t.startAnimation(AnimationUtils.loadAnimation(templateStubActivity.getApplicationContext(), R.anim.hiad_anim_fade_in));
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends IPPSUiEngineCallback.b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<TemplateStubActivity> f21947a;

        public b(TemplateStubActivity templateStubActivity) {
            this.f21947a = new WeakReference<>(templateStubActivity);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0054, code lost:
        
            if (r6.equals(com.huawei.openalliance.ad.constant.bj.b.S) == false) goto L4;
         */
        @Override // com.huawei.hms.ads.uiengine.IPPSUiEngineCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCallResult(java.lang.String r6, android.os.Bundle r7) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.activity.TemplateStubActivity.b.onCallResult(java.lang.String, android.os.Bundle):void");
        }
    }

    public final void a() {
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f21943s;
            if (iRemoteViewDelegate != null) {
                View view = (View) ObjectWrapper.unwrap(iRemoteViewDelegate.getView());
                this.f21944t = view;
                setContentView(view);
            }
        } catch (Throwable th) {
            i.q(th, "plugRemoteView ", "TemplateStubActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.hiad_anim_fade_out);
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SafeIntent safeIntent = new SafeIntent(getIntent());
        String stringExtra = safeIntent.getStringExtra("content");
        f21942v = (AdContentData) gb.b.o(AdContentData.class, stringExtra, new Class[0]);
        if (u.o(getApplicationContext())) {
            ex.V("TemplateStubActivity", "screen locked");
            jk.Code(getApplicationContext()).Code(f21942v, 1);
            finish();
        }
        IRemoteCreator Code = g.Code(getApplicationContext());
        if (Code != null) {
            getWindow().setFlags(1024, 1024);
            int i10 = Build.VERSION.SDK_INT;
            getWindow().addFlags(134217728);
            if (i10 >= 28) {
                try {
                    if (1 == getResources().getConfiguration().orientation) {
                        WindowManager.LayoutParams attributes = getWindow().getAttributes();
                        attributes.layoutInDisplayCutoutMode = 1;
                        getWindow().setAttributes(attributes);
                    }
                } catch (Throwable th) {
                    Log.w("TemplateStubActivity", "set CutoutMode error:".concat(th.getClass().getSimpleName()));
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("filePath", safeIntent.getStringExtra("filePath"));
            bundle2.putString("content", stringExtra);
            try {
                IRemoteViewDelegate newRemoteViewDelegate = Code.newRemoteViewDelegate(ObjectWrapper.wrap(this), safeIntent.getStringExtra(bj.f.F), null);
                this.f21943s = newRemoteViewDelegate;
                newRemoteViewDelegate.onCreate(bundle2);
                this.f21943s.setCallback(new b(this));
                w.b(new a());
                return;
            } catch (Throwable th2) {
                ex.I("TemplateStubActivity", "create remoteViewDelegate err: %s", th2.getClass().getSimpleName());
                return;
            }
        }
        jk.Code(getApplicationContext()).Code(f21942v, 2);
        finish();
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ex.V("TemplateStubActivity", "onDestroy");
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f21943s;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onDestroy();
            }
        } catch (Throwable th) {
            i.q(th, "onDestroy failed: ", "TemplateStubActivity");
        }
        jk.Code(getApplicationContext()).V(f21942v);
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onPause() {
        super.onPause();
        ex.V("TemplateStubActivity", "onPause");
        this.f21945u = true;
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f21943s;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onPause();
            }
        } catch (Throwable th) {
            i.q(th, "onPause ", "TemplateStubActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onRestart() {
        super.onRestart();
        ex.V("TemplateStubActivity", "onRestart, hasPause= %s", Boolean.valueOf(this.f21945u));
        if (this.f21945u) {
            finish();
        }
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f21943s;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onRestart();
            }
        } catch (Throwable th) {
            i.q(th, "onRestart ", "TemplateStubActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onResume() {
        super.onResume();
        ex.V("TemplateStubActivity", "onResume, hasPause= %s", Boolean.valueOf(this.f21945u));
        if (this.f21945u) {
            finish();
        }
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f21943s;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onResume();
            }
        } catch (Throwable th) {
            i.q(th, "onResume ", "TemplateStubActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f21943s;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onStart();
            }
        } catch (Throwable th) {
            i.q(th, "onStart ", "TemplateStubActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onStop() {
        super.onStop();
        ex.V("TemplateStubActivity", "onStop");
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f21943s;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onStop();
            }
        } catch (Throwable th) {
            i.q(th, "onStop ", "TemplateStubActivity");
        }
        finish();
    }
}
