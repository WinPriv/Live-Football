package d6;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Clock.java */
/* loaded from: classes2.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f27283a = new a0();

    long a();

    b0 b(Looper looper, Handler.Callback callback);

    void c();

    long elapsedRealtime();
}
