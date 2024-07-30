package androidx.work;

import android.net.Uri;
import b2.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r1.e;
import r1.o;
import r1.p;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f2599a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2600b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f2601c;

    /* renamed from: d, reason: collision with root package name */
    public final p f2602d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2603e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f2604a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f2605b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, b bVar, List list, ExecutorService executorService, o oVar, r rVar) {
        this.f2599a = uuid;
        this.f2600b = bVar;
        new HashSet(list);
        this.f2601c = executorService;
        this.f2602d = oVar;
        this.f2603e = rVar;
    }
}
