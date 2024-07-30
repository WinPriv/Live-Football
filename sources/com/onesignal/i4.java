package com.onesignal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

/* compiled from: PushRegistratorFCM.java */
/* loaded from: classes2.dex */
public final class i4 extends h4 {

    /* renamed from: d, reason: collision with root package name */
    public n7.e f26857d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f26858e;
    public final a f;

    /* compiled from: PushRegistratorFCM.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f26859a;

        /* renamed from: b, reason: collision with root package name */
        public final String f26860b;

        /* renamed from: c, reason: collision with root package name */
        public final String f26861c;

        public a(String str, String str2, String str3) {
            this.f26859a = str == null ? "onesignal-shared-public" : str;
            this.f26860b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
            this.f26861c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
        }
    }

    public i4(Context context, a aVar) {
        this.f26858e = context;
        if (aVar == null) {
            this.f = new a(null, null, null);
        } else {
            this.f = aVar;
        }
    }

    @Override // com.onesignal.h4
    public final String b(String str) throws Exception {
        if (this.f26857d == null) {
            a aVar = this.f;
            this.f26857d = n7.e.f(this.f26858e, new n7.g(Preconditions.checkNotEmpty(aVar.f26860b, "ApplicationId must be set."), Preconditions.checkNotEmpty(aVar.f26861c, "ApiKey must be set."), null, null, str, null, aVar.f26859a), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
        try {
            return d();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            e3.b(5, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken", null);
            try {
                Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", n7.e.class).invoke(null, this.f26857d);
                return (String) invoke.getClass().getMethod("getToken", String.class, String.class).invoke(invoke, str, "FCM");
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e10);
            }
        }
    }

    public final String d() throws Exception {
        Task<String> task;
        n7.e eVar = this.f26857d;
        eVar.a();
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) eVar.f33461d.a(FirebaseMessaging.class);
        b8.a aVar = firebaseMessaging.f21282b;
        if (aVar != null) {
            task = aVar.b();
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            firebaseMessaging.f21287h.execute(new androidx.appcompat.app.p(12, firebaseMessaging, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        try {
            return (String) Tasks.await(task);
        } catch (ExecutionException unused) {
            throw task.getException();
        }
    }
}
