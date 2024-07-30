package g4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager.java */
/* loaded from: classes.dex */
public final class t extends SQLiteOpenHelper {

    /* renamed from: u, reason: collision with root package name */
    public static final String f28511u = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: v, reason: collision with root package name */
    public static final int f28512v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final List<a> f28513w;

    /* renamed from: s, reason: collision with root package name */
    public final int f28514s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28515t;

    /* compiled from: SchemaManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        final int i10 = 0;
        final int i11 = 1;
        f28513w = Arrays.asList(new a() { // from class: g4.p
            @Override // g4.t.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i10) {
                    case 0:
                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        return;
                    default:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sQLiteDatabase.execSQL(t.f28511u);
                        return;
                }
            }
        }, new a() { // from class: g4.q
            @Override // g4.t.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        }, new a() { // from class: g4.r
            @Override // g4.t.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        }, new a() { // from class: g4.s
            @Override // g4.t.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        }, new a() { // from class: g4.p
            @Override // g4.t.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                switch (i11) {
                    case 0:
                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        return;
                    default:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sQLiteDatabase.execSQL(t.f28511u);
                        return;
                }
            }
        });
    }

    public t(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f28515t = false;
        this.f28514s = i10;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f28513w;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                list.get(i10).a(sQLiteDatabase);
                i10++;
            }
        } else {
            StringBuilder r10 = a3.l.r("Migration from ", i10, " to ", i11, " was requested, but cannot be performed. Only ");
            r10.append(list.size());
            r10.append(" migrations are provided");
            throw new IllegalArgumentException(r10.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f28515t = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f28515t) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, this.f28514s);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f28515t) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f28515t) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f28515t) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, i10, i11);
    }
}
