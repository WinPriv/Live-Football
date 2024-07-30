package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.k;
import com.anythink.expressad.foundation.h.o;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends i<String> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9967c = "f";

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f9968d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.c.b[] f9969e;
    private String f;

    private f(int i10, String str, Map<String, String> map, com.anythink.expressad.foundation.g.f.c.b[] bVarArr, com.anythink.expressad.foundation.g.f.e<String> eVar) {
        super(i10, str, eVar);
        this.f = "---------Ij5ei4KM7KM7ae0KM7cH2ae0Ij5Ef1";
        this.f9968d = map;
        this.f9969e = bVarArr;
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final void a(OutputStream outputStream) {
        DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
        try {
            try {
                com.anythink.expressad.foundation.g.f.c.b[] bVarArr = this.f9969e;
                if (bVarArr != null) {
                    for (com.anythink.expressad.foundation.g.f.c.b bVar : bVarArr) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("--");
                        sb2.append(this.f);
                        sb2.append("\r\n");
                        sb2.append("Content-Disposition: form-data;name=\"" + bVar.f() + "\";filename=\"" + bVar.e() + "\"\r\n");
                        StringBuilder sb3 = new StringBuilder("Content-Type: ");
                        sb3.append(bVar.g());
                        sb3.append("\r\n\r\n");
                        sb2.append(sb3.toString());
                        dataOutputStream.write(sb2.toString().getBytes());
                        if (bVar.c() != null) {
                            byte[] bArr = new byte[1024];
                            int i10 = 0;
                            while (true) {
                                int read = bVar.c().read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                dataOutputStream.write(bArr, 0, read);
                                i10 += read;
                                com.anythink.expressad.foundation.g.f.e<T> eVar = this.f10033b;
                                if (eVar != 0) {
                                    eVar.a(bVar.a(), i10);
                                }
                            }
                            bVar.c().close();
                        } else {
                            dataOutputStream.write(bVar.d(), 0, bVar.d().length);
                        }
                        dataOutputStream.write("\r\n".getBytes());
                    }
                }
                dataOutputStream.writeBytes("--" + this.f + "--\r\n");
                dataOutputStream.flush();
                try {
                    dataOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (IOException e11) {
                o.d(f9967c, e11.getMessage());
                this.f10033b.a(new com.anythink.expressad.foundation.g.f.a.a(2, null));
                try {
                    dataOutputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            throw th;
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final byte[] h() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f9968d.entrySet()) {
            sb2.append("--");
            sb2.append(this.f);
            sb2.append("\r\n");
            sb2.append("Content-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n");
            sb2.append(entry.getValue());
            sb2.append("\r\n");
        }
        return sb2.toString().getBytes();
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final void i() {
        super.i();
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "multipart/form-data; boundary=" + this.f);
        a((Map<String, String>) hashMap);
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final k<String> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return k.a(new String(cVar.f9988b, com.anythink.expressad.foundation.g.f.g.e.a(cVar.f9990d)), cVar);
        } catch (UnsupportedEncodingException e10) {
            o.d(f9967c, e10.getMessage());
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
