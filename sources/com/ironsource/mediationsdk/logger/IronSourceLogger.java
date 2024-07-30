package com.ironsource.mediationsdk.logger;

/* loaded from: classes2.dex */
public abstract class IronSourceLogger {

    /* renamed from: a, reason: collision with root package name */
    public int f25581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25582b;

    /* loaded from: classes2.dex */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel(IronSourceLogger ironSourceLogger) {
        }
    }

    /* loaded from: classes2.dex */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public IronSourceLogger(String str) {
        this.f25582b = str;
        this.f25581a = 0;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f25582b;
            if (str != null && str.equals(ironSourceLogger.f25582b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i10) {
        this.f25581a = i10;
    }

    public IronSourceLogger(String str, int i10) {
        this.f25582b = str;
        this.f25581a = i10;
    }
}
