package com.vungle.warren.model;

import android.content.ContentValues;
import com.vungle.warren.persistence.DBAdapter;
import com.vungle.warren.persistence.IdColumns;

/* loaded from: classes2.dex */
public class AnalyticUrlDBAdapter implements DBAdapter<AnalyticUrl> {
    public static final String CREATE_ANALYTICS_URL_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS analytic_url(_id INTEGER PRIMARY KEY AUTOINCREMENT,  item_id TEXT UNIQUE)";

    /* loaded from: classes2.dex */
    public interface AnalyticsUrlColumns extends IdColumns {
        public static final String TABLE_NAME = "analytic_url";
    }

    @Override // com.vungle.warren.persistence.DBAdapter
    public String tableName() {
        return AnalyticsUrlColumns.TABLE_NAME;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vungle.warren.persistence.DBAdapter
    public AnalyticUrl fromContentValues(ContentValues contentValues) {
        return new AnalyticUrl(contentValues.getAsString(IdColumns.COLUMN_IDENTIFIER));
    }

    @Override // com.vungle.warren.persistence.DBAdapter
    public ContentValues toContentValues(AnalyticUrl analyticUrl) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(IdColumns.COLUMN_IDENTIFIER, analyticUrl.url);
        return contentValues;
    }
}
