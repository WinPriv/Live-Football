package a3;

import u3.a;
import u3.d;

/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class w<Z> implements x<Z>, a.d {

    /* renamed from: w, reason: collision with root package name */
    public static final a.c f219w = u3.a.a(20, new a());

    /* renamed from: s, reason: collision with root package name */
    public final d.a f220s = new d.a();

    /* renamed from: t, reason: collision with root package name */
    public x<Z> f221t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f222u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f223v;

    /* compiled from: LockedResource.java */
    /* loaded from: classes.dex */
    public class a implements a.b<w<?>> {
        @Override // u3.a.b
        public final w<?> create() {
            return new w<>();
        }
    }

    @Override // a3.x
    public final synchronized void a() {
        this.f220s.a();
        this.f223v = true;
        if (!this.f222u) {
            this.f221t.a();
            this.f221t = null;
            f219w.a(this);
        }
    }

    @Override // u3.a.d
    public final d.a b() {
        return this.f220s;
    }

    @Override // a3.x
    public final Class<Z> c() {
        return this.f221t.c();
    }

    public final synchronized void d() {
        this.f220s.a();
        if (this.f222u) {
            this.f222u = false;
            if (this.f223v) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // a3.x
    public final Z get() {
        return this.f221t.get();
    }

    @Override // a3.x
    public final int getSize() {
        return this.f221t.getSize();
    }
}
