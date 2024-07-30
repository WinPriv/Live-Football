package com.vungle.warren.network;

import android.util.Log;
import com.vungle.warren.network.converters.Converter;
import java.io.IOException;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.b;
import okio.d;
import okio.h;
import okio.q;
import okio.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OkHttpCall<T> implements Call<T> {
    private static final String TAG = "OkHttpCall";
    private final Converter<ResponseBody, T> converter;
    private okhttp3.Call rawCall;

    /* loaded from: classes2.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        IOException thrownException;

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public d source() {
            h hVar = new h(this.delegate.source()) { // from class: com.vungle.warren.network.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.h, okio.z
                public long read(b bVar, long j10) throws IOException {
                    try {
                        return super.read(bVar, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.thrownException = e10;
                        throw e10;
                    }
                }
            };
            Logger logger = q.f33861a;
            return new u(hVar);
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException == null) {
            } else {
                throw iOException;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final MediaType contentType;

        public NoContentResponseBody(MediaType mediaType, long j10) {
            this.contentType = mediaType;
            this.contentLength = j10;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public d source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(okhttp3.Call call, Converter<ResponseBody, T> converter) {
        this.rawCall = call;
        this.converter = converter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response<T> parseResponse(okhttp3.Response response, Converter<ResponseBody, T> converter) throws IOException {
        ResponseBody body = response.body();
        okhttp3.Response build = response.newBuilder().body(new NoContentResponseBody(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body);
                try {
                    return Response.success(converter.convert(exceptionCatchingResponseBody), build);
                } catch (RuntimeException e10) {
                    exceptionCatchingResponseBody.throwIfCaught();
                    throw e10;
                }
            }
            body.close();
            return Response.success(null, build);
        }
        try {
            b bVar = new b();
            body.source().D(bVar);
            return Response.error(ResponseBody.create(body.contentType(), body.contentLength(), bVar), build);
        } finally {
            body.close();
        }
    }

    @Override // com.vungle.warren.network.Call
    public void enqueue(final Callback<T> callback) {
        this.rawCall.enqueue(new okhttp3.Callback() { // from class: com.vungle.warren.network.OkHttpCall.1
            private void callFailure(Throwable th) {
                try {
                    callback.onFailure(OkHttpCall.this, th);
                } catch (Throwable th2) {
                    Log.w(OkHttpCall.TAG, "Error on executing callback", th2);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, IOException iOException) {
                callFailure(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, okhttp3.Response response) {
                try {
                    OkHttpCall okHttpCall = OkHttpCall.this;
                    try {
                        callback.onResponse(OkHttpCall.this, okHttpCall.parseResponse(response, okHttpCall.converter));
                    } catch (Throwable th) {
                        Log.w(OkHttpCall.TAG, "Error on excuting callback", th);
                    }
                } catch (Throwable th2) {
                    callFailure(th2);
                }
            }
        });
    }

    @Override // com.vungle.warren.network.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call call;
        synchronized (this) {
            call = this.rawCall;
        }
        return parseResponse(call.execute(), this.converter);
    }
}
