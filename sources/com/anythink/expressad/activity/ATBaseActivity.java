package com.anythink.expressad.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.anythink.expressad.foundation.f.b;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public abstract class ATBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6742a = "ATBaseActivity";

    /* renamed from: b, reason: collision with root package name */
    private OrientationEventListener f6743b;

    /* renamed from: c, reason: collision with root package name */
    private Display f6744c;

    /* renamed from: d, reason: collision with root package name */
    private int f6745d = -1;

    /* renamed from: com.anythink.expressad.activity.ATBaseActivity$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends OrientationEventListener {
        public AnonymousClass2(Context context) {
            super(context, 1);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i10) {
            int c10 = ATBaseActivity.this.c();
            if (c10 < 0) {
                c10 = 0;
            }
            if (c10 == 1 && ATBaseActivity.this.f6745d != 1) {
                ATBaseActivity.this.f6745d = 1;
                ATBaseActivity.this.a();
                o.d(ATBaseActivity.f6742a, "Orientation Left");
                return;
            }
            if (c10 == 3 && ATBaseActivity.this.f6745d != 2) {
                ATBaseActivity.this.f6745d = 2;
                ATBaseActivity.this.a();
                o.d(ATBaseActivity.f6742a, "Orientation Right");
            } else if (c10 == 0 && ATBaseActivity.this.f6745d != 3) {
                ATBaseActivity.this.f6745d = 3;
                ATBaseActivity.this.a();
                o.d(ATBaseActivity.f6742a, "Orientation Top");
            } else if (c10 == 2 && ATBaseActivity.this.f6745d != 4) {
                ATBaseActivity.this.f6745d = 4;
                ATBaseActivity.this.a();
                o.d(ATBaseActivity.f6742a, "Orientation Bottom");
            }
        }
    }

    private void d() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            o.d(f6742a, th.getMessage());
        }
    }

    public abstract void a(int i10, int i11, int i12, int i13, int i14);

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            d();
            c();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e10) {
            o.d(f6742a, e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f6743b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f6743b = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (b.f9758c) {
            return;
        }
        a();
        d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        d();
    }

    private void b() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this);
        this.f6743b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            this.f6743b.enable();
        } else {
            this.f6743b.disable();
            this.f6743b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        if (this.f6744c == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f6744c = getDisplay();
            } else {
                this.f6744c = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f6744c;
        if (display == null) {
            return -1;
        }
        try {
            return display.getRotation();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void a() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.anythink.expressad.activity.ATBaseActivity.1
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
            
                r1 = r2.getDisplayCutout();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r13 = this;
                    java.lang.String r0 = "ATBaseActivity"
                    int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.activity.ATBaseActivity r2 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> Lc2
                    android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> Lc2
                    android.view.WindowInsets r2 = r2.getRootWindowInsets()     // Catch: java.lang.Throwable -> Lc2
                    r3 = -1
                    r4 = 0
                    if (r2 == 0) goto Lac
                    r5 = 28
                    if (r1 < r5) goto Lac
                    android.view.DisplayCutout r1 = b0.t.m(r2)     // Catch: java.lang.Throwable -> Lc2
                    if (r1 == 0) goto Lac
                    int r2 = androidx.appcompat.widget.r.c(r1)     // Catch: java.lang.Throwable -> Lc2
                    int r5 = androidx.appcompat.widget.r.C(r1)     // Catch: java.lang.Throwable -> Lc2
                    int r6 = b0.t.D(r1)     // Catch: java.lang.Throwable -> Lc2
                    int r1 = b0.t.C(r1)     // Catch: java.lang.Throwable -> Lc2
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r8 = "NOTCH Left:"
                    r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc2
                    r7.append(r2)     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r8 = " Right:"
                    r7.append(r8)     // Catch: java.lang.Throwable -> Lc2
                    r7.append(r5)     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r8 = " Top:"
                    r7.append(r8)     // Catch: java.lang.Throwable -> Lc2
                    r7.append(r6)     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r8 = " Bottom:"
                    r7.append(r8)     // Catch: java.lang.Throwable -> Lc2
                    r7.append(r1)     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.foundation.h.o.d(r0, r7)     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.activity.ATBaseActivity r7 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    int r7 = com.anythink.expressad.activity.ATBaseActivity.a(r7)     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.activity.ATBaseActivity r8 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    int r8 = com.anythink.expressad.activity.ATBaseActivity.b(r8)     // Catch: java.lang.Throwable -> Lc2
                    r9 = 3
                    r10 = 2
                    r11 = 1
                    if (r8 != r3) goto L95
                    com.anythink.expressad.activity.ATBaseActivity r8 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    if (r7 != 0) goto L70
                    r12 = r9
                    goto L7d
                L70:
                    if (r7 != r11) goto L74
                    r12 = r11
                    goto L7d
                L74:
                    if (r7 != r10) goto L78
                    r12 = 4
                    goto L7d
                L78:
                    if (r7 != r9) goto L7c
                    r12 = r10
                    goto L7d
                L7c:
                    r12 = r3
                L7d:
                    com.anythink.expressad.activity.ATBaseActivity.a(r8, r12)     // Catch: java.lang.Throwable -> Lc2
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
                    r8.<init>()     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.activity.ATBaseActivity r12 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    int r12 = com.anythink.expressad.activity.ATBaseActivity.b(r12)     // Catch: java.lang.Throwable -> Lc2
                    r8.append(r12)     // Catch: java.lang.Throwable -> Lc2
                    java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.foundation.h.o.d(r0, r8)     // Catch: java.lang.Throwable -> Lc2
                L95:
                    if (r7 == 0) goto La9
                    if (r7 == r11) goto La6
                    if (r7 == r10) goto La3
                    if (r7 == r9) goto La0
                L9d:
                    r7 = r1
                L9e:
                    r4 = r2
                    goto Laf
                La0:
                    r3 = 270(0x10e, float:3.78E-43)
                    goto L9d
                La3:
                    r3 = 180(0xb4, float:2.52E-43)
                    goto L9d
                La6:
                    r3 = 90
                    goto L9d
                La9:
                    r7 = r1
                    r3 = r4
                    goto L9e
                Lac:
                    r5 = r4
                    r6 = r5
                    r7 = r6
                Laf:
                    com.anythink.expressad.activity.ATBaseActivity r2 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.activity.ATBaseActivity r1 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    android.view.OrientationEventListener r1 = com.anythink.expressad.activity.ATBaseActivity.c(r1)     // Catch: java.lang.Throwable -> Lc2
                    if (r1 != 0) goto Lc1
                    com.anythink.expressad.activity.ATBaseActivity r1 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> Lc2
                    com.anythink.expressad.activity.ATBaseActivity.d(r1)     // Catch: java.lang.Throwable -> Lc2
                Lc1:
                    return
                Lc2:
                    r1 = move-exception
                    java.lang.String r1 = r1.getMessage()
                    com.anythink.expressad.foundation.h.o.d(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.activity.ATBaseActivity.AnonymousClass1.run():void");
            }
        }, 500L);
    }

    public static /* synthetic */ void d(ATBaseActivity aTBaseActivity) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(aTBaseActivity);
        aTBaseActivity.f6743b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            aTBaseActivity.f6743b.enable();
        } else {
            aTBaseActivity.f6743b.disable();
            aTBaseActivity.f6743b = null;
        }
    }
}
