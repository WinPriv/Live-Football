package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.tasks.Tasks;
import d8.b;
import d8.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n7.e;
import o7.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f21261b;

    /* renamed from: a, reason: collision with root package name */
    public final zzef f21262a;

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.f21262a = zzefVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f21261b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f21261b == null) {
                    f21261b = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                }
            }
        }
        return f21261b;
    }

    @Keep
    public static zzil getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzg = zzef.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new a(zzg);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = b.f27492m;
            e b10 = e.b();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            b10.a();
            return (String) Tasks.await(((b) b10.f33461d.a(c.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f21262a.zzH(activity, str, str2);
    }
}
