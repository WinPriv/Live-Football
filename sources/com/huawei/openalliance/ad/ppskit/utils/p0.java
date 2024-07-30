package com.huawei.openalliance.ad.ppskit.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.beans.AgendaBean;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.views.PPSWebView;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import ka.n7;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f22941j = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f22942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22943b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentRecord f22944c;

    /* renamed from: d, reason: collision with root package name */
    public final PPSWebView f22945d;

    /* renamed from: e, reason: collision with root package name */
    public final ka.v f22946e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public AgendaBean f22947g;

    /* renamed from: h, reason: collision with root package name */
    public String f22948h;

    /* renamed from: i, reason: collision with root package name */
    public String f22949i;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p0 p0Var = p0.this;
            if (p0.f(p0Var, p0Var.f)) {
                p0Var.f22945d.getWebView().loadUrl("javascript:" + p0Var.f + "(5)");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p0 p0Var = p0.this;
            if (p0.f(p0Var, p0Var.f22949i)) {
                p0Var.f22945d.getWebView().loadUrl("javascript:" + p0Var.f22949i + "(5)");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f22952s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f22953t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f22954u;

        public c(String str, int i10, int i11) {
            this.f22952s = str;
            this.f22953t = i10;
            this.f22954u = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p0 p0Var = p0.this;
            String str = this.f22952s;
            if (p0.f(p0Var, str)) {
                WebView webView = p0Var.f22945d.getWebView();
                StringBuilder s10 = a3.l.s("javascript:", str, "(");
                s10.append(this.f22953t);
                s10.append(")");
                webView.loadUrl(s10.toString());
            }
            if (!p0.e(p0Var.f22944c)) {
                Toast.makeText(p0Var.f22942a.getApplicationContext(), this.f22954u, 0).show();
            }
        }
    }

    public p0(Context context, String str, ContentRecord contentRecord, PPSWebView pPSWebView) {
        n7.e("IPPSAppointJs", "IPPSAppointJs init");
        this.f22942a = context;
        this.f22943b = str;
        this.f22944c = contentRecord;
        this.f22945d = pPSWebView;
        this.f22946e = new ka.v(context);
    }

    public static long a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    public static boolean e(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        if (!"2".equals(contentRecord.f1()) && !"1".equals(contentRecord.f1())) {
            return false;
        }
        return true;
    }

    public static boolean f(p0 p0Var, String str) {
        p0Var.getClass();
        if (y1.h(str)) {
            return false;
        }
        return str.matches("^[0-9a-zA-Z_]+$");
    }

    @JavascriptInterface
    public void appoint(String str, String str2) {
        boolean z10;
        n7.e("IPPSAppointJs", "call appoint from js");
        boolean h10 = y1.h(str);
        String str3 = this.f22943b;
        ka.v vVar = this.f22946e;
        ContentRecord contentRecord = this.f22944c;
        if (h10) {
            n7.g("IPPSAppointJs", "appoint failed: missing required parameters");
            c(str2, 1, R.string.hiad_calender_appoint_failed);
            vVar.h(1, contentRecord, str3);
            return;
        }
        if (n7.d()) {
            n7.c("IPPSAppointJs", "appoint info= %s", str);
        }
        if (y1.h(str2)) {
            n7.g("IPPSAppointJs", "appoint, recall funcName is empty.");
        }
        AgendaBean agendaBean = (AgendaBean) y0.o(null, str, AgendaBean.class, new Class[0]);
        if (agendaBean == null) {
            n7.g("IPPSAppointJs", "appoint failed: missing required parameters");
            c(str2, 1, R.string.hiad_calender_appoint_failed);
            vVar.h(1, contentRecord, str3);
            return;
        }
        if (!y1.h(agendaBean.a()) && !y1.h(agendaBean.i())) {
            if (agendaBean.d() > 0 && agendaBean.e() > 0 && agendaBean.d() <= agendaBean.e()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !y1.h(agendaBean.g())) {
                if (agendaBean.d() < System.currentTimeMillis()) {
                    n7.g("IPPSAppointJs", "appoint failed: date start time before now");
                    c(str2, 2, R.string.hiad_calender_appoint_failed);
                    vVar.h(2, contentRecord, str3);
                    return;
                }
                if (agendaBean.f() != 1 && agendaBean.f() != 0) {
                    agendaBean.b();
                }
                this.f22947g = agendaBean;
                this.f = str2;
                if (!e(contentRecord)) {
                    new AlertDialog.Builder(this.f22942a).setTitle(R.string.hiad_calender_dialog).setMessage(R.string.hiad_calender_appoint_dialog_message).setNegativeButton(R.string.hiad_dialog_cancel, new o0(this)).setPositiveButton(R.string.hiad_calender_add, new n0(this)).setCancelable(false).create().show();
                    return;
                } else {
                    k();
                    return;
                }
            }
        }
        n7.g("IPPSAppointJs", "appoint failed: missing required parameters");
        c(str2, 1, R.string.hiad_calender_appoint_failed);
        vVar.h(1, contentRecord, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.huawei.openalliance.ad.ppskit.beans.AgendaBean r20) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.p0.b(com.huawei.openalliance.ad.ppskit.beans.AgendaBean):void");
    }

    public final void c(String str, int i10, int i11) {
        d2.a(new c(str, i10, i11));
    }

    @JavascriptInterface
    public void cancel(String str, String str2) {
        boolean h10 = y1.h(str);
        ContentRecord contentRecord = this.f22944c;
        if (h10) {
            n7.g("IPPSAppointJs", "cancel failed, title is empty.");
            c(str2, 1, R.string.hiad_calender_cancel_failed);
            this.f22946e.o(1, contentRecord, this.f22943b);
            return;
        }
        if (n7.d()) {
            n7.c("IPPSAppointJs", "cancel title= %s", str);
        }
        if (y1.h(str2)) {
            n7.g("IPPSAppointJs", "cancel, recall funcName is empty.");
        }
        this.f22949i = str2;
        this.f22948h = str;
        if (!e(contentRecord)) {
            new AlertDialog.Builder(this.f22942a).setTitle(R.string.hiad_calender_dialog).setMessage(R.string.hiad_calender_cancel_dialog_message).setNegativeButton(R.string.hiad_dialog_cancel, new m0(this)).setPositiveButton(R.string.hiad_calender_delete, new l0(this)).setCancelable(false).create().show();
        } else {
            j();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ContentRecord contentRecord = this.f22944c;
        String str = this.f22943b;
        ka.v vVar = this.f22946e;
        if (z10) {
            if (g()) {
                n7.g("IPPSAppointJs", "appoint failed: already appointed");
                c(this.f, 3, R.string.hiad_calender_already_appoint);
                vVar.h(3, contentRecord, str);
                return;
            }
            b(this.f22947g);
            return;
        }
        n7.g("IPPSAppointJs", "appoint failed: not allowed permissions");
        if (z11) {
            c(this.f, 5, R.string.hiad_calender_appoint_failed);
        } else {
            d2.a(new a());
        }
        vVar.h(5, contentRecord, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f6 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.p0.g():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.p0.h(java.lang.String):void");
    }

    public final void i(boolean z10, boolean z11) {
        if (z10) {
            h(this.f22948h);
            return;
        }
        n7.g("IPPSAppointJs", "cancel failed, permissions deny.");
        if (z11) {
            c(this.f22949i, 5, R.string.hiad_calender_cancel_failed);
        } else {
            d2.a(new b());
        }
        String str = this.f22943b;
        this.f22946e.o(5, this.f22944c, str);
    }

    public final void j() {
        String[] strArr = f22941j;
        Context context = this.f22942a;
        if (!p1.b(context, strArr)) {
            n7.e("IPPSAppointJs", "cancel, request permissions");
            ((Activity) context).requestPermissions(strArr, 12);
        } else {
            h(this.f22948h);
        }
    }

    public final void k() {
        String[] strArr = f22941j;
        Context context = this.f22942a;
        if (!p1.b(context, strArr)) {
            n7.e("IPPSAppointJs", "request permissions");
            ((Activity) context).requestPermissions(strArr, 11);
        } else {
            if (g()) {
                n7.g("IPPSAppointJs", "appoint failed: already appointed");
                c(this.f, 3, R.string.hiad_calender_already_appoint);
                this.f22946e.h(3, this.f22944c, this.f22943b);
                return;
            }
            b(this.f22947g);
        }
    }

    public final int l() {
        Cursor query = this.f22942a.getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        if (query == null) {
            if (query != null) {
            }
            return -1;
        }
        try {
            if (query.getCount() <= 0) {
                return -1;
            }
            query.moveToFirst();
            return query.getInt(query.getColumnIndex(pa.a.ID));
        } finally {
            query.close();
        }
    }
}
