package k4;

import java.io.IOException;

/* compiled from: ParserException.java */
/* loaded from: classes2.dex */
public class z0 extends IOException {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f30857s;

    /* renamed from: t, reason: collision with root package name */
    public final int f30858t;

    public z0(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f30857s = z10;
        this.f30858t = i10;
    }

    public static z0 a(String str, Exception exc) {
        return new z0(str, exc, true, 1);
    }

    public static z0 b(String str, Exception exc) {
        return new z0(str, exc, true, 4);
    }

    public static z0 c(String str) {
        return new z0(str, null, false, 1);
    }
}
