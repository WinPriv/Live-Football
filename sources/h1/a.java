package h1;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f28653e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f28654a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f28655b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28656c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f28657d;

    public a(File file, String str, boolean z10) {
        Lock lock;
        File file2 = new File(file, com.ironsource.adapters.facebook.a.h(str, ".lck"));
        this.f28654a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = f28653e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f28655b = lock;
        this.f28656c = z10;
    }

    public final void a() {
        FileChannel fileChannel = this.f28657d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f28655b.unlock();
    }
}
