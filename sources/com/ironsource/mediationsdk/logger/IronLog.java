package com.ironsource.mediationsdk.logger;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes2.dex */
public enum IronLog {
    API(0),
    CALLBACK(1),
    ADAPTER_API(2),
    ADAPTER_CALLBACK(3),
    NETWORK(4),
    INTERNAL(5),
    NATIVE(6),
    EVENT(7);


    /* renamed from: s, reason: collision with root package name */
    public final IronSourceLogger.IronSourceTag f25578s;

    IronLog(int i10) {
        this.f25578s = r1;
    }

    public static String a() {
        StackTraceElement stackTraceElement;
        String methodName;
        StringBuilder sb2;
        StackTraceElement stackTraceElement2;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String str = stackTrace[5].getClassName().split("\\.")[r2.length - 1];
        if (str.contains("$")) {
            str = str.split("\\$")[0];
        }
        String[] split = stackTrace[5].getClassName().split("\\.");
        String str2 = split[split.length - 1];
        if (str2.contains("$")) {
            String[] split2 = str2.split("\\$");
            sb2 = new StringBuilder();
            sb2.append(split2[1]);
            sb2.append(".");
            stackTraceElement2 = stackTrace[5];
        } else {
            if (stackTrace[5].getMethodName().contains("$")) {
                String[] split3 = stackTrace[6].getClassName().split("\\$");
                if (split3.length > 1) {
                    sb2 = new StringBuilder();
                    sb2.append(split3[1]);
                    sb2.append(".");
                    stackTraceElement2 = stackTrace[6];
                } else {
                    stackTraceElement = stackTrace[6];
                }
            } else {
                stackTraceElement = stackTrace[5];
            }
            methodName = stackTraceElement.getMethodName();
            return String.format("%s %s", str, methodName);
        }
        sb2.append(stackTraceElement2.getMethodName());
        methodName = sb2.toString();
        return String.format("%s %s", str, methodName);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        return String.format("%s - %s", a(), str);
    }

    public final void error() {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(""), 3);
    }

    public final void info() {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(""), 1);
    }

    public final void verbose() {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(""), 0);
    }

    public final void warning() {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(""), 2);
    }

    public final void error(String str) {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(str), 3);
    }

    public final void info(String str) {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(str), 1);
    }

    public final void verbose(String str) {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(str), 0);
    }

    public final void warning(String str) {
        IronSourceLoggerManager.getLogger().log(this.f25578s, b(str), 2);
    }
}
