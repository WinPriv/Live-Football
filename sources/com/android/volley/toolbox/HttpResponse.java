package com.android.volley.toolbox;

import com.android.volley.Header;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class HttpResponse {
    private final InputStream mContent;
    private final byte[] mContentBytes;
    private final int mContentLength;
    private final List<Header> mHeaders;
    private final int mStatusCode;

    public HttpResponse(int i10, List<Header> list) {
        this(i10, list, -1, null);
    }

    public final InputStream getContent() {
        InputStream inputStream = this.mContent;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.mContentBytes != null) {
            return new ByteArrayInputStream(this.mContentBytes);
        }
        return null;
    }

    public final byte[] getContentBytes() {
        return this.mContentBytes;
    }

    public final int getContentLength() {
        return this.mContentLength;
    }

    public final List<Header> getHeaders() {
        return Collections.unmodifiableList(this.mHeaders);
    }

    public final int getStatusCode() {
        return this.mStatusCode;
    }

    public HttpResponse(int i10, List<Header> list, int i11, InputStream inputStream) {
        this.mStatusCode = i10;
        this.mHeaders = list;
        this.mContentLength = i11;
        this.mContent = inputStream;
        this.mContentBytes = null;
    }

    public HttpResponse(int i10, List<Header> list, byte[] bArr) {
        this.mStatusCode = i10;
        this.mHeaders = list;
        this.mContentLength = bArr.length;
        this.mContentBytes = bArr;
        this.mContent = null;
    }
}
