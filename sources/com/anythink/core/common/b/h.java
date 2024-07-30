package com.anythink.core.common.b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.openalliance.ad.constant.w;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h implements Thread.UncaughtExceptionHandler {

    /* renamed from: d, reason: collision with root package name */
    private static volatile h f5150d;

    /* renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f5152b;

    /* renamed from: c, reason: collision with root package name */
    private Context f5153c;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f5154e;
    private final String f = CrashHianalyticsData.CRASH_TYPE;

    /* renamed from: g, reason: collision with root package name */
    private final String f5155g = "crash_msg";

    /* renamed from: h, reason: collision with root package name */
    private final String f5156h = e.f4977c;

    /* renamed from: a, reason: collision with root package name */
    String f5151a = "com.anythink";

    private h(Context context) {
        this.f5153c = context;
        this.f5154e = context.getSharedPreferences(g.f5012t, 0);
    }

    public static h a(Context context) {
        if (f5150d == null) {
            synchronized (h.class) {
                if (f5150d == null) {
                    f5150d = new h(context);
                }
            }
        }
        return f5150d;
    }

    private String b() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap hashMap = new HashMap(4);
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Thread key = it.next().getKey();
                if (key.getName().startsWith("anythink")) {
                    String str = key.getName() + "-" + key.getState();
                    if (hashMap.containsKey(str)) {
                        hashMap.put(str, Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1));
                    } else {
                        hashMap.put(str, 1);
                    }
                    i10++;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(hashMap);
                jSONObject.put("anythink_thread_count", i10);
                try {
                    ActivityManager activityManager = (ActivityManager) this.f5153c.getSystemService("activity");
                    Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                    if (processMemoryInfo.length > 0) {
                        jSONObject.put("app_memory", (processMemoryInfo[0].getTotalPss() / 1024) + "MB");
                    }
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("sys_total_memory", (memoryInfo.totalMem / w.f22146c) + "MB");
                    jSONObject.put("sys_avail_memory", (memoryInfo.availMem / w.f22146c) + "MB");
                } catch (Throwable unused) {
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                return th.getMessage();
            }
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    private void c() {
        String str;
        Map<String, ?> all = this.f5154e.getAll();
        for (Object obj : all.values()) {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    com.anythink.core.common.j.c.a(jSONObject.optString(CrashHianalyticsData.CRASH_TYPE), jSONObject.optString("crash_msg"), jSONObject.optString(e.f4977c));
                } catch (Exception unused) {
                }
            }
        }
        if (all.size() > 0) {
            this.f5154e.edit().clear().commit();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        try {
            String b10 = b(th);
            if (a(b10)) {
                String b11 = b(b10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CrashHianalyticsData.CRASH_TYPE, URLEncoder.encode(b11));
                jSONObject.put("crash_msg", URLEncoder.encode(b() + "\n" + b10));
                jSONObject.put(e.f4977c, n.a().r());
                SharedPreferences.Editor edit = this.f5154e.edit();
                edit.putString(System.currentTimeMillis() + "_crash", jSONObject.toString());
                edit.commit();
            }
        } catch (Throwable unused) {
        }
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5152b;
            if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this && !(uncaughtExceptionHandler instanceof h)) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Exception unused2) {
        }
    }

    public final void a() {
        com.anythink.core.c.a h10 = a3.l.h(com.anythink.core.c.b.a(this.f5153c));
        if (h10 == null || h10.x() != 0) {
            try {
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.h.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a(h.this);
                    }
                });
                if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof h)) {
                    this.f5152b = Thread.getDefaultUncaughtExceptionHandler();
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
            } catch (Exception unused) {
            }
        }
    }

    private void a(Throwable th) {
        try {
            String b10 = b(th);
            if (a(b10)) {
                String b11 = b(b10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CrashHianalyticsData.CRASH_TYPE, URLEncoder.encode(b11));
                jSONObject.put("crash_msg", URLEncoder.encode(b() + "\n" + b10));
                jSONObject.put(e.f4977c, n.a().r());
                SharedPreferences.Editor edit = this.f5154e.edit();
                edit.putString(System.currentTimeMillis() + "_crash", jSONObject.toString());
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    private static String b(Throwable th) {
        PrintWriter printWriter;
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = null;
        try {
            for (Throwable th2 = new Throwable(com.anythink.core.common.k.g.a(), th); th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            }
            StringWriter stringWriter2 = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter2);
                try {
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    printWriter.close();
                    stringWriter2.close();
                    String stringWriter3 = stringWriter2.toString();
                    try {
                        stringWriter2.close();
                        stringWriter2.close();
                    } catch (Throwable unused) {
                    }
                    return stringWriter3;
                } catch (Exception unused2) {
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (Throwable unused3) {
                            return "";
                        }
                    }
                    if (printWriter != null) {
                        stringWriter.close();
                    }
                    return "";
                } catch (Throwable th3) {
                    th = th3;
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (Throwable unused4) {
                            throw th;
                        }
                    }
                    if (printWriter != null) {
                        stringWriter.close();
                    }
                    throw th;
                }
            } catch (Exception unused5) {
                printWriter = null;
            } catch (Throwable th4) {
                th = th4;
                printWriter = null;
            }
        } catch (Exception unused6) {
            printWriter = null;
        } catch (Throwable th5) {
            th = th5;
            printWriter = null;
        }
    }

    private boolean a(String str) {
        com.anythink.core.c.a h10 = a3.l.h(com.anythink.core.c.b.a(this.f5153c));
        if (h10 != null) {
            if (h10.x() == 0) {
                return false;
            }
            String z10 = h10.z();
            try {
                if (TextUtils.isEmpty(z10)) {
                    return true;
                }
                JSONArray jSONArray = new JSONArray(z10);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (str.contains(jSONArray.optString(i10))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        } else if (str.contains(this.f5151a)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void a(h hVar) {
        Map<String, ?> all = hVar.f5154e.getAll();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String obj = next != null ? next.toString() : "";
            if (!TextUtils.isEmpty(obj)) {
                try {
                    JSONObject jSONObject = new JSONObject(obj);
                    com.anythink.core.common.j.c.a(jSONObject.optString(CrashHianalyticsData.CRASH_TYPE), jSONObject.optString("crash_msg"), jSONObject.optString(e.f4977c));
                } catch (Exception unused) {
                }
            }
        }
        if (all.size() > 0) {
            hVar.f5154e.edit().clear().commit();
        }
    }

    private static String b(String str) {
        String group;
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*?(Exception|Error|Death)", 2).matcher(str);
            group = matcher.find() ? matcher.group(0) : "";
        } catch (Exception unused) {
        }
        try {
            return !TextUtils.isEmpty(group) ? group.replaceAll("Caused by:", "").replaceAll(" ", "") : group;
        } catch (Exception unused2) {
            str2 = group;
            return str2;
        }
    }
}
