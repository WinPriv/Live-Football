package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.lang.ref.WeakReference;

/* compiled from: OSNotificationDataController.java */
/* loaded from: classes2.dex */
public final class w1 extends g {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ WeakReference f27179s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f27180t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y1 f27181u;

    public w1(y1 y1Var, WeakReference weakReference, int i10) {
        this.f27181u = y1Var;
        this.f27179s = weakReference;
        this.f27180t = i10;
    }

    @Override // com.onesignal.g, java.lang.Runnable
    public final void run() {
        super.run();
        Context context = (Context) this.f27179s.get();
        if (context == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("android_notification_id = ");
        int i10 = this.f27180t;
        String i11 = com.ironsource.adapters.facebook.a.i(sb2, i10, " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        y1 y1Var = this.f27181u;
        if (y1Var.f27199a.m("notification", contentValues, i11, null) > 0) {
            p3 p3Var = y1Var.f27199a;
            Cursor i12 = p3Var.i("notification", new String[]{"group_id"}, a3.l.i("android_notification_id = ", i10), null, null);
            if (i12.moveToFirst()) {
                String string = i12.getString(i12.getColumnIndex("group_id"));
                i12.close();
                if (string != null) {
                    try {
                        Cursor P0 = a0.a.P0(context, p3Var, string, true);
                        if (!P0.isClosed()) {
                            P0.close();
                        }
                    } finally {
                    }
                }
            } else {
                i12.close();
            }
        }
        h.b(context);
        ((NotificationManager) context.getSystemService("notification")).cancel(i10);
    }
}
