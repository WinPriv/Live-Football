package l5;

import java.util.NoSuchElementException;

/* compiled from: BaseMediaChunkIterator.java */
/* loaded from: classes2.dex */
public abstract class b implements m {

    /* renamed from: b, reason: collision with root package name */
    public final long f32488b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32489c;

    /* renamed from: d, reason: collision with root package name */
    public long f32490d;

    public b(long j10, long j11) {
        this.f32488b = j10;
        this.f32489c = j11;
        this.f32490d = j10 - 1;
    }

    public final void c() {
        long j10 = this.f32490d;
        if (j10 >= this.f32488b && j10 <= this.f32489c) {
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // l5.m
    public final boolean next() {
        boolean z10;
        long j10 = this.f32490d + 1;
        this.f32490d = j10;
        if (j10 > this.f32489c) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
