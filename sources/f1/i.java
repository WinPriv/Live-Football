package f1;

import androidx.work.impl.WorkDatabase_Impl;
import j1.c;

/* compiled from: RoomOpenHelper.java */
/* loaded from: classes.dex */
public final class i extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public f1.a f27971b;

    /* renamed from: c, reason: collision with root package name */
    public final a f27972c;

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27973a = 12;

        public abstract void a(k1.a aVar);

        public abstract b b(k1.a aVar);
    }

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f27974a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27975b;

        public b(boolean z10, String str) {
            this.f27974a = z10;
            this.f27975b = str;
        }
    }

    public i(f1.a aVar, WorkDatabase_Impl.a aVar2) {
        super(aVar2.f27973a);
        this.f27971b = aVar;
        this.f27972c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0076 A[EDGE_INSN: B:90:0x0076->B:79:0x0076 BREAK  A[LOOP:4: B:58:0x0020->B:80:?], SYNTHETIC] */
    @Override // j1.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(k1.a r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i.b(k1.a, int, int):void");
    }

    public final void c(k1.a aVar) {
        aVar.d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
