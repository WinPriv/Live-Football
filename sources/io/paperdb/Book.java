package io.paperdb;

import android.content.Context;
import com.esotericsoftware.kryo.Serializer;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class Book {
    private final DbStoragePlainFile mStorage;

    public Book(Context context, String str, HashMap<Class, Serializer> hashMap) {
        this.mStorage = new DbStoragePlainFile(context.getApplicationContext(), str, hashMap);
    }

    public boolean contains(String str) {
        return this.mStorage.exists(str);
    }

    public void delete(String str) {
        this.mStorage.deleteIfExists(str);
    }

    public void destroy() {
        this.mStorage.destroy();
    }

    public boolean exist(String str) {
        return this.mStorage.exists(str);
    }

    public List<String> getAllKeys() {
        return this.mStorage.getAllKeys();
    }

    public String getPath() {
        return this.mStorage.getRootFolderPath();
    }

    public long lastModified(String str) {
        return this.mStorage.lastModified(str);
    }

    public <T> T read(String str) {
        return (T) read(str, null);
    }

    public void setLogLevel(int i10) {
        this.mStorage.setLogLevel(i10);
    }

    public <T> Book write(String str, T t10) {
        if (t10 != null) {
            this.mStorage.insert(str, t10);
            return this;
        }
        throw new PaperDbException("Paper doesn't support writing null root values");
    }

    public String getPath(String str) {
        return this.mStorage.getOriginalFilePath(str);
    }

    public <T> T read(String str, T t10) {
        T t11 = (T) this.mStorage.select(str);
        return t11 == null ? t10 : t11;
    }

    public Book(String str, String str2, HashMap<Class, Serializer> hashMap) {
        this.mStorage = new DbStoragePlainFile(str, str2, hashMap);
    }
}
