package com.huawei.hms.framework.common;

import a3.k;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adapters.facebook.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;
import s.f;

/* loaded from: classes2.dex */
public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 20;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 8;
    private static final String SPLIT = "|";
    private static final String TAG = "NetworkKit_Logger";
    private static final String TAG_NETWORKKIT_PRE = "NetworkKit_";
    private static final String TAG_NETWORK_SDK_PRE = "NetworkSdk_";
    private static ExtLogger extLogger = null;
    private static boolean kitPrint = true;

    /* loaded from: classes2.dex */
    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        /* JADX INFO: Access modifiers changed from: private */
        public void setCause(Throwable th) {
            this.thisCause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th = this.thisCause;
            if (th == this) {
                return null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.ownerThrowable;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.message != null) {
                String concat = name.concat(": ");
                if (this.message.startsWith(concat)) {
                    return this.message;
                }
                StringBuilder j10 = a.j(concat);
                j10.append(this.message);
                return j10.toString();
            }
            return name;
        }

        private ThrowableWrapper(Throwable th) {
            this.ownerThrowable = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i10 = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i10) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i10));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }
    }

    private static String complexAppTag(String str) {
        return f.b(TAG_NETWORK_SDK_PRE, str);
    }

    private static String complexMsg(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            return k.m(new StringBuilder(), getCallMethodInfo(i10), "|", str);
        }
        return getCallMethodInfo(i10);
    }

    private static String complexTag(String str) {
        return f.b(TAG_NETWORKKIT_PRE, str);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    private static void extLogPrintln(int i10, String str, String str2) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            extLogger.e(str, str2);
                            return;
                        }
                        return;
                    }
                    extLogger.w(str, str2);
                    return;
                }
                extLogger.i(str, str2);
                return;
            }
            extLogger.d(str, str2);
            return;
        }
        extLogger.v(str, str2);
    }

    private static String getCallMethodInfo(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i10) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            return Thread.currentThread().getName() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
        }
        return "";
    }

    private static Throwable getNewThrowable(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.setCause(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    private static boolean isAPPLoggable(int i10) {
        if (extLogger != null && i10 >= 3) {
            return true;
        }
        return false;
    }

    private static boolean isKitLoggable(int i10) {
        if (kitPrint && isLoggable(i10)) {
            return true;
        }
        return false;
    }

    public static boolean isLoggable(int i10) {
        return Log.isLoggable(TAG_NETWORKKIT_PRE, i10);
    }

    private static int logPrintln(int i10, String str, String str2) {
        if (isAPPLoggable(i10)) {
            extLogPrintln(i10, complexAppTag(str), complexMsg(str2, 7));
        }
        if (isKitLoggable(i10)) {
            return Log.println(i10, complexTag(str), complexMsg(str2, 7));
        }
        return 1;
    }

    public static void println(int i10, String str, Object obj) {
        if (i10 < 3) {
            return;
        }
        logPrintln(i10, str, obj == null ? "null" : obj.toString());
    }

    public static void setExtLogger(ExtLogger extLogger2, boolean z10) {
        extLogger = extLogger2;
        kitPrint = z10;
        i(TAG, "logger = " + extLogger2 + z10);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void println(int i10, String str, String str2, Object... objArr) {
        if (i10 < 3) {
            return;
        }
        if (str2 == null) {
            Log.w(TAG, "format is null, not log");
            return;
        }
        try {
            logPrintln(i10, str, StringUtils.format(str2, objArr));
        } catch (IllegalFormatException e10) {
            w(TAG, "log format error".concat(str2), e10);
        }
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    public static void e(String str, String str2, Throwable th) {
        if (isAPPLoggable(6)) {
            extLogger.e(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            Log.e(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (isAPPLoggable(5)) {
            extLogger.w(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            Log.w(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }
}
