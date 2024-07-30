package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import r1.j;

/* loaded from: classes2.dex */
public final class OSNotificationRestoreWorkManager {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f26610a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* renamed from: b, reason: collision with root package name */
    public static final String f26611b = NotificationRestoreWorker.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f26612c;

    /* loaded from: classes2.dex */
    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            if (r3.isClosed() == false) goto L30;
         */
        @Override // androidx.work.Worker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.work.ListenableWorker.a g() {
            /*
                r11 = this;
                android.content.Context r0 = com.onesignal.e3.f26748b
                android.content.Context r1 = r11.f2590s
                if (r0 != 0) goto L9
                com.onesignal.e3.y(r1)
            L9:
                boolean r0 = com.onesignal.OSUtils.a()
                if (r0 != 0) goto L15
                androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a
                r0.<init>()
                return r0
            L15:
                boolean r0 = com.onesignal.OSNotificationRestoreWorkManager.f26612c
                if (r0 == 0) goto L1f
                androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a
                r0.<init>()
                return r0
            L1f:
                r0 = 1
                com.onesignal.OSNotificationRestoreWorkManager.f26612c = r0
                r0 = 5
                java.lang.String r2 = "Restoring notifications"
                r3 = 0
                com.onesignal.e3.b(r0, r2, r3)
                com.onesignal.p3 r4 = com.onesignal.p3.c(r1)
                java.lang.StringBuilder r2 = com.onesignal.p3.k()
                android.service.notification.StatusBarNotification[] r5 = com.onesignal.q3.a(r1)
                int r6 = r5.length
                if (r6 != 0) goto L39
                goto L65
            L39:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r7 = r5.length
                r8 = 0
            L40:
                if (r8 >= r7) goto L52
                r9 = r5[r8]
                int r9 = r9.getId()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r6.add(r9)
                int r8 = r8 + 1
                goto L40
            L52:
                java.lang.String r5 = " AND android_notification_id NOT IN ("
                r2.append(r5)
                java.lang.String r5 = ","
                java.lang.String r5 = android.text.TextUtils.join(r5, r6)
                r2.append(r5)
                java.lang.String r5 = ")"
                r2.append(r5)
            L65:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Querying DB for notifications to restore: "
                r5.<init>(r6)
                java.lang.String r6 = r2.toString()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.onesignal.e3.b(r0, r5, r3)
                java.lang.String r5 = "notification"
                java.lang.String[] r6 = com.onesignal.OSNotificationRestoreWorkManager.f26610a     // Catch: java.lang.Throwable -> L9a
                java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L9a
                r8 = 0
                java.lang.String r9 = "_id DESC"
                java.lang.String r10 = com.onesignal.h0.f26840a     // Catch: java.lang.Throwable -> L9a
                android.database.Cursor r3 = r4.j(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9a
                r0 = 200(0xc8, float:2.8E-43)
                com.onesignal.OSNotificationRestoreWorkManager.b(r1, r3, r0)     // Catch: java.lang.Throwable -> L9a
                com.onesignal.h.b(r1)     // Catch: java.lang.Throwable -> L9a
                boolean r0 = r3.isClosed()
                if (r0 != 0) goto Lac
                goto La9
            L9a:
                r0 = move-exception
                java.lang.String r1 = "Error restoring notification records! "
                r2 = 3
                com.onesignal.e3.b(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb2
                if (r3 == 0) goto Lac
                boolean r0 = r3.isClosed()
                if (r0 != 0) goto Lac
            La9:
                r3.close()
            Lac:
                androidx.work.ListenableWorker$a$c r0 = new androidx.work.ListenableWorker$a$c
                r0.<init>()
                return r0
            Lb2:
                r0 = move-exception
                if (r3 == 0) goto Lbe
                boolean r1 = r3.isClosed()
                if (r1 != 0) goto Lbe
                r3.close()
            Lbe:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSNotificationRestoreWorkManager.NotificationRestoreWorker.g():androidx.work.ListenableWorker$a");
        }
    }

    public static void a(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = 15;
        } else {
            i10 = 0;
        }
        c3.f(context).a(f26611b, new j.a(NotificationRestoreWorker.class).b(i10, TimeUnit.SECONDS).a());
    }

    public static void b(Context context, Cursor cursor, int i10) {
        if (!cursor.moveToFirst()) {
            return;
        }
        do {
            OSNotificationWorkManager.a(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true);
            if (i10 > 0) {
                try {
                    Thread.sleep(i10);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        } while (cursor.moveToNext());
    }
}
