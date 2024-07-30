package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import r1.h;
import r1.m;
import s1.j;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements l1.b<m> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2597a = h.e("WrkMgrInitializer");

    @Override // l1.b
    public final List<Class<? extends l1.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // l1.b
    public final m b(Context context) {
        h.c().a(f2597a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        j.c(context, new a(new a.C0024a()));
        return j.b(context);
    }
}
