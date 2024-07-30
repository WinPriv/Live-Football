package k1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import f1.i;
import j1.c;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public final class b implements j1.c {

    /* renamed from: s, reason: collision with root package name */
    public final Context f30290s;

    /* renamed from: t, reason: collision with root package name */
    public final String f30291t;

    /* renamed from: u, reason: collision with root package name */
    public final c.a f30292u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30293v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f30294w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public a f30295x;
    public boolean y;

    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: s, reason: collision with root package name */
        public final k1.a[] f30296s;

        /* renamed from: t, reason: collision with root package name */
        public final c.a f30297t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f30298u;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: k1.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0415a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.a f30299a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1.a[] f30300b;

            public C0415a(c.a aVar, k1.a[] aVarArr) {
                this.f30299a = aVar;
                this.f30300b = aVarArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
            
                if (r2 == false) goto L9;
             */
            @Override // android.database.DatabaseErrorHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                    r3 = this;
                    k1.a[] r0 = r3.f30300b
                    r1 = 0
                    r2 = r0[r1]
                    if (r2 == 0) goto L10
                    android.database.sqlite.SQLiteDatabase r2 = r2.f30288s
                    if (r2 != r4) goto Ld
                    r2 = 1
                    goto Le
                Ld:
                    r2 = r1
                Le:
                    if (r2 != 0) goto L17
                L10:
                    k1.a r2 = new k1.a
                    r2.<init>(r4)
                    r0[r1] = r2
                L17:
                    r4 = r0[r1]
                    j1.c$a r0 = r3.f30299a
                    r0.getClass()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Corruption reported by sqlite on database: "
                    r0.<init>(r1)
                    android.database.sqlite.SQLiteDatabase r1 = r4.f30288s
                    java.lang.String r1 = r1.getPath()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "SupportSQLite"
                    android.util.Log.e(r1, r0)
                    android.database.sqlite.SQLiteDatabase r0 = r4.f30288s
                    boolean r1 = r0.isOpen()
                    if (r1 != 0) goto L47
                    java.lang.String r4 = r0.getPath()
                    j1.c.a.a(r4)
                    goto L96
                L47:
                    r1 = 0
                    java.util.List r1 = r0.getAttachedDbs()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L4f
                    goto L4f
                L4d:
                    r4 = move-exception
                    goto L53
                L4f:
                    r4.close()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L75
                    goto L75
                L53:
                    if (r1 == 0) goto L6d
                    java.util.Iterator r0 = r1.iterator()
                L59:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L74
                    java.lang.Object r1 = r0.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    j1.c.a.a(r1)
                    goto L59
                L6d:
                    java.lang.String r0 = r0.getPath()
                    j1.c.a.a(r0)
                L74:
                    throw r4
                L75:
                    if (r1 == 0) goto L8f
                    java.util.Iterator r4 = r1.iterator()
                L7b:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L96
                    java.lang.Object r0 = r4.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    j1.c.a.a(r0)
                    goto L7b
                L8f:
                    java.lang.String r4 = r0.getPath()
                    j1.c.a.a(r4)
                L96:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: k1.b.a.C0415a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, k1.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f29570a, new C0415a(aVar, aVarArr));
            this.f30297t = aVar;
            this.f30296s = aVarArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        
            if (r2 == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final k1.a b(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                k1.a[] r0 = r3.f30296s
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L10
                android.database.sqlite.SQLiteDatabase r2 = r2.f30288s
                if (r2 != r4) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = r1
            Le:
                if (r2 != 0) goto L17
            L10:
                k1.a r2 = new k1.a
                r2.<init>(r4)
                r0[r1] = r2
            L17:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.b.a.b(android.database.sqlite.SQLiteDatabase):k1.a");
        }

        public final synchronized j1.b c() {
            this.f30298u = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f30298u) {
                close();
                return c();
            }
            return b(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.f30296s[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            b(sQLiteDatabase);
            this.f30297t.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[ORIG_RETURN, RETURN] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
            /*
                r5 = this;
                k1.a r6 = r5.b(r6)
                j1.c$a r0 = r5.f30297t
                f1.i r0 = (f1.i) r0
                r0.getClass()
                java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r1 = r6.f(r1)
                boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6c
                r3 = 0
                if (r2 == 0) goto L20
                int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L6c
                if (r2 != 0) goto L20
                r2 = 1
                goto L21
            L20:
                r2 = r3
            L21:
                r1.close()
                f1.i$a r1 = r0.f27972c
                r1.a(r6)
                if (r2 != 0) goto L4a
                f1.i$b r2 = r1.b(r6)
                boolean r4 = r2.f27974a
                if (r4 == 0) goto L34
                goto L4a
            L34:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Pre-packaged database has an invalid schema: "
                r0.<init>(r1)
                java.lang.String r1 = r2.f27975b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L4a:
                r0.c(r6)
                androidx.work.impl.WorkDatabase_Impl$a r1 = (androidx.work.impl.WorkDatabase_Impl.a) r1
                int r6 = androidx.work.impl.WorkDatabase_Impl.f2620s
                androidx.work.impl.WorkDatabase_Impl r6 = androidx.work.impl.WorkDatabase_Impl.this
                java.util.List<f1.h$b> r0 = r6.f27956g
                if (r0 == 0) goto L6b
                int r0 = r0.size()
            L5b:
                if (r3 >= r0) goto L6b
                java.util.List<f1.h$b> r1 = r6.f27956g
                java.lang.Object r1 = r1.get(r3)
                f1.h$b r1 = (f1.h.b) r1
                r1.getClass()
                int r3 = r3 + 1
                goto L5b
            L6b:
                return
            L6c:
                r6 = move-exception
                r1.close()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.b.a.onCreate(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f30298u = true;
            ((i) this.f30297t).b(b(sQLiteDatabase), i10, i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0064  */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onOpen(android.database.sqlite.SQLiteDatabase r10) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.b.a.onOpen(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f30298u = true;
            this.f30297t.b(b(sQLiteDatabase), i10, i11);
        }
    }

    public b(Context context, String str, c.a aVar, boolean z10) {
        this.f30290s = context;
        this.f30291t = str;
        this.f30292u = aVar;
        this.f30293v = z10;
    }

    @Override // j1.c
    public final j1.b H() {
        return b().c();
    }

    public final a b() {
        a aVar;
        synchronized (this.f30294w) {
            if (this.f30295x == null) {
                k1.a[] aVarArr = new k1.a[1];
                if (this.f30291t != null && this.f30293v) {
                    this.f30295x = new a(this.f30290s, new File(this.f30290s.getNoBackupFilesDir(), this.f30291t).getAbsolutePath(), aVarArr, this.f30292u);
                } else {
                    this.f30295x = new a(this.f30290s, this.f30291t, aVarArr, this.f30292u);
                }
                this.f30295x.setWriteAheadLoggingEnabled(this.y);
            }
            aVar = this.f30295x;
        }
        return aVar;
    }

    @Override // j1.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    @Override // j1.c
    public final String getDatabaseName() {
        return this.f30291t;
    }

    @Override // j1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f30294w) {
            a aVar = this.f30295x;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.y = z10;
        }
    }
}
