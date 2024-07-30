package x4;

import com.anythink.expressad.exoplayer.k.p;
import d6.w;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PsshAtomUtil.java */
/* loaded from: classes2.dex */
public final class h {

    /* compiled from: PsshAtomUtil.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f36429a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36430b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f36431c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f36429a = uuid;
            this.f36430b = i10;
            this.f36431c = bArr;
        }
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i10;
        int i11;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        int i12 = i10 + 32;
        if (uuidArr != null) {
            i12 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12);
        allocate.putInt(i12);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i11 = com.anythink.expressad.exoplayer.b.f7294bc;
        } else {
            i11 = 0;
        }
        allocate.putInt(i11);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static a b(byte[] bArr) {
        w wVar = new w(bArr);
        if (wVar.f27386c < 32) {
            return null;
        }
        wVar.E(0);
        if (wVar.d() != (wVar.f27386c - wVar.f27385b) + 4 || wVar.d() != 1886614376) {
            return null;
        }
        int d10 = (wVar.d() >> 24) & p.f9095b;
        if (d10 > 1) {
            a3.k.s("Unsupported pssh version: ", d10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(wVar.m(), wVar.m());
        if (d10 == 1) {
            wVar.F(wVar.w() * 16);
        }
        int w10 = wVar.w();
        if (w10 != wVar.f27386c - wVar.f27385b) {
            return null;
        }
        byte[] bArr2 = new byte[w10];
        wVar.b(bArr2, 0, w10);
        return new a(uuid, d10, bArr2);
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        a b10 = b(bArr);
        if (b10 == null) {
            return null;
        }
        UUID uuid2 = b10.f36429a;
        if (!uuid.equals(uuid2)) {
            d6.p.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return b10.f36431c;
    }
}
