package p2;

import android.content.Context;
import g2.f0;
import g2.h;
import g2.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f34236a;

    /* renamed from: b, reason: collision with root package name */
    public final b f34237b;

    public f(e eVar, b bVar) {
        this.f34236a = eVar;
        this.f34237b = bVar;
    }

    public final f0<h> a(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        f0<h> f;
        f0<h> f0Var;
        c cVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        e eVar = this.f34236a;
        if (!contains && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            s2.c.a();
            cVar = c.JSON;
            if (str3 != null && eVar != null) {
                f0Var = p.c(new FileInputStream(eVar.c(str, inputStream, cVar).getAbsolutePath()), str);
            } else {
                f0Var = p.c(inputStream, null);
            }
        } else {
            s2.c.a();
            c cVar2 = c.ZIP;
            if (str3 != null && eVar != null) {
                f = p.f(context, new ZipInputStream(new FileInputStream(eVar.c(str, inputStream, cVar2))), str);
            } else {
                f = p.f(context, new ZipInputStream(inputStream), null);
            }
            f0Var = f;
            cVar = cVar2;
        }
        if (str3 != null && f0Var.f28396a != null && eVar != null) {
            File file = new File(eVar.b(), e.a(str, cVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            s2.c.a();
            if (!renameTo) {
                s2.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return f0Var;
    }
}
