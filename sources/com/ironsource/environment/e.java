package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static String f24653c = "";

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f24654a;

    /* renamed from: b, reason: collision with root package name */
    public String f24655b;

    /* renamed from: d, reason: collision with root package name */
    public String f24656d;

    /* renamed from: e, reason: collision with root package name */
    public String f24657e;
    public Context f;

    /* renamed from: g, reason: collision with root package name */
    public String f24658g;

    /* renamed from: h, reason: collision with root package name */
    public String f24659h;

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f24665s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f24666t;

        public b(Context context, String str) {
            this.f24665s = context;
            this.f24666t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f24665s;
            try {
                String C = h.C(context);
                boolean isEmpty = TextUtils.isEmpty(C);
                e eVar = e.this;
                if (!isEmpty) {
                    eVar.f24655b = C;
                }
                String D = h.D(context);
                if (!TextUtils.isEmpty(D)) {
                    eVar.f24657e = D;
                }
                SharedPreferences.Editor edit = context.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", eVar.f24655b);
                edit.putString("sId", this.f24666t);
                edit.apply();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e.a().f24658g).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                Log.i("JSON", eVar.f24654a.toString());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(eVar.f24654a.toString());
                dataOutputStream.flush();
                dataOutputStream.close();
                Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                Log.i(com.anythink.expressad.d.a.b.f7167g, httpURLConnection.getResponseMessage());
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static volatile e f24672a = new e(0);
    }

    private e() {
        this.f24654a = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f24659h = " ";
        this.f24658g = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new com.ironsource.environment.d(defaultUncaughtExceptionHandler));
    }

    public static e a() {
        return d.f24672a;
    }

    public /* synthetic */ e(int i10) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r7, java.util.HashSet<java.lang.String> r8, java.lang.String r9, java.lang.String r10, boolean r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.e.a(android.content.Context, java.util.HashSet, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean):void");
    }

    /* loaded from: classes2.dex */
    public class a implements nb.a {
        @Override // nb.a
        public final void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(" (");
                    sb2.append(thread.getState().toString());
                    sb2.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(" ");
                        sb2.append(thread.getState().toString());
                        sb2.append("\n");
                    }
                }
            }
            e.f24653c = sb2.toString();
        }

        @Override // nb.a
        public final void b() {
        }
    }
}
