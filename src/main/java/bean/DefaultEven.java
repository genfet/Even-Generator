package bean;

import java.util.Date;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
final class DefaultEven implements Even {

    private final String id;
    private final String name;
    private final Date date;
    private final boolean isImportant;

    DefaultEven(final String id,
                final String name,
                final Date date,
                final boolean isImportant) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.isImportant = isImportant;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public boolean isImportant() {
        return isImportant;
    }

}
