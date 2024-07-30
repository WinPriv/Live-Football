package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.e3;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import r1.j;

/* loaded from: classes2.dex */
public final class OSNotificationWorkManager {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f26613a = OSUtils.p();

    /* loaded from: classes2.dex */
    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        public static void h(Context context, int i10, JSONObject jSONObject, boolean z10, Long l10) {
            t1 t1Var = new t1(null, jSONObject, i10);
            c2 c2Var = new c2(new u1(context, t1Var, jSONObject, z10, l10), t1Var);
            e3.t tVar = e3.f26766m;
            if (tVar != null) {
                try {
                    tVar.a();
                    return;
                } catch (Throwable th) {
                    e3.b(3, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                    c2Var.a(t1Var);
                    throw th;
                }
            }
            e3.b(4, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification", null);
            c2Var.a(t1Var);
        }

        @Override // androidx.work.Worker
        public final ListenableWorker.a g() {
            int i10;
            String str;
            WorkerParameters workerParameters = this.f2591t;
            androidx.work.b bVar = workerParameters.f2600b;
            try {
                e3.b(6, "NotificationWorker running doWork with data: " + bVar, null);
                Object obj = bVar.f2615a.get("android_notif_id");
                boolean z10 = false;
                if (obj instanceof Integer) {
                    i10 = ((Integer) obj).intValue();
                } else {
                    i10 = 0;
                }
                HashMap hashMap = bVar.f2615a;
                Object obj2 = hashMap.get("json_payload");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                JSONObject jSONObject = new JSONObject(str);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Object obj3 = hashMap.get("timestamp");
                if (obj3 instanceof Long) {
                    currentTimeMillis = ((Long) obj3).longValue();
                }
                Object obj4 = hashMap.get("is_restoring");
                if (obj4 instanceof Boolean) {
                    z10 = ((Boolean) obj4).booleanValue();
                }
                h(this.f2590s, i10, jSONObject, z10, Long.valueOf(currentTimeMillis));
                return new ListenableWorker.a.c();
            } catch (JSONException e10) {
                e3.b(3, "Error occurred doing work for job with id: " + workerParameters.f2599a.toString(), null);
                e10.printStackTrace();
                return new ListenableWorker.a.C0023a();
            }
        }
    }

    public static void a(Context context, String str, int i10, String str2, long j10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("android_notif_id", Integer.valueOf(i10));
        hashMap.put("json_payload", str2);
        hashMap.put("timestamp", Long.valueOf(j10));
        hashMap.put("is_restoring", Boolean.valueOf(z10));
        androidx.work.b bVar = new androidx.work.b(hashMap);
        androidx.work.b.b(bVar);
        j.a aVar = new j.a(NotificationWorker.class);
        aVar.f34838b.f60e = bVar;
        r1.j a10 = aVar.a();
        e3.b(6, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2, null);
        c3.f(context).a(str, a10);
    }
}
