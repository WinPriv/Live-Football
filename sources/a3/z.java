package a3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
public final class z implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final t3.i<Class<?>, byte[]> f231j = new t3.i<>(50);

    /* renamed from: b, reason: collision with root package name */
    public final b3.b f232b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.e f233c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.e f234d;

    /* renamed from: e, reason: collision with root package name */
    public final int f235e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f236g;

    /* renamed from: h, reason: collision with root package name */
    public final y2.g f237h;

    /* renamed from: i, reason: collision with root package name */
    public final y2.k<?> f238i;

    public z(b3.b bVar, y2.e eVar, y2.e eVar2, int i10, int i11, y2.k<?> kVar, Class<?> cls, y2.g gVar) {
        this.f232b = bVar;
        this.f233c = eVar;
        this.f234d = eVar2;
        this.f235e = i10;
        this.f = i11;
        this.f238i = kVar;
        this.f236g = cls;
        this.f237h = gVar;
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        b3.b bVar = this.f232b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.f235e).putInt(this.f).array();
        this.f234d.a(messageDigest);
        this.f233c.a(messageDigest);
        messageDigest.update(bArr);
        y2.k<?> kVar = this.f238i;
        if (kVar != null) {
            kVar.a(messageDigest);
        }
        this.f237h.a(messageDigest);
        t3.i<Class<?>, byte[]> iVar = f231j;
        Class<?> cls = this.f236g;
        byte[] a10 = iVar.a(cls);
        if (a10 == null) {
            a10 = cls.getName().getBytes(y2.e.f36561a);
            iVar.d(cls, a10);
        }
        messageDigest.update(a10);
        bVar.put(bArr);
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f != zVar.f || this.f235e != zVar.f235e || !t3.l.b(this.f238i, zVar.f238i) || !this.f236g.equals(zVar.f236g) || !this.f233c.equals(zVar.f233c) || !this.f234d.equals(zVar.f234d) || !this.f237h.equals(zVar.f237h)) {
            return false;
        }
        return true;
    }

    @Override // y2.e
    public final int hashCode() {
        int hashCode = ((((this.f234d.hashCode() + (this.f233c.hashCode() * 31)) * 31) + this.f235e) * 31) + this.f;
        y2.k<?> kVar = this.f238i;
        if (kVar != null) {
            hashCode = (hashCode * 31) + kVar.hashCode();
        }
        return this.f237h.hashCode() + ((this.f236g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f233c + ", signature=" + this.f234d + ", width=" + this.f235e + ", height=" + this.f + ", decodedResourceClass=" + this.f236g + ", transformation='" + this.f238i + "', options=" + this.f237h + '}';
    }
}
