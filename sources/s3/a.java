package s3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t3.l;
import y2.e;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final int f35116b;

    /* renamed from: c, reason: collision with root package name */
    public final e f35117c;

    public a(int i10, e eVar) {
        this.f35116b = i10;
        this.f35117c = eVar;
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        this.f35117c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f35116b).array());
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f35116b != aVar.f35116b || !this.f35117c.equals(aVar.f35117c)) {
            return false;
        }
        return true;
    }

    @Override // y2.e
    public final int hashCode() {
        return l.f(this.f35116b, this.f35117c);
    }
}
