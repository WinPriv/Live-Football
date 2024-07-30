package t7;

import android.os.StrictMode;
import com.applovin.exoplayer2.b.e0;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* compiled from: CustomThreadFactory.java */
/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f35513e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f35514a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f35515b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35516c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f35517d;

    public a(String str, int i10, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f35515b = str;
        this.f35516c = i10;
        this.f35517d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f35513e.newThread(new e0(10, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f35515b, Long.valueOf(this.f35514a.getAndIncrement())));
        return newThread;
    }
}
