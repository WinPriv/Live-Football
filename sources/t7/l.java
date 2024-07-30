package t7;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiExecutor.java */
/* loaded from: classes2.dex */
public final class l implements Executor {

    /* renamed from: s, reason: collision with root package name */
    public static final l f35552s;

    /* renamed from: t, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler f35553t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ l[] f35554u;

    static {
        l lVar = new l();
        f35552s = lVar;
        f35554u = new l[]{lVar};
        f35553t = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f35554u.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f35553t.post(runnable);
    }
}
