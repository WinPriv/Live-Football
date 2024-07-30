package o8;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public final class y extends z {
    @Override // o8.z
    public final <T> T b(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
