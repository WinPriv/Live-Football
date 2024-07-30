package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class GregorianCalendarSerializer extends Serializer<GregorianCalendar> {
    private final Field _zoneField;

    public GregorianCalendarSerializer() {
        try {
            Field declaredField = Calendar.class.getDeclaredField("zone");
            this._zoneField = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private TimeZone getTimeZone(Calendar calendar) {
        try {
            return (TimeZone) this._zoneField.get(calendar);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public GregorianCalendar copy(Kryo kryo, GregorianCalendar gregorianCalendar) {
        return (GregorianCalendar) gregorianCalendar.clone();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public GregorianCalendar read(Kryo kryo, Input input, Class<GregorianCalendar> cls) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(input.readLong(true));
        calendar.setLenient(input.readBoolean());
        calendar.setFirstDayOfWeek(input.readInt(true));
        calendar.setMinimalDaysInFirstWeek(input.readInt(true));
        String readString = input.readString();
        if (!getTimeZone(calendar).getID().equals(readString)) {
            calendar.setTimeZone(TimeZone.getTimeZone(readString));
        }
        return (GregorianCalendar) calendar;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, GregorianCalendar gregorianCalendar) {
        output.writeLong(gregorianCalendar.getTimeInMillis(), true);
        output.writeBoolean(gregorianCalendar.isLenient());
        output.writeInt(gregorianCalendar.getFirstDayOfWeek(), true);
        output.writeInt(gregorianCalendar.getMinimalDaysInFirstWeek(), true);
        output.writeString(getTimeZone(gregorianCalendar).getID());
    }
}
