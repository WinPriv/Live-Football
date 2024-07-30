package f1;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f27935k = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f27937b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Set<String>> f27938c;

    /* renamed from: d, reason: collision with root package name */
    public final h f27939d;

    /* renamed from: g, reason: collision with root package name */
    public volatile k1.e f27941g;

    /* renamed from: h, reason: collision with root package name */
    public final b f27942h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f27940e = new AtomicBoolean(false);
    public volatile boolean f = false;

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    public final k.b<c, d> f27943i = new k.b<>();

    /* renamed from: j, reason: collision with root package name */
    public final a f27944j = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, Integer> f27936a = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final HashSet a() {
            HashSet hashSet = new HashSet();
            Cursor g6 = g.this.f27939d.g(new j1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (g6.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(g6.getInt(0)));
                } catch (Throwable th) {
                    g6.close();
                    throw th;
                }
            }
            g6.close();
            if (!hashSet.isEmpty()) {
                g.this.f27941g.g();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r5 = this;
                f1.g r0 = f1.g.this
                f1.h r0 = r0.f27939d
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f27957h
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r1 = 1
                r2 = 0
                r3 = 0
                r0.lock()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                f1.g r4 = f1.g.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r4 = r4.a()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r4 != 0) goto L1c
                r0.unlock()
                return
            L1c:
                f1.g r4 = f1.g.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f27940e     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r1 = r4.compareAndSet(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r1 != 0) goto L2a
                r0.unlock()
                return
            L2a:
                f1.g r1 = f1.g.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                f1.h r1 = r1.f27939d     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                j1.c r1 = r1.f27953c     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                j1.b r1 = r1.H()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                k1.a r1 = (k1.a) r1     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                android.database.sqlite.SQLiteDatabase r1 = r1.f30288s     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r1 = r1.inTransaction()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r1 == 0) goto L42
                r0.unlock()
                return
            L42:
                f1.g r1 = f1.g.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                f1.h r1 = r1.f27939d     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r2 = r1.f     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r2 == 0) goto L69
                j1.c r1 = r1.f27953c     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                j1.b r1 = r1.H()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                k1.a r1 = (k1.a) r1     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                r1.b()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                java.util.HashSet r3 = r5.a()     // Catch: java.lang.Throwable -> L64
                r1.g()     // Catch: java.lang.Throwable -> L64
                r1.c()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                goto L77
            L60:
                r1 = move-exception
                goto L70
            L62:
                r1 = move-exception
                goto L70
            L64:
                r2 = move-exception
                r1.c()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                throw r2     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
            L69:
                java.util.HashSet r3 = r5.a()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                goto L77
            L6e:
                r1 = move-exception
                goto Lae
            L70:
                java.lang.String r2 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L6e
            L77:
                r0.unlock()
                if (r3 == 0) goto Lad
                boolean r0 = r3.isEmpty()
                if (r0 != 0) goto Lad
                f1.g r0 = f1.g.this
                k.b<f1.g$c, f1.g$d> r0 = r0.f27943i
                monitor-enter(r0)
                f1.g r1 = f1.g.this     // Catch: java.lang.Throwable -> Laa
                k.b<f1.g$c, f1.g$d> r1 = r1.f27943i     // Catch: java.lang.Throwable -> Laa
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Laa
                k.b$e r1 = (k.b.e) r1     // Catch: java.lang.Throwable -> Laa
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Laa
                if (r2 != 0) goto L99
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
                goto Lad
            L99:
                java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> Laa
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Laa
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Laa
                f1.g$d r1 = (f1.g.d) r1     // Catch: java.lang.Throwable -> Laa
                r1.getClass()     // Catch: java.lang.Throwable -> Laa
                r1 = 0
                throw r1     // Catch: java.lang.Throwable -> Laa
            Laa:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
                throw r1
            Lad:
                return
            Lae:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.g.a.run():void");
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f27946a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f27947b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f27948c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27949d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27950e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f27946a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f27947b = zArr;
            this.f27948c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            boolean z10;
            synchronized (this) {
                if (this.f27949d && !this.f27950e) {
                    int length = this.f27946a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 < length) {
                            if (this.f27946a[i10] > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean[] zArr = this.f27947b;
                            if (z10 != zArr[i10]) {
                                int[] iArr = this.f27948c;
                                if (!z10) {
                                    i11 = 2;
                                }
                                iArr[i10] = i11;
                            } else {
                                this.f27948c[i10] = 0;
                            }
                            zArr[i10] = z10;
                            i10++;
                        } else {
                            this.f27950e = true;
                            this.f27949d = false;
                            return this.f27948c;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class d {
    }

    public g(h hVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f27939d = hVar;
        this.f27942h = new b(strArr.length);
        this.f27938c = hashMap2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f27937b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f27936a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) hashMap.get(strArr[i10]);
            if (str2 != null) {
                this.f27937b[i10] = str2.toLowerCase(locale);
            } else {
                this.f27937b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f27936a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap3 = this.f27936a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        boolean z10;
        j1.b bVar = this.f27939d.f27951a;
        if (bVar != null && ((k1.a) bVar).f30288s.isOpen()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (!this.f) {
            this.f27939d.f27953c.H();
        }
        if (this.f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(j1.b bVar, int i10) {
        k1.a aVar = (k1.a) bVar;
        aVar.d(a3.l.j("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i10, ", 0)"));
        String str = this.f27937b[i10];
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f27935k;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            e0.i.o(sb2, str, "_", str2, "`");
            e0.i.o(sb2, " AFTER ", str2, " ON `", str);
            e0.i.o(sb2, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            e0.i.o(sb2, " = 1", " WHERE ", "table_id", " = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            aVar.d(sb2.toString());
        }
    }

    public final void c(j1.b bVar) {
        k1.a aVar = (k1.a) bVar;
        if (aVar.f30288s.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f27939d.f27957h.readLock();
                readLock.lock();
                try {
                    int[] a10 = this.f27942h.a();
                    if (a10 == null) {
                        return;
                    }
                    int length = a10.length;
                    aVar.b();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = a10[i10];
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    String str = this.f27937b[i10];
                                    StringBuilder sb2 = new StringBuilder();
                                    String[] strArr = f27935k;
                                    for (int i12 = 0; i12 < 3; i12++) {
                                        String str2 = strArr[i12];
                                        sb2.setLength(0);
                                        sb2.append("DROP TRIGGER IF EXISTS ");
                                        sb2.append("`");
                                        sb2.append("room_table_modification_trigger_");
                                        sb2.append(str);
                                        sb2.append("_");
                                        sb2.append(str2);
                                        sb2.append("`");
                                        aVar.d(sb2.toString());
                                    }
                                }
                            } else {
                                b(aVar, i10);
                            }
                        } catch (Throwable th) {
                            aVar.c();
                            throw th;
                        }
                    }
                    aVar.g();
                    aVar.c();
                    b bVar2 = this.f27942h;
                    synchronized (bVar2) {
                        bVar2.f27950e = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
