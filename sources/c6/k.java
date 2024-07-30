package c6;

import java.io.IOException;

/* compiled from: DataSourceException.java */
/* loaded from: classes2.dex */
public class k extends IOException {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f3369t = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int f3370s;

    public k(int i10) {
        this.f3370s = i10;
    }

    public k(Throwable th, int i10) {
        super(th);
        this.f3370s = i10;
    }

    public k(String str, int i10) {
        super(str);
        this.f3370s = i10;
    }

    public k(String str, Throwable th, int i10) {
        super(str, th);
        this.f3370s = i10;
    }
}
