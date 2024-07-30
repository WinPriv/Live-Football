package w2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {
    public BufferedWriter A;
    public int C;

    /* renamed from: s, reason: collision with root package name */
    public final File f36042s;

    /* renamed from: t, reason: collision with root package name */
    public final File f36043t;

    /* renamed from: u, reason: collision with root package name */
    public final File f36044u;

    /* renamed from: v, reason: collision with root package name */
    public final File f36045v;

    /* renamed from: x, reason: collision with root package name */
    public final long f36047x;

    /* renamed from: z, reason: collision with root package name */
    public long f36048z = 0;
    public final LinkedHashMap<String, d> B = new LinkedHashMap<>(0, 0.75f, true);
    public long D = 0;
    public final ThreadPoolExecutor E = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final CallableC0498a F = new CallableC0498a();

    /* renamed from: w, reason: collision with root package name */
    public final int f36046w = 1;
    public final int y = 1;

    /* compiled from: DiskLruCache.java */
    /* renamed from: w2.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0498a implements Callable<Void> {
        public CallableC0498a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.A != null) {
                    aVar.Q();
                    if (a.this.h()) {
                        a.this.m();
                        a.this.C = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f36050a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f36051b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f36052c;

        public c(d dVar) {
            boolean[] zArr;
            this.f36050a = dVar;
            if (dVar.f36058e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.y];
            }
            this.f36051b = zArr;
        }

        public final void a() throws IOException {
            a.b(a.this, this, false);
        }

        public final File b() throws IOException {
            File file;
            synchronized (a.this) {
                d dVar = this.f36050a;
                if (dVar.f == this) {
                    if (!dVar.f36058e) {
                        this.f36051b[0] = true;
                    }
                    file = dVar.f36057d[0];
                    a.this.f36042s.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f36054a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f36055b;

        /* renamed from: c, reason: collision with root package name */
        public final File[] f36056c;

        /* renamed from: d, reason: collision with root package name */
        public final File[] f36057d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f36058e;
        public c f;

        public d(String str) {
            this.f36054a = str;
            int i10 = a.this.y;
            this.f36055b = new long[i10];
            this.f36056c = new File[i10];
            this.f36057d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.y; i11++) {
                sb2.append(i11);
                File[] fileArr = this.f36056c;
                String sb3 = sb2.toString();
                File file = a.this.f36042s;
                fileArr[i11] = new File(file, sb3);
                sb2.append(".tmp");
                this.f36057d[i11] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f36055b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final File[] f36060a;

        public e(File[] fileArr) {
            this.f36060a = fileArr;
        }
    }

    public a(File file, long j10) {
        this.f36042s = file;
        this.f36043t = new File(file, "journal");
        this.f36044u = new File(file, "journal.tmp");
        this.f36045v = new File(file, "journal.bkp");
        this.f36047x = j10;
    }

    public static void P(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            d(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public static void b(a aVar, c cVar, boolean z10) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.f36050a;
            if (dVar.f == cVar) {
                if (z10 && !dVar.f36058e) {
                    for (int i10 = 0; i10 < aVar.y; i10++) {
                        if (cVar.f36051b[i10]) {
                            if (!dVar.f36057d[i10].exists()) {
                                cVar.a();
                                return;
                            }
                        } else {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < aVar.y; i11++) {
                    File file = dVar.f36057d[i11];
                    if (z10) {
                        if (file.exists()) {
                            File file2 = dVar.f36056c[i11];
                            file.renameTo(file2);
                            long j10 = dVar.f36055b[i11];
                            long length = file2.length();
                            dVar.f36055b[i11] = length;
                            aVar.f36048z = (aVar.f36048z - j10) + length;
                        }
                    } else {
                        d(file);
                    }
                }
                aVar.C++;
                dVar.f = null;
                if (dVar.f36058e | z10) {
                    dVar.f36058e = true;
                    aVar.A.append((CharSequence) "CLEAN");
                    aVar.A.append(' ');
                    aVar.A.append((CharSequence) dVar.f36054a);
                    aVar.A.append((CharSequence) dVar.a());
                    aVar.A.append('\n');
                    if (z10) {
                        aVar.D++;
                        dVar.getClass();
                    }
                } else {
                    aVar.B.remove(dVar.f36054a);
                    aVar.A.append((CharSequence) "REMOVE");
                    aVar.A.append(' ');
                    aVar.A.append((CharSequence) dVar.f36054a);
                    aVar.A.append('\n');
                }
                f(aVar.A);
                if (aVar.f36048z > aVar.f36047x || aVar.h()) {
                    aVar.E.submit(aVar.F);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    @TargetApi(26)
    public static void c(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void f(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a i(File file, long j10) throws IOException {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    P(file2, file3, false);
                }
            }
            a aVar = new a(file, j10);
            if (aVar.f36043t.exists()) {
                try {
                    aVar.k();
                    aVar.j();
                    return aVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    w2.c.a(aVar.f36042s);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.m();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void Q() throws IOException {
        while (this.f36048z > this.f36047x) {
            String key = this.B.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.A != null) {
                    d dVar = this.B.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i10 = 0; i10 < this.y; i10++) {
                            File file = dVar.f36056c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f36048z;
                            long[] jArr = dVar.f36055b;
                            this.f36048z = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.C++;
                        this.A.append((CharSequence) "REMOVE");
                        this.A.append(' ');
                        this.A.append((CharSequence) key);
                        this.A.append('\n');
                        this.B.remove(key);
                        if (h()) {
                            this.E.submit(this.F);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A == null) {
            return;
        }
        Iterator it = new ArrayList(this.B.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f;
            if (cVar != null) {
                cVar.a();
            }
        }
        Q();
        c(this.A);
        this.A = null;
    }

    public final c e(String str) throws IOException {
        synchronized (this) {
            if (this.A != null) {
                d dVar = this.B.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.B.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.A.append((CharSequence) "DIRTY");
                this.A.append(' ');
                this.A.append((CharSequence) str);
                this.A.append('\n');
                f(this.A);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e g(String str) throws IOException {
        if (this.A != null) {
            d dVar = this.B.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f36058e) {
                return null;
            }
            for (File file : dVar.f36056c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.C++;
            this.A.append((CharSequence) "READ");
            this.A.append(' ');
            this.A.append((CharSequence) str);
            this.A.append('\n');
            if (h()) {
                this.E.submit(this.F);
            }
            return new e(dVar.f36056c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean h() {
        int i10 = this.C;
        if (i10 >= 2000 && i10 >= this.B.size()) {
            return true;
        }
        return false;
    }

    public final void j() throws IOException {
        d(this.f36044u);
        Iterator<d> it = this.B.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i10 = this.y;
            int i11 = 0;
            if (cVar == null) {
                while (i11 < i10) {
                    this.f36048z += next.f36055b[i11];
                    i11++;
                }
            } else {
                next.f = null;
                while (i11 < i10) {
                    d(next.f36056c[i11]);
                    d(next.f36057d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void k() throws IOException {
        File file = this.f36043t;
        w2.b bVar = new w2.b(new FileInputStream(file), w2.c.f36067a);
        try {
            String b10 = bVar.b();
            String b11 = bVar.b();
            String b12 = bVar.b();
            String b13 = bVar.b();
            String b14 = bVar.b();
            if ("libcore.io.DiskLruCache".equals(b10) && "1".equals(b11) && Integer.toString(this.f36046w).equals(b12) && Integer.toString(this.y).equals(b13) && "".equals(b14)) {
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    try {
                        l(bVar.b());
                        i10++;
                    } catch (EOFException unused) {
                        this.C = i10 - this.B.size();
                        if (bVar.f36065w == -1) {
                            z10 = true;
                        }
                        if (z10) {
                            m();
                        } else {
                            this.A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), w2.c.f36067a));
                        }
                        try {
                            bVar.close();
                            return;
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + b10 + ", " + b11 + ", " + b13 + ", " + b14 + "]");
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void l(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            LinkedHashMap<String, d> linkedHashMap = this.B;
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                linkedHashMap.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f36058e = true;
                dVar.f = null;
                if (split.length == a.this.y) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            dVar.f36055b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void m() throws IOException {
        BufferedWriter bufferedWriter = this.A;
        if (bufferedWriter != null) {
            c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36044u), w2.c.f36067a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f36046w));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.y));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d dVar : this.B.values()) {
                if (dVar.f != null) {
                    bufferedWriter2.write("DIRTY " + dVar.f36054a + '\n');
                } else {
                    bufferedWriter2.write("CLEAN " + dVar.f36054a + dVar.a() + '\n');
                }
            }
            c(bufferedWriter2);
            if (this.f36043t.exists()) {
                P(this.f36043t, this.f36045v, true);
            }
            P(this.f36044u, this.f36043t, false);
            this.f36045v.delete();
            this.A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36043t, true), w2.c.f36067a));
        } catch (Throwable th) {
            c(bufferedWriter2);
            throw th;
        }
    }
}
