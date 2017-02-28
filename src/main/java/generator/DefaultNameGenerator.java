package generator;

import java.util.Random;

import static java.lang.String.join;
import static java.lang.String.valueOf;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
final class DefaultNameGenerator implements NameGenerator {

    private static final String SPLIT = "-";

    DefaultNameGenerator() {
    }

    public String getName() {
        final String name = "test";
        final String code = valueOf(new Random().nextBoolean());

        return join(SPLIT, name, code);
    }
}
