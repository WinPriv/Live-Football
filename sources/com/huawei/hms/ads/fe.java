package com.huawei.hms.ads;

import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class fe {
    private static final String Code = "HA";
    private String C;
    private String I;
    private int S;
    private String V;
    private int Z;
    private long B = 0;
    private final StringBuilder F = new StringBuilder();

    public fe(String str, int i10, String str2) {
        this.V = null;
        this.I = Code;
        this.Z = 0;
        this.V = str;
        this.Z = i10;
        if (str2 != null) {
            this.I = str2;
        }
        I();
    }

    private fe I() {
        this.B = System.currentTimeMillis();
        this.C = Thread.currentThread().getName();
        this.S = Process.myPid();
        return this;
    }

    public <T> fe Code(T t10) {
        this.F.append(t10);
        return this;
    }

    public String V() {
        StringBuilder sb2 = new StringBuilder();
        V(sb2);
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Code(sb2);
        V(sb2);
        return sb2.toString();
    }

    private StringBuilder V(StringBuilder sb2) {
        sb2.append(' ');
        sb2.append((CharSequence) this.F);
        return sb2;
    }

    public fe Code(Throwable th) {
        if (th != null) {
            Code((fe) '\n').Code((fe) Log.getStackTraceString(th));
        }
        return this;
    }

    public String Code() {
        StringBuilder sb2 = new StringBuilder();
        Code(sb2);
        return sb2.toString();
    }

    private StringBuilder Code(StringBuilder sb2) {
        SimpleDateFormat simpleDateFormat;
        try {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        } catch (Throwable unused) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
        sb2.append('[');
        sb2.append(simpleDateFormat.format(Long.valueOf(this.B)));
        String Code2 = fb.Code(this.Z);
        sb2.append(' ');
        sb2.append(Code2);
        sb2.append('/');
        sb2.append(this.V);
        sb2.append('/');
        sb2.append(this.I);
        sb2.append(' ');
        sb2.append(this.S);
        sb2.append(':');
        sb2.append(this.C);
        sb2.append(']');
        return sb2;
    }
}
