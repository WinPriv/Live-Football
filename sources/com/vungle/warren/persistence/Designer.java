package com.vungle.warren.persistence;

import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface Designer {
    void clearCache();

    void deleteAssets(String str) throws IOException;

    File getAssetDirectory(String str) throws IllegalStateException;

    File getCacheDirectory() throws IllegalStateException;
}
