package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.hamkho.livefoot.R;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class PermissionsActivity extends Activity {

    /* renamed from: u, reason: collision with root package name */
    public static boolean f26624u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f26625v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f26626w;

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap<String, b> f26627x = new HashMap<>();

    /* renamed from: s, reason: collision with root package name */
    public String f26628s;

    /* renamed from: t, reason: collision with root package name */
    public String f26629t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int[] f26630s;

        public a(int[] iArr) {
            this.f26630s = iArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            int[] iArr = this.f26630s;
            boolean z11 = true;
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            HashMap<String, b> hashMap = PermissionsActivity.f26627x;
            PermissionsActivity permissionsActivity = PermissionsActivity.this;
            b bVar = hashMap.get(permissionsActivity.f26628s);
            if (bVar != null) {
                if (z10) {
                    bVar.a();
                    return;
                }
                permissionsActivity.getClass();
                if (!PermissionsActivity.f26625v || !PermissionsActivity.f26626w || b0.a.c(permissionsActivity, permissionsActivity.f26629t)) {
                    z11 = false;
                }
                bVar.b(z11);
                return;
            }
            throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.f26628s);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b(boolean z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Bundle bundle) {
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
            this.f26628s = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
            String string2 = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
            this.f26629t = string2;
            if (!f26624u) {
                f26624u = true;
                f26626w = !b0.a.c(this, string2);
                String[] strArr = {string2};
                if (this instanceof f) {
                    ((f) this).a();
                }
                requestPermissions(strArr, 2);
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(s.f.b("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e3.y(this);
        a(getIntent().getExtras());
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent.getExtras());
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        f26624u = false;
        if (i10 == 2) {
            new Handler().postDelayed(new a(iArr), 500L);
        }
        if (c.f26699t != null) {
            com.onesignal.a.f26632d.remove("com.onesignal.PermissionsActivity");
        }
        finish();
        overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }
}
