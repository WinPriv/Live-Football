package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import com.ironsource.adapters.facebook.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class VolleyLog {
    public static String TAG = "Volley";
    public static boolean DEBUG = Log.isLoggable("Volley", 2);
    private static final String CLASS_NAME = VolleyLog.class.getName();

    /* loaded from: classes.dex */
    public static class MarkerLog {
        public static final boolean ENABLED = VolleyLog.DEBUG;
        private static final long MIN_DURATION_FOR_LOGGING_MS = 0;
        private final List<Marker> mMarkers = new ArrayList();
        private boolean mFinished = false;

        /* loaded from: classes.dex */
        public static class Marker {
            public final String name;
            public final long thread;
            public final long time;

            public Marker(String str, long j10, long j11) {
                this.name = str;
                this.thread = j10;
                this.time = j11;
            }
        }

        private long getTotalDuration() {
            if (this.mMarkers.size() == 0) {
                return 0L;
            }
            return this.mMarkers.get(r2.size() - 1).time - this.mMarkers.get(0).time;
        }

        public synchronized void add(String str, long j10) {
            if (!this.mFinished) {
                this.mMarkers.add(new Marker(str, j10, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public void finalize() throws Throwable {
            if (!this.mFinished) {
                finish("Request on the loose");
                VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        public synchronized void finish(String str) {
            this.mFinished = true;
            long totalDuration = getTotalDuration();
            if (totalDuration <= 0) {
                return;
            }
            long j10 = this.mMarkers.get(0).time;
            VolleyLog.d("(%-4d ms) %s", Long.valueOf(totalDuration), str);
            for (Marker marker : this.mMarkers) {
                long j11 = marker.time;
                VolleyLog.d("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(marker.thread), marker.name);
                j10 = j11;
            }
        }
    }

    private static String buildMessage(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 < stackTrace.length) {
                if (!stackTrace[i10].getClassName().equals(CLASS_NAME)) {
                    String className = stackTrace[i10].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    StringBuilder l10 = a.l(substring.substring(substring.lastIndexOf(36) + 1), ".");
                    l10.append(stackTrace[i10].getMethodName());
                    str2 = l10.toString();
                    break;
                }
                i10++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void d(String str, Object... objArr) {
        Log.d(TAG, buildMessage(str, objArr));
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, buildMessage(str, objArr));
    }

    public static void setTag(String str) {
        d("Changing log tag to %s", str);
        TAG = str;
        DEBUG = Log.isLoggable(str, 2);
    }

    public static void v(String str, Object... objArr) {
        if (DEBUG) {
            Log.v(TAG, buildMessage(str, objArr));
        }
    }

    public static void wtf(String str, Object... objArr) {
        Log.wtf(TAG, buildMessage(str, objArr));
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, buildMessage(str, objArr), th);
    }

    public static void wtf(Throwable th, String str, Object... objArr) {
        Log.wtf(TAG, buildMessage(str, objArr), th);
    }
}
