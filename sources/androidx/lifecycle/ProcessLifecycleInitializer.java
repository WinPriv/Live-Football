package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements l1.b<m> {
    @Override // l1.b
    public final List<Class<? extends l1.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // l1.b
    public final m b(Context context) {
        if (l1.a.c(context).f32315b.contains(ProcessLifecycleInitializer.class)) {
            if (!j.f1982a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new j.a());
            }
            t tVar = t.A;
            tVar.getClass();
            tVar.f1998w = new Handler();
            tVar.f1999x.f(i.b.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new u(tVar));
            return tVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
