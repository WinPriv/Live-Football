package com.vungle.warren.model;

import android.content.ContentValues;
import com.vungle.warren.persistence.DBAdapter;
import com.vungle.warren.persistence.IdColumns;

/* loaded from: classes2.dex */
public class VisionDataDBAdapter implements DBAdapter<VisionData> {
    public static final String CREATE_VISION_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS vision_data(_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp NUMERIC, creative TEXT, campaign TEXT, advertiser TEXT )";

    /* loaded from: classes2.dex */
    public interface VisionDataColumns extends IdColumns {
        public static final String COLUMN_ADVERTISER = "advertiser";
        public static final String COLUMN_CAMPAIGN = "campaign";
        public static final String COLUMN_CREATIVE = "creative";
        public static final String COLUMN_TIMESTAMP = "timestamp";
        public static final String TABLE_NAME = "vision_data";
    }

    @Override // com.vungle.warren.persistence.DBAdapter
    public String tableName() {
        return VisionDataColumns.TABLE_NAME;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vungle.warren.persistence.DBAdapter
    public VisionData fromContentValues(ContentValues contentValues) {
        return new VisionData(contentValues.getAsLong("timestamp").longValue(), contentValues.getAsString("creative"), contentValues.getAsString("campaign"), contentValues.getAsString(VisionDataColumns.COLUMN_ADVERTISER));
    }

    @Override // com.vungle.warren.persistence.DBAdapter
    public ContentValues toContentValues(VisionData visionData) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(visionData.timestamp));
        contentValues.put("creative", visionData.creative);
        contentValues.put("campaign", visionData.campaign);
        contentValues.put(VisionDataColumns.COLUMN_ADVERTISER, visionData.advertiser);
        return contentValues;
    }
}
