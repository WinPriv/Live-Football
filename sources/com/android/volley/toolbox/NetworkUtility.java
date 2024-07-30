package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.ClientError;
import com.android.volley.Header;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.anythink.expressad.video.module.a.a.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* loaded from: classes.dex */
final class NetworkUtility {
    private static final int SLOW_REQUEST_THRESHOLD_MS = 3000;

    /* loaded from: classes.dex */
    public static class RetryInfo {
        private final VolleyError errorToRetry;
        private final String logPrefix;

        private RetryInfo(String str, VolleyError volleyError) {
            this.logPrefix = str;
            this.errorToRetry = volleyError;
        }
    }

    private NetworkUtility() {
    }

    public static void attemptRetryOnException(Request<?> request, RetryInfo retryInfo) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(retryInfo.errorToRetry);
            request.addMarker(String.format("%s-retry [timeout=%s]", retryInfo.logPrefix, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e10) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", retryInfo.logPrefix, Integer.valueOf(timeoutMs)));
            throw e10;
        }
    }

    public static NetworkResponse getNotModifiedNetworkResponse(Request<?> request, long j10, List<Header> list) {
        Cache.Entry cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new NetworkResponse(304, (byte[]) null, true, j10, list);
        }
        return new NetworkResponse(304, cacheEntry.data, true, j10, HttpHeaderParser.combineHeaders(list, cacheEntry));
    }

    public static byte[] inputStreamToBytes(InputStream inputStream, int i10, ByteArrayPool byteArrayPool) throws IOException {
        byte[] bArr;
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(byteArrayPool, i10);
        try {
            bArr = byteArrayPool.getBuf(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    poolingByteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    byteArrayPool.returnBuf(bArr);
                    poolingByteArrayOutputStream.close();
                    throw th;
                }
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
            }
            byteArrayPool.returnBuf(bArr);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static void logSlowRequests(long j10, Request<?> request, byte[] bArr, int i10) {
        Object obj;
        if (VolleyLog.DEBUG || j10 > m.ag) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j10);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i10);
            objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
            VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    public static RetryInfo shouldRetryException(Request<?> request, IOException iOException, long j10, HttpResponse httpResponse, byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new RetryInfo("socket", new TimeoutError());
        }
        if (!(iOException instanceof MalformedURLException)) {
            if (httpResponse != null) {
                int statusCode = httpResponse.getStatusCode();
                VolleyLog.e("Unexpected response code %d for %s", Integer.valueOf(statusCode), request.getUrl());
                if (bArr != null) {
                    NetworkResponse networkResponse = new NetworkResponse(statusCode, bArr, false, SystemClock.elapsedRealtime() - j10, httpResponse.getHeaders());
                    if (statusCode != 401 && statusCode != 403) {
                        if (statusCode >= 400 && statusCode <= 499) {
                            throw new ClientError(networkResponse);
                        }
                        if (statusCode >= 500 && statusCode <= 599 && request.shouldRetryServerErrors()) {
                            return new RetryInfo("server", new ServerError(networkResponse));
                        }
                        throw new ServerError(networkResponse);
                    }
                    return new RetryInfo("auth", new AuthFailureError(networkResponse));
                }
                return new RetryInfo("network", new NetworkError());
            }
            if (request.shouldRetryConnectionErrors()) {
                return new RetryInfo("connection", new NoConnectionError());
            }
            throw new NoConnectionError(iOException);
        }
        throw new RuntimeException("Bad URL " + request.getUrl(), iOException);
    }
}
