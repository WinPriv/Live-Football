package c2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectExecutor.java */
/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: s, reason: collision with root package name */
    public static final b f3226s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f3227t;

    static {
        b bVar = new b();
        f3226s = bVar;
        f3227t = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3227t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
