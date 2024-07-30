package v0;

import java.nio.ByteBuffer;
import l3.d;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f35904a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f35905b;

    /* renamed from: c, reason: collision with root package name */
    public int f35906c;

    /* renamed from: d, reason: collision with root package name */
    public int f35907d;

    public c() {
        if (d.f32367t == null) {
            d.f32367t = new d();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f35907d) {
            return this.f35905b.getShort(this.f35906c + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        this.f35905b = byteBuffer;
        if (byteBuffer != null) {
            this.f35904a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f35906c = i11;
            this.f35907d = this.f35905b.getShort(i11);
            return;
        }
        this.f35904a = 0;
        this.f35906c = 0;
        this.f35907d = 0;
    }
}
