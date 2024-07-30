package com.vungle.warren.downloader;

import a3.l;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.warren.AdLoader;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.NetworkProvider;
import com.vungle.warren.utility.VungleThreadPoolExecutor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import m0.c;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.k;
import okio.q;
import okio.u;

@SuppressLint({"LogNotTimber"})
/* loaded from: classes2.dex */
public class AssetDownloader implements Downloader {
    private static final String ACCEPT_ENCODING = "Accept-Encoding";
    private static final String ACCEPT_RANGES = "Accept-Ranges";
    private static final String BYTES = "bytes";
    private static final int CONNECTION_RETRY_TIMEOUT = 300;
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_RANGE = "Content-Range";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    static final String DOWNLOAD_COMPLETE = "DOWNLOAD_COMPLETE";
    static final String DOWNLOAD_URL = "Download_URL";
    static final String ETAG = "ETag";
    private static final String GZIP = "gzip";
    private static final String IDENTITY = "identity";
    private static final String IF_MODIFIED_SINCE = "If-Modified-Since";
    private static final String IF_NONE_MATCH = "If-None-Match";
    private static final String IF_RANGE = "If-Range";
    private static final String KEY_TEMPLATE = "template";
    static final String LAST_CACHE_VERIFICATION = "Last-Cache-Verification";
    static final String LAST_DOWNLOAD = "Last-Download";
    static final String LAST_MODIFIED = "Last-Modified";
    private static final String LOAD_CONTEXT = "AssetDownloader#load; loadAd sequence";
    private static final long MAX_PERCENT = 100;
    private static final int MAX_RECONNECT_ATTEMPTS = 10;
    private static final String META_POSTFIX_EXT = ".vng_meta";
    private static final int PROGRESS_STEP = 5;
    private static final String RANGE = "Range";
    private static final int RANGE_NOT_SATISFIABLE = 416;
    private static final int RETRY_COUNT_ON_CONNECTION_LOST = 5;
    private static final int TIMEOUT = 30;
    private final Object addLock;
    private final DownloaderCache cache;
    private final VungleThreadPoolExecutor downloadExecutor;
    private boolean isCacheEnabled;
    int maxReconnectAttempts;
    private Map<String, DownloadRequestMediator> mediators;
    private final NetworkProvider.NetworkListener networkListener;
    private final NetworkProvider networkProvider;
    private final OkHttpClient okHttpClient;
    private volatile int progressStep;
    int reconnectTimeout;
    int retryCountOnConnectionLost;
    private final long timeWindow;
    private List<DownloadRequest> transitioning;
    private final ExecutorService uiExecutor;
    public static final long VERIFICATION_WINDOW = TimeUnit.HOURS.toMillis(24);
    private static final String TAG = "AssetDownloader";

    /* loaded from: classes2.dex */
    public @interface NetworkType {
        public static final int ANY = 3;
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;
    }

    public AssetDownloader(NetworkProvider networkProvider, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService) {
        this(null, 0L, networkProvider, vungleThreadPoolExecutor, executorService);
    }

    public static /* synthetic */ String access$000() {
        return TAG;
    }

    public static /* synthetic */ long access$1000(AssetDownloader assetDownloader, Response response) {
        return assetDownloader.getContentLength(response);
    }

    public static /* synthetic */ boolean access$1100(AssetDownloader assetDownloader, File file, Response response, DownloadRequestMediator downloadRequestMediator, HashMap hashMap) {
        return assetDownloader.notModified(file, response, downloadRequestMediator, hashMap);
    }

    public static /* synthetic */ boolean access$1200(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, File file, Map map, int i10) {
        return assetDownloader.useCacheOnFail(downloadRequestMediator, file, map, i10);
    }

    public static /* synthetic */ void access$1300(AssetDownloader assetDownloader, File file, HashMap hashMap) {
        assetDownloader.saveMeta(file, hashMap);
    }

    public static /* synthetic */ boolean access$1400(AssetDownloader assetDownloader, long j10, int i10, Response response, DownloadRequestMediator downloadRequestMediator) {
        return assetDownloader.partialMalformed(j10, i10, response, downloadRequestMediator);
    }

    public static /* synthetic */ void access$1500(AssetDownloader assetDownloader, File file, File file2, boolean z10) {
        assetDownloader.deleteFileAndMeta(file, file2, z10);
    }

    public static /* synthetic */ void access$1600(AssetDownloader assetDownloader, File file, File file2, Headers headers) throws IOException {
        assetDownloader.checkEncoding(file, file2, headers);
    }

    public static /* synthetic */ HashMap access$1700(AssetDownloader assetDownloader, File file, Headers headers, String str) {
        return assetDownloader.makeMeta(file, headers, str);
    }

    public static /* synthetic */ ResponseBody access$1800(AssetDownloader assetDownloader, Response response) {
        return assetDownloader.decodeGzipIfNeeded(response);
    }

