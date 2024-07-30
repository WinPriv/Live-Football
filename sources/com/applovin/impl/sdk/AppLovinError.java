package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* renamed from: a, reason: collision with root package name */
    private final int f18440a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18441b;

    public AppLovinError(int i10, String str) {
        this.f18440a = i10;
        this.f18441b = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        if (message != null ? message.equals(message2) : message2 == null) {
            return true;
        }
        return false;
    }

    public int getCode() {
        return this.f18440a;
    }

    public String getMessage() {
        return this.f18441b;
    }

    public int hashCode() {
        int hashCode;
        int code = getCode() + 59;
        String message = getMessage();
        int i10 = code * 59;
        if (message == null) {
            hashCode = 43;
        } else {
            hashCode = message.hashCode();
        }
        return i10 + hashCode;
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
