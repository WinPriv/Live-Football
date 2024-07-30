package v9;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w9.a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f35997c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f35998a;

    /* renamed from: b, reason: collision with root package name */
    public final a.ExecutorC0500a f35999b;

    public d() {
        w9.a aVar = w9.a.f36161b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(w9.a.f36162c, w9.a.f36163d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f35998a = threadPoolExecutor;
        this.f35999b = w9.a.f36161b.f36164a;
    }
}
