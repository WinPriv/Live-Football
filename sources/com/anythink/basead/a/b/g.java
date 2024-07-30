package com.anythink.basead.a.b;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import java.io.File;
import java.io.FileDescriptor;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3607a;

        /* renamed from: b, reason: collision with root package name */
        public int f3608b;
    }

    public static a a(String str) {
        a aVar = null;
        try {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return null;
            }
            a aVar2 = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                aVar2.f3607a = Integer.parseInt(extractMetadata);
                aVar2.f3608b = Integer.parseInt(extractMetadata2);
                return aVar2;
            } catch (Exception e10) {
                e = e10;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static a a(FileDescriptor fileDescriptor) {
        a aVar;
        a aVar2 = null;
        if (fileDescriptor == null) {
            return null;
        }
        try {
            aVar = new a();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(fileDescriptor);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            mediaMetadataRetriever.release();
            aVar.f3607a = Integer.parseInt(extractMetadata);
            aVar.f3608b = Integer.parseInt(extractMetadata2);
            return aVar;
        } catch (Exception e11) {
            e = e11;
            aVar2 = aVar;
            e.printStackTrace();
            return aVar2;
        }
    }

    private static a a(String str, int i10, int i11) {
        a a10 = a(str);
        if (a10 == null) {
            return null;
        }
        float f = (a10.f3607a * 1.0f) / a10.f3608b;
        if (f < (i10 * 1.0f) / i11) {
            a10.f3608b = i11;
            a10.f3607a = (int) (i11 * f);
        } else {
            a10.f3607a = i10;
            a10.f3608b = (int) (i10 / f);
        }
        return a10;
    }

    private static a a(FileDescriptor fileDescriptor, int i10, int i11) {
        a a10 = a(fileDescriptor);
        if (a10 == null) {
            return null;
        }
        if ((a10.f3607a * 1.0f) / a10.f3608b < (i10 * 1.0f) / i11) {
            a10.f3608b = i11;
            a10.f3607a = (int) Math.ceil(i11 * r0);
        } else {
            a10.f3607a = i10;
            a10.f3608b = (int) Math.ceil(i10 / r0);
        }
        return a10;
    }
}
