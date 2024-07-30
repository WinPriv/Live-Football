package a5;

import d6.p;
import d6.w;
import java.io.IOException;
import k4.z0;
import p4.e;

/* compiled from: WavHeaderReader.java */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: WavHeaderReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f292a;

        /* renamed from: b, reason: collision with root package name */
        public final long f293b;

        public a(int i10, long j10) {
            this.f292a = i10;
            this.f293b = j10;
        }

        public static a a(e eVar, w wVar) throws IOException {
            eVar.c(wVar.f27384a, 0, 8, false);
            wVar.E(0);
            return new a(wVar.d(), wVar.j());
        }
    }

    public static boolean a(e eVar) throws IOException {
        w wVar = new w(8);
        int i10 = a.a(eVar, wVar).f292a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        eVar.c(wVar.f27384a, 0, 4, false);
        wVar.E(0);
        int d10 = wVar.d();
        if (d10 != 1463899717) {
            p.c("WavHeaderReader", "Unsupported form type: " + d10);
            return false;
        }
        return true;
    }

    public static a b(int i10, e eVar, w wVar) throws IOException {
        a a10 = a.a(eVar, wVar);
        while (a10.f292a != i10) {
            StringBuilder sb2 = new StringBuilder("Ignoring unknown WAV chunk: ");
            int i11 = a10.f292a;
            sb2.append(i11);
            p.f("WavHeaderReader", sb2.toString());
            long j10 = a10.f293b + 8;
            if (j10 <= 2147483647L) {
                eVar.i((int) j10);
                a10 = a.a(eVar, wVar);
            } else {
                throw z0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
        }
        return a10;
    }
}
