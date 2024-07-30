package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OSReceiveReceiptController {

    /* renamed from: b, reason: collision with root package name */
    public static OSReceiveReceiptController f26614b;

    /* renamed from: a, reason: collision with root package name */
    public final o2 f26615a = e3.f26776x;

    /* loaded from: classes2.dex */
    public static class ReceiveReceiptWorker extends Worker {
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public final ListenableWorker.a g() {
            String str;
            String q10;
            Integer num;
            Object obj = this.f2591t.f2600b.f2615a.get("os_notification_id");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            String str2 = e3.f26752d;
            if (str2 != null && !str2.isEmpty()) {
                q10 = e3.f26752d;
            } else {
                q10 = e3.q();
            }
            String s10 = e3.s();
            try {
                new OSUtils();
                num = Integer.valueOf(OSUtils.b());
            } catch (NullPointerException e10) {
                e10.printStackTrace();
                num = null;
            }
            e3.b(6, "ReceiveReceiptWorker: Device Type is: " + num, null);
            n2 n2Var = new n2(str);
            try {
                JSONObject put = new JSONObject().put("app_id", q10).put("player_id", s10);
                if (num != null) {
                    put.put("device_type", num);
                }
                new Thread(new u3("notifications/" + str + "/report_received", put, n2Var), "OS_REST_ASYNC_PUT").start();
            } catch (JSONException e11) {
                e3.b(3, "Generating direct receive receipt:JSON Failed.", e11);
            }
            return new ListenableWorker.a.c();
        }
    }
}
