package h3;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import h3.s;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes.dex */
public final class g implements y2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28692a;

    /* renamed from: b, reason: collision with root package name */
    public final m f28693b;

    public /* synthetic */ g(m mVar, int i10) {
        this.f28692a = i10;
        this.f28693b = mVar;
    }

    @Override // y2.i
    public final boolean a(Object obj, y2.g gVar) {
        boolean z10;
        int i10 = this.f28692a;
        m mVar = this.f28693b;
        switch (i10) {
            case 0:
                mVar.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!com.huawei.openalliance.ad.constant.w.bn.equalsIgnoreCase(str) && !com.huawei.openalliance.ad.constant.w.bo.equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    mVar.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // y2.i
    public final a3.x b(Object obj, int i10, int i11, y2.g gVar) {
        int i12 = this.f28692a;
        m mVar = this.f28693b;
        switch (i12) {
            case 0:
                List<ImageHeaderParser> list = mVar.f28716d;
                return mVar.a(new s.a(mVar.f28715c, (ByteBuffer) obj, list), i10, i11, gVar, m.f28711j);
            default:
                return mVar.a(new s.c((ParcelFileDescriptor) obj, mVar.f28716d, mVar.f28715c), i10, i11, gVar, m.f28711j);
        }
    }
}
