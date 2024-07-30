package com.vungle.warren.downloader;

import com.vungle.warren.downloader.DownloadRequest;

/* loaded from: classes2.dex */
public class AssetPriority implements Comparable {
    private final Integer firstPriority;
    private final Integer secondPriority;

    public AssetPriority(int i10, @DownloadRequest.Priority int i11) {
        this.firstPriority = Integer.valueOf(i10);
        this.secondPriority = Integer.valueOf(i11);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof AssetPriority) {
            AssetPriority assetPriority = (AssetPriority) obj;
            int compareTo = this.firstPriority.compareTo(assetPriority.firstPriority);
            if (compareTo == 0) {
                return this.secondPriority.compareTo(assetPriority.secondPriority);
            }
            return compareTo;
        }
        return -1;
    }

    public String toString() {
        return "AssetPriority{firstPriority=" + this.firstPriority + ", secondPriority=" + this.secondPriority + '}';
    }
}
