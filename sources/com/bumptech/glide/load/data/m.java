package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: classes.dex */
public final class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
