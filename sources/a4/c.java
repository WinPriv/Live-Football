package a4;

import android.content.Context;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f243a;

    /* renamed from: b, reason: collision with root package name */
    public final i4.a f244b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.a f245c;

    /* renamed from: d, reason: collision with root package name */
    public final String f246d;

    public c(Context context, i4.a aVar, i4.a aVar2, String str) {
        if (context != null) {
            this.f243a = context;
            if (aVar != null) {
                this.f244b = aVar;
                if (aVar2 != null) {
                    this.f245c = aVar2;
                    if (str != null) {
                        this.f246d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // a4.h
    public final Context a() {
        return this.f243a;
    }

    @Override // a4.h
    public final String b() {
        return this.f246d;
    }

    @Override // a4.h
    public final i4.a c() {
        return this.f245c;
    }

    @Override // a4.h
    public final i4.a d() {
        return this.f244b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f243a.equals(hVar.a()) && this.f244b.equals(hVar.d()) && this.f245c.equals(hVar.c()) && this.f246d.equals(hVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f243a.hashCode() ^ 1000003) * 1000003) ^ this.f244b.hashCode()) * 1000003) ^ this.f245c.hashCode()) * 1000003) ^ this.f246d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f243a);
        sb2.append(", wallClock=");
        sb2.append(this.f244b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f245c);
        sb2.append(", backendName=");
        return a3.l.p(sb2, this.f246d, "}");
    }
}
