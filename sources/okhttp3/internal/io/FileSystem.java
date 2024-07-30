package okhttp3.internal.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import okio.a0;
import okio.n;
import okio.q;
import okio.y;
import okio.z;

/* loaded from: classes2.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: okhttp3.internal.io.FileSystem.1
        @Override // okhttp3.internal.io.FileSystem
        public y appendingSink(File file) throws FileNotFoundException {
            try {
                return q.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return q.a(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // okhttp3.internal.io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.io.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // okhttp3.internal.io.FileSystem
        public y sink(File file) throws FileNotFoundException {
            try {
                return q.c(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return q.c(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.io.FileSystem
        public z source(File file) throws FileNotFoundException {
            Logger logger = q.f33861a;
            if (file != null) {
                return new n(new FileInputStream(file), new a0());
            }
            throw new IllegalArgumentException("file == null");
        }
    };

    y appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    y sink(File file) throws FileNotFoundException;

    long size(File file);

    z source(File file) throws FileNotFoundException;
}
