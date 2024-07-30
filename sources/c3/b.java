package c3;

import androidx.activity.n;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3228a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C0038b f3229b = new C0038b();

    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ReentrantLock f3230a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        public int f3231b;
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: c3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0038b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f3232a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f3228a.get(str);
            n.n0(obj);
            aVar = (a) obj;
            int i10 = aVar.f3231b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f3231b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f3228a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0038b c0038b = this.f3229b;
                        synchronized (c0038b.f3232a) {
                            if (c0038b.f3232a.size() < 10) {
                                c0038b.f3232a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f3231b);
            }
        }
        aVar.f3230a.unlock();
    }
}
