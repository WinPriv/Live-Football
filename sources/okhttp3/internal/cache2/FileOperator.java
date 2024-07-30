package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import okio.b;

/* loaded from: classes2.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j10, b bVar, long j11) throws IOException {
        if (j11 >= 0) {
            while (j11 > 0) {
                long transferTo = this.fileChannel.transferTo(j10, j11, bVar);
                j10 += transferTo;
                j11 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j10, b bVar, long j11) throws IOException {
        if (j11 >= 0 && j11 <= bVar.f33824t) {
            while (j11 > 0) {
                long transferFrom = this.fileChannel.transferFrom(bVar, j10, j11);
                j10 += transferFrom;
                j11 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
