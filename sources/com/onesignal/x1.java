package com.onesignal;

import android.database.Cursor;
import com.onesignal.y1;

/* compiled from: OSNotificationDataController.java */
/* loaded from: classes2.dex */
public final class x1 extends g {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f27190s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1.a f27191t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y1 f27192u;

    public x1(y1 y1Var, String str, y1.a aVar) {
        this.f27192u = y1Var;
        this.f27190s = str;
        this.f27191t = aVar;
    }

    @Override // com.onesignal.g, java.lang.Runnable
    public final void run() {
        super.run();
        boolean z10 = true;
        String str = this.f27190s;
        y1 y1Var = this.f27192u;
        Cursor i10 = y1Var.f27199a.i("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{str}, null);
        boolean moveToFirst = i10.moveToFirst();
        i10.close();
        if (moveToFirst) {
            ((c3) y1Var.f27200b).c(s.f.b("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of ", str));
        } else {
            z10 = false;
        }
        this.f27191t.a(z10);
    }
}
