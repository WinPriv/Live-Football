package s7;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements c8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35227a;

    @Override // c8.a
    public final Object get() {
        switch (this.f35227a) {
            case 0:
                return Collections.emptySet();
            default:
                p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f21263a;
                return Executors.newSingleThreadScheduledExecutor(new t7.a("Firebase Scheduler", 0, null));
        }
    }
}
