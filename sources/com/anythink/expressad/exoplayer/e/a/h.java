package com.anythink.expressad.exoplayer.e.a;

import android.util.Log;
import com.anythink.expressad.exoplayer.k.s;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7883a = "PsshAtomUtil";

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f7884a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7885b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f7886c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f7884a = uuid;
            this.f7885b = i10;
            this.f7886c = bArr;
        }
    }

    private h() {
    }

    private static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z10 = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int i10 = length + 32;
        if (z10) {
            i10 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.putInt(i10);
        allocate.putInt(com.anythink.expressad.exoplayer.e.a.a.Z);
        allocate.putInt(z10 ? com.anythink.expressad.exoplayer.b.f7294bc : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (z10) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static int b(byte[] bArr) {
        a c10 = c(bArr);
        if (c10 != null) {
            return c10.f7885b;
        }
        return -1;
    }

    private static a c(byte[] bArr) {
        s sVar = new s(bArr);
        if (sVar.b() < 32) {
            return null;
        }
        sVar.c(0);
        if (sVar.i() != sVar.a() + 4 || sVar.i() != com.anythink.expressad.exoplayer.e.a.a.Z) {
            return null;
        }
        int a10 = com.anythink.expressad.exoplayer.e.a.a.a(sVar.i());
        if (a10 > 1) {
            Log.w(f7883a, "Unsupported pssh version: ".concat(String.valueOf(a10)));
            return null;
        }
        UUID uuid = new UUID(sVar.j(), sVar.j());
        if (a10 == 1) {
            sVar.d(sVar.m() * 16);
        }
        int m10 = sVar.m();
        if (m10 != sVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[m10];
        sVar.a(bArr2, 0, m10);
        return new a(uuid, a10, bArr2);
    }

    public static UUID a(byte[] bArr) {
        a c10 = c(bArr);
        if (c10 == null) {
            return null;
        }
        return c10.f7884a;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a c10 = c(bArr);
        if (c10 == null) {
            return null;
        }
        if (uuid == null || uuid.equals(c10.f7884a)) {
            return c10.f7886c;
        }
        Log.w(f7883a, "UUID mismatch. Expected: " + uuid + ", got: " + c10.f7884a + ".");
        return null;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i10 = length + 32;
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.putInt(i10);
        allocate.putInt(com.anythink.expressad.exoplayer.e.a.a.Z);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }
}
