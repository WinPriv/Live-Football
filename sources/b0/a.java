package b0;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public final class a extends d0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2696c = 0;

    /* compiled from: ActivityCompat.java */
    /* renamed from: b0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0028a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void validateRequestPermissionsRequestCode(int i10);
    }

    public static boolean c(Activity activity, String str) {
        if (!j0.a.c() && TextUtils.equals(com.huawei.openalliance.ad.constant.w.cx, str)) {
            return false;
        }
        return c.c(activity, str);
    }
}
