package com.anythink.core.common.res;

import a3.k;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    static final String f6394a = "journal";

    /* renamed from: b, reason: collision with root package name */
    static final String f6395b = "journal.tmp";

    /* renamed from: c, reason: collision with root package name */
    static final String f6396c = "libcore.io.DiskLruCache";

    /* renamed from: d, reason: collision with root package name */
    static final String f6397d = "1";

    /* renamed from: e, reason: collision with root package name */
    static final long f6398e = -1;
    private static final String f = "CLEAN";

    /* renamed from: g, reason: collision with root package name */
    private static final String f6399g = "DIRTY";

    /* renamed from: h, reason: collision with root package name */
    private static final String f6400h = "REMOVE";

    /* renamed from: i, reason: collision with root package name */
    private static final String f6401i = "READ";

    /* renamed from: j, reason: collision with root package name */
    private static final Charset f6402j = Charset.forName("UTF-8");

    /* renamed from: k, reason: collision with root package name */
    private static final int f6403k = 8192;

    /* renamed from: l, reason: collision with root package name */
    private final File f6404l;

    /* renamed from: m, reason: collision with root package name */
    private final File f6405m;

    /* renamed from: n, reason: collision with root package name */
    private final File f6406n;

    /* renamed from: p, reason: collision with root package name */
    private final long f6407p;

    /* renamed from: s, reason: collision with root package name */
    private Writer f6410s;

    /* renamed from: u, reason: collision with root package name */
    private int f6412u;

    /* renamed from: r, reason: collision with root package name */
    private long f6409r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final LinkedHashMap<String, b> f6411t = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: v, reason: collision with root package name */
    private long f6413v = 0;

    /* renamed from: w, reason: collision with root package name */
    private final ExecutorService f6414w = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: x, reason: collision with root package name */
    private final Callable<Void> f6415x = new Callable<Void>() { // from class: com.anythink.core.common.res.a.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                if (a.this.f6410s != null) {
                    a.this.l();
                    if (a.this.h()) {
                        a.this.d();
                        a.e(a.this);
                    }
                    return null;
                }
                return null;
            }
        }
    };
    private final int o = 1;

    /* renamed from: q, reason: collision with root package name */
    private final int f6408q = 1;

    /* renamed from: com.anythink.core.common.res.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0082a {

        /* renamed from: b, reason: collision with root package name */
        private final b f6429b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6430c;

        /* renamed from: com.anythink.core.common.res.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0084a extends FilterOutputStream {
            public /* synthetic */ C0084a(C0082a c0082a, OutputStream outputStream, byte b10) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0082a.b(C0082a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0082a.b(C0082a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0082a.b(C0082a.this);
                }
            }

            private C0084a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0082a.b(C0082a.this);
                }
            }
        }

        public /* synthetic */ C0082a(a aVar, b bVar, byte b10) {
            this(bVar);
        }

        public static /* synthetic */ boolean b(C0082a c0082a) {
            c0082a.f6430c = true;
            return true;
        }

        private String c(int i10) {
            InputStream b10 = b(i10);
            if (b10 != null) {
                return a.a(b10);
            }
            return null;
        }

        private C0082a(b bVar) {
            this.f6429b = bVar;
        }

        private InputStream b(int i10) {
            synchronized (a.this) {
                if (this.f6429b.f6439e == this) {
                    if (!this.f6429b.f6438d) {
                        return null;
                    }
                    return new FileInputStream(this.f6429b.a(i10));
                }
                throw new IllegalStateException();
            }
        }

        public final OutputStream a(int i10) {
            C0084a c0084a;
            synchronized (a.this) {
                if (this.f6429b.f6439e == this) {
                    c0084a = new C0084a(this, new FileOutputStream(this.f6429b.b(i10)), (byte) 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c0084a;
        }

        private void a(int i10, String str) {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i10), a.f6402j);
                try {
                    outputStreamWriter2.write(str);
                    a.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    a.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void b() {
            a.this.a(this, false);
        }

        public final void a() {
            if (this.f6430c) {
                a.this.a(this, false);
                a.this.c(this.f6429b.f6436b);
            } else {
                a.this.a(this, true);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: b, reason: collision with root package name */
        private final String f6436b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f6437c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6438d;

        /* renamed from: e, reason: collision with root package name */
        private C0082a f6439e;
        private long f;

        public /* synthetic */ b(a aVar, String str, byte b10) {
            this(str);
        }

        private b(String str) {
            this.f6436b = str;
            this.f6437c = new long[a.this.f6408q];
        }

        private static IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ boolean a(b bVar) {
            bVar.f6438d = true;
            return true;
        }

        public final File b(int i10) {
            return new File(a.this.f6404l, this.f6436b + "." + i10 + ".tmp");
        }

        public final String a() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f6437c) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private void a(String[] strArr) {
            if (strArr.length == a.this.f6408q) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f6437c[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        public final File a(int i10) {
            return new File(a.this.f6404l, this.f6436b + "." + i10);
        }

        public static /* synthetic */ void a(b bVar, String[] strArr) {
            if (strArr.length == a.this.f6408q) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        bVar.f6437c[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final String f6443b;

        /* renamed from: c, reason: collision with root package name */
        private final long f6444c;

        /* renamed from: d, reason: collision with root package name */
        private final InputStream[] f6445d;

        public /* synthetic */ c(a aVar, String str, long j10, InputStream[] inputStreamArr, byte b10) {
            this(str, j10, inputStreamArr);
        }

        private C0082a b() {
            return a.this.a(this.f6443b, this.f6444c);
        }

        public final InputStream a() {
            return this.f6445d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f6445d) {
                a.a((Closeable) inputStream);
            }
        }

        private c(String str, long j10, InputStream[] inputStreamArr) {
            this.f6443b = str;
            this.f6444c = j10;
            this.f6445d = inputStreamArr;
        }

        private String a(int i10) {
            return a.a(this.f6445d[i10]);
        }
    }

    private a(File file, long j10) {
        this.f6404l = file;
        this.f6405m = new File(file, f6394a);
        this.f6406n = new File(file, f6395b);
        this.f6407p = j10;
    }

    public static /* synthetic */ int e(a aVar) {
        aVar.f6412u = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        int i10 = this.f6412u;
        if (i10 >= 2000 && i10 >= this.f6411t.size()) {
            return true;
        }
        return false;
    }

    private boolean i() {
        if (this.f6410s == null) {
            return true;
        }
        return false;
    }

    private void j() {
        if (this.f6410s != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    private synchronized void k() {
        j();
        l();
        this.f6410s.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        while (this.f6409r > this.f6407p) {
            c(this.f6411t.entrySet().iterator().next().getKey());
        }
    }

    private void m() {
        close();
        a(this.f6404l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f6410s == null) {
            return;
        }
        Iterator it = new ArrayList(this.f6411t.values()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f6439e != null) {
                bVar.f6439e.b();
            }
        }
        l();
        this.f6410s.close();
        this.f6410s = null;
    }

    private static String b(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read != 10) {
                sb2.append((char) read);
            } else {
                int length = sb2.length();
                if (length > 0) {
                    int i10 = length - 1;
                    if (sb2.charAt(i10) == '\r') {
                        sb2.setLength(i10);
                    }
                }
                return sb2.toString();
            }
        }
    }

    private void c() {
        b(this.f6406n);
        Iterator<b> it = this.f6411t.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i10 = 0;
            if (next.f6439e != null) {
                next.f6439e = null;
                while (i10 < this.f6408q) {
                    b(next.a(i10));
                    b(next.b(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.f6408q) {
                    this.f6409r += next.f6437c[i10];
                    i10++;
                }
            }
        }
    }

    private void d(String str) {
        String[] split = str.split(" ");
        if (split.length >= 2) {
            String str2 = split[1];
            byte b10 = 0;
            if (split[0].equals(f6400h) && split.length == 2) {
                this.f6411t.remove(str2);
                return;
            }
            b bVar = this.f6411t.get(str2);
            if (bVar == null) {
                bVar = new b(this, str2, b10);
                this.f6411t.put(str2, bVar);
            }
            if (split[0].equals(f) && split.length == this.f6408q + 2) {
                b.a(bVar);
                bVar.f6439e = null;
                int length = split.length;
                int length2 = split.length;
                if (2 > length) {
                    throw new IllegalArgumentException();
                }
                if (2 <= length2) {
                    int i10 = length - 2;
                    int min = Math.min(i10, length2 - 2);
                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i10);
                    System.arraycopy(split, 2, objArr, 0, min);
                    b.a(bVar, (String[]) objArr);
                    return;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            if (split[0].equals(f6399g) && split.length == 2) {
                bVar.f6439e = new C0082a(this, bVar, b10);
                return;
            } else {
                if (!split[0].equals(f6401i) || split.length != 2) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    private File e() {
        return this.f6404l;
    }

    private long f() {
        return this.f6407p;
    }

    private synchronized long g() {
        return this.f6409r;
    }

    private static void e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(k.l("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    private static <T> T[] a(T[] tArr, int i10) {
        int length = tArr.length;
        if (2 > i10) {
            throw new IllegalArgumentException();
        }
        if (2 <= length) {
            int i11 = i10 - 2;
            int min = Math.min(i11, length - 2);
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
            System.arraycopy(tArr, 2, tArr2, 0, min);
            return tArr2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private void b() {
        String b10;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f6405m), f6403k);
        try {
            String b11 = b(bufferedInputStream);
            String b12 = b(bufferedInputStream);
            String b13 = b(bufferedInputStream);
            String b14 = b(bufferedInputStream);
            String b15 = b(bufferedInputStream);
            if (f6396c.equals(b11) && "1".equals(b12) && Integer.toString(this.o).equals(b13) && Integer.toString(this.f6408q).equals(b14) && "".equals(b15)) {
                while (true) {
                    try {
                        b10 = b(bufferedInputStream);
                        String[] split = b10.split(" ");
                        if (split.length >= 2) {
                            String str = split[1];
                            byte b16 = 0;
                            if (split[0].equals(f6400h) && split.length == 2) {
                                this.f6411t.remove(str);
                            } else {
                                b bVar = this.f6411t.get(str);
                                if (bVar == null) {
                                    bVar = new b(this, str, b16);
                                    this.f6411t.put(str, bVar);
                                }
                                if (split[0].equals(f) && split.length == this.f6408q + 2) {
                                    b.a(bVar);
                                    bVar.f6439e = null;
                                    int length = split.length;
                                    int length2 = split.length;
                                    if (2 > length) {
                                        throw new IllegalArgumentException();
                                    }
                                    if (2 <= length2) {
                                        int i10 = length - 2;
                                        int min = Math.min(i10, length2 - 2);
                                        Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i10);
                                        System.arraycopy(split, 2, objArr, 0, min);
                                        b.a(bVar, (String[]) objArr);
                                    } else {
                                        throw new ArrayIndexOutOfBoundsException();
                                    }
                                } else if (split[0].equals(f6399g) && split.length == 2) {
                                    bVar.f6439e = new C0082a(this, bVar, b16);
                                } else if (!split[0].equals(f6401i) || split.length != 2) {
                                    break;
                                }
                            }
                        } else {
                            throw new IOException("unexpected journal line: ".concat(b10));
                        }
                    } catch (EOFException unused) {
                        return;
                    }
                }
                throw new IOException("unexpected journal line: ".concat(b10));
            }
            throw new IOException("unexpected journal header: [" + b11 + ", " + b12 + ", " + b14 + ", " + b15 + "]");
        } finally {
            a((Closeable) bufferedInputStream);
        }
    }

    private static String a(Reader reader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            reader.close();
        }
    }

    public final synchronized boolean c(String str) {
        j();
        e(str);
        b bVar = this.f6411t.get(str);
        if (bVar != null && bVar.f6439e == null) {
            for (int i10 = 0; i10 < this.f6408q; i10++) {
                File a10 = bVar.a(i10);
                if (a10.delete()) {
                    this.f6409r -= bVar.f6437c[i10];
                    bVar.f6437c[i10] = 0;
                } else {
                    throw new IOException("failed to delete ".concat(String.valueOf(a10)));
                }
            }
            this.f6412u++;
            this.f6410s.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f6411t.remove(str);
            if (h()) {
                this.f6414w.submit(this.f6415x);
            }
            return true;
        }
        return false;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
    }

    public static a a(File file, long j10) {
        if (j10 > 0) {
            a aVar = new a(file, j10);
            if (aVar.f6405m.exists()) {
                try {
                    aVar.b();
                    aVar.c();
                    aVar.f6410s = new BufferedWriter(new FileWriter(aVar.f6405m, true), f6403k);
                    return aVar;
                } catch (IOException unused) {
                    aVar.close();
                    a(aVar.f6404l);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.d();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        Writer writer = this.f6410s;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f6406n), f6403k);
        bufferedWriter.write(f6396c);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.o));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f6408q));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.f6411t.values()) {
            if (bVar.f6439e != null) {
                bufferedWriter.write("DIRTY " + bVar.f6436b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.f6436b + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        this.f6406n.renameTo(this.f6405m);
        this.f6410s = new BufferedWriter(new FileWriter(this.f6405m, true), f6403k);
    }

    private static String c(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, f6402j));
    }

    public final synchronized c a(String str) {
        j();
        e(str);
        b bVar = this.f6411t.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f6438d) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f6408q];
        for (int i10 = 0; i10 < this.f6408q; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(bVar.a(i10));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.f6412u++;
        this.f6410s.append((CharSequence) ("READ " + str + '\n'));
        if (h()) {
            this.f6414w.submit(this.f6415x);
        }
        this.f6410s.flush();
        return new c(this, str, bVar.f, inputStreamArr, (byte) 0);
    }

    private static void b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final C0082a b(String str) {
        return a(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C0082a a(String str, long j10) {
        j();
        e(str);
        b bVar = this.f6411t.get(str);
        if (j10 != -1 && (bVar == null || bVar.f != j10)) {
            return null;
        }
        byte b10 = 0;
        if (bVar != null) {
            if (bVar.f6439e != null) {
                return null;
            }
        } else {
            bVar = new b(this, str, b10);
            this.f6411t.put(str, bVar);
        }
        C0082a c0082a = new C0082a(this, bVar, b10);
        bVar.f6439e = c0082a;
        this.f6410s.write("DIRTY " + str + '\n');
        this.f6410s.flush();
        return c0082a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0082a c0082a, boolean z10) {
        b bVar = c0082a.f6429b;
        if (bVar.f6439e == c0082a) {
            if (z10 && !bVar.f6438d) {
                for (int i10 = 0; i10 < this.f6408q; i10++) {
                    if (!bVar.b(i10).exists()) {
                        c0082a.b();
                        throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.f6408q; i11++) {
                File b10 = bVar.b(i11);
                if (z10) {
                    if (b10.exists()) {
                        File a10 = bVar.a(i11);
                        b10.renameTo(a10);
                        long j10 = bVar.f6437c[i11];
                        long length = a10.length();
                        bVar.f6437c[i11] = length;
                        this.f6409r = (this.f6409r - j10) + length;
                    }
                } else {
                    b(b10);
                }
            }
            this.f6412u++;
            bVar.f6439e = null;
            if (!(bVar.f6438d | z10)) {
                this.f6411t.remove(bVar.f6436b);
                this.f6410s.write("REMOVE " + bVar.f6436b + '\n');
            } else {
                b.a(bVar);
                this.f6410s.write("CLEAN " + bVar.f6436b + bVar.a() + '\n');
                if (z10) {
                    long j11 = this.f6413v;
                    this.f6413v = 1 + j11;
                    bVar.f = j11;
                }
            }
            this.f6410s.flush();
            if (this.f6409r > this.f6407p || h()) {
                this.f6414w.submit(this.f6415x);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public static /* synthetic */ String a(InputStream inputStream) {
        return a((Reader) new InputStreamReader(inputStream, f6402j));
    }
}
