package f8;

import f8.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import n7.e;
import org.json.JSONException;
import org.json.JSONObject;
import s.f;

/* compiled from: PersistedInstallation.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public File f28164a;

    /* renamed from: b, reason: collision with root package name */
    public final e f28165b;

    public c(e eVar) {
        this.f28165b = eVar;
    }

    public final File a() {
        if (this.f28164a == null) {
            synchronized (this) {
                if (this.f28164a == null) {
                    e eVar = this.f28165b;
                    eVar.a();
                    this.f28164a = new File(eVar.f33458a.getFilesDir(), "PersistedInstallation." + this.f28165b.c() + ".json");
                }
            }
        }
        return this.f28164a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f28149b);
            jSONObject.put("Status", f.c(aVar.f28150c));
            jSONObject.put("AuthToken", aVar.f28151d);
            jSONObject.put("RefreshToken", aVar.f28152e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f28153g);
            jSONObject.put("ExpiresInSecs", aVar.f);
            jSONObject.put("FisError", aVar.f28154h);
            e eVar = this.f28165b;
            eVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", eVar.f33458a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = d.f28166a;
        a.C0379a c0379a = new a.C0379a();
        c0379a.f = 0L;
        c0379a.b(1);
        c0379a.f28159e = 0L;
        c0379a.f28155a = optString;
        c0379a.b(f.d(5)[optInt]);
        c0379a.f28157c = optString2;
        c0379a.f28158d = optString3;
        c0379a.f = Long.valueOf(optLong);
        c0379a.f28159e = Long.valueOf(optLong2);
        c0379a.f28160g = optString4;
        return c0379a.a();
    }
}
