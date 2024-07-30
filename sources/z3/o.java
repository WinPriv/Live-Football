package z3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes.dex */
public final class o implements b4.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f36955a = new o();
    }

    @Override // tc.a
    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
