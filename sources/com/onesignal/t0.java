package com.onesignal;

import android.content.ContentValues;
import java.util.Date;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public final class t0 extends g {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b1 f27066s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v0 f27067t;

    public t0(v0 v0Var, b1 b1Var) {
        this.f27067t = v0Var;
        this.f27066s = b1Var;
    }

    @Override // com.onesignal.g, java.lang.Runnable
    public final void run() {
        String str;
        super.run();
        q1 q1Var = this.f27067t.f27112e;
        b1 b1Var = this.f27066s;
        synchronized (q1Var) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", b1Var.f26667a);
            contentValues.put("display_quantity", Integer.valueOf(b1Var.f26671e.f26842b));
            contentValues.put("last_display", Long.valueOf(b1Var.f26671e.f26841a));
            contentValues.put("click_ids", b1Var.f26670d.toString());
            contentValues.put("displayed_in_session", Boolean.valueOf(b1Var.f26672g));
            if (q1Var.f26984a.m("in_app_message", contentValues, "message_id = ?", new String[]{b1Var.f26667a}) == 0) {
                q1Var.f26984a.f("in_app_message", contentValues);
            }
        }
        v0 v0Var = this.f27067t;
        q1 q1Var2 = v0Var.f27112e;
        Date date = v0Var.f27124s;
        q1Var2.getClass();
        if (date != null) {
            str = date.toString();
        } else {
            str = null;
        }
        String str2 = r3.f27010a;
        q1Var2.f26986c.getClass();
        r3.h(str, str2, "PREFS_OS_LAST_TIME_IAM_DISMISSED");
    }
}