    public static /* synthetic */ void access$1900(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress) {
        assetDownloader.onProgressMediator(downloadRequestMediator, progress);
    }

    public static /* synthetic */ int access$2000(AssetDownloader assetDownloader) {
        return assetDownloader.progressStep;
    }

    public static /* synthetic */ int access$2100(AssetDownloader assetDownloader, Throwable th, boolean z10) {
        return assetDownloader.mapExceptionToReason(th, z10);
    }

    public static /* synthetic */ void access$2200(AssetDownloader assetDownloader, long j10) {
        assetDownloader.sleep(j10);
    }

    public static /* synthetic */ boolean access$2300(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress, AssetDownloadListener.DownloadError downloadError) {
        return assetDownloader.pause(downloadRequestMediator, progress, downloadError);
    }

    public static /* synthetic */ void access$2400(AssetDownloader assetDownloader, File file, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.onSuccessMediator(file, downloadRequestMediator);
    }

    public static /* synthetic */ void access$2500(AssetDownloader assetDownloader, AssetDownloadListener.DownloadError downloadError, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.onErrorMediator(downloadError, downloadRequestMediator);
    }

    public static /* synthetic */ void access$2600(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.onCancelledMediator(downloadRequestMediator);
    }

    public static /* synthetic */ void access$2700(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        assetDownloader.removeMediator(downloadRequestMediator);
    }

    public static /* synthetic */ void access$2800(AssetDownloader assetDownloader) {
        assetDownloader.removeNetworkListener();
    }

    public static /* synthetic */ DownloaderCache access$300(AssetDownloader assetDownloader) {
        return assetDownloader.cache;
    }

    public static /* synthetic */ String access$400(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        return assetDownloader.debugString(downloadRequestMediator);
    }

    public static /* synthetic */ boolean access$500(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator) {
        return assetDownloader.isAnyConnected(downloadRequestMediator);
    }

    public static /* synthetic */ HashMap access$600(AssetDownloader assetDownloader, File file) {
        return assetDownloader.extractMeta(file);
    }

    public static /* synthetic */ boolean access$700(AssetDownloader assetDownloader, DownloadRequestMediator downloadRequestMediator, File file, Map map) {
        return assetDownloader.useCacheWithoutVerification(downloadRequestMediator, file, map);
    }

    public static /* synthetic */ void access$800(AssetDownloader assetDownloader, long j10, File file, HashMap hashMap, Request.Builder builder) {
        assetDownloader.appendHeaders(j10, file, hashMap, builder);
    }

    public static /* synthetic */ OkHttpClient access$900(AssetDownloader assetDownloader) {
        return assetDownloader.okHttpClient;
    }

