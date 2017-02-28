package bean;

import generator.IdGenerator;
import generator.NameGenerator;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
final class DefaultEvenFactory implements EvenFactory {

    private final IdGenerator idGenerator;
    private final NameGenerator nameGenerator;
    private final boolean isImportant;

    @Inject
    DefaultEvenFactory(@Named("IdGenerator")final IdGenerator idGenerator,
                       @Named("NameGenerator")final NameGenerator nameGenerator,
                       @Named("IsImportant") final boolean isImportant) {
        this.idGenerator = idGenerator;
        this.nameGenerator = nameGenerator;
        this.isImportant = isImportant;
    }

    public Even getEven() {
        final String id = idGenerator.getId();
        final String name = nameGenerator.getName();
        final Date date = Calendar.getInstance().getTime();

        return new DefaultEven(id, name, date, isImportant);
    }
}
