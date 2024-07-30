package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: OneSignalPrefs.java */
/* loaded from: classes2.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f27010a;

    /* renamed from: b, reason: collision with root package name */
    public static HashMap<String, HashMap<String, Object>> f27011b;

    /* renamed from: c, reason: collision with root package name */
    public static a f27012c;

    /* compiled from: OneSignalPrefs.java */
    /* loaded from: classes2.dex */
    public static class a extends HandlerThread {

        /* renamed from: s, reason: collision with root package name */
        public Handler f27013s;

        /* renamed from: t, reason: collision with root package name */
        public long f27014t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f27015u;

        /* compiled from: OneSignalPrefs.java */
        /* renamed from: com.onesignal.r3$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0349a implements Runnable {
            public RunnableC0349a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                aVar.getClass();
                for (String str : r3.f27011b.keySet()) {
                    SharedPreferences.Editor edit = r3.e(str).edit();
                    HashMap<String, Object> hashMap = r3.f27011b.get(str);
                    synchronized (hashMap) {
                        for (String str2 : hashMap.keySet()) {
                            Object obj = hashMap.get(str2);
                            if (obj instanceof String) {
                                edit.putString(str2, (String) obj);
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(str2, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Integer) {
                                edit.putInt(str2, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                edit.putLong(str2, ((Long) obj).longValue());
                            } else if (obj instanceof Set) {
                                edit.putStringSet(str2, (Set) obj);
                            } else if (obj == null) {
                                edit.remove(str2);
                            }
                        }
                        hashMap.clear();
                    }
                    edit.apply();
                }
                e3.f26775w.getClass();
                aVar.f27014t = System.currentTimeMillis();
            }
        }

        public a() {
            super("OSH_WritePrefs");
            this.f27014t = 0L;
        }

        public final synchronized void a() {
            Handler handler = this.f27013s;
            if (handler == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
            if (this.f27014t == 0) {
                e3.f26775w.getClass();
                this.f27014t = System.currentTimeMillis();
            }
            long j10 = this.f27014t;
            e3.f26775w.getClass();
            long currentTimeMillis = (j10 - System.currentTimeMillis()) + 200;
            this.f27013s.postDelayed(new RunnableC0349a(), currentTimeMillis);
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            this.f27013s = new Handler(getLooper());
            a();
        }
    }

    static {
        String simpleName = e3.class.getSimpleName();
        f27010a = simpleName;
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        f27011b = hashMap;
        hashMap.put(simpleName, new HashMap<>());
        f27011b.put("GTPlayerPurchases", new HashMap<>());
        f27011b.put("OneSignalTriggers", new HashMap<>());
        f27012c = new a();
    }

    public static Object a(String str, String str2, Class cls, Object obj) {
        HashMap<String, Object> hashMap = f27011b.get(str);
        synchronized (hashMap) {
            if (cls.equals(Object.class) && hashMap.containsKey(str2)) {
                return Boolean.TRUE;
            }
            Object obj2 = hashMap.get(str2);
            if (obj2 == null && !hashMap.containsKey(str2)) {
                SharedPreferences e10 = e(str);
                if (e10 != null) {
                    if (cls.equals(String.class)) {
                        return e10.getString(str2, (String) obj);
                    }
                    if (cls.equals(Boolean.class)) {
                        return Boolean.valueOf(e10.getBoolean(str2, ((Boolean) obj).booleanValue()));
                    }
                    if (cls.equals(Integer.class)) {
                        return Integer.valueOf(e10.getInt(str2, ((Integer) obj).intValue()));
                    }
                    if (cls.equals(Long.class)) {
                        return Long.valueOf(e10.getLong(str2, ((Long) obj).longValue()));
                    }
                    if (cls.equals(Set.class)) {
                        return e10.getStringSet(str2, (Set) obj);
                    }
                    if (cls.equals(Object.class)) {
                        return Boolean.valueOf(e10.contains(str2));
                    }
                    return null;
                }
                return obj;
            }
            return obj2;
        }
    }

    public static boolean b(String str, String str2, boolean z10) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z10))).booleanValue();
    }

    public static int c(int i10, String str) {
        return ((Integer) a(f27010a, str, Integer.class, Integer.valueOf(i10))).intValue();
    }

    public static long d(String str, long j10) {
        return ((Long) a(f27010a, str, Long.class, Long.valueOf(j10))).longValue();
    }

    public static synchronized SharedPreferences e(String str) {
        synchronized (r3.class) {
            Context context = e3.f26748b;
            if (context == null) {
                e3.b(4, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
                return null;
            }
            return context.getSharedPreferences(str, 0);
        }
    }

    public static String f(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    public static Set g(String str, HashSet hashSet) {
        return (Set) a(f27010a, str, Set.class, hashSet);
    }

    public static void h(Object obj, String str, String str2) {
        HashMap<String, Object> hashMap = f27011b.get(str);
        synchronized (hashMap) {
            hashMap.put(str2, obj);
        }
        a aVar = f27012c;
        synchronized (aVar) {
            if (e3.f26748b != null) {
                if (!aVar.f27015u) {
                    aVar.start();
                    aVar.f27015u = true;
                }
                aVar.a();
            }
        }
    }

    public static void i(String str, String str2, boolean z10) {
        h(Boolean.valueOf(z10), str, str2);
    }
}
