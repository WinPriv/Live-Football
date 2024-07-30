package com.vungle.warren.persistence;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "vungle_db";
    public static final String TAG = "DatabaseHelper";
    private final DatabaseFactory databaseFactory;

    /* loaded from: classes2.dex */
    public static class DBException extends Exception {
        public DBException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public interface DatabaseFactory {
        void create(SQLiteDatabase sQLiteDatabase);

        void deleteData(SQLiteDatabase sQLiteDatabase);

        void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11);

        void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public static class NoBackupDatabaseWrapperContext extends ContextWrapper {
        public NoBackupDatabaseWrapperContext(Context context) {
            super(context);
        }

        @SuppressLint({"NewApi"})
        private int getFlags(int i10) {
            int i11;
            int i12 = 0;
            if ((i10 & 8) != 0) {
                i11 = 536870912;
            } else {
                i11 = 0;
            }
            int i13 = i11 | 268435456;
            if ((i10 & 16) != 0) {
                i12 = 16;
            }
            return i13 | i12;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public File getDatabasePath(String str) {
            File databasePath = super.getDatabasePath(str);
            File file = new File(getApplicationContext().getNoBackupFilesDir(), str);
            try {
                FileUtility.delete(new File(databasePath.getPath()));
                FileUtility.delete(new File(databasePath.getPath() + "-journal"));
            } catch (IOException unused) {
                VungleLogger.error(true, DatabaseHelper.TAG, DatabaseHelper.TAG, "Failed to delete old db/-journal");
            }
            return file;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public SQLiteDatabase openOrCreateDatabase(String str, int i10, SQLiteDatabase.CursorFactory cursorFactory) {
            return SQLiteDatabase.openDatabase(getDatabasePath(str).getPath(), cursorFactory, getFlags(i10));
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public SQLiteDatabase openOrCreateDatabase(String str, int i10, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            return SQLiteDatabase.openDatabase(getDatabasePath(str).getPath(), cursorFactory, getFlags(i10), databaseErrorHandler);
        }
    }

    public DatabaseHelper(Context context, int i10, DatabaseFactory databaseFactory) {
        super(new NoBackupDatabaseWrapperContext(context.getApplicationContext()), DB_NAME, (SQLiteDatabase.CursorFactory) null, i10);
        this.databaseFactory = databaseFactory;
    }

    private synchronized SQLiteDatabase loadWritableDB() {
        return getWritableDatabase();
    }

    public void delete(Query query) throws DBException {
        try {
            loadWritableDB().delete(query.tableName, query.selection, query.args);
        } catch (SQLException e10) {
            throw new DBException(e10.getMessage());
        }
    }

    public synchronized void dropDb() {
        this.databaseFactory.deleteData(loadWritableDB());
        close();
        onCreate(loadWritableDB());
    }

    public void execSQL(String str) throws DBException {
        try {
            loadWritableDB().execSQL(str);
        } catch (SQLException e10) {
            throw new DBException(e10.getMessage());
        }
    }

    public void init() {
        loadWritableDB();
    }

    public long insertWithConflict(String str, ContentValues contentValues, int i10) throws DBException {
        try {
            return loadWritableDB().insertWithOnConflict(str, null, contentValues, i10);
        } catch (SQLException e10) {
            throw new DBException(e10.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.databaseFactory.create(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.databaseFactory.onDowngrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.databaseFactory.onUpgrade(sQLiteDatabase, i10, i11);
    }

    public Cursor query(Query query) {
        return loadWritableDB().query(query.tableName, query.columns, query.selection, query.args, query.groupBy, query.having, query.orderBy, query.limit);
    }

    public Cursor queryRaw(String str, String[] strArr) {
        return loadWritableDB().rawQuery(str, strArr);
    }

    public long update(Query query, ContentValues contentValues) throws DBException {
        try {
            return loadWritableDB().update(query.tableName, contentValues, query.selection, query.args);
        } catch (SQLException e10) {
            throw new DBException(e10.getMessage());
        }
    }
}
