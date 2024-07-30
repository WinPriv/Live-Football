package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* loaded from: classes.dex */
public class NetworkImageView extends ImageView {
    private Bitmap mDefaultImageBitmap;
    private Drawable mDefaultImageDrawable;
    private int mDefaultImageId;
    private Bitmap mErrorImageBitmap;
    private Drawable mErrorImageDrawable;
    private int mErrorImageId;
    private ImageLoader.ImageContainer mImageContainer;
    private ImageLoader mImageLoader;
    private String mUrl;

    /* renamed from: com.android.volley.toolbox.NetworkImageView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements ImageLoader.ImageListener {
        final /* synthetic */ boolean val$isInLayoutPass;

        public AnonymousClass1(boolean z10) {
            this.val$isInLayoutPass = z10;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (NetworkImageView.this.mErrorImageId != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.mErrorImageId);
            } else if (NetworkImageView.this.mErrorImageDrawable != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.mErrorImageDrawable);
            } else if (NetworkImageView.this.mErrorImageBitmap != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.mErrorImageBitmap);
            }
        }

        @Override // com.android.volley.toolbox.ImageLoader.ImageListener
        public void onResponse(final ImageLoader.ImageContainer imageContainer, boolean z10) {
            if (z10 && this.val$isInLayoutPass) {
                NetworkImageView.this.post(new Runnable() { // from class: com.android.volley.toolbox.NetworkImageView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1.this.onResponse(imageContainer, false);
                    }
                });
                return;
            }
            if (imageContainer.getBitmap() != null) {
                NetworkImageView.this.setImageBitmap(imageContainer.getBitmap());
                return;
            }
            if (NetworkImageView.this.mDefaultImageId != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.mDefaultImageId);
            } else if (NetworkImageView.this.mDefaultImageDrawable != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.mDefaultImageDrawable);
            } else if (NetworkImageView.this.mDefaultImageBitmap != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.mDefaultImageBitmap);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    private void setDefaultImageOrNull() {
        int i10 = this.mDefaultImageId;
        if (i10 != 0) {
            setImageResource(i10);
            return;
        }
        Drawable drawable = this.mDefaultImageDrawable;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.mDefaultImageBitmap;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public void loadImageIfNecessary(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z13 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (getLayoutParams().height == -2) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z11 = false;
            z12 = false;
        }
        if (!z11 || !z12) {
            z13 = false;
        }
        if (width == 0 && height == 0 && !z13) {
            return;
        }
        if (TextUtils.isEmpty(this.mUrl)) {
            ImageLoader.ImageContainer imageContainer = this.mImageContainer;
            if (imageContainer != null) {
                imageContainer.cancelRequest();
                this.mImageContainer = null;
            }
            setDefaultImageOrNull();
            return;
        }
        ImageLoader.ImageContainer imageContainer2 = this.mImageContainer;
        if (imageContainer2 != null && imageContainer2.getRequestUrl() != null) {
            if (this.mImageContainer.getRequestUrl().equals(this.mUrl)) {
                return;
            }
            this.mImageContainer.cancelRequest();
            setDefaultImageOrNull();
        }
        if (z11) {
            width = 0;
        }
        if (z12) {
            i10 = 0;
        } else {
            i10 = height;
        }
        this.mImageContainer = this.mImageLoader.get(this.mUrl, new AnonymousClass1(z10), width, i10, scaleType);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        ImageLoader.ImageContainer imageContainer = this.mImageContainer;
        if (imageContainer != null) {
            imageContainer.cancelRequest();
            setImageBitmap(null);
            this.mImageContainer = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        loadImageIfNecessary(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.mDefaultImageId = 0;
        this.mDefaultImageDrawable = null;
        this.mDefaultImageBitmap = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.mDefaultImageId = 0;
        this.mDefaultImageBitmap = null;
        this.mDefaultImageDrawable = drawable;
    }

    public void setDefaultImageResId(int i10) {
        this.mDefaultImageBitmap = null;
        this.mDefaultImageDrawable = null;
        this.mDefaultImageId = i10;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.mErrorImageId = 0;
        this.mErrorImageDrawable = null;
        this.mErrorImageBitmap = bitmap;
    }

    public void setErrorImageDrawable(Drawable drawable) {
        this.mErrorImageId = 0;
        this.mErrorImageBitmap = null;
        this.mErrorImageDrawable = drawable;
    }

    public void setErrorImageResId(int i10) {
        this.mErrorImageBitmap = null;
        this.mErrorImageDrawable = null;
        this.mErrorImageId = i10;
    }

    public void setImageUrl(String str, ImageLoader imageLoader) {
        Threads.throwIfNotOnMainThread();
        this.mUrl = str;
        this.mImageLoader = imageLoader;
        loadImageIfNecessary(false);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
