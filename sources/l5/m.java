package l5;

import java.util.NoSuchElementException;

/* compiled from: MediaChunkIterator.java */
/* loaded from: classes2.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32537a = new a();

    /* compiled from: MediaChunkIterator.java */
    /* loaded from: classes2.dex */
    public class a implements m {
        @Override // l5.m
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // l5.m
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // l5.m
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
