package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.huawei.openalliance.ad.constant.w;
import org.joda.time.LocalDateTime;

/* loaded from: classes2.dex */
public class JodaLocalDateTimeSerializer extends Serializer<LocalDateTime> {
    public JodaLocalDateTimeSerializer() {
        setImmutable(true);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public LocalDateTime read(Kryo kryo, Input input, Class<LocalDateTime> cls) {
        long readLong = input.readLong(true);
        int i10 = (int) (readLong / 86400000);
        int i11 = (int) (readLong % 86400000);
        return new LocalDateTime(i10 / 416, (i10 % 416) / 32, i10 % 32, i11 / 3600000, (i11 % 3600000) / w.f22171t, (i11 % w.f22171t) / 1000, i11 % 1000, IdentifiableChronology.readChronology(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, LocalDateTime localDateTime) {
        output.writeLong((((localDateTime.getMonthOfYear() * 32) + (localDateTime.getYear() * 13 * 32) + localDateTime.getDayOfMonth()) * 86400000) + localDateTime.getMillisOfDay(), true);
        String chronologyId = IdentifiableChronology.getChronologyId(localDateTime.getChronology());
        if (chronologyId == null) {
            chronologyId = "";
        }
        output.writeString(chronologyId);
    }
}
