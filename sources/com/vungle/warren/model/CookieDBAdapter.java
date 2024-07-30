package com.vungle.warren.model;

import android.content.ContentValues;
import com.vungle.warren.persistence.DBAdapter;
import com.vungle.warren.persistence.IdColumns;
import java.lang.reflect.Type;
import java.util.Map;
import m8.i;
import m8.j;
import r8.a;

/* loaded from: classes2.dex */
public class CookieDBAdapter implements DBAdapter<Cookie> {
    public static final String CREATE_COOKIE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS cookie(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, bools TEXT, ints TEXT, longs TEXT, strings TEXT )";
    private i gson = new j().a();
    Type boolType = new a<Map<String, Boolean>>() { // from class: com.vungle.warren.model.CookieDBAdapter.1
    }.getType();
    Type intType = new a<Map<String, Integer>>() { // from class: com.vungle.warren.model.CookieDBAdapter.2
    }.getType();
    Type longType = new a<Map<String, Long>>() { // from class: com.vungle.warren.model.CookieDBAdapter.3
    }.getType();
    Type stringType = new a<Map<String, String>>() { // from class: com.vungle.warren.model.CookieDBAdapter.4
    }.getType();

    /* loaded from: classes2.dex */
    public interface CookieColumns extends IdColumns {
        public static final String COLUMN_BOOLS = "bools";
        public static final String COLUMN_INTS = "ints";
        public static final String COLUMN_LONGS = "longs";
        public static final String COLUMN_STRINGS = "strings";
        public static final String TABLE_NAME = "cookie";
    }

    @Override // com.vungle.warren.persistence.DBAdapter
    public String tableName() {
        return CookieColumns.TABLE_NAME;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vungle.warren.persistence.DBAdapter
    public Cookie fromContentValues(ContentValues contentValues) {
        Cookie cookie = new Cookie(contentValues.getAsString(IdColumns.COLUMN_IDENTIFIER));
        cookie.booleans = (Map) this.gson.c(contentValues.getAsString(CookieColumns.COLUMN_BOOLS), this.boolType);
        cookie.longs = (Map) this.gson.c(contentValues.getAsString(CookieColumns.COLUMN_LONGS), this.longType);
        cookie.integers = (Map) this.gson.c(contentValues.getAsString(CookieColumns.COLUMN_INTS), this.intType);
        cookie.strings = (Map) this.gson.c(contentValues.getAsString(CookieColumns.COLUMN_STRINGS), this.stringType);
        return cookie;
    }

    @Override // com.vungle.warren.persistence.DBAdapter
    public ContentValues toContentValues(Cookie cookie) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(IdColumns.COLUMN_IDENTIFIER, cookie.identifier);
        contentValues.put(CookieColumns.COLUMN_BOOLS, this.gson.k(cookie.booleans, this.boolType));
        contentValues.put(CookieColumns.COLUMN_INTS, this.gson.k(cookie.integers, this.intType));
        contentValues.put(CookieColumns.COLUMN_LONGS, this.gson.k(cookie.longs, this.longType));
        contentValues.put(CookieColumns.COLUMN_STRINGS, this.gson.k(cookie.strings, this.stringType));
        return contentValues;
    }
}
