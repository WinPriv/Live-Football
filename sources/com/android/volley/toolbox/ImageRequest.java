package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

/* loaded from: classes.dex */
public class ImageRequest extends Request<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private Response.Listener<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public ImageRequest(String str, Response.Listener<Bitmap> listener, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, Response.ErrorListener errorListener) {
        super(0, str, errorListener);
        this.mLock = new Object();
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0f));
        this.mListener = listener;
        this.mDecodeConfig = config;
        this.mMaxWidth = i10;
        this.mMaxHeight = i11;
        this.mScaleType = scaleType;
    }

    private Response<Bitmap> doParse(NetworkResponse networkResponse) {
        Bitmap decodeByteArray;
        byte[] bArr = networkResponse.data;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i10, i11, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i11, i10, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i10, i11, resizedDimension, resizedDimension2);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > resizedDimension || decodeByteArray.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, resizedDimension, resizedDimension2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return Response.error(new ParseError(networkResponse));
        }
        return Response.success(decodeByteArray, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    public static int findBestSampleSize(int i10, int i11, int i12, int i13) {
        double min = Math.min(i10 / i12, i11 / i13);
        float f = 1.0f;
        while (true) {
            float f10 = 2.0f * f;
            if (f10 <= min) {
                f = f10;
            } else {
                return (int) f;
            }
        }
    }

    private static int getResizedDimension(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i10 == 0) {
                return i12;
            }
            return i10;
        }
        if (i10 == 0) {
            return (int) (i12 * (i11 / i13));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = i13 / i12;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d11 = i11;
            if (i10 * d10 < d11) {
                return (int) (d11 / d10);
            }
            return i10;
        }
        double d12 = i11;
        if (i10 * d10 > d12) {
            return (int) (d12 / d10);
        }
        return i10;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    @Override // com.android.volley.Request
    public Response<Bitmap> parseNetworkResponse(NetworkResponse networkResponse) {
        Response<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    doParse = doParse(networkResponse);
                } catch (OutOfMemoryError e10) {
                    VolleyLog.e("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.data.length), getUrl());
                    return Response.error(new ParseError(e10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return doParse;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(Bitmap bitmap) {
        Response.Listener<Bitmap> listener;
        synchronized (this.mLock) {
            listener = this.mListener;
        }
        if (listener != null) {
            listener.onResponse(bitmap);
        }
    }

    @Deprecated
    public ImageRequest(String str, Response.Listener<Bitmap> listener, int i10, int i11, Bitmap.Config config, Response.ErrorListener errorListener) {
        this(str, listener, i10, i11, ImageView.ScaleType.CENTER_INSIDE, config, errorListener);
    }
}
