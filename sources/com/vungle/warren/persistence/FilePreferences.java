package com.vungle.warren.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.CollectionsConcurrencyUtil;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class FilePreferences {
    static final String FILENAME = "vungle_settings";
    static final String OLD_SHARED_PREFS = "com.vungle.sdk";
    private final File file;
    private final Executor ioExecutor;
    private final SharedPreferences preferences;
    private final HashSet<String> sharedPrefValues;
    private final ConcurrentHashMap<String, Object> values;

    public FilePreferences(Context context, Executor executor) {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        this.sharedPrefValues = new HashSet<>();
        this.ioExecutor = executor;
        File file = new File(context.getNoBackupFilesDir(), FILENAME);
        this.file = file;
        File file2 = new File(context.getFilesDir(), FILENAME);
        if (file2.exists() && !file2.renameTo(file)) {
            VungleLogger.error("FilePreferences", "Can't move old FilePreferences");
        }
        Object readSerializable = FileUtility.readSerializable(file);
        if (readSerializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) readSerializable);
        }
        this.preferences = context.getSharedPreferences(OLD_SHARED_PREFS, 0);
        migrateFromSharedPrefs();
    }

    private void migrateFromSharedPrefs() {
        for (Map.Entry<String, ?> entry : this.preferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                put(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                put(entry.getKey(), (String) value);
            } else if (value instanceof Integer) {
                put(entry.getKey(), ((Integer) value).intValue());
            } else if (value instanceof HashSet) {
                put(entry.getKey(), (HashSet<String>) value);
            }
        }
        this.preferences.edit().clear().apply();
        apply();
    }

    public FilePreferences addSharedPrefsKey(String... strArr) {
        this.sharedPrefValues.addAll(Arrays.asList(strArr));
        return this;
    }

    public void apply() {
        final HashMap hashMap = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.FilePreferences.1
            @Override // java.lang.Runnable
            public void run() {
                FileUtility.writeSerializable(FilePreferences.this.file, hashMap);
            }
        });
    }

    public boolean getBoolean(String str, boolean z10) {
        Object obj = this.values.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z10;
    }

    public int getInt(String str, int i10) {
        Object obj = this.values.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return i10;
    }

    public String getString(String str, String str2) {
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    public HashSet<String> getStringSet(String str, HashSet<String> hashSet) {
        Object obj = this.values.get(str);
        if (obj instanceof HashSet) {
            return CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj);
        }
        return hashSet;
    }

    public FilePreferences put(String str, boolean z10) {
        this.values.put(str, Boolean.valueOf(z10));
        if (this.sharedPrefValues.contains(str)) {
            this.preferences.edit().putBoolean(str, z10).apply();
        }
        return this;
    }

    public FilePreferences put(String str, String str2) {
        this.values.put(str, str2);
        if (this.sharedPrefValues.contains(str)) {
            this.preferences.edit().putString(str, str2).apply();
        }
        return this;
    }

    public FilePreferences put(String str, int i10) {
        this.values.put(str, Integer.valueOf(i10));
        if (this.sharedPrefValues.contains(str)) {
            this.preferences.edit().putInt(str, i10).apply();
        }
        return this;
    }

    public FilePreferences put(String str, HashSet<String> hashSet) {
        this.values.put(str, CollectionsConcurrencyUtil.getNewHashSet(hashSet));
        if (this.sharedPrefValues.contains(str)) {
            this.preferences.edit().putStringSet(str, CollectionsConcurrencyUtil.getNewHashSet(hashSet)).apply();
        }
        return this;
    }
}
