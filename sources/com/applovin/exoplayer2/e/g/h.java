package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f14426a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14427b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f14428c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f14426a = uuid;
            this.f14427b = i10;
            this.f14428c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    public static UUID b(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 != null) {
            return d10.f14426a;
        }
        return null;
    }

    public static int c(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 != null) {
            return d10.f14427b;
        }
        return -1;
    }

    private static a d(byte[] bArr) {
        y yVar = new y(bArr);
        if (yVar.b() < 32) {
            return null;
        }
        yVar.d(0);
        if (yVar.q() != yVar.a() + 4 || yVar.q() != 1886614376) {
            return null;
        }
        int a10 = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        if (a10 > 1) {
            a3.k.y("Unsupported pssh version: ", a10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(yVar.s(), yVar.s());
        if (a10 == 1) {
            yVar.e(yVar.w() * 16);
        }
        int w10 = yVar.w();
        if (w10 != yVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[w10];
        yVar.a(bArr2, 0, w10);
        return new a(uuid, a10, bArr2);
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? com.anythink.expressad.exoplayer.b.f7294bc : 0);
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

    public static boolean a(byte[] bArr) {
        return d(bArr) != null;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f14426a)) {
            return d10.f14428c;
        }
        q.c("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f14426a + ".");
        return null;
    }
}
