package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public interface a<T extends Activity> {
        void a(T t10);
    }

    public static void a(Context context, final Class cls, final com.applovin.impl.sdk.a aVar, final a aVar2) {
        aVar.a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.utils.b.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (cls.isInstance(activity)) {
                    aVar2.a(activity);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (cls.isInstance(activity) && !activity.isChangingConfigurations()) {
                    aVar.b(this);
                }
            }
        });
        context.startActivity(new Intent(context, (Class<?>) cls));
    }

    public static void a(boolean z10, Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (z10 && h.j()) {
            insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
                systemBars = WindowInsets.Type.systemBars();
                insetsController.hide(systemBars);
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static boolean a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (h.b() && activity.isDestroyed());
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
