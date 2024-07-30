package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f1618i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile f f1619j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1620a;

    /* renamed from: b, reason: collision with root package name */
    public final q.d f1621b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1622c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1623d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1624e;
    public final g f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1625g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.emoji2.text.d f1626h;

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile j f1627b;

        /* renamed from: c, reason: collision with root package name */
        public volatile n f1628c;

        public a(f fVar) {
            super(fVar);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f1629a;

        public b(f fVar) {
            this.f1629a = fVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f1630a;

        /* renamed from: b, reason: collision with root package name */
        public int f1631b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.emoji2.text.d f1632c = new androidx.emoji2.text.d();

        public c(g gVar) {
            this.f1630a = gVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0017f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final ArrayList f1633s;

        /* renamed from: t, reason: collision with root package name */
        public final int f1634t;

        public RunnableC0017f(List list, int i10, Throwable th) {
            if (list != null) {
                this.f1633s = new ArrayList(list);
                this.f1634t = i10;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f1633s;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f1634t != 1) {
                while (i10 < size) {
                    ((e) arrayList.get(i10)).a();
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((e) arrayList.get(i10)).b();
                    i10++;
                }
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class i {
    }

    public f(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1620a = reentrantReadWriteLock;
        this.f1622c = 3;
        g gVar = aVar.f1630a;
        this.f = gVar;
        int i10 = aVar.f1631b;
        this.f1625g = i10;
        this.f1626h = aVar.f1632c;
        this.f1623d = new Handler(Looper.getMainLooper());
        this.f1621b = new q.d();
        a aVar2 = new a(this);
        this.f1624e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1622c = 0;
            } catch (Throwable th) {
                this.f1620a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.e(aVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static f a() {
        f fVar;
        boolean z10;
        synchronized (f1618i) {
            fVar = f1619j;
            if (fVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return fVar;
    }

    public final int b() {
        this.f1620a.readLock().lock();
        try {
            return this.f1622c;
        } finally {
            this.f1620a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11 = true;
        if (this.f1625g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b() != 1) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            this.f1620a.writeLock().lock();
            try {
                if (this.f1622c == 0) {
                    return;
                }
                this.f1622c = 0;
                this.f1620a.writeLock().unlock();
                a aVar = this.f1624e;
                f fVar = aVar.f1629a;
                try {
                    fVar.f.a(new androidx.emoji2.text.e(aVar));
                    return;
                } catch (Throwable th) {
                    fVar.d(th);
                    return;
                }
            } finally {
                this.f1620a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1620a.writeLock().lock();
        try {
            this.f1622c = 2;
            arrayList.addAll(this.f1621b);
            this.f1621b.clear();
            this.f1620a.writeLock().unlock();
            this.f1623d.post(new RunnableC0017f(arrayList, this.f1622c, th));
        } catch (Throwable th2) {
            this.f1620a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1620a.writeLock().lock();
        try {
            this.f1622c = 1;
            arrayList.addAll(this.f1621b);
            this.f1621b.clear();
            this.f1620a.writeLock().unlock();
            this.f1623d.post(new RunnableC0017f(arrayList, this.f1622c, null));
        } catch (Throwable th) {
            this.f1620a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        if (r3.b(r15, r6, r13, r5.f1651d.f1670b) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e5, code lost:
    
        r0 = new androidx.emoji2.text.q((android.text.Spannable) new android.text.SpannableString(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ef, code lost:
    
        r10 = r5.f1651d.f1670b;
        r3.f1645a.getClass();
        r0.setSpan(new androidx.emoji2.text.p(r10), r6, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0145 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:121:0x005a, B:124:0x005f, B:126:0x0063, B:128:0x0070, B:29:0x0080, B:31:0x0088, B:33:0x008b, B:35:0x008f, B:37:0x009b, B:39:0x009e, B:43:0x00ab, B:46:0x00b3, B:52:0x00cd, B:69:0x00d9, B:72:0x00e5, B:73:0x00ef, B:56:0x0104, B:59:0x010b, B:78:0x0110, B:81:0x011b, B:86:0x0120, B:88:0x0124, B:90:0x012a, B:92:0x012e, B:97:0x0139, B:100:0x0145, B:101:0x014b, B:103:0x015e, B:27:0x0076), top: B:120:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015e A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:121:0x005a, B:124:0x005f, B:126:0x0063, B:128:0x0070, B:29:0x0080, B:31:0x0088, B:33:0x008b, B:35:0x008f, B:37:0x009b, B:39:0x009e, B:43:0x00ab, B:46:0x00b3, B:52:0x00cd, B:69:0x00d9, B:72:0x00e5, B:73:0x00ef, B:56:0x0104, B:59:0x010b, B:78:0x0110, B:81:0x011b, B:86:0x0120, B:88:0x0124, B:90:0x012a, B:92:0x012e, B:97:0x0139, B:100:0x0145, B:101:0x014b, B:103:0x015e, B:27:0x0076), top: B:120:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:121:0x005a, B:124:0x005f, B:126:0x0063, B:128:0x0070, B:29:0x0080, B:31:0x0088, B:33:0x008b, B:35:0x008f, B:37:0x009b, B:39:0x009e, B:43:0x00ab, B:46:0x00b3, B:52:0x00cd, B:69:0x00d9, B:72:0x00e5, B:73:0x00ef, B:56:0x0104, B:59:0x010b, B:78:0x0110, B:81:0x011b, B:86:0x0120, B:88:0x0124, B:90:0x012a, B:92:0x012e, B:97:0x0139, B:100:0x0145, B:101:0x014b, B:103:0x015e, B:27:0x0076), top: B:120:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence f(int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.f.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(e eVar) {
        if (eVar != null) {
            this.f1620a.writeLock().lock();
            try {
                if (this.f1622c != 1 && this.f1622c != 2) {
                    this.f1621b.add(eVar);
                    return;
                }
                this.f1623d.post(new RunnableC0017f(Arrays.asList(eVar), this.f1622c, null));
                return;
            } finally {
                this.f1620a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }
}
