package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: classes.dex */
public final class h extends b<AssetFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
