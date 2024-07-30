package okhttp3.internal.cache;

import a3.k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.c;
import okio.o;
import okio.q;
import okio.t;
import okio.u;
import okio.y;
import okio.z;

/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    boolean closed;
    final File directory;
    private final Executor executor;
    final FileSystem fileSystem;
    boolean hasJournalErrors;
    boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    c journalWriter;
    private long maxSize;
    boolean mostRecentRebuildFailed;
    boolean mostRecentTrimFailed;
    int redundantOpCount;
    final int valueCount;
    private long size = 0;
    final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long nextSequenceNumber = 0;
    private final Runnable cleanupRunnable = new Runnable() { // from class: okhttp3.internal.cache.DiskLruCache.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (DiskLruCache.this) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (!diskLruCache.initialized) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 | diskLruCache.closed) {
                    return;
                }
                try {
                    diskLruCache.trimToSize();
                } catch (IOException unused) {
                    DiskLruCache.this.mostRecentTrimFailed = true;
                }
                try {
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                } catch (IOException unused2) {
                    DiskLruCache diskLruCache2 = DiskLruCache.this;
                    diskLruCache2.mostRecentRebuildFailed = true;
                    Logger logger = q.f33861a;
                    diskLruCache2.journalWriter = new t(new o());
                }
            }
        }
    };

    /* loaded from: classes2.dex */
    public final class Editor {
        private boolean done;
        final Entry entry;
        final boolean[] written;

        public Editor(Entry entry) {
            boolean[] zArr;
            this.entry = entry;
            if (entry.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }

        public void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, false);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void abortUnlessCommitted() {
            synchronized (DiskLruCache.this) {
                if (!this.done && this.entry.currentEditor == this) {
                    try {
                        DiskLruCache.this.completeEdit(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, true);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void detach() {
            if (this.entry.currentEditor == this) {
                int i10 = 0;
                while (true) {
                    DiskLruCache diskLruCache = DiskLruCache.this;
                    if (i10 < diskLruCache.valueCount) {
                        try {
                            diskLruCache.fileSystem.delete(this.entry.dirtyFiles[i10]);
                        } catch (IOException unused) {
                        }
                        i10++;
                    } else {
                        this.entry.currentEditor = null;
                        return;
                    }
                }
            }
        }

        public y newSink(int i10) {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    Entry entry = this.entry;
                    if (entry.currentEditor != this) {
                        Logger logger = q.f33861a;
                        return new o();
                    }
                    if (!entry.readable) {
                        this.written[i10] = true;
                    }
                    try {
                        return new FaultHidingSink(DiskLruCache.this.fileSystem.sink(entry.dirtyFiles[i10])) { // from class: okhttp3.internal.cache.DiskLruCache.Editor.1
                            @Override // okhttp3.internal.cache.FaultHidingSink
                            public void onException(IOException iOException) {
                                synchronized (DiskLruCache.this) {
                                    Editor.this.detach();
                                }
                            }
                        };
                    } catch (FileNotFoundException unused) {
                        Logger logger2 = q.f33861a;
                        return new o();
                    }
                }
                throw new IllegalStateException();
            }
        }

        public z newSource(int i10) {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    Entry entry = this.entry;
                    if (!entry.readable || entry.currentEditor != this) {
                        return null;
                    }
                    try {
                        return DiskLruCache.this.fileSystem.source(entry.cleanFiles[i10]);
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class Entry {
        final File[] cleanFiles;
        Editor currentEditor;
        final File[] dirtyFiles;
        final String key;
        final long[] lengths;
        boolean readable;
        long sequenceNumber;

        public Entry(String str) {
            this.key = str;
            int i10 = DiskLruCache.this.valueCount;
            this.lengths = new long[i10];
            this.cleanFiles = new File[i10];
            this.dirtyFiles = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < DiskLruCache.this.valueCount; i11++) {
                sb2.append(i11);
                this.cleanFiles[i11] = new File(DiskLruCache.this.directory, sb2.toString());
                sb2.append(".tmp");
                this.dirtyFiles[i11] = new File(DiskLruCache.this.directory, sb2.toString());
                sb2.setLength(length);
            }
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.lengths[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        public Snapshot snapshot() {
            z zVar;
            if (Thread.holdsLock(DiskLruCache.this)) {
                z[] zVarArr = new z[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    try {
                        DiskLruCache diskLruCache = DiskLruCache.this;
                        if (i11 < diskLruCache.valueCount) {
                            zVarArr[i11] = diskLruCache.fileSystem.source(this.cleanFiles[i11]);
                            i11++;
                        } else {
                            return new Snapshot(this.key, this.sequenceNumber, zVarArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            DiskLruCache diskLruCache2 = DiskLruCache.this;
                            if (i10 < diskLruCache2.valueCount && (zVar = zVarArr[i10]) != null) {
                                Util.closeQuietly(zVar);
                                i10++;
                            } else {
                                try {
                                    diskLruCache2.removeEntry(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        public void writeLengths(c cVar) throws IOException {
            for (long j10 : this.lengths) {
                cVar.writeByte(32).U(j10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final z[] sources;

        public Snapshot(String str, long j10, z[] zVarArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j10;
            this.sources = zVarArr;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (z zVar : this.sources) {
                Util.closeQuietly(zVar);
            }
        }

        @Nullable
        public Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public long getLength(int i10) {
            return this.lengths[i10];
        }

        public z getSource(int i10) {
            return this.sources[i10];
        }

        public String key() {
            return this.key;
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                return;
            }
        }
        autoCloseable.close();
    }

    public DiskLruCache(FileSystem fileSystem, File file, int i10, int i11, long j10, Executor executor) {
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i10;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = i11;
        this.maxSize = j10;
        this.executor = executor;
    }

    private synchronized void checkNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i10, int i11, long j10) {
        if (j10 > 0) {
            if (i11 > 0) {
                return new DiskLruCache(fileSystem, file, i10, i11, j10, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private c newJournalWriter() throws FileNotFoundException {
        FaultHidingSink faultHidingSink = new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) { // from class: okhttp3.internal.cache.DiskLruCache.2
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // okhttp3.internal.cache.FaultHidingSink
            public void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        };
        Logger logger = q.f33861a;
        return new t(faultHidingSink);
    }

    private void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i10 = 0;
            if (next.currentEditor == null) {
                while (i10 < this.valueCount) {
                    this.size += next.lengths[i10];
                    i10++;
                }
            } else {
                next.currentEditor = null;
                while (i10 < this.valueCount) {
                    this.fileSystem.delete(next.cleanFiles[i10]);
                    this.fileSystem.delete(next.dirtyFiles[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void readJournal() throws IOException {
        z source = this.fileSystem.source(this.journalFile);
        Logger logger = q.f33861a;
        u uVar = new u(source);
        try {
            String M = uVar.M();
            String M2 = uVar.M();
            String M3 = uVar.M();
            String M4 = uVar.M();
            String M5 = uVar.M();
            if (MAGIC.equals(M) && "1".equals(M2) && Integer.toString(this.appVersion).equals(M3) && Integer.toString(this.valueCount).equals(M4) && "".equals(M5)) {
                int i10 = 0;
                while (true) {
                    try {
                        readJournalLine(uVar.M());
                        i10++;
                    } catch (EOFException unused) {
                        this.redundantOpCount = i10 - this.lruEntries.size();
                        if (!uVar.u()) {
                            rebuildJournal();
                        } else {
                            this.journalWriter = newJournalWriter();
                        }
                        $closeResource(null, uVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + M + ", " + M2 + ", " + M4 + ", " + M5 + "]");
            }
        } finally {
        }
    }

    private void readJournalLine(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith(REMOVE)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(substring);
                this.lruEntries.put(substring, entry);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(CLEAN)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith(DIRTY)) {
                entry.currentEditor = new Editor(entry);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith(READ)) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    private void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException(k.l("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.initialized && !this.closed) {
            for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
                Editor editor = entry.currentEditor;
                if (editor != null) {
                    editor.abort();
                }
            }
            trimToSize();
            this.journalWriter.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    public synchronized void completeEdit(Editor editor, boolean z10) throws IOException {
        Entry entry = editor.entry;
        if (entry.currentEditor == editor) {
            if (z10 && !entry.readable) {
                for (int i10 = 0; i10 < this.valueCount; i10++) {
                    if (editor.written[i10]) {
                        if (!this.fileSystem.exists(entry.dirtyFiles[i10])) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.valueCount; i11++) {
                File file = entry.dirtyFiles[i11];
                if (z10) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry.cleanFiles[i11];
                        this.fileSystem.rename(file, file2);
                        long j10 = entry.lengths[i11];
                        long size = this.fileSystem.size(file2);
                        entry.lengths[i11] = size;
                        this.size = (this.size - j10) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable | z10) {
                entry.readable = true;
                this.journalWriter.G(CLEAN).writeByte(32);
                this.journalWriter.G(entry.key);
                entry.writeLengths(this.journalWriter);
                this.journalWriter.writeByte(10);
                if (z10) {
                    long j11 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j11;
                    entry.sequenceNumber = j11;
                }
            } else {
                this.lruEntries.remove(entry.key);
                this.journalWriter.G(REMOVE).writeByte(32);
                this.journalWriter.G(entry.key);
                this.journalWriter.writeByte(10);
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executor.execute(this.cleanupRunnable);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    @Nullable
    public Editor edit(String str) throws IOException {
        return edit(str, -1L);
    }

    public synchronized void evictAll() throws IOException {
        initialize();
        for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
            removeEntry(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    public synchronized Snapshot get(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry != null && entry.readable) {
            Snapshot snapshot = entry.snapshot();
            if (snapshot == null) {
                return null;
            }
            this.redundantOpCount++;
            this.journalWriter.G(READ).writeByte(32).G(str).writeByte(10);
            if (journalRebuildRequired()) {
                this.executor.execute(this.cleanupRunnable);
            }
            return snapshot;
        }
        return null;
    }

    public File getDirectory() {
        return this.directory;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized void initialize() throws IOException {
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e10) {
                Platform.get().log(5, "DiskLruCache " + this.directory + " is corrupt: " + e10.getMessage() + ", removing", e10);
                try {
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal();
        this.initialized = true;
    }

    public synchronized boolean isClosed() {
        return this.closed;
    }

    public boolean journalRebuildRequired() {
        int i10 = this.redundantOpCount;
        if (i10 >= 2000 && i10 >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    public synchronized void rebuildJournal() throws IOException {
        c cVar = this.journalWriter;
        if (cVar != null) {
            cVar.close();
        }
        y sink = this.fileSystem.sink(this.journalFileTmp);
        Logger logger = q.f33861a;
        t tVar = new t(sink);
        try {
            tVar.G(MAGIC);
            tVar.writeByte(10);
            tVar.G("1");
            tVar.writeByte(10);
            tVar.U(this.appVersion);
            tVar.writeByte(10);
            tVar.U(this.valueCount);
            tVar.writeByte(10);
            tVar.writeByte(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    tVar.G(DIRTY);
                    tVar.writeByte(32);
                    tVar.G(entry.key);
                    tVar.writeByte(10);
                } else {
                    tVar.G(CLEAN);
                    tVar.writeByte(32);
                    tVar.G(entry.key);
                    entry.writeLengths(tVar);
                    tVar.writeByte(10);
                }
            }
            $closeResource(null, tVar);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public synchronized boolean remove(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry = removeEntry(entry);
        if (removeEntry && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry;
    }

    public boolean removeEntry(Entry entry) throws IOException {
        Editor editor = entry.currentEditor;
        if (editor != null) {
            editor.detach();
        }
        for (int i10 = 0; i10 < this.valueCount; i10++) {
            this.fileSystem.delete(entry.cleanFiles[i10]);
            long j10 = this.size;
            long[] jArr = entry.lengths;
            this.size = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.G(REMOVE).writeByte(32).G(entry.key).writeByte(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    public synchronized void setMaxSize(long j10) {
        this.maxSize = j10;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
    }

    public synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new Iterator<Snapshot>() { // from class: okhttp3.internal.cache.DiskLruCache.3
            final Iterator<Entry> delegate;
            Snapshot nextSnapshot;
            Snapshot removeSnapshot;

            {
                this.delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Snapshot snapshot;
                if (this.nextSnapshot != null) {
                    return true;
                }
                synchronized (DiskLruCache.this) {
                    if (DiskLruCache.this.closed) {
                        return false;
                    }
                    while (this.delegate.hasNext()) {
                        Entry next = this.delegate.next();
                        if (next.readable && (snapshot = next.snapshot()) != null) {
                            this.nextSnapshot = snapshot;
                            return true;
                        }
                    }
                    return false;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                Snapshot snapshot = this.removeSnapshot;
                if (snapshot != null) {
                    try {
                        DiskLruCache.this.remove(snapshot.key);
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.removeSnapshot = null;
                        throw th;
                    }
                    this.removeSnapshot = null;
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            @Override // java.util.Iterator
            public Snapshot next() {
                if (hasNext()) {
                    Snapshot snapshot = this.nextSnapshot;
                    this.removeSnapshot = snapshot;
                    this.nextSnapshot = null;
                    return snapshot;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            removeEntry(this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }

    public synchronized Editor edit(String str, long j10) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j10 != -1 && (entry == null || entry.sequenceNumber != j10)) {
            return null;
        }
        if (entry != null && entry.currentEditor != null) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            this.journalWriter.G(DIRTY).writeByte(32).G(str).writeByte(10);
            this.journalWriter.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(entry);
            entry.currentEditor = editor;
            return editor;
        }
        this.executor.execute(this.cleanupRunnable);
        return null;
    }
}
