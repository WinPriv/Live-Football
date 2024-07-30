package com.applovin.exoplayer2.g.b;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f15111a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f15112b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f15111a = byteArrayOutputStream;
        this.f15112b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(a aVar) {
        this.f15111a.reset();
        try {
            a(this.f15112b, aVar.f15105a);
            String str = aVar.f15106b;
            if (str == null) {
                str = "";
            }
            a(this.f15112b, str);
            this.f15112b.writeLong(aVar.f15107c);
            this.f15112b.writeLong(aVar.f15108d);
            this.f15112b.write(aVar.f15109e);
            this.f15112b.flush();
            return this.f15111a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
