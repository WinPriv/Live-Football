package h3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import t3.a;

/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
public interface s {

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f28735a;

        /* renamed from: b, reason: collision with root package name */
        public final b3.b f28736b;

        /* renamed from: c, reason: collision with root package name */
        public final List<ImageHeaderParser> f28737c;

        public b(b3.b bVar, t3.j jVar, List list) {
            androidx.activity.n.n0(bVar);
            this.f28736b = bVar;
            androidx.activity.n.n0(list);
            this.f28737c = list;
            this.f28735a = new com.bumptech.glide.load.data.k(jVar, bVar);
        }

        @Override // h3.s
        public final int a() throws IOException {
            u uVar = this.f28735a.f19775a;
            uVar.reset();
            return com.bumptech.glide.load.a.a(this.f28736b, uVar, this.f28737c);
        }

        @Override // h3.s
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            u uVar = this.f28735a.f19775a;
            uVar.reset();
            return BitmapFactory.decodeStream(uVar, null, options);
        }

        @Override // h3.s
        public final void c() {
            u uVar = this.f28735a.f19775a;
            synchronized (uVar) {
                uVar.f28744u = uVar.f28742s.length;
            }
        }

        @Override // h3.s
        public final ImageHeaderParser.ImageType d() throws IOException {
            u uVar = this.f28735a.f19775a;
            uVar.reset();
            return com.bumptech.glide.load.a.b(this.f28736b, uVar, this.f28737c);
        }
    }

    int a() throws IOException;

    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28732a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f28733b;

        /* renamed from: c, reason: collision with root package name */
        public final b3.b f28734c;

        public a(b3.b bVar, ByteBuffer byteBuffer, List list) {
            this.f28732a = byteBuffer;
            this.f28733b = list;
            this.f28734c = bVar;
        }

        @Override // h3.s
        public final int a() throws IOException {
            ByteBuffer c10 = t3.a.c(this.f28732a);
            b3.b bVar = this.f28734c;
            if (c10 == null) {
                return -1;
            }
            List<ImageHeaderParser> list = this.f28733b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    int d10 = list.get(i10).d(c10, bVar);
                    if (d10 != -1) {
                        return d10;
                    }
                } finally {
                    t3.a.c(c10);
                }
            }
            return -1;
        }

        @Override // h3.s
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new a.C0486a(t3.a.c(this.f28732a)), null, options);
        }

        @Override // h3.s
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.c(this.f28733b, t3.a.c(this.f28732a));
        }

        @Override // h3.s
        public final void c() {
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class c implements s {

        /* renamed from: a, reason: collision with root package name */
        public final b3.b f28738a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f28739b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f28740c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, b3.b bVar) {
            androidx.activity.n.n0(bVar);
            this.f28738a = bVar;
            androidx.activity.n.n0(list);
            this.f28739b = list;
            this.f28740c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // h3.s
        public final int a() throws IOException {
            u uVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f28740c;
            b3.b bVar = this.f28738a;
            List<ImageHeaderParser> list = this.f28739b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    uVar = new u(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                    try {
                        int c10 = imageHeaderParser.c(uVar, bVar);
                        uVar.release();
                        parcelFileDescriptorRewinder.a();
                        if (c10 != -1) {
                            return c10;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (uVar != null) {
                            uVar.release();
                        }
                        parcelFileDescriptorRewinder.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    uVar = null;
                }
            }
            return -1;
        }

        @Override // h3.s
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f28740c.a().getFileDescriptor(), null, options);
        }

        @Override // h3.s
        public final ImageHeaderParser.ImageType d() throws IOException {
            u uVar;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f28740c;
            b3.b bVar = this.f28738a;
            List<ImageHeaderParser> list = this.f28739b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    uVar = new u(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                    try {
                        ImageHeaderParser.ImageType b10 = imageHeaderParser.b(uVar);
                        uVar.release();
                        parcelFileDescriptorRewinder.a();
                        if (b10 != ImageHeaderParser.ImageType.UNKNOWN) {
                            return b10;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (uVar != null) {
                            uVar.release();
                        }
                        parcelFileDescriptorRewinder.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    uVar = null;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // h3.s
        public final void c() {
        }
    }
}
