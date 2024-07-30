package com.anythink.expressad.exoplayer.j.a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final l f8773b = new l(Collections.emptyMap());

    /* renamed from: c, reason: collision with root package name */
    private static final int f8774c = 10485760;

    /* renamed from: d, reason: collision with root package name */
    private int f8775d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, byte[]> f8776e;

    private l(Map<String, byte[]> map) {
        this.f8776e = Collections.unmodifiableMap(map);
    }

    public static l a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0 && readInt2 <= f8774c) {
                byte[] bArr = new byte[readInt2];
                dataInputStream.readFully(bArr);
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException("Invalid value size: ".concat(String.valueOf(readInt2)));
            }
        }
        return new l(hashMap);
    }

    @Override // com.anythink.expressad.exoplayer.j.a.i
    public final boolean b(String str) {
        return this.f8776e.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return a(((l) obj).f8776e);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8775d == 0) {
            int i10 = 0;
            for (Map.Entry<String, byte[]> entry : this.f8776e.entrySet()) {
                i10 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f8775d = i10;
        }
        return this.f8775d;
    }

    public final l a(k kVar) {
        HashMap hashMap = new HashMap(this.f8776e);
        a((HashMap<String, byte[]>) hashMap, kVar.a());
        a((HashMap<String, byte[]>) hashMap, kVar.b());
        return a((Map<String, byte[]>) hashMap) ? this : new l(hashMap);
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f8776e.size());
        for (Map.Entry<String, byte[]> entry : this.f8776e.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.a.i
    public final byte[] a(String str, byte[] bArr) {
        if (!this.f8776e.containsKey(str)) {
            return bArr;
        }
        byte[] bArr2 = this.f8776e.get(str);
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // com.anythink.expressad.exoplayer.j.a.i
    public final String a(String str, String str2) {
        return this.f8776e.containsKey(str) ? new String(this.f8776e.get(str), Charset.forName("UTF-8")) : str2;
    }

    @Override // com.anythink.expressad.exoplayer.j.a.i
    public final long a(String str) {
        if (this.f8776e.containsKey(str)) {
            return ByteBuffer.wrap(this.f8776e.get(str)).getLong();
        }
        return -1L;
    }

    private boolean a(Map<String, byte[]> map) {
        if (this.f8776e.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.f8776e.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, byte[]> a(Map<String, byte[]> map, k kVar) {
        HashMap hashMap = new HashMap(map);
        a((HashMap<String, byte[]>) hashMap, kVar.a());
        a((HashMap<String, byte[]>) hashMap, kVar.b());
        return hashMap;
    }

    private static void a(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.remove(list.get(i10));
        }
    }

    private static void a(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        byte[] bArr;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bArr = ((String) obj).getBytes(Charset.forName("UTF-8"));
            } else if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else {
                throw new IllegalArgumentException();
            }
            if (bArr.length <= f8774c) {
                hashMap.put(str, bArr);
            } else {
                throw new IllegalArgumentException(String.format("The size of %s (%d) is greater than maximum allowed: %d", str, Integer.valueOf(bArr.length), Integer.valueOf(f8774c)));
            }
        }
    }

    private static byte[] a(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }
}
