package i8;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* compiled from: TopicsStore.java */
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference<b0> f29236c;

    /* renamed from: a, reason: collision with root package name */
    public y f29237a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f29238b;

    public b0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f29238b = scheduledExecutorService;
    }

    public final synchronized a0 a() {
        String peek;
        a0 a0Var;
        y yVar = this.f29237a;
        synchronized (yVar.f29313d) {
            peek = yVar.f29313d.peek();
        }
        Pattern pattern = a0.f29230d;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                a0Var = new a0(split[0], split[1]);
            }
        }
        a0Var = null;
        return a0Var;
    }
}