    private void addNetworkListener() {
        Log.d(TAG, "Adding network listner");
        this.networkProvider.addListener(this.networkListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendHeaders(long j10, File file, HashMap<String, String> hashMap, Request.Builder builder) {
        builder.addHeader(ACCEPT_ENCODING, IDENTITY);
        if (file.exists() && !hashMap.isEmpty()) {
            String str = hashMap.get(ETAG);
            String str2 = hashMap.get(LAST_MODIFIED);
            if (Boolean.parseBoolean(hashMap.get(DOWNLOAD_COMPLETE))) {
                if (!TextUtils.isEmpty(str)) {
                    builder.addHeader(IF_NONE_MATCH, str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    builder.addHeader(IF_MODIFIED_SINCE, str2);
                    return;
                }
                return;
            }
            if (!BYTES.equalsIgnoreCase(hashMap.get(ACCEPT_RANGES))) {
                return;
            }
            if (hashMap.get("Content-Encoding") != null && !IDENTITY.equalsIgnoreCase(hashMap.get("Content-Encoding"))) {
                return;
            }
            builder.addHeader(RANGE, l.k("bytes=", j10, "-"));
            if (!TextUtils.isEmpty(str)) {
                builder.addHeader(IF_RANGE, str);
            } else if (!TextUtils.isEmpty(str2)) {
                builder.addHeader(IF_RANGE, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkEncoding(File file, File file2, Headers headers) throws IOException {
        String str = headers.get("Content-Encoding");
        if (str != null && !"gzip".equalsIgnoreCase(str) && !IDENTITY.equalsIgnoreCase(str)) {
            deleteFileAndMeta(file, file2, false);
            VungleLogger.error("AssetDownloader#checkEncoding; loadAd sequence", String.format("unknown %1$s %2$s ", "Content-Encoding", str));
            throw new IOException("Unknown Content-Encoding");
        }
    }

    private void copyToDestination(File file, File file2, c<DownloadRequest, AssetDownloadListener> cVar) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (file2.exists()) {
            FileUtility.deleteAndLogIfFailed(file2);
        }
        if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (IOException e10) {
                e = e10;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            FileChannel channel = fileInputStream.getChannel();
            channel.transferTo(0L, channel.size(), fileOutputStream.getChannel());
            Log.d(TAG, "Copying: finished " + cVar.f32635a.url + " copying to " + file2.getPath());
            FileUtility.closeQuietly(fileInputStream);
        } catch (IOException e12) {
            e = e12;
            fileInputStream2 = fileInputStream;
            try {
                Object[] objArr = new Object[4];
                objArr[0] = file.getPath();
                DownloadRequest downloadRequest = cVar.f32635a;
                DownloadRequest downloadRequest2 = cVar.f32635a;
                objArr[1] = downloadRequest.url;
                objArr[2] = file2.getPath();
                objArr[3] = e;
                VungleLogger.error("AssetDownloader#copyToDestination; loadAd sequence", String.format("cannot copy from %1$s(%2$s) to %3$s due to %4$s", objArr));
                deliverError(downloadRequest2, cVar.f32636b, new AssetDownloadListener.DownloadError(-1, e, 2));
                Log.d(TAG, "Copying: error" + downloadRequest2.url + " copying to " + file2.getPath());
                FileUtility.closeQuietly(fileInputStream2);
                FileUtility.closeQuietly(fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
                FileUtility.closeQuietly(fileInputStream2);
                FileUtility.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            FileUtility.closeQuietly(fileInputStream2);
            FileUtility.closeQuietly(fileOutputStream);
            throw th;
        }
        FileUtility.closeQuietly(fileOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String debugString(DownloadRequestMediator downloadRequestMediator) {
        return ", mediator url - " + downloadRequestMediator.url + ", path - " + downloadRequestMediator.filePath + ", th - " + Thread.currentThread().getName() + "id " + downloadRequestMediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseBody decodeGzipIfNeeded(Response response) {
        if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && HttpHeaders.hasBody(response) && response.body() != null) {
            k kVar = new k(response.body().source());
            String header = response.header("Content-Type");
            Logger logger = q.f33861a;
            return new RealResponseBody(header, -1L, new u(kVar));
        }
        return response.body();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteFileAndMeta(File file, File file2, boolean z10) {
        if (file == null) {
            return;
        }
        FileUtility.deleteAndLogIfFailed(file);
        if (file2 != null) {
            FileUtility.deleteAndLogIfFailed(file2);
        }
        if (this.cache != null && isCacheEnabled()) {
            if (z10) {
                this.cache.deleteAndRemove(file);
            } else {
                this.cache.deleteContents(file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverError(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener, final AssetDownloadListener.DownloadError downloadError) {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = downloadError;
        if (downloadRequest != null) {
            str = debugString(downloadRequest);
        } else {
            str = "null";
        }
        objArr[1] = str;
        VungleLogger.error("AssetDownloader#deliverError; loadAd sequence", String.format("Delivering error %1$s; request %2$s", objArr));
        if (assetDownloadListener != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.6
                @Override // java.lang.Runnable
                public void run() {
                    assetDownloadListener.onError(downloadError, downloadRequest);
                }
            });
        }
    }

    private void deliverProgress(final AssetDownloadListener.Progress progress, final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.7
                @Override // java.lang.Runnable
                public void run() {
                    Log.d(AssetDownloader.TAG, "On progress " + downloadRequest);
                    assetDownloadListener.onProgress(progress, downloadRequest);
                }
            });
        }
    }

    private void deliverSuccess(c<DownloadRequest, AssetDownloadListener> cVar, File file) {
        AssetDownloadListener assetDownloadListener = cVar.f32636b;
        if (assetDownloadListener != null) {
            assetDownloadListener.onSuccess(file, cVar.f32635a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> extractMeta(File file) {
        return FileUtility.readMap(file.getPath());
    }

    private synchronized DownloadRequestMediator findMediatorForCancellation(DownloadRequest downloadRequest) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.mediators.get(getCacheableKey(downloadRequest)));
        arrayList.add(this.mediators.get(getNonCacheableKey(downloadRequest)));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DownloadRequestMediator downloadRequestMediator = (DownloadRequestMediator) it.next();
            if (downloadRequestMediator != null) {
                Iterator<DownloadRequest> it2 = downloadRequestMediator.requests().iterator();
                while (it2.hasNext()) {
                    if (it2.next().equals(downloadRequest)) {
                        return downloadRequestMediator;
                    }
                }
            }
        }
        return null;
    }

    private String getCacheableKey(DownloadRequest downloadRequest) {
        return downloadRequest.url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getContentLength(Response response) {
        if (response == null) {
            return -1L;
        }
        String str = response.headers().get("Content-Length");
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private String getNonCacheableKey(DownloadRequest downloadRequest) {
        return downloadRequest.url + " " + downloadRequest.path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAnyConnected(DownloadRequestMediator downloadRequestMediator) {
        for (DownloadRequest downloadRequest : downloadRequestMediator.requests()) {
            if (downloadRequest == null) {
                Log.d(TAG, "Request is null");
            } else if (isConnected(downloadRequest)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002b  */
    @android.annotation.TargetApi(21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isConnected(com.vungle.warren.downloader.DownloadRequest r6) {
        /*
            r5 = this;
            com.vungle.warren.utility.NetworkProvider r0 = r5.networkProvider
            int r0 = r0.getCurrentNetworkType()
            r1 = 1
            if (r0 < 0) goto Lf
            int r2 = r6.networkType
            r3 = 3
            if (r2 != r3) goto Lf
            return r1
        Lf:
            if (r0 == 0) goto L28
            if (r0 == r1) goto L26
            r2 = 4
            if (r0 == r2) goto L28
            r2 = 9
            if (r0 == r2) goto L26
            r2 = 17
            if (r0 == r2) goto L28
            r2 = 6
            if (r0 == r2) goto L26
            r2 = 7
            if (r0 == r2) goto L28
            r2 = -1
            goto L29
        L26:
            r2 = 2
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 <= 0) goto L31
            int r3 = r6.networkType
            r3 = r3 & r2
            if (r3 != r2) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            java.lang.String r2 = com.vungle.warren.downloader.AssetDownloader.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "checking pause for type: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " connected "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r6 = r5.debugString(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.util.Log.d(r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.isConnected(com.vungle.warren.downloader.DownloadRequest):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchRequest(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        synchronized (this.addLock) {
            synchronized (this) {
                if (downloadRequest.isCancelled()) {
                    this.transitioning.remove(downloadRequest);
                    Log.d(TAG, "Request " + downloadRequest.url + " is cancelled before starting");
                    new AssetDownloadListener.Progress().status = 3;
                    deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IOException("Cancelled"), 1));
                    return;
                }
                DownloadRequestMediator downloadRequestMediator = this.mediators.get(mediatorKeyFromRequest(downloadRequest));
                if (downloadRequestMediator == null) {
                    this.transitioning.remove(downloadRequest);
                    DownloadRequestMediator makeNewMediator = makeNewMediator(downloadRequest, assetDownloadListener);
                    this.mediators.put(makeNewMediator.key, makeNewMediator);
                    load(makeNewMediator);
                    return;
                }
                try {
                    downloadRequestMediator.lock();
                    synchronized (this) {
                        this.transitioning.remove(downloadRequest);
                        if (!downloadRequestMediator.is(6) && (!downloadRequestMediator.is(3) || downloadRequest.isCancelled())) {
                            if (downloadRequestMediator.isCacheable) {
                                downloadRequestMediator.add(downloadRequest, assetDownloadListener);
                                if (downloadRequestMediator.is(2)) {
                                    load(downloadRequestMediator);
                                }
                            } else {
                                VungleLogger.warn("AssetDownloader#launchRequest; loadAd sequence", "request " + downloadRequest + " is already running");
                                deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is already running"), 1));
                            }
                        }
                        DownloadRequestMediator makeNewMediator2 = makeNewMediator(downloadRequest, assetDownloadListener);
                        this.mediators.put(downloadRequestMediator.key, makeNewMediator2);
                        load(makeNewMediator2);
                    }
                } finally {
                    downloadRequestMediator.unlock();
                }
            }
        }
    }

    private synchronized void load(final DownloadRequestMediator downloadRequestMediator) {
        addNetworkListener();
        downloadRequestMediator.set(1);
        this.downloadExecutor.execute(new DownloadPriorityRunnable(downloadRequestMediator) { // from class: com.vungle.warren.downloader.AssetDownloader.3
            /*  JADX ERROR: Types fix failed
                jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r21v16 ??), method size: 3502
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 3502
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.AnonymousClass3.run():void");
            }
        }, new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.4
            @Override // java.lang.Runnable
            public void run() {
                AssetDownloader.this.onErrorMediator(new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1), downloadRequestMediator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> makeMeta(File file, Headers headers, String str) {
        HashMap<String, String> t10 = l.t(DOWNLOAD_URL, str);
        t10.put(ETAG, headers.get(ETAG));
        t10.put(LAST_MODIFIED, headers.get(LAST_MODIFIED));
        t10.put(ACCEPT_RANGES, headers.get(ACCEPT_RANGES));
        t10.put("Content-Encoding", headers.get("Content-Encoding"));
        saveMeta(file, t10);
        return t10;
    }

    private DownloadRequestMediator makeNewMediator(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        File file;
        File metaFile;
        String str;
        boolean z10;
        if (!isCacheEnabled()) {
            file = new File(downloadRequest.path);
            metaFile = new File(file.getPath() + META_POSTFIX_EXT);
            str = downloadRequest.url + " " + downloadRequest.path;
            z10 = false;
        } else {
            file = this.cache.getFile(downloadRequest.url);
            metaFile = this.cache.getMetaFile(file);
            str = downloadRequest.url;
            z10 = true;
        }
        String str2 = str;
        boolean z11 = z10;
        Log.d(TAG, "Destination file " + file.getPath());
        return new DownloadRequestMediator(downloadRequest, assetDownloadListener, file.getPath(), metaFile.getPath(), z11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int mapExceptionToReason(Throwable th, boolean z10) {
        if (th instanceof RuntimeException) {
            return 4;
        }
        if (z10 && !(th instanceof SocketException) && !(th instanceof SocketTimeoutException)) {
            if (!(th instanceof UnknownHostException) && !(th instanceof SSLException)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    private String mediatorKeyFromRequest(DownloadRequest downloadRequest) {
        if (isCacheEnabled()) {
            return getCacheableKey(downloadRequest);
        }
        return getNonCacheableKey(downloadRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notModified(File file, Response response, DownloadRequestMediator downloadRequestMediator, HashMap<String, String> hashMap) {
        if (response != null && file.exists() && file.length() > 0 && downloadRequestMediator.isCacheable) {
            int code = response.code();
            if (Boolean.parseBoolean(hashMap.get(DOWNLOAD_COMPLETE)) && code == 304) {
                Log.d(TAG, "304 code, data size matches file size " + debugString(downloadRequestMediator));
                return true;
            }
        }
        return false;
    }

    private void onCancelled(DownloadRequest downloadRequest) {
        DownloadRequest downloadRequest2;
        if (downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
        DownloadRequestMediator findMediatorForCancellation = findMediatorForCancellation(downloadRequest);
        if (findMediatorForCancellation != null && findMediatorForCancellation.getStatus() != 3) {
            c<DownloadRequest, AssetDownloadListener> remove = findMediatorForCancellation.remove(downloadRequest);
            AssetDownloadListener assetDownloadListener = null;
            if (remove == null) {
                downloadRequest2 = null;
            } else {
                downloadRequest2 = remove.f32635a;
            }
            if (remove != null) {
                assetDownloadListener = remove.f32636b;
            }
            if (findMediatorForCancellation.values().isEmpty()) {
                findMediatorForCancellation.set(3);
            }
            if (downloadRequest2 == null) {
                return;
            }
            AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
            progress.status = 3;
            deliverProgress(progress, downloadRequest2, assetDownloadListener);
        }
        removeNetworkListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onCancelledMediator(DownloadRequestMediator downloadRequestMediator) {
        Iterator<DownloadRequest> it = downloadRequestMediator.requests().iterator();
        while (it.hasNext()) {
            onCancelled(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onErrorMediator(AssetDownloadListener.DownloadError downloadError, DownloadRequestMediator downloadRequestMediator) {
        VungleLogger.error("AssetDownloader#onErrorMediator; loadAd sequence", String.format("Error %1$s occured; mediator %2$s", downloadError, debugString(downloadRequestMediator)));
        if (downloadError == null) {
            downloadError = new AssetDownloadListener.DownloadError(-1, new RuntimeException(), 4);
        }
        try {
            downloadRequestMediator.lock();
            for (c<DownloadRequest, AssetDownloadListener> cVar : downloadRequestMediator.values()) {
                deliverError(cVar.f32635a, cVar.f32636b, downloadError);
            }
            removeMediator(downloadRequestMediator);
            downloadRequestMediator.set(6);
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkChanged(int i10) {
        Log.d(TAG, "Num of connections: " + this.mediators.values().size());
        for (DownloadRequestMediator downloadRequestMediator : this.mediators.values()) {
            if (downloadRequestMediator.is(3)) {
                Log.d(TAG, "Result cancelled");
            } else {
                boolean isAnyConnected = isAnyConnected(downloadRequestMediator);
                String str = TAG;
                Log.d(str, "Connected = " + isAnyConnected + " for " + i10);
                downloadRequestMediator.setConnected(isAnyConnected);
                if (downloadRequestMediator.isPausable() && isAnyConnected && downloadRequestMediator.is(2)) {
                    load(downloadRequestMediator);
                    Log.d(str, "resumed " + downloadRequestMediator.key + " " + downloadRequestMediator);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgressMediator(DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress) {
        if (downloadRequestMediator == null) {
            return;
        }
        AssetDownloadListener.Progress copy = AssetDownloadListener.Progress.copy(progress);
        Log.d(TAG, "Progress " + progress.progressPercent + " status " + progress.status + " " + downloadRequestMediator + " " + downloadRequestMediator.filePath);
        for (c<DownloadRequest, AssetDownloadListener> cVar : downloadRequestMediator.values()) {
            deliverProgress(copy, cVar.f32635a, cVar.f32636b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessMediator(File file, DownloadRequestMediator downloadRequestMediator) {
        Log.d(TAG, "OnComplete - Removing connections and listener " + downloadRequestMediator);
        try {
            downloadRequestMediator.lock();
            List<c<DownloadRequest, AssetDownloadListener>> values = downloadRequestMediator.values();
            if (!file.exists()) {
                VungleLogger.error("AssetDownloader#onSuccessMediator; loadAd sequence", String.format("File %1$s does not exist; mediator %2$s ", file.getPath(), debugString(downloadRequestMediator)));
                onErrorMediator(new AssetDownloadListener.DownloadError(-1, new IOException("File is deleted"), 2), downloadRequestMediator);
                return;
            }
            DownloaderCache downloaderCache = this.cache;
            if (downloaderCache != null && downloadRequestMediator.isCacheable) {
                downloaderCache.onCacheHit(file, values.size());
                this.cache.setCacheLastUpdateTimestamp(file, System.currentTimeMillis());
            }
            for (c<DownloadRequest, AssetDownloadListener> cVar : values) {
                File file2 = new File(cVar.f32635a.path);
                if (!file2.equals(file)) {
                    copyToDestination(file, file2, cVar);
                } else {
                    file2 = file;
                }
                Log.d(TAG, "Deliver success:" + cVar.f32635a.url + " dest file: " + file2.getPath());
                deliverSuccess(cVar, file2);
            }
            removeMediator(downloadRequestMediator);
            downloadRequestMediator.set(6);
            Log.d(TAG, "Finished " + debugString(downloadRequestMediator));
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean partialMalformed(long j10, int i10, Response response, DownloadRequestMediator downloadRequestMediator) {
        if ((i10 == 206 && !satisfiesPartialDownload(response, j10, downloadRequestMediator)) || i10 == RANGE_NOT_SATISFIABLE) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pause(DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress, AssetDownloadListener.DownloadError downloadError) {
        boolean z10 = false;
        if (downloadRequestMediator.is(3) || isAnyConnected(downloadRequestMediator)) {
            return false;
        }
        progress.status = 2;
        AssetDownloadListener.Progress copy = AssetDownloadListener.Progress.copy(progress);
        boolean z11 = false;
        for (c<DownloadRequest, AssetDownloadListener> cVar : downloadRequestMediator.values()) {
            DownloadRequest downloadRequest = cVar.f32635a;
            if (downloadRequest != null) {
                boolean z12 = downloadRequest.pauseOnConnectionLost;
                AssetDownloadListener assetDownloadListener = cVar.f32636b;
                if (!z12) {
                    downloadRequestMediator.remove(downloadRequest);
                    deliverError(downloadRequest, assetDownloadListener, downloadError);
                } else {
                    downloadRequestMediator.set(2);
                    Log.d(TAG, "Pausing download " + debugString(downloadRequest));
                    deliverProgress(copy, cVar.f32635a, assetDownloadListener);
                    z11 = true;
                }
            }
        }
        if (!z11) {
            downloadRequestMediator.set(5);
        }
        String str = TAG;
        StringBuilder sb2 = new StringBuilder("Attempted to pause - ");
        if (downloadRequestMediator.getStatus() == 2) {
            z10 = true;
        }
        sb2.append(z10);
        Log.d(str, sb2.toString());
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeMediator(DownloadRequestMediator downloadRequestMediator) {
        this.mediators.remove(downloadRequestMediator.key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNetworkListener() {
        if (this.mediators.isEmpty()) {
            Log.d(TAG, "Removing listener");
            this.networkProvider.removeListener(this.networkListener);
        }
    }

    private boolean responseVersionMatches(Response response, HashMap<String, String> hashMap) {
        Headers headers = response.headers();
        String str = headers.get(ETAG);
        String str2 = headers.get(LAST_MODIFIED);
        String str3 = TAG;
        Log.d(str3, "server etag: " + str);
        Log.d(str3, "server lastModified: " + str2);
        if (str != null && !str.equals(hashMap.get(ETAG))) {
            Log.d(str3, "etags miss match current: " + hashMap.get(ETAG));
            return false;
        }
        if (str2 != null && !str2.equals(hashMap.get(LAST_MODIFIED))) {
            Log.d(str3, "lastModified miss match current: " + hashMap.get(LAST_MODIFIED));
            return false;
        }
        return true;
    }

    private boolean satisfiesPartialDownload(Response response, long j10, DownloadRequestMediator downloadRequestMediator) {
        boolean z10;
        RangeResponse rangeResponse = new RangeResponse(response.headers().get(CONTENT_RANGE));
        if (response.code() == 206 && BYTES.equalsIgnoreCase(rangeResponse.dimension)) {
            long j11 = rangeResponse.rangeStart;
            if (j11 >= 0 && j10 == j11) {
                z10 = true;
                Log.d(TAG, "satisfies partial download: " + z10 + " " + debugString(downloadRequestMediator));
                return z10;
            }
        }
        z10 = false;
        Log.d(TAG, "satisfies partial download: " + z10 + " " + debugString(downloadRequestMediator));
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveMeta(File file, HashMap<String, String> hashMap) {
        FileUtility.writeMap(file.getPath(), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sleep(long j10) {
        try {
            Thread.sleep(Math.max(0L, j10));
        } catch (InterruptedException e10) {
            Log.e(TAG, "InterruptedException ", e10);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean useCacheOnFail(DownloadRequestMediator downloadRequestMediator, File file, Map<String, String> map, int i10) {
        if (this.cache != null && downloadRequestMediator.isCacheable && i10 != 200 && i10 != RANGE_NOT_SATISFIABLE && i10 != 206 && Boolean.parseBoolean(map.get(DOWNLOAD_COMPLETE)) && file.exists() && file.length() > 0) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean useCacheWithoutVerification(com.vungle.warren.downloader.DownloadRequestMediator r6, java.io.File r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r5 = this;
            r0 = 0
            if (r8 == 0) goto L45
            com.vungle.warren.downloader.DownloaderCache r1 = r5.cache
            if (r1 == 0) goto L45
            boolean r6 = r6.isCacheable
            if (r6 != 0) goto Lc
            goto L45
        Lc:
            java.lang.String r6 = "Last-Cache-Verification"
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L45
            boolean r7 = r7.exists()
            if (r7 == 0) goto L45
            java.lang.String r7 = "DOWNLOAD_COMPLETE"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            if (r7 != 0) goto L2b
            goto L45
        L2b:
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L45
            long r1 = r5.timeWindow
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = r3 - r6
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L44
            long r6 = r6 + r1
            long r1 = java.lang.System.currentTimeMillis()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 < 0) goto L45
        L44:
            r0 = 1
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.useCacheWithoutVerification(com.vungle.warren.downloader.DownloadRequestMediator, java.io.File, java.util.Map):boolean");
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void cancel(DownloadRequest downloadRequest) {
        if (downloadRequest == null) {
            return;
        }
        onCancelled(downloadRequest);
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void cancelAll() {
        Log.d(TAG, "Cancelling all");
        for (DownloadRequest downloadRequest : this.transitioning) {
            Log.d(TAG, "Cancel in transtiotion " + downloadRequest.url);
            cancel(downloadRequest);
        }
        Log.d(TAG, "Cancel in mediator " + this.mediators.values().size());
        for (DownloadRequestMediator downloadRequestMediator : this.mediators.values()) {
            Log.d(TAG, "Cancel in mediator " + downloadRequestMediator.key);
            onCancelledMediator(downloadRequestMediator);
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public boolean cancelAndAwait(DownloadRequest downloadRequest, long j10) {
        if (downloadRequest == null) {
            return false;
        }
        cancel(downloadRequest);
        long max = Math.max(0L, j10) + System.currentTimeMillis();
        while (System.currentTimeMillis() < max) {
            DownloadRequestMediator findMediatorForCancellation = findMediatorForCancellation(downloadRequest);
            synchronized (this) {
                if (!this.transitioning.contains(downloadRequest) && (findMediatorForCancellation == null || !findMediatorForCancellation.requests().contains(downloadRequest))) {
                    return true;
                }
            }
            sleep(10L);
        }
        return false;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void clearCache() {
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null) {
            downloaderCache.clear();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void download(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            VungleLogger.error("AssetDownloader#download; loadAd sequence", "downloadRequest is null");
            if (assetDownloadListener != null) {
                deliverError(null, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is null"), 1));
            }
        } else {
            VungleLogger.verbose(true, TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Waiting for download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
            this.transitioning.add(downloadRequest);
            this.downloadExecutor.execute(new DownloadPriorityRunnable(new AssetPriority(DownloadRequest.Priority.CRITICAL, 0)) { // from class: com.vungle.warren.downloader.AssetDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    VungleLogger.verbose(true, AssetDownloader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Start to download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
                    try {
                        AssetDownloader.this.launchRequest(downloadRequest, assetDownloadListener);
                    } catch (IOException e10) {
                        VungleLogger.error("AssetDownloader#download; loadAd sequence", "cannot launch request due to " + e10);
                        Log.e(AssetDownloader.TAG, "Error on launching request", e10);
                        AssetDownloader.this.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, e10, 1));
                    }
                }
            }, new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.2
                @Override // java.lang.Runnable
                public void run() {
                    AssetDownloader.this.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1));
                }
            });
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public boolean dropCache(String str) {
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null && str != null) {
            try {
                File file = downloaderCache.getFile(str);
                Log.d(TAG, "Deleting " + file.getPath());
                return this.cache.deleteAndRemove(file);
            } catch (IOException e10) {
                VungleLogger.error("AssetDownloader#dropCache; loadAd sequence", String.format("Error %1$s occured", e10));
                Log.e(TAG, "There was an error to get file", e10);
            }
        }
        return false;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized List<DownloadRequest> getAllRequests() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = new ArrayList(this.mediators.values()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((DownloadRequestMediator) it.next()).requests());
        }
        arrayList.addAll(this.transitioning);
        return arrayList;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void init() {
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null) {
            downloaderCache.init();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized boolean isCacheEnabled() {
        boolean z10;
        if (this.cache != null) {
            if (this.isCacheEnabled) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void setCacheEnabled(boolean z10) {
        this.isCacheEnabled = z10;
    }

    public synchronized void setDownloadedForTests(boolean z10, String str, String str2) {
        ArrayList arrayList = new ArrayList(2);
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null) {
            try {
                arrayList.add(downloaderCache.getMetaFile(downloaderCache.getFile(str)));
            } catch (IOException e10) {
                Log.e(TAG, "Cannot add or get meta file", e10);
                throw new RuntimeException("Failed to get file for request");
            }
        }
        arrayList.add(new File(str2 + META_POSTFIX_EXT));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            HashMap<String, String> extractMeta = extractMeta(file);
            extractMeta.put(DOWNLOAD_COMPLETE, Boolean.valueOf(z10).toString());
            FileUtility.writeSerializable(file, extractMeta);
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public void setProgressStep(int i10) {
        if (i10 != 0) {
            this.progressStep = i10;
        }
    }

    public synchronized void shutdown() {
        cancel(null);
        this.transitioning.clear();
        this.mediators.clear();
        this.uiExecutor.shutdownNow();
        this.downloadExecutor.shutdownNow();
        try {
            VungleThreadPoolExecutor vungleThreadPoolExecutor = this.downloadExecutor;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            vungleThreadPoolExecutor.awaitTermination(2L, timeUnit);
            this.uiExecutor.awaitTermination(2L, timeUnit);
        } catch (InterruptedException e10) {
            Log.e(TAG, "InterruptedException ", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public void updatePriority(DownloadRequest downloadRequest) {
        Runnable runnable;
        final DownloadRequestMediator findMediatorForCancellation = findMediatorForCancellation(downloadRequest);
        if (findMediatorForCancellation != null && (runnable = findMediatorForCancellation.getRunnable()) != null && this.downloadExecutor.remove(runnable)) {
            Log.d(TAG, "prio: updated to " + findMediatorForCancellation.getPriority());
            this.downloadExecutor.execute(runnable, new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.8
                @Override // java.lang.Runnable
                public void run() {
                    AssetDownloader.this.onErrorMediator(new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1), findMediatorForCancellation);
                }
            });
        }
    }

    public AssetDownloader(DownloaderCache downloaderCache, long j10, NetworkProvider networkProvider, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService) {
        this.retryCountOnConnectionLost = 5;
        this.maxReconnectAttempts = 10;
        this.reconnectTimeout = 300;
        this.mediators = new ConcurrentHashMap();
        this.transitioning = new ArrayList();
        this.addLock = new Object();
        this.progressStep = 5;
        this.isCacheEnabled = true;
        this.networkListener = new NetworkProvider.NetworkListener() { // from class: com.vungle.warren.downloader.AssetDownloader.5
            @Override // com.vungle.warren.utility.NetworkProvider.NetworkListener
            public void onChanged(int i10) {
                Log.d(AssetDownloader.TAG, "Network changed: " + i10);
                AssetDownloader.this.onNetworkChanged(i10);
            }
        };
        this.cache = downloaderCache;
        this.timeWindow = j10;
        this.downloadExecutor = vungleThreadPoolExecutor;
        this.networkProvider = networkProvider;
        this.uiExecutor = executorService;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.okHttpClient = builder.readTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true).build();
    }

    private String debugString(DownloadRequest downloadRequest) {
        return ", single request url - " + downloadRequest.url + ", path - " + downloadRequest.path + ", th - " + Thread.currentThread().getName() + "id " + downloadRequest.f27242id;
    }

    /* loaded from: classes2.dex */
    public static abstract class DownloadPriorityRunnable implements Comparable, Runnable {
        private static final AtomicInteger seq = new AtomicInteger();
        private final DownloadRequestMediator mediator;
        private final int order;
        private final AssetPriority priority;

        public DownloadPriorityRunnable(DownloadRequestMediator downloadRequestMediator) {
            this.order = seq.incrementAndGet();
            this.mediator = downloadRequestMediator;
            this.priority = downloadRequestMediator.priority;
            downloadRequestMediator.setRunnable(this);
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof DownloadPriorityRunnable) {
                DownloadPriorityRunnable downloadPriorityRunnable = (DownloadPriorityRunnable) obj;
                int compareTo = getPriority().compareTo(downloadPriorityRunnable.getPriority());
                if (compareTo == 0) {
                    return Integer.valueOf(this.order).compareTo(Integer.valueOf(downloadPriorityRunnable.order));
                }
                return compareTo;
            }
            return -1;
        }

        public AssetPriority getPriority() {
            DownloadRequestMediator downloadRequestMediator = this.mediator;
            if (downloadRequestMediator != null) {
                return downloadRequestMediator.getPriority();
            }
            return this.priority;
        }

        public DownloadPriorityRunnable(AssetPriority assetPriority) {
            this.order = seq.incrementAndGet();
            this.priority = assetPriority;
            this.mediator = null;
        }
    }
}
