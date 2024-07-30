package h3;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import y2.f;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class z<T> implements y2.i<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final y2.f<Long> f28757d = new y2.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final y2.f<Integer> f28758e = new y2.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final e f = new e();

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f28759g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final f<T> f28760a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.d f28761b;

    /* renamed from: c, reason: collision with root package name */
    public final e f28762c = f;

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class a implements f.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28763a = ByteBuffer.allocate(8);

        @Override // y2.f.b
        public final void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            Long l11 = l10;
            messageDigest.update(bArr);
            synchronized (this.f28763a) {
                this.f28763a.position(0);
                messageDigest.update(this.f28763a.putLong(l11.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class b implements f.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28764a = ByteBuffer.allocate(4);

        @Override // y2.f.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.f28764a) {
                    this.f28764a.position(0);
                    messageDigest.update(this.f28764a.putInt(num2.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        @Override // h3.z.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // h3.z.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a0(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static class e {
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // h3.z.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public z(b3.d dVar, f<T> fVar) {
        this.f28761b = dVar;
        this.f28760a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        if (r1 < 33) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r12, long r13, int r15, int r16, int r17, h3.l r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.z.c(android.media.MediaMetadataRetriever, long, int, int, int, h3.l):android.graphics.Bitmap");
    }

    @Override // y2.i
    public final boolean a(T t10, y2.g gVar) {
        return true;
    }

    @Override // y2.i
    public final a3.x<Bitmap> b(T t10, int i10, int i11, y2.g gVar) throws IOException {
        long longValue = ((Long) gVar.c(f28757d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(a3.k.k("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) gVar.c(f28758e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) gVar.c(l.f);
        if (lVar == null) {
            lVar = l.f28706e;
        }
        l lVar2 = lVar;
        this.f28762c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f28760a.a(mediaMetadataRetriever, t10);
            return h3.e.b(c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, lVar2), this.f28761b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }
}
