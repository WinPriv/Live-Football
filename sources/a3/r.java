package a3;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
public final class r implements y2.e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f195c;

    /* renamed from: d, reason: collision with root package name */
    public final int f196d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f197e;
    public final Class<?> f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.e f198g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<Class<?>, y2.k<?>> f199h;

    /* renamed from: i, reason: collision with root package name */
    public final y2.g f200i;

    /* renamed from: j, reason: collision with root package name */
    public int f201j;

    public r(Object obj, y2.e eVar, int i10, int i11, t3.b bVar, Class cls, Class cls2, y2.g gVar) {
        androidx.activity.n.n0(obj);
        this.f194b = obj;
        if (eVar != null) {
            this.f198g = eVar;
            this.f195c = i10;
            this.f196d = i11;
            androidx.activity.n.n0(bVar);
            this.f199h = bVar;
            if (cls != null) {
                this.f197e = cls;
                if (cls2 != null) {
                    this.f = cls2;
                    androidx.activity.n.n0(gVar);
                    this.f200i = gVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f194b.equals(rVar.f194b) || !this.f198g.equals(rVar.f198g) || this.f196d != rVar.f196d || this.f195c != rVar.f195c || !this.f199h.equals(rVar.f199h) || !this.f197e.equals(rVar.f197e) || !this.f.equals(rVar.f) || !this.f200i.equals(rVar.f200i)) {
            return false;
        }
        return true;
    }

    @Override // y2.e
    public final int hashCode() {
        if (this.f201j == 0) {
            int hashCode = this.f194b.hashCode();
            this.f201j = hashCode;
            int hashCode2 = ((((this.f198g.hashCode() + (hashCode * 31)) * 31) + this.f195c) * 31) + this.f196d;
            this.f201j = hashCode2;
            int hashCode3 = this.f199h.hashCode() + (hashCode2 * 31);
            this.f201j = hashCode3;
            int hashCode4 = this.f197e.hashCode() + (hashCode3 * 31);
            this.f201j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.f201j = hashCode5;
            this.f201j = this.f200i.hashCode() + (hashCode5 * 31);
        }
        return this.f201j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f194b + ", width=" + this.f195c + ", height=" + this.f196d + ", resourceClass=" + this.f197e + ", transcodeClass=" + this.f + ", signature=" + this.f198g + ", hashCode=" + this.f201j + ", transformations=" + this.f199h + ", options=" + this.f200i + '}';
    }
}
