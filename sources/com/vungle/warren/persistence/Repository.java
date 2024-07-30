package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.AdAssetDBAdapter;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.AnalyticUrl;
import com.vungle.warren.model.AnalyticUrlDBAdapter;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.CookieDBAdapter;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.PlacementDBAdapter;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.SessionDataDBAdapter;
import com.vungle.warren.model.VisionData;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.VungleThreadPoolExecutor;
import com.vungle.warren.vision.VisionAggregationData;
import com.vungle.warren.vision.VisionAggregationInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class Repository {
    private static final String TAG = "Repository";
    protected static final int VERSION = 11;
    private Map<Class, DBAdapter> adapters;
    private final Context appCtx;
    protected DatabaseHelper dbHelper;
    private final Designer designer;
    private final VungleThreadPoolExecutor ioExecutor;
    private final ExecutorService uiExecutor;

    /* loaded from: classes2.dex */
    public interface LoadCallback<T> {
        void onLoaded(T t10);
    }

    /* loaded from: classes2.dex */
    public interface SaveCallback {
        void onError(Exception exc);

        void onSaved();
    }

    /* loaded from: classes2.dex */
    public static class VungleDatabaseCreator implements DatabaseHelper.DatabaseFactory {
        private final Context context;

        public VungleDatabaseCreator(Context context) {
            this.context = context;
        }

        private void deleteDatabase(String str) {
            this.context.deleteDatabase(str);
        }

        private void dropOldFilesData() {
            boolean z10;
            deleteDatabase("vungle");
            File externalFilesDir = this.context.getExternalFilesDir(null);
            if (Environment.getExternalStorageState().equals("mounted") && externalFilesDir != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && externalFilesDir.exists()) {
                try {
                    FileUtility.delete(new File(externalFilesDir, ".vungle"));
                } catch (IOException e10) {
                    Log.e(Repository.TAG, "IOException ", e10);
                }
            }
            File filesDir = this.context.getFilesDir();
            if (filesDir.exists()) {
                try {
                    FileUtility.delete(new File(filesDir, "vungle"));
                } catch (IOException e11) {
                    Log.e(Repository.TAG, "IOException ", e11);
                }
            }
            try {
                FileUtility.delete(new File(this.context.getCacheDir() + File.separator + "downloads_vungle"));
            } catch (IOException e12) {
                Log.e(Repository.TAG, "IOException ", e12);
            }
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void create(SQLiteDatabase sQLiteDatabase) {
            dropOldFilesData();
            sQLiteDatabase.execSQL(AdvertisementDBAdapter.CREATE_ADVERTISEMENT_TABLE_QUERY);
            sQLiteDatabase.execSQL(PlacementDBAdapter.CREATE_PLACEMENT_TABLE_QUERY);
            sQLiteDatabase.execSQL(CookieDBAdapter.CREATE_COOKIE_TABLE_QUERY);
            sQLiteDatabase.execSQL(ReportDBAdapter.CREATE_REPORT_TABLE_QUERY);
            sQLiteDatabase.execSQL(AdAssetDBAdapter.CREATE_ASSET_TABLE_QUERY);
            sQLiteDatabase.execSQL(VisionDataDBAdapter.CREATE_VISION_TABLE_QUERY);
            sQLiteDatabase.execSQL(AnalyticUrlDBAdapter.CREATE_ANALYTICS_URL_TABLE_QUERY);
            sQLiteDatabase.execSQL(CacheBustDBAdapter.CREATE_CACHE_BUST_TABLE_QUERY);
            sQLiteDatabase.execSQL(SessionDataDBAdapter.CREATE_SESSION_DATA_TABLE_QUERY);
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void deleteData(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS advertisement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS placement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS report");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS adAsset");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vision_data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_url");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache_bust");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS session_data");
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master WHERE type='table'", null);
            while (rawQuery != null && rawQuery.moveToNext()) {
                String string = rawQuery.getString(1);
                if (!string.equals("android_metadata") && !string.startsWith("sqlite_")) {
                    arrayList.add(string);
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it.next()));
            }
            create(sQLiteDatabase);
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 < 2) {
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN status INTEGER DEFAULT 1");
            }
            if (i10 < 3) {
                sQLiteDatabase.execSQL(VisionDataDBAdapter.CREATE_VISION_TABLE_QUERY);
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN ad_size TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN tt_download NUMERIC DEFAULT -1");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN ad_size TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN refresh_duration NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN supported_template_types NUMERIC DEFAULT 0");
            }
            if (i10 < 4) {
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN header_bidding SHORT ");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN header_bidding SHORT ");
            }
            if (i10 < 5) {
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN autocache_priority NUMERIC DEFAULT 2147483647");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN ad_request_start_time NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN init_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
            }
            if (i10 < 6) {
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_enable_om_sdk NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_om_sdk_extra_vast TEXT ");
            }
            if (i10 < 7) {
                sQLiteDatabase.execSQL(AnalyticUrlDBAdapter.CREATE_ANALYTICS_URL_TABLE_QUERY);
            }
            if (i10 < 8) {
                sQLiteDatabase.execSQL(CacheBustDBAdapter.CREATE_CACHE_BUST_TABLE_QUERY);
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_request_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN max_hb_cache NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN recommended_ad_size TEXT ");
            }
            if (i10 < 9) {
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN play_remote_url SHORT DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_assets_fully_downloaded SHORT DEFAULT 0");
            }
            if (i10 < 10) {
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_click_coordinates_enabled SHORT DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_deep_link TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_notifications TEXT ");
            }
            if (i10 < 11) {
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_header_bidding SHORT DEFAULT 0");
            }
        }
    }

    public Repository(Context context, Designer designer, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService) {
        this(context, designer, vungleThreadPoolExecutor, executorService, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteAdInternal(String str) throws DatabaseHelper.DBException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        deleteAssetForAdId(str);
        deleteModel(Advertisement.class, str);
        try {
            this.designer.deleteAssets(str);
        } catch (IOException e10) {
            Log.e(TAG, "IOException ", e10);
        }
    }

    private void deleteAssetForAdId(String str) throws DatabaseHelper.DBException {
        Query query = new Query(this.adapters.get(AdAsset.class).tableName());
        query.selection = "ad_identifier=?";
        query.args = new String[]{str};
        this.dbHelper.delete(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void deleteModel(Class<T> cls, String str) throws DatabaseHelper.DBException {
        Query query = new Query(this.adapters.get(cls).tableName());
        query.selection = "item_id=?";
        query.args = new String[]{str};
        this.dbHelper.delete(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> List<T> extractModels(Class<T> cls, Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            ArrayList arrayList = new ArrayList();
            try {
                DBAdapter dBAdapter = this.adapters.get(cls);
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(dBAdapter.fromContentValues(contentValues));
                }
                return arrayList;
            } catch (Exception e10) {
                VungleLogger.critical(true, TAG, "extractModels", e10.toString());
                return new ArrayList();
            } finally {
                cursor.close();
            }
        }
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Advertisement findValidAdvertisementForPlacementFromDB(String str, String str2) {
        String[] strArr;
        Log.i(TAG, " Searching for valid advertisement for placement with " + str + "event ID " + str2);
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        StringBuilder sb2 = new StringBuilder("placement_id = ? AND (state = ? OR state = ?) AND expire_time > ?");
        if (str2 != null) {
            sb2.append(" AND item_id = ?");
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
        } else {
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
        }
        query.selection = sb2.toString();
        query.args = strArr;
        query.limit = "1";
        Cursor query2 = this.dbHelper.query(query);
        Advertisement advertisement = null;
        if (query2 == null) {
            return null;
        }
        try {
            AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) this.adapters.get(Advertisement.class);
            if (advertisementDBAdapter != null && query2.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                advertisement = advertisementDBAdapter.fromContentValues(contentValues);
            }
            return advertisement;
        } catch (Exception e10) {
            VungleLogger.critical(true, TAG, "findValidAdvertisementForPlacementFromDB", e10.toString());
            return null;
        } finally {
            query2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Advertisement> findValidAdvertisementsForPlacementFromDB(String str, String str2) {
        String[] strArr;
        Log.i(TAG, " Searching for valid advertisement for placement with " + str + "event ID " + str2);
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        StringBuilder sb2 = new StringBuilder("placement_id = ? AND (state = ? OR state = ?) AND expire_time > ?");
        if (str2 != null) {
            sb2.append(" AND item_id = ?");
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
        } else {
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
        }
        query.selection = sb2.toString();
        query.args = strArr;
        query.orderBy = "state DESC";
        AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) this.adapters.get(Advertisement.class);
        ArrayList arrayList = new ArrayList();
        Cursor query2 = this.dbHelper.query(query);
        if (query2 == null) {
            return arrayList;
        }
        while (advertisementDBAdapter != null) {
            try {
                if (!query2.moveToNext()) {
                    break;
                }
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                arrayList.add(advertisementDBAdapter.fromContentValues(contentValues));
            } catch (Exception e10) {
                VungleLogger.critical(true, TAG, "findValidAdvertisementsForPlacementFromDB", e10.toString());
                return new ArrayList();
            } finally {
                query2.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> getAdsForPlacement(String str) {
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        query.columns = new String[]{IdColumns.COLUMN_IDENTIFIER};
        query.selection = "placement_id=?";
        query.args = new String[]{str};
        ArrayList arrayList = new ArrayList();
        Cursor query2 = this.dbHelper.query(query);
        if (query2 == null) {
            return arrayList;
        }
        while (query2.moveToNext()) {
            try {
                arrayList.add(query2.getString(query2.getColumnIndex(IdColumns.COLUMN_IDENTIFIER)));
            } catch (Exception e10) {
                VungleLogger.critical(true, TAG, "getAdsForPlacement", e10.toString());
                return new ArrayList();
            } finally {
                query2.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<AdAsset> loadAllAdAssetModels(String str) {
        Query query = new Query(AdAssetDBAdapter.AdAssetColumns.TABLE_NAME);
        query.selection = "ad_identifier = ? ";
        query.args = new String[]{str};
        return extractModels(AdAsset.class, this.dbHelper.query(query));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> List<T> loadAllModels(Class<T> cls) {
        DBAdapter dBAdapter = this.adapters.get(cls);
        if (dBAdapter == null) {
            return Collections.EMPTY_LIST;
        }
        return extractModels(cls, this.dbHelper.query(new Query(dBAdapter.tableName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T loadModel(String str, Class<T> cls) {
        DBAdapter dBAdapter = this.adapters.get(cls);
        Query query = new Query(dBAdapter.tableName());
        query.selection = "item_id = ? ";
        query.args = new String[]{str};
        Cursor query2 = this.dbHelper.query(query);
        try {
            if (query2 != null) {
                if (query2.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                    return (T) dBAdapter.fromContentValues(contentValues);
                }
            }
            return null;
        } catch (Exception e10) {
            VungleLogger.critical(true, TAG, "loadModel", e10.toString());
            return null;
        } finally {
            query2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> loadValidPlacementIds() {
        Query query = new Query("placement");
        query.selection = "is_valid = ?";
        query.args = new String[]{"1"};
        query.columns = new String[]{IdColumns.COLUMN_IDENTIFIER};
        Cursor query2 = this.dbHelper.query(query);
        ArrayList arrayList = new ArrayList();
        if (query2 != null) {
            while (query2.moveToNext()) {
                try {
                    try {
                        arrayList.add(query2.getString(query2.getColumnIndex(IdColumns.COLUMN_IDENTIFIER)));
                    } catch (Exception e10) {
                        VungleLogger.critical(true, TAG, "loadValidPlacementIds", e10.toString());
                    }
                } finally {
                    query2.close();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSaveCallbackError(final SaveCallback saveCallback, final Exception exc) {
        if (saveCallback != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.7
                @Override // java.lang.Runnable
                public void run() {
                    saveCallback.onError(exc);
                }
            });
        }
    }

    private void runAndWait(Callable<Void> callable) throws DatabaseHelper.DBException {
        try {
            this.ioExecutor.submit(callable).get();
        } catch (InterruptedException e10) {
            Log.e(TAG, "InterruptedException ", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            if (!(e11.getCause() instanceof DatabaseHelper.DBException)) {
                Log.e(TAG, "Exception during runAndWait", e11);
                return;
            }
            throw ((DatabaseHelper.DBException) e11.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void saveModel(T t10) throws DatabaseHelper.DBException {
        DBAdapter dBAdapter = this.adapters.get(t10.getClass());
        this.dbHelper.insertWithConflict(dBAdapter.tableName(), dBAdapter.toContentValues(t10), 5);
    }

    public void clearAllData() {
        this.dbHelper.dropDb();
        this.designer.clearCache();
    }

    public void close() {
        this.dbHelper.close();
    }

    public <T> void delete(final T t10) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.16
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.deleteModel(t10);
                return null;
            }
        });
    }

    public void deleteAdvertisement(final String str) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.17
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.deleteAdInternal(str);
                return null;
            }
        });
    }

    public <T> void deleteAll(Class<T> cls) {
        if (cls == Advertisement.class) {
            Iterator<T> it = loadAll(Advertisement.class).get().iterator();
            while (it.hasNext()) {
                try {
                    deleteAdvertisement(((Advertisement) it.next()).getId());
                } catch (DatabaseHelper.DBException e10) {
                    Log.e(TAG, "DB Exception deleting advertisement", e10);
                }
            }
            return;
        }
        Iterator<T> it2 = loadAll(cls).get().iterator();
        while (it2.hasNext()) {
            try {
                deleteModel(it2.next());
            } catch (DatabaseHelper.DBException e11) {
                Log.e(TAG, "DB Exception deleting db entry", e11);
            }
        }
    }

    public FutureResult<List<String>> findAdsForPlacement(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<String>>() { // from class: com.vungle.warren.persistence.Repository.23
            @Override // java.util.concurrent.Callable
            public List<String> call() {
                return Repository.this.getAdsForPlacement(str);
            }
        }));
    }

    public FutureResult<Advertisement> findPotentiallyExpiredAd(final String str, final String str2) {
        Log.i(TAG, " Searching for valid advertisement for placement with " + str + " event ID " + str2);
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Advertisement>() { // from class: com.vungle.warren.persistence.Repository.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Advertisement call() {
                String[] strArr;
                Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                StringBuilder sb2 = new StringBuilder("placement_id = ? AND (state = ? OR state = ?)");
                if (str2 != null) {
                    sb2.append(" AND item_id = ?");
                    strArr = new String[]{str, String.valueOf(1), String.valueOf(0), str2};
                } else {
                    strArr = new String[]{str, String.valueOf(1), String.valueOf(0)};
                }
                query.selection = sb2.toString();
                query.args = strArr;
                Cursor query2 = Repository.this.dbHelper.query(query);
                Advertisement advertisement = null;
                if (query2 == null) {
                    return null;
                }
                try {
                    AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) Repository.this.adapters.get(Advertisement.class);
                    if (advertisementDBAdapter != null && query2.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                        advertisement = advertisementDBAdapter.fromContentValues(contentValues);
                    }
                    return advertisement;
                } catch (Exception e10) {
                    VungleLogger.critical(true, Repository.TAG, "findPotentiallyExpiredAd", e10.toString());
                    return null;
                } finally {
                    query2.close();
                }
            }
        }));
    }

    public FutureResult<Advertisement> findValidAdvertisementForPlacement(final String str, final String str2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Advertisement>() { // from class: com.vungle.warren.persistence.Repository.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Advertisement call() {
                return Repository.this.findValidAdvertisementForPlacementFromDB(str, str2);
            }
        }));
    }

    public FutureResult<List<Advertisement>> findValidAdvertisementsForPlacement(final String str, final String str2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Advertisement>>() { // from class: com.vungle.warren.persistence.Repository.10
            @Override // java.util.concurrent.Callable
            public List<Advertisement> call() {
                return Repository.this.findValidAdvertisementsForPlacementFromDB(str, str2);
            }
        }));
    }

    public List<Advertisement> getAdsByCampaign(Collection<String> collection) {
        HashSet hashSet = new HashSet(collection);
        HashSet hashSet2 = new HashSet();
        for (Advertisement advertisement : loadAllModels(Advertisement.class)) {
            if (hashSet.contains(advertisement.getCampaignId())) {
                hashSet2.add(advertisement);
            }
        }
        return new ArrayList(hashSet2);
    }

    public List<Advertisement> getAdsByCreative(Collection<String> collection) {
        HashSet hashSet = new HashSet(collection);
        HashSet hashSet2 = new HashSet();
        for (Advertisement advertisement : loadAllModels(Advertisement.class)) {
            if (hashSet.contains(advertisement.getCreativeId())) {
                hashSet2.add(advertisement);
            }
        }
        return new ArrayList(hashSet2);
    }

    public FutureResult<File> getAdvertisementAssetDirectory(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<File>() { // from class: com.vungle.warren.persistence.Repository.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public File call() throws Exception {
                return Repository.this.designer.getAssetDirectory(str);
            }
        }));
    }

    public FutureResult<List<String>> getAvailableBidTokens(final String str, final int i10, final int i11) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<String>>() { // from class: com.vungle.warren.persistence.Repository.21
            @Override // java.util.concurrent.Callable
            public List<String> call() {
                ArrayList arrayList;
                synchronized (Repository.this) {
                    Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                    query.selection = TextUtils.isEmpty(str) ? "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ?" : "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ? AND placement_id = ?";
                    query.columns = new String[]{"bid_token"};
                    int i12 = 0;
                    String[] strArr = {String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000)};
                    if (!TextUtils.isEmpty(str)) {
                        strArr = new String[]{String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000), str};
                    }
                    query.args = strArr;
                    Cursor query2 = Repository.this.dbHelper.query(query);
                    arrayList = new ArrayList();
                    if (query2 != null) {
                        while (query2.moveToNext() && i12 < i10) {
                            try {
                                try {
                                    String string = query2.getString(query2.getColumnIndex("bid_token"));
                                    if (string.getBytes().length + i12 <= i10) {
                                        int length = string.getBytes().length + i11 + i12;
                                        arrayList.add(string);
                                        i12 = length;
                                    }
                                } finally {
                                    query2.close();
                                }
                            } catch (Exception e10) {
                                VungleLogger.critical(true, Repository.TAG, "getAvailableBidTokens", e10.toString());
                                return new ArrayList();
                            }
                        }
                    }
                }
                return arrayList;
            }
        }));
    }

    public String getPlacementIdByAd(Advertisement advertisement) {
        return advertisement.getPlacementId();
    }

    public List<CacheBust> getUnProcessedBusts() {
        List<CacheBust> loadAllModels = loadAllModels(CacheBust.class);
        ArrayList arrayList = new ArrayList();
        for (CacheBust cacheBust : loadAllModels) {
            if (cacheBust.getTimestampProcessed() == 0) {
                arrayList.add(cacheBust);
            }
        }
        return arrayList;
    }

    public FutureResult<Collection<String>> getValidPlacementIds() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Collection<String>>() { // from class: com.vungle.warren.persistence.Repository.20
            @Override // java.util.concurrent.Callable
            public Collection<String> call() throws Exception {
                List loadValidPlacementIds;
                synchronized (Repository.this) {
                    loadValidPlacementIds = Repository.this.loadValidPlacementIds();
                }
                return loadValidPlacementIds;
            }
        }));
    }

    public FutureResult<List<VisionAggregationData>> getVisionAggregationData(final long j10, final int i10, final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<VisionAggregationData>>() { // from class: com.vungle.warren.persistence.Repository.27
            @Override // java.util.concurrent.Callable
            public List<VisionAggregationData> call() {
                ArrayList arrayList = new ArrayList();
                if (!VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER.equals(str) && !"campaign".equals(str) && !"creative".equals(str)) {
                    return arrayList;
                }
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                String str2 = str;
                query.columns = new String[]{"COUNT ( * ) as viewCount", "MAX ( timestamp ) as lastTimeStamp", str2};
                query.selection = "timestamp >= ?";
                query.groupBy = str2;
                query.orderBy = "_id DESC";
                query.limit = Integer.toString(i10);
                query.args = new String[]{Long.toString(j10)};
                Cursor query2 = Repository.this.dbHelper.query(query);
                if (query2 != null) {
                    while (query2.moveToNext()) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                            arrayList.add(new VisionAggregationData(contentValues.getAsString(str), contentValues.getAsInteger("viewCount").intValue(), contentValues.getAsLong("lastTimeStamp").longValue()));
                        } catch (Exception e10) {
                            VungleLogger.critical(true, Repository.TAG, "getVisionAggregationInfo", e10.toString());
                            return new ArrayList();
                        } finally {
                            query2.close();
                        }
                    }
                }
                return arrayList;
            }
        }));
    }

    public FutureResult<VisionAggregationInfo> getVisionAggregationInfo(final long j10) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<VisionAggregationInfo>() { // from class: com.vungle.warren.persistence.Repository.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public VisionAggregationInfo call() {
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                query.selection = "timestamp >= ?";
                query.orderBy = "_id DESC";
                query.args = new String[]{Long.toString(j10)};
                Cursor query2 = Repository.this.dbHelper.query(query);
                VisionDataDBAdapter visionDataDBAdapter = (VisionDataDBAdapter) Repository.this.adapters.get(VisionData.class);
                if (query2 != null) {
                    if (visionDataDBAdapter != null) {
                        try {
                            if (query2.moveToFirst()) {
                                ContentValues contentValues = new ContentValues();
                                DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                                return new VisionAggregationInfo(query2.getCount(), visionDataDBAdapter.fromContentValues(contentValues).creative);
                            }
                        } catch (Exception e10) {
                            VungleLogger.critical(true, Repository.TAG, "getVisionAggregationInfo", e10.toString());
                            return null;
                        } finally {
                            query2.close();
                        }
                    }
                }
                return null;
            }
        }));
    }

    public void init() throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.1
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.dbHelper.init();
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", (Integer) 3);
                Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                query.selection = "state=?";
                query.args = new String[]{String.valueOf(2)};
                Repository.this.dbHelper.update(query, contentValues);
                return null;
            }
        });
    }

    public <T> FutureResult<T> load(final String str, final Class<T> cls) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<T>() { // from class: com.vungle.warren.persistence.Repository.2
            @Override // java.util.concurrent.Callable
            public T call() {
                return (T) Repository.this.loadModel(str, cls);
            }
        }));
    }

    public <T> FutureResult<List<T>> loadAll(final Class<T> cls) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<T>>() { // from class: com.vungle.warren.persistence.Repository.11
            @Override // java.util.concurrent.Callable
            public List<T> call() {
                return Repository.this.loadAllModels(cls);
            }
        }));
    }

    public List<AdAsset> loadAllAdAssetByStatus(String str, int i10) {
        Query query = new Query(AdAssetDBAdapter.AdAssetColumns.TABLE_NAME);
        query.selection = "ad_identifier = ?  AND file_status = ? ";
        query.args = new String[]{str, String.valueOf(i10)};
        return extractModels(AdAsset.class, this.dbHelper.query(query));
    }

    public FutureResult<List<AdAsset>> loadAllAdAssets(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<AdAsset>>() { // from class: com.vungle.warren.persistence.Repository.15
            @Override // java.util.concurrent.Callable
            public List<AdAsset> call() {
                return Repository.this.loadAllAdAssetModels(str);
            }
        }));
    }

    public FutureResult<List<Report>> loadAllReportToSend() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Report>>() { // from class: com.vungle.warren.persistence.Repository.12
            @Override // java.util.concurrent.Callable
            public List<Report> call() {
                List<Report> loadAllModels = Repository.this.loadAllModels(Report.class);
                for (Report report : loadAllModels) {
                    report.setStatus(2);
                    try {
                        Repository.this.saveModel(report);
                    } catch (DatabaseHelper.DBException unused) {
                        return null;
                    }
                }
                return loadAllModels;
            }
        }));
    }

    public FutureResult<List<Report>> loadReadyOrFailedReportToSend() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Report>>() { // from class: com.vungle.warren.persistence.Repository.13
            @Override // java.util.concurrent.Callable
            public List<Report> call() {
                Query query = new Query(ReportDBAdapter.ReportColumns.TABLE_NAME);
                query.selection = "status = ?  OR status = ? ";
                query.args = new String[]{String.valueOf(1), String.valueOf(3)};
                List<Report> extractModels = Repository.this.extractModels(Report.class, Repository.this.dbHelper.query(query));
                for (Report report : extractModels) {
                    report.setStatus(2);
                    try {
                        Repository.this.saveModel(report);
                    } catch (DatabaseHelper.DBException unused) {
                        return null;
                    }
                }
                return extractModels;
            }
        }));
    }

    public FutureResult<Collection<Placement>> loadValidPlacements() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Collection<Placement>>() { // from class: com.vungle.warren.persistence.Repository.18
            @Override // java.util.concurrent.Callable
            public Collection<Placement> call() {
                List extractModels;
                synchronized (Repository.this) {
                    Query query = new Query("placement");
                    query.selection = "is_valid = ?";
                    query.args = new String[]{"1"};
                    extractModels = Repository.this.extractModels(Placement.class, Repository.this.dbHelper.query(query));
                }
                return extractModels;
            }
        }));
    }

    public <T> void save(final T t10) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.4
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.saveModel(t10);
                return null;
            }
        });
    }

    public void saveAndApplyState(final Advertisement advertisement, final String str, @Advertisement.State final int i10) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.24
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
            
                if (r0 != 5) goto L18;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r3 = this;
                    java.lang.String r0 = com.vungle.warren.persistence.Repository.access$1400()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Setting "
                    r1.<init>(r2)
                    int r2 = r2
                    r1.append(r2)
                    java.lang.String r2 = " for adv "
                    r1.append(r2)
                    com.vungle.warren.model.Advertisement r2 = r3
                    java.lang.String r2 = r2.getId()
                    r1.append(r2)
                    java.lang.String r2 = " and pl "
                    r1.append(r2)
                    java.lang.String r2 = r4
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.i(r0, r1)
                    com.vungle.warren.model.Advertisement r0 = r3
                    int r1 = r2
                    r0.setState(r1)
                    int r0 = r2
                    r1 = 0
                    if (r0 == 0) goto L64
                    r2 = 1
                    if (r0 == r2) goto L64
                    r2 = 2
                    if (r0 == r2) goto L57
                    r2 = 3
                    if (r0 == r2) goto L4b
                    r2 = 4
                    if (r0 == r2) goto L4b
                    r2 = 5
                    if (r0 == r2) goto L64
                    goto L72
                L4b:
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    java.lang.String r2 = r2.getId()
                    com.vungle.warren.persistence.Repository.access$1100(r0, r2)
                    goto L72
                L57:
                    com.vungle.warren.model.Advertisement r0 = r3
                    r0.setPlacementId(r1)
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    com.vungle.warren.persistence.Repository.access$200(r0, r2)
                    goto L72
                L64:
                    com.vungle.warren.model.Advertisement r0 = r3
                    java.lang.String r2 = r4
                    r0.setPlacementId(r2)
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    com.vungle.warren.persistence.Repository.access$200(r0, r2)
                L72:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.persistence.Repository.AnonymousClass24.call():java.lang.Void");
            }
        });
    }

    public void setMockDBHelper(DatabaseHelper databaseHelper) {
        this.dbHelper = databaseHelper;
    }

    public void setValidPlacements(final List<Placement> list) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.22
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                synchronized (Repository.class) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(PlacementDBAdapter.PlacementColumns.COLUMN_IS_VALID, Boolean.FALSE);
                    Repository.this.dbHelper.update(new Query("placement"), contentValues);
                    for (Placement placement : list) {
                        Placement placement2 = (Placement) Repository.this.loadModel(placement.getId(), Placement.class);
                        if (placement2 != null && (placement2.isIncentivized() != placement.isIncentivized() || placement2.isHeaderBidding() != placement.isHeaderBidding())) {
                            Log.w(Repository.TAG, "Placements data for " + placement.getId() + " is different from disc, deleting old");
                            Iterator it = Repository.this.getAdsForPlacement(placement.getId()).iterator();
                            while (it.hasNext()) {
                                Repository.this.deleteAdInternal((String) it.next());
                            }
                            Repository.this.deleteModel(Placement.class, placement2.getId());
                        }
                        if (placement2 != null) {
                            placement.setWakeupTime(placement2.getWakeupTime());
                            placement.setAdSize(placement2.getAdSize());
                        }
                        placement.setValid(placement.getPlacementAdType() != 2);
                        if (placement.getMaxHbCache() == Integer.MIN_VALUE) {
                            placement.setValid(false);
                        }
                        Repository.this.saveModel(placement);
                    }
                }
                return null;
            }
        });
    }

    public void trimVisionData(final int i10) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.25
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                query.selection = "_id <= ( SELECT MAX( _id ) FROM vision_data ) - ?";
                query.args = new String[]{Integer.toString(i10)};
                Repository.this.dbHelper.delete(query);
                return null;
            }
        });
    }

    public void updateAndSaveReportState(final String str, final String str2, final int i10, final int i11) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.14
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                ContentValues contentValues = new ContentValues();
                contentValues.put("status", Integer.valueOf(i11));
                Query query = new Query(ReportDBAdapter.ReportColumns.TABLE_NAME);
                query.selection = "placementId = ?  AND status = ?  AND appId = ? ";
                query.args = new String[]{str, String.valueOf(i10), str2};
                Repository.this.dbHelper.update(query, contentValues);
                return null;
            }
        });
    }

    public Repository(Context context, Designer designer, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService, int i10) {
        this.adapters = new HashMap();
        Context applicationContext = context.getApplicationContext();
        this.appCtx = applicationContext;
        this.ioExecutor = vungleThreadPoolExecutor;
        this.uiExecutor = executorService;
        this.dbHelper = new DatabaseHelper(context, i10, new VungleDatabaseCreator(applicationContext));
        this.designer = designer;
        this.adapters.put(Placement.class, new PlacementDBAdapter());
        this.adapters.put(Cookie.class, new CookieDBAdapter());
        this.adapters.put(Report.class, new ReportDBAdapter());
        this.adapters.put(Advertisement.class, new AdvertisementDBAdapter());
        this.adapters.put(AdAsset.class, new AdAssetDBAdapter());
        this.adapters.put(VisionData.class, new VisionDataDBAdapter());
        this.adapters.put(AnalyticUrl.class, new AnalyticUrlDBAdapter());
        this.adapters.put(CacheBust.class, new CacheBustDBAdapter());
        this.adapters.put(SessionData.class, new SessionDataDBAdapter());
    }

    public <T> void load(final String str, final Class<T> cls, final LoadCallback<T> loadCallback) {
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.3
            @Override // java.lang.Runnable
            public void run() {
                final Object loadModel = Repository.this.loadModel(str, cls);
                Repository.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        loadCallback.onLoaded(loadModel);
                    }
                });
            }
        });
    }

    public <T> void save(final T t10, final SaveCallback saveCallback, boolean z10) {
        Future<?> submit = this.ioExecutor.submit(new Runnable() { // from class: com.vungle.warren.persistence.Repository.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Repository.this.saveModel(t10);
                    if (saveCallback != null) {
                        Repository.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                saveCallback.onSaved();
                            }
                        });
                    }
                } catch (DatabaseHelper.DBException e10) {
                    Repository.this.onSaveCallbackError(saveCallback, e10);
                }
            }
        }, new Runnable() { // from class: com.vungle.warren.persistence.Repository.6
            @Override // java.lang.Runnable
            public void run() {
                Repository.this.onSaveCallbackError(saveCallback, new VungleException(39));
            }
        });
        if (z10) {
            try {
                submit.get();
            } catch (InterruptedException e10) {
                Log.e(TAG, "InterruptedException ", e10);
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                Log.e(TAG, "Error on execution during saving", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void deleteModel(T t10) throws DatabaseHelper.DBException {
        deleteModel(t10.getClass(), this.adapters.get(t10.getClass()).toContentValues(t10).getAsString(IdColumns.COLUMN_IDENTIFIER));
    }

    public <T> void save(T t10, SaveCallback saveCallback) {
        save(t10, saveCallback, true);
    }

    public List<Advertisement> getAdsByCampaign(String str) {
        return getAdsByCampaign(Collections.singletonList(str));
    }

    public List<Advertisement> getAdsByCreative(String str) {
        return getAdsByCreative(Collections.singletonList(str));
    }
}
