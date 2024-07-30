package com.android.volley;

import com.android.volley.Cache;

/* loaded from: classes.dex */
public class Response<T> {
    public final Cache.Entry cacheEntry;
    public final VolleyError error;
    public boolean intermediate;
    public final T result;

    /* loaded from: classes.dex */
    public interface ErrorListener {
        void onErrorResponse(VolleyError volleyError);
    }

    /* loaded from: classes.dex */
    public interface Listener<T> {
        void onResponse(T t10);
    }

    private Response(T t10, Cache.Entry entry) {
        this.intermediate = false;
        this.result = t10;
        this.cacheEntry = entry;
        this.error = null;
    }

    public static <T> Response<T> error(VolleyError volleyError) {
        return new Response<>(volleyError);
    }

    public static <T> Response<T> success(T t10, Cache.Entry entry) {
        return new Response<>(t10, entry);
    }

    public boolean isSuccess() {
        if (this.error == null) {
            return true;
        }
        return false;
    }

    private Response(VolleyError volleyError) {
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = volleyError;
    }
}
