package com.vungle.warren.utility;

import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class FileUtility {
    private static ObjectInputStreamProvider objectInputStreamProvider = new ObjectInputStreamProvider() { // from class: com.vungle.warren.utility.FileUtility.1
        @Override // com.vungle.warren.utility.FileUtility.ObjectInputStreamProvider
        public SafeObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException {
            return new SafeObjectInputStream(inputStream, FileUtility.allowedClasses);
        }
    };
    private static final String TAG = "FileUtility";
    protected static final List<Class<?>> allowedClasses = Arrays.asList(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    /* loaded from: classes2.dex */
    public interface ObjectInputStreamProvider {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void delete(File file) throws IOException {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                for (File file2 : listFiles) {
                    delete(file2);
                }
            }
            if (file.delete()) {
                return;
            }
            throw new FileNotFoundException("Failed to delete file: " + file);
        }
    }

    public static void deleteAndLogIfFailed(File file) {
        Path path;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                Log.w(TAG, "Cannot delete " + file.getName());
            }
        } catch (IOException e10) {
            Log.w(TAG, "Cannot delete " + file.getName() + e10.getLocalizedMessage());
        }
    }

    private static String getIndentString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("|  ");
        }
        return sb2.toString();
    }

    public static ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public static boolean isVideoFile(String str) {
        if (str != null) {
            return str.endsWith(".mp4");
        }
        return false;
    }

    public static void printDirectoryTree(File file) {
    }

    private static void printFile(File file, int i10, StringBuilder sb2) {
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    public static ArrayList<String> readAllLines(String str) {
        File file = new File(str);
        if (file.exists()) {
            Object readSerializable = readSerializable(file);
            if (readSerializable instanceof ArrayList) {
                return (ArrayList) readSerializable;
            }
        }
        return new ArrayList<>();
    }

    public static HashMap<String, String> readMap(String str) {
        Object readSerializable = readSerializable(new File(str));
        if (readSerializable instanceof HashMap) {
            return (HashMap) readSerializable;
        }
        return new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:94), block:B:47:0x005d */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.vungle.warren.utility.FileUtility$ObjectInputStreamProvider] */
    public static <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStream;
        Closeable closeable2;
        ?? exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
                try {
                    objectInputStream = objectInputStreamProvider.provideObjectInputStream(exists);
                    try {
                        T t10 = (T) objectInputStream.readObject();
                        closeQuietly(objectInputStream);
                        closeQuietly(exists);
                        return t10;
                    } catch (IOException e10) {
                        e = e10;
                        Log.e(TAG, "IOIOException", e);
                        closeable2 = exists;
                        closeQuietly(objectInputStream);
                        closeQuietly(closeable2);
                        try {
                            delete(file);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        Log.e(TAG, "ClassNotFoundException", e);
                        closeable2 = exists;
                        closeQuietly(objectInputStream);
                        closeQuietly(closeable2);
                        delete(file);
                        return null;
                    } catch (Exception e12) {
                        e = e12;
                        Log.e(TAG, "cannot read serializable", e);
                        closeable2 = exists;
                        closeQuietly(objectInputStream);
                        closeQuietly(closeable2);
                        delete(file);
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    objectInputStream = null;
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    objectInputStream = null;
                } catch (Exception e15) {
                    e = e15;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    closeQuietly(closeable3);
                    closeQuietly(exists);
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e17) {
                e = e17;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e18) {
                e = e18;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                exists = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    public static void setObjectInputStreamProvider(ObjectInputStreamProvider objectInputStreamProvider2) {
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public static long size(File file) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    j10 += size(file2);
                }
            }
            return j10;
        }
        return file.length();
    }

    public static void writeAllLines(String str, ArrayList<String> arrayList) {
        File file = new File(str);
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        writeSerializable(file, arrayList);
    }

    public static void writeMap(String str, HashMap<String, String> hashMap) {
        File file = new File(str);
        if (hashMap.isEmpty()) {
            return;
        }
        writeSerializable(file, hashMap);
    }

    public static void writeSerializable(File file, Serializable serializable) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.reset();
                closeQuietly(objectOutputStream);
            } catch (IOException e11) {
                e = e11;
                objectOutputStream2 = objectOutputStream;
                Log.e(TAG, "IOIOException", e);
                closeQuietly(objectOutputStream2);
                closeQuietly(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                closeQuietly(objectOutputStream2);
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        closeQuietly(fileOutputStream);
    }

    private static void printDirectoryTree(File file, int i10, StringBuilder sb2) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            sb2.append(getIndentString(i10));
            sb2.append("+--");
            sb2.append(file.getName());
            sb2.append("/\n");
            if (file.listFiles() == null) {
                return;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    printDirectoryTree(file2, i10 + 1, sb2);
                } else {
                    printFile(file2, i10 + 1, sb2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("folder is not a Directory");
    }
}
