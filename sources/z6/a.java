package z6;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: t, reason: collision with root package name */
    public final Typeface f37307t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0516a f37308u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f37309v;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: z6.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0516a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0516a interfaceC0516a, Typeface typeface) {
        super(0);
        this.f37307t = typeface;
        this.f37308u = interfaceC0516a;
    }

    @Override // z6.f
    public final void q(int i10) {
        if (!this.f37309v) {
            this.f37308u.a(this.f37307t);
        }
    }

    @Override // z6.f
    public final void r(Typeface typeface, boolean z10) {
        if (!this.f37309v) {
            this.f37308u.a(typeface);
        }
    }
}
