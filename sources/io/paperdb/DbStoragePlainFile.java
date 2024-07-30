package io.paperdb;

import a3.k;
import a3.l;
import android.content.Context;
import android.util.Log;
import androidx.activity.n;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer;
import com.ironsource.adapters.facebook.a;
import de.javakaffee.kryoserializers.ArraysAsListSerializer;
import de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer;
import de.javakaffee.kryoserializers.UUIDSerializer;
import de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer;
import io.paperdb.serializer.NoArgCollectionSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DbStoragePlainFile {
    private static final String BACKUP_EXTENSION = ".bak";
    private final HashMap<Class, Serializer> mCustomSerializers;
    private final String mDbPath;
    private volatile boolean mPaperDirIsCreated;
    private KeyLocker keyLocker = new KeyLocker();
    private final ThreadLocal<Kryo> mKryo = new ThreadLocal<Kryo>() { // from class: io.paperdb.DbStoragePlainFile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Kryo initialValue() {
            return DbStoragePlainFile.this.createKryoInstance(false);
        }
    };

    public DbStoragePlainFile(Context context, String str, HashMap<Class, Serializer> hashMap) {
        this.mCustomSerializers = hashMap;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir());
        this.mDbPath = l.p(sb2, File.separator, str);
    }

    private synchronized void assertInit() {
        if (!this.mPaperDirIsCreated) {
            if (!new File(this.mDbPath).exists() && !new File(this.mDbPath).mkdirs()) {
                throw new RuntimeException("Couldn't create Paper dir: " + this.mDbPath);
            }
            this.mPaperDirIsCreated = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Kryo createKryoInstance(boolean z10) {
        Kryo kryo = new Kryo();
        if (z10) {
            kryo.getFieldSerializerConfig().setOptimizedGenerics(true);
        }
        kryo.register(PaperTable.class);
        kryo.setDefaultSerializer(CompatibleFieldSerializer.class);
        kryo.setReferences(false);
        kryo.register(Arrays.asList("").getClass(), new ArraysAsListSerializer());
        UnmodifiableCollectionsSerializer.registerSerializers(kryo);
        SynchronizedCollectionsSerializer.registerSerializers(kryo);
        kryo.addDefaultSerializer(new ArrayList().subList(0, 0).getClass(), new NoArgCollectionSerializer());
        kryo.addDefaultSerializer(new LinkedList().subList(0, 0).getClass(), new NoArgCollectionSerializer());
        kryo.register(UUID.class, new UUIDSerializer());
        for (Class cls : this.mCustomSerializers.keySet()) {
            kryo.register(cls, this.mCustomSerializers.get(cls));
        }
        kryo.setInstantiatorStrategy(new Kryo.DefaultInstantiatorStrategy(new n()));
        return kryo;
    }

    private static boolean deleteDirectory(String str) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteDirectory(file2.toString());
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    private boolean existsInternal(String str) {
        assertInit();
        return getOriginalFile(str).exists();
    }

    private Kryo getKryo() {
        return this.mKryo.get();
    }

    private File getOriginalFile(String str) {
        return new File(getOriginalFilePath(str));
    }

    private File makeBackupFile(File file) {
        return new File(file.getPath() + BACKUP_EXTENSION);
    }

    private <E> E readContent(File file, Kryo kryo) throws FileNotFoundException, KryoException {
        Input input = new Input(new FileInputStream(file));
        try {
            return (E) ((PaperTable) kryo.readObject(input, PaperTable.class)).mContent;
        } finally {
            input.close();
        }
    }

    private <E> E readTableFile(String str, File file) {
        try {
            return (E) readContent(file, getKryo());
        } catch (KryoException | FileNotFoundException | ClassCastException e10) {
            e = e10;
            if (e instanceof KryoException) {
                try {
                    return (E) readContent(file, createKryoInstance(true));
                } catch (KryoException e11) {
                    e = e11;
                    throw new PaperDbException("Couldn't read/deserialize file " + file + " for table " + str, e);
                } catch (FileNotFoundException e12) {
                    e = e12;
                    throw new PaperDbException("Couldn't read/deserialize file " + file + " for table " + str, e);
                } catch (ClassCastException e13) {
                    e = e13;
                    throw new PaperDbException("Couldn't read/deserialize file " + file + " for table " + str, e);
                }
            }
            throw new PaperDbException("Couldn't read/deserialize file " + file + " for table " + str, e);
        }
    }

    private static void sync(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException unused) {
            }
        }
    }

    private <E> void writeTableFile(String str, PaperTable<E> paperTable, File file, File file2) {
        FileOutputStream fileOutputStream;
        Output output;
        Output output2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                output = new Output(fileOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (KryoException e10) {
            e = e10;
        } catch (IOException e11) {
            e = e11;
        }
        try {
            getKryo().writeObject(output, paperTable);
            output.flush();
            fileOutputStream.flush();
            sync(fileOutputStream);
            output.close();
            file2.delete();
        } catch (KryoException e12) {
            e = e12;
            if (!file.exists() && !file.delete()) {
                throw new PaperDbException("Couldn't clean up partially-written file " + file, e);
            }
            throw new PaperDbException("Couldn't save table: " + str + ". Backed up table will be used on next read attempt", e);
        } catch (IOException e13) {
            e = e13;
            if (!file.exists()) {
            }
            throw new PaperDbException("Couldn't save table: " + str + ". Backed up table will be used on next read attempt", e);
        } catch (Throwable th2) {
            th = th2;
            output2 = output;
            if (output2 != null) {
                output2.close();
            }
            throw th;
        }
    }

    public void deleteIfExists(String str) {
        try {
            this.keyLocker.acquire(str);
            assertInit();
            File originalFile = getOriginalFile(str);
            if (!originalFile.exists()) {
                return;
            }
            if (originalFile.delete()) {
                return;
            }
            throw new PaperDbException("Couldn't delete file " + originalFile + " for table " + str);
        } finally {
            this.keyLocker.release(str);
        }
    }

    public void destroy() {
        try {
            this.keyLocker.acquireGlobal();
            if (!deleteDirectory(this.mDbPath)) {
                Log.e("paperdb", "Couldn't delete Paper dir " + this.mDbPath);
            }
            this.mPaperDirIsCreated = false;
        } finally {
            this.keyLocker.releaseGlobal();
        }
    }

    public boolean exists(String str) {
        try {
            this.keyLocker.acquire(str);
            return existsInternal(str);
        } finally {
            this.keyLocker.release(str);
        }
    }

    public List<String> getAllKeys() {
        List<String> arrayList;
        try {
            this.keyLocker.acquireGlobal();
            assertInit();
            String[] list = new File(this.mDbPath).list(new FilenameFilter() { // from class: io.paperdb.DbStoragePlainFile.2
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !str.endsWith(DbStoragePlainFile.BACKUP_EXTENSION);
                }
            });
            if (list != null) {
                for (int i10 = 0; i10 < list.length; i10++) {
                    list[i10] = list[i10].replace(".pt", "");
                }
                arrayList = Arrays.asList(list);
            } else {
                arrayList = new ArrayList<>();
            }
            return arrayList;
        } finally {
            this.keyLocker.releaseGlobal();
        }
    }

    public String getOriginalFilePath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mDbPath);
        return k.m(sb2, File.separator, str, ".pt");
    }

    public String getRootFolderPath() {
        return this.mDbPath;
    }

    public <E> void insert(String str, E e10) {
        try {
            this.keyLocker.acquire(str);
            assertInit();
            PaperTable<E> paperTable = new PaperTable<>(e10);
            File originalFile = getOriginalFile(str);
            File makeBackupFile = makeBackupFile(originalFile);
            if (originalFile.exists()) {
                if (!makeBackupFile.exists()) {
                    if (!originalFile.renameTo(makeBackupFile)) {
                        throw new PaperDbException("Couldn't rename file " + originalFile + " to backup file " + makeBackupFile);
                    }
                } else {
                    originalFile.delete();
                }
            }
            writeTableFile(str, paperTable, originalFile, makeBackupFile);
        } finally {
            this.keyLocker.release(str);
        }
    }

    public long lastModified(String str) {
        long j10;
        try {
            this.keyLocker.acquire(str);
            assertInit();
            File originalFile = getOriginalFile(str);
            if (originalFile.exists()) {
                j10 = originalFile.lastModified();
            } else {
                j10 = -1;
            }
            return j10;
        } finally {
            this.keyLocker.release(str);
        }
    }

    public <E> E select(String str) {
        try {
            this.keyLocker.acquire(str);
            assertInit();
            File originalFile = getOriginalFile(str);
            File makeBackupFile = makeBackupFile(originalFile);
            if (makeBackupFile.exists()) {
                originalFile.delete();
                makeBackupFile.renameTo(originalFile);
            }
            if (!existsInternal(str)) {
                this.keyLocker.release(str);
                return null;
            }
            return (E) readTableFile(str, originalFile);
        } finally {
            this.keyLocker.release(str);
        }
    }

    public void setLogLevel(int i10) {
        com.esotericsoftware.minlog.Log.set(i10);
    }

    public DbStoragePlainFile(String str, String str2, HashMap<Class, Serializer> hashMap) {
        this.mCustomSerializers = hashMap;
        this.mDbPath = l.p(a.j(str), File.separator, str2);
    }
}
