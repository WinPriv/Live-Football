package s7;

import com.applovin.exoplayer2.b0;

/* compiled from: OptionalProvider.java */
/* loaded from: classes2.dex */
public final class t<T> implements c8.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f35254c = new b0(23);

    /* renamed from: d, reason: collision with root package name */
    public static final s f35255d = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public b0 f35256a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c8.a<T> f35257b;

    public t() {
        b0 b0Var = f35254c;
        s sVar = f35255d;
        this.f35256a = b0Var;
        this.f35257b = sVar;
    }

    @Override // c8.a
    public final T get() {
        return this.f35257b.get();
    }
}
