package com.vungle.warren.downloader;

import java.util.List;

/* loaded from: classes2.dex */
public interface CachePolicy<T> {
    void clean();

    List<T> getOrderedCacheItems();

    void load();

    void put(T t10, long j10);

    void remove(T t10);

    void save();
}
